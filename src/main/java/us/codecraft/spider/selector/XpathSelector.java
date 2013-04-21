package us.codecraft.spider.selector;

import org.htmlcleaner.*;

import java.util.ArrayList;
import java.util.List;

/**
 * User: cairne
 * Date: 13-4-21
 * Time: 上午9:39
 */
public class XpathSelector implements Selector {

    private String xpathStr;

    public XpathSelector(String xpathStr) {
        this.xpathStr = xpathStr;
    }

    @Override
    public String select(String text) {
        TagNode tagNode = new HtmlCleaner().clean(text);
        try {
            Object[] objects = tagNode.evaluateXPath(xpathStr);
            if (objects[0] instanceof TagNode) {
                TagNode tagNode1 = (TagNode) objects[0];
                return tagNode1.getText().toString();
            } else {
                return objects[0].toString();
            }
        } catch (XPatherException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<String> selectList(String text) {
        TagNode tagNode = new HtmlCleaner().clean(text);
        List<String> results = new ArrayList<String>();
        try {
            Object[] objects = tagNode.evaluateXPath(xpathStr);
            if (objects[0] instanceof TagNode) {
                TagNode tagNode1 = (TagNode) objects[0];
                results.add(tagNode1.getText().toString());
            } else {
                results.add(objects[0].toString());
            }
        } catch (XPatherException e) {
            e.printStackTrace();
        }
        return results;
    }
}
