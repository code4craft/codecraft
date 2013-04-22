package us.codecraft.spider.selector;

import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * User: cairne
 * Date: 13-4-21
 * Time: 上午7:54
 */
public class Html extends PlainText {

    public Html(List<String> strings) {
        super(strings);
    }

    public Html(String text) {
        super(text);
    }

    @Override
    public Selectable x(String xpath) {
        XpathSelector xpathSelector = SelectorFactory.getInstatnce().newXpathSelector(xpath);
        return select(xpathSelector,strings);
    }

    @Override
    public Selectable xs(String xpath) {
        XpathSelector xpathSelector = SelectorFactory.getInstatnce().newXpathSelector(xpath);
        return selectList(xpathSelector, strings);
    }

}
