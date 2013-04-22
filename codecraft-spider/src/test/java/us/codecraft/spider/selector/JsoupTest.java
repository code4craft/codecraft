package us.codecraft.spider.selector;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * User: cairne
 * Date: 13-4-21
 * Time: 上午9:44
 */
public class JsoupTest {

    @Test
    public void testJsoupXpath() throws IOException {
        Document document = Jsoup.parse(new URL("http://masong1987.iteye.com/blog/1191016"), 1100);
        Elements elements = document.select("div");
        System.out.println(elements);
    }
}
