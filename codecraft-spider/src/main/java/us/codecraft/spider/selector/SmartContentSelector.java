package us.codecraft.spider.selector;

import org.apache.log4j.Logger;
import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.TagNode;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 找到clear
 * User: cairne
 * Date: 13-4-21
 * Time: 下午4:42
 */
public class SmartContentSelector implements Selector {

    private Logger logger = Logger.getLogger(getClass());

    public SmartContentSelector() {
    }

    @Override
    public String select(String text) {
        HtmlCleaner htmlCleaner = new HtmlCleaner();
        TagNode tagNode = htmlCleaner.clean(text);
        if (tagNode == null) {
            return null;
        }
        int allCount = 0;
        TagNode[] nodes = tagNode.getElementsByName("p", true);
        allCount += nodes.length;
        Map<TagNode, AtomicInteger> countMap = new ConcurrentHashMap<TagNode, AtomicInteger>();
        count(nodes, countMap);
        nodes = tagNode.getElementsByName("br", true);
        allCount += nodes.length;
        count(nodes, countMap);
        List<Map.Entry<TagNode, AtomicInteger>> sortList = new ArrayList<Map.Entry<TagNode, AtomicInteger>>();
        if (countMap.size() == 0) {
            return null;
        }
        for (Map.Entry<TagNode, AtomicInteger> entry : countMap.entrySet()) {
            sortList.add(entry);
        }

        Collections.sort(sortList, new Comparator<Map.Entry<TagNode, AtomicInteger>>() {
            @Override
            public int compare(Map.Entry<TagNode, AtomicInteger> o1, Map.Entry<TagNode, AtomicInteger> o2) {
                return o2.getValue().get() - o1.getValue().get();
            }
        });
        TagNode contentNode = sortList.get(0).getKey();
        int contentCount = countMap.get(contentNode).get();
        if (contentCount * 1.0 / allCount > 0.3) {
            return htmlCleaner.getInnerHtml(contentNode);
        } else {
            return  htmlCleaner.getInnerHtml(contentNode.getParent());
        }
    }

    private void incrCounter(TagNode node, Map<TagNode, AtomicInteger> countMap) {
        AtomicInteger counter = countMap.get(node);
        if (counter == null) {
            counter = new AtomicInteger(1);
            countMap.put(node, counter);
        } else {
            counter.incrementAndGet();
        }
    }

    private void count(TagNode[] nodes, Map<TagNode, AtomicInteger> countMap) {
        for (TagNode node : nodes) {
            TagNode parent = node.getParent();
            incrCounter(parent, countMap);
            TagNode grandParent = parent.getParent();
            if (grandParent != null) {
                incrCounter(grandParent, countMap);
            }
        }
    }

    private TagNode findLowestCommonParent(List<TagNode> tagNodes, int maxMargin, Map<TagNode, AtomicInteger> countMap) {
        TagNode contentNode = tagNodes.get(0);
        return contentNode;
    }

    @Override
    public List<String> selectList(String text) {
        throw new UnsupportedOperationException();
    }
}
