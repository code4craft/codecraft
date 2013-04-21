package us.codecraft.spider.processor;

import us.codecraft.spider.selector.Selectable;

import java.util.List;
import java.util.Map;

/**
 * User: cairne
 * Date: 13-4-21
 * Time: 上午11:22
 */
public class Page {

    private Map<String, Selectable> fields;

    private Selectable _html;

    private Selectable _url;

    private List<String> _targetUrls;

    public void process() {
        fields.put("title", _html.x("").r(""));
    }

}
