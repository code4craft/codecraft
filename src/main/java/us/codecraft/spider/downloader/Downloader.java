package us.codecraft.spider.downloader;

import us.codecraft.spider.processor.Page;

/**
 * User: cairne
 * Date: 13-4-21
 * Time: 下午12:14
 */
public interface Downloader {

    public Page download(Request request);
}
