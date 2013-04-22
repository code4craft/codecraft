package us.codecraft.spider.schedular;

import us.codecraft.spider.downloader.Request;

/**
 * User: cairne
 * Date: 13-4-21
 * Time: 下午1:12
 */
public interface Schedular {

    public void push(Request request);

    public Request poll();

}
