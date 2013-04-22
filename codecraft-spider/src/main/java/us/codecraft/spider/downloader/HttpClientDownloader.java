package us.codecraft.spider.downloader;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.log4j.Logger;
import us.codecraft.spider.processor.Page;
import us.codecraft.spider.selector.Html;
import us.codecraft.spider.selector.PlainText;
import us.codecraft.spider.utils.UrlUtils;

import java.io.IOException;


/**
 * User: cairne
 * Date: 13-4-21
 * Time: 下午12:15
 */
public class HttpClientDownloader implements Downloader {

    private Logger logger = Logger.getLogger(getClass());


    @Override
    public Page download(Request request) {
        logger.info("downloading page " + request.getUrl());
        HttpClient httpClient = HttpClientPool.getInstance().getClient(request.getSite());
        HttpGet httpGet = new HttpGet(request.getUrl());
        try {
            HttpResponse httpResponse = httpClient.execute(httpGet);
            int statusCode = httpResponse.getStatusLine().getStatusCode();
            if (request.getSite().getAcceptStatCode().contains(statusCode)) {
                String content = IOUtils.toString(httpResponse.getEntity().getContent(),
                        request.getSite().getEncoding() == null ? request.getSite().getEncoding() : httpResponse.getEntity().getContentType().getValue());
                Page page = new Page();
                page.setHtml(new Html(UrlUtils.fixAllRelativeHrefs(content, request.getUrl())));
                page.setUrl(new PlainText(request.getUrl()));
                page.setRequest(request);
                return page;
            } else {
                logger.warn("code error "+statusCode);
            }
        } catch (IOException e) {
            logger.warn("download page " + request.getUrl() + " error", e);
        }
        return null;
    }
}
