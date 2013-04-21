package us.codecraft.spider;

import org.apache.commons.collections.CollectionUtils;
import org.apache.log4j.Logger;
import us.codecraft.spider.downloader.Downloader;
import us.codecraft.spider.downloader.HttpClientDownloader;
import us.codecraft.spider.downloader.Request;
import us.codecraft.spider.pipeline.Pipeline;
import us.codecraft.spider.processor.Page;
import us.codecraft.spider.processor.PageProcessor;
import us.codecraft.spider.schedular.QueueSchedular;
import us.codecraft.spider.schedular.Schedular;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * User: cairne
 * Date: 13-4-21
 * Time: 上午6:53
 */
public class Spider implements Runnable {

    private Downloader downloader = new HttpClientDownloader();

    private Pipeline pipeline;

    private Map<Site, PageProcessor> pageProcessors = new ConcurrentHashMap<Site, PageProcessor>();

    private Schedular schedular = new QueueSchedular();

    private Logger logger = Logger.getLogger(getClass());


    public static Spider me() {
        return new Spider();
    }

    public Spider processor(PageProcessor pageProcessor) {
        this.pageProcessors.put(pageProcessor.getSite(), pageProcessor);
        schedular.push(new Request(pageProcessor.getSite().getStartUrl(), pageProcessor.getSite()));
        return this;
    }

    public Spider schedular(Schedular schedular) {
        this.schedular = schedular;
        return this;
    }

    public Spider pipeline(Pipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }


    @Override
    public void run() {
        Request request = schedular.poll();
        while (request != null) {
            Page page = downloader.download(request);
            PageProcessor pageProcessor = pageProcessors.get(request.getSite());
            if (pageProcessor==null){
               logger.info("no processor for site "+request.getSite());
            }
            pageProcessor.process(page);
            addRequest(page);
            pipeline.process(page);
            try {
                Thread.sleep(request.getSite().getSleepTime());
            } catch (InterruptedException e) {
            }
            request = schedular.poll();
        }
    }

    private void addRequest(Page page) {
        if (CollectionUtils.isNotEmpty(page.getTargetRequests())) {
            for (Request request : page.getTargetRequests()) {
                schedular.push(request);
            }
        }
    }
}
