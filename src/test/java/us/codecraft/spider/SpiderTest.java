package us.codecraft.spider;

import org.junit.Ignore;
import org.junit.Test;

/**
 * User: cairne
 * Date: 13-4-20
 * Time: 下午7:46
 */
public class SpiderTest {

    @Ignore
    @Test
    public void test() {

        /**
         *
         *
         * if (page == r('') && refer(1) == 1) {
         *
         *      type = _refer(1)
         *      content = _text.t().c()
         *      title = x("asd@asd").r("",1)
         *      body[r(_currentUrl).g(1)] = body[r(_currentUrl).g(1)] + (x("").r("",1,2).c())
         *
         *      body=body[r(_currentUrl).g(1)]
         *      tags[%] = (tags[%] + xs('')) . r('')
         *
         *      _targetUrls.add('' + x('').r(''))
         *      _sourceUrls.add()
         *      _header.put("","");
         *      _cookie.add("asdsadasdsa");
         *
         *
         * }
         *
         * _cookie.add(_cookie[''])
         *
         * if (page == r('') && refer(1) == 1)
         *  (
         *      _targetUrl = '' + x('') & r('')
         *      _sourceUrl = ''
         *  )
         *
         */

        /**
         * <condition></>
         * <selector>
         *     <fields>
         *
         *     <type>
         *         <selector></selector>
         *         <selector></selector>
         *     </type>
         *         </>
         *     </>
         */

        /**
         *
         * if (model.url('') && model.refer(1) == 1)
         *  (
         *
         *      model.set(type, model.refer(1))
         *      content = t(_html) > c()
         *      title = x(_html, 'asd@asd') > r('',1)
         *      body[r(_currentUrl).g(1)] = body[r(_currentUrl).g(1)] + (x('') > r('',1,2) > c()) | x('')
         *      tags[%] = tags + xs('') > r('')
         *      model.setTargetUrl();
         *
         *      _targetUrl = '' + x('') & r('')
         *      _sourceUrl = ''
         * )
         *
         * _cookie.add(_cookie[''])
         *
         * if (page == r('') && refer(1) == 1)
         *  (
         *      _targetUrl = '' + x('') & r('')
         *      _sourceUrl = ''
         *  )
         *
         */
    }
}
