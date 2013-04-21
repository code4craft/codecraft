package us.codecraft.spider.pipeline;

import us.codecraft.spider.processor.Page;

/**
 * User: cairne
 * Date: 13-4-21
 * Time: 下午1:39
 */
public interface Pipeline {

    public void process(Page page);
}
