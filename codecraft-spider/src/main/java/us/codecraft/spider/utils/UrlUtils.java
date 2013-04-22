package us.codecraft.spider.utils;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * User: cairne
 * Date: 13-4-21
 * Time: 下午1:52
 */
public class UrlUtils {

    private static Pattern relativePathPattern = Pattern.compile("^([\\.]+)/");

    public static String fixRelativeUrl(String url, String refer) {
        if (StringUtils.isBlank(url) || StringUtils.isBlank(refer)) {
            return url;
        }
        if (url.startsWith("http") || url.startsWith("ftp") || url.startsWith("mailto")) {
            return url;
        }
        if (StringUtils.startsWith(url, "/")) {
            String host = getHost(refer);
            return host + url;
        } else if (!StringUtils.startsWith(url, ".")) {
            refer = reversePath(refer, 1);
            return refer + "/" + url;
        } else {
            Matcher matcher = relativePathPattern.matcher(url);
            if (matcher.find()) {
                int reverseDepth = matcher.group(1).length();
                refer = reversePath(refer, reverseDepth);
                String substring = StringUtils.substring(url, matcher.end());
                return refer + "/" + substring;
            } else {
                refer = reversePath(refer, 1);
                return refer + "/" + url;
            }
        }
    }

    public static String reversePath(String url, int depth) {
        int i = StringUtils.lastOrdinalIndexOf(url, "/", depth);
        if (i < 10) {
            url = getHost(url);
        } else {
            url = StringUtils.substring(url, 0, i);
        }
        return url;
    }

    public static String getHost(String url) {
        String host = url;
        int i = StringUtils.ordinalIndexOf(url, "/", 3);
        if (i > 0) {
            host = StringUtils.substring(url, 0, i);
        }
        return host;
    }

}