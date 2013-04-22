package us.codecraft.spider.pipeline;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import sun.security.provider.MD5;
import us.codecraft.spider.processor.Page;
import us.codecraft.spider.selector.Selectable;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

/**
 * User: cairne
 * Date: 13-4-21
 * Time: 下午6:28
 */
public class FilePipeline implements Pipeline {

    private String path = "/data/temp/spider/";

    public FilePipeline() {

    }

    public FilePipeline(String path) {
        this.path = path;
    }

    @Override
    public void process(Page page) {
        String domain = page.getRequest().getSite().getDomain();
        domain = StringUtils.removeStart(domain, "http://");
        domain = StringUtils.removeStart(domain, "https://");
        domain = StringUtils.replace(domain,"/","");
        String path = this.path + "" + domain + "/";
        File file = new File(path);
        if (!file.exists()) {
            file.mkdir();
        }
        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter(path + DigestUtils.md5Hex(page.getUrl().toString()) + ".html"));
            printWriter.println("url:\t" + page.getUrl());
            for (Map.Entry<String, Selectable> entry : page.getFields().entrySet()) {
                printWriter.println(entry.getKey() + ":\t" + entry.getValue().toStrings());
            }
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

    }
}
