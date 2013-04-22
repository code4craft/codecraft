package us.codecraft.spider.utils;

import org.junit.Assert;
import org.junit.Test;

/**
 * User: cairne
 * Date: 13-4-21
 * Time: 下午2:22
 */
public class UrlUtilsTest {

    @Test
    public void testFixRelativeUrl() {
        String fixrelativeurl = UrlUtils.fixRelativeUrl("aa", "http://www.dianping.com/sh/ss/com");
        System.out.println("fix: " + fixrelativeurl);
        Assert.assertEquals("http://www.dianping.com/sh/ss/aa", fixrelativeurl);

        fixrelativeurl = UrlUtils.fixRelativeUrl("../aa", "http://www.dianping.com/sh/ss/com");
        Assert.assertEquals("http://www.dianping.com/sh/aa", fixrelativeurl);

        fixrelativeurl = UrlUtils.fixRelativeUrl("..../aa", "http://www.dianping.com/sh/ss/com");
        Assert.assertEquals("http://www.dianping.com/aa", fixrelativeurl);
        fixrelativeurl = UrlUtils.fixRelativeUrl(".../aa", "http://www.dianping.com/sh/ss/com");
        Assert.assertEquals("http://www.dianping.com/aa", fixrelativeurl);
        fixrelativeurl = UrlUtils.fixRelativeUrl("..aa", "http://www.dianping.com/sh/ss/com");
        Assert.assertEquals("http://www.dianping.com/sh/ss/..aa", fixrelativeurl);
//        fixrelativeurl = fixrelativeurl("/aa", "http://www.dianping.com");
//        System.out.println("fix: " + fixrelativeurl);
//        fixrelativeurl = fixrelativeurl("/aa", "http://www.dianping.com/");
//        System.out.println("fix: " + fixrelativeurl);
    }
}
