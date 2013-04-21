package us.codecraft.spider.downloader;

import us.codecraft.spider.Site;

import java.util.List;

/**
 * User: cairne
 * Date: 13-4-21
 * Time: 上午11:37
 */
public class Request {

    private String url;

    private Site site;

    private Object[] extra;

    public Request(String url,Site site, Object... extra) {
        this.url = url;
        this.site = site;
        this.extra = extra;
    }

    public Object[] getExtra() {
        return extra;
    }

    public String getUrl() {
        return url;
    }

    public Site getSite() {
        return site;
    }
}
