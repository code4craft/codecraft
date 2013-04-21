package us.codecraft.spider.processor;

import us.codecraft.spider.Site;

/**
 * User: cairne
 * Date: 13-4-21
 * Time: 上午11:42
 */
public interface PageProcessor {

    /**
     * extends the class to implements variaty spiders
     * @param page
     */
    public void process(Page page);

    public Site getSite();
}
