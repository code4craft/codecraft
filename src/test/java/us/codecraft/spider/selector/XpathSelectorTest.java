package us.codecraft.spider.selector;

import org.junit.Assert;
import org.junit.Test;

/**
 * User: cairne
 * Date: 13-4-21
 * Time: 上午10:06
 */
public class XpathSelectorTest {

    @Test
    public void test(){
         String text = "\n" +
                 "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n" +
                 "<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"zh-CN\" dir=\"ltr\">\n" +
                 "  <head>\n" +
                 "    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>\n" +
                 "    <title>jsoup 解析页面商品信息 -  - ITeye技术网站</title>\n" +
                 "    <meta name=\"description\" content=\"今天用了jsoup 解析页面商品信息，感觉比用xpath获取信息准确多了     下面就记录一下：  一、首先去 http://jsoup.org/download 下载jsoup的jar包。     二、下面记录下相关代码：              Document doc = Jsoup.connect(url).get();    //将htm转换成Document类型数据结构        ...\" />\n" +
                 "    <meta name=\"keywords\" content=\" jsoup 解析页面商品信息\" />\n" +
                 "    <link rel=\"shortcut icon\" href=\"/images/favicon.ico\" type=\"image/x-icon\" />\n" +
                 "    <link rel=\"search\" type=\"application/opensearchdescription+xml\" href=\"/open_search.xml\" title=\"ITeye\" />\n" +
                 "    <link href=\"/rss\" rel=\"alternate\" title=\"\" type=\"application/rss+xml\" />\n" +
                 "    <link href=\"http://www.iteye.com/stylesheets/blog.css?1365750118\" media=\"screen\" rel=\"stylesheet\" type=\"text/css\" />\n" +
                 "<link href=\"http://www.iteye.com/stylesheets/themes/blog/blue.css?1326191326\" media=\"screen\" rel=\"stylesheet\" type=\"text/css\" />\n" +
                 "    <script src=\"http://www.iteye.com/javascripts/application.js?1358214518\" type=\"text/javascript\"></script>\n" +
                 "    <script type=\"text/javascript\">\n" +
                 "\n" +
                 "  var _gaq = _gaq || [];\n" +
                 "  _gaq.push(['_setAccount', 'UA-535605-1']);\n" +
                 "  _gaq.push(['_setDomainName', 'iteye.com']);\n" +
                 "  _gaq.push(['_trackPageview']);\n" +
                 "\n" +
                 "  (function() {\n" +
                 "    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;\n" +
                 "    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';\n" +
                 "    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);\n" +
                 "  })();\n" +
                 "\n" +
                 "</script>\n" +
                 "\n" +
                 "\n" +
                 "      <link href=\"http://www.iteye.com/javascripts/syntaxhighlighter/SyntaxHighlighter.css?1348819953\" media=\"screen\" rel=\"stylesheet\" type=\"text/css\" />\n" +
                 "  <script src=\"http://www.iteye.com/javascripts/syntaxhighlighter/shCoreCommon.js?1325907333\" type=\"text/javascript\"></script>\n" +
                 "<script src=\"http://www.iteye.com/javascripts/hotkey.js?1324994303\" type=\"text/javascript\"></script>\n" +
                 "  <script src=\"http://www.iteye.com/javascripts/code_favorites.js?1358214518\" type=\"text/javascript\"></script>\n" +
                 "<script src=\"http://www.iteye.com/javascripts/weiboshare.js?1324994303\" type=\"text/javascript\"></script>\n" +
                 "  <link href=\"http://www.iteye.com/javascripts/editor/css/ui.css?1324994303\" media=\"screen\" rel=\"stylesheet\" type=\"text/css\" />\n" +
                 "  <script src=\"http://www.iteye.com/javascripts/editor/compress.js?1358129160\" type=\"text/javascript\"></script>\n" +
                 "  </head>\n" +
                 "  <body>\n" +
                 "    <div id=\"header\">\n" +
                 "      <div id=\"blog_site_nav\">\n" +
                 "  <a href=\"http://www.iteye.com/\" class=\"homepage\">首页</a>\n" +
                 "  <a href=\"http://www.iteye.com/news\">资讯</a>\n" +
                 "  <a href=\"http://www.iteye.com/magazines\">精华</a>\n" +
                 "  <a href=\"http://www.iteye.com/forums\">论坛</a>\n" +
                 "  <a href=\"http://www.iteye.com/ask\">问答</a>\n" +
                 "  <a href=\"http://www.iteye.com/blogs\">博客</a>\n" +
                 "  <a href=\"http://www.iteye.com/blogs/subjects\">专栏</a>\n" +
                 "  <a href=\"http://www.iteye.com/groups\">群组</a>\n" +
                 "  <a href=\"#\" onclick=\"return false;\" id=\"msna\"><u>更多</u> <small>▼</small></a>\n" +
                 "  <div class=\"quick_menu\" style=\"display:none;\">\n" +
                 "    <a target=\"_blank\" href=\"http://job.iteye.com/iteye\">招聘</a>\n" +
                 "    <a href=\"http://www.iteye.com/search\">搜索</a>\n" +
                 "  </div>\n" +
                 "</div>\n" +
                 "\n" +
                 "      <div id=\"user_nav\">\n" +
                 "  \n" +
                 "        <a href=\"http://flashsword20.iteye.com\" title=\"查看我的博客首页\" class=\"welcome\">欢迎flashsword20</a>\n" +
                 "    <a id=\"notifications_count\" href=\"http://my.iteye.com/notifications\">0</a>\n" +
                 "    \n" +
                 "      <a href=\"http://my.iteye.com/messages\" title=\"你有新的站内短信\"><img alt=\"Newpm\" src=\"http://www.iteye.com/images/newpm.gif?1324994303\" />收件箱(3)</a>\n" +
                 "    \n" +
                 "    <a href=\"http://my.iteye.com\" title=\"我的应用首页\">我的应用</a>\n" +
                 "    <div class=\"quick_menu\" style=\"display:none;\">\n" +
                 "      <a href=\"http://my.iteye.com/feed\" title=\"我关注的好友动态消息\">我的关注</a>\n" +
                 "      <a href=\"http://my.iteye.com/mygroup\" title=\"我加入的群组最新话题\">我的群组</a>\n" +
                 "      <a href=\"http://my.iteye.com/myresume\" title=\"我的个人简历\">我的简历</a>\n" +
                 "      <a href=\"http://my.iteye.com/admin/album\" title=\"我的个人简历\">我的相册</a>\n" +
                 "      <a href=\"http://my.iteye.com/admin/link\" title=\"我收藏的网络资源链接\">我的收藏</a>\n" +
                 "      <a href=\"http://my.iteye.com/admin/code\" title=\"我收藏的代码\">我的代码</a>\n" +
                 "      <a href=\"http://my.iteye.com/admin/weibo\" title=\"用微博发表简短的话题\">我的微博</a>\n" +
                 "    </div>\n" +
                 "    <a href=\"http://flashsword20.iteye.com/admin\" title=\"管理我的博客\">我的博客</a>\n" +
                 "    <a href=\"http://my.iteye.com/profile\" title=\"修改我的个人设置\">设置</a>\n" +
                 "    <a href=\"/logout\" class=\"nobg\" onclick=\"var f = document.createElement('form'); f.style.display = 'none'; this.parentNode.appendChild(f); f.method = 'POST'; f.action = this.href;var m = document.createElement('input'); m.setAttribute('type', 'hidden'); m.setAttribute('name', '_method'); m.setAttribute('value', 'put'); f.appendChild(m);var s = document.createElement('input'); s.setAttribute('type', 'hidden'); s.setAttribute('name', 'authenticity_token'); s.setAttribute('value', 'TDmn/IsWi1Aj4CXKfdMKZZzALz6jbRU/Biw0/QHnsVw='); f.appendChild(s);f.submit();return false;\">退出</a>\n" +
                 "  </div>\n" +
                 "\n" +
                 "    </div>\n" +
                 "\n" +
                 "    <div id=\"page\">\n" +
                 "      <div id=\"branding\" class=\"clearfix\">\n" +
                 "        <div id=\"blog_name\">\n" +
                 "          <h1><a href=\"/\">masong1987</a></h1>\n" +
                 "        </div>\n" +
                 "        <div id='fd'></div>\n" +
                 "        <div id=\"blog_navbar\">\n" +
                 "          <ul>\n" +
                 "            <li class='blog_navbar_for'><a href=\"http://masong1987.iteye.com\"><strong>博客</strong></a></li>\n" +
                 "            <li ><a href=\"/weibo\">微博</a></li>\n" +
                 "            <li ><a href=\"/album\">相册</a></li>\n" +
                 "            <li ><a href=\"/link\">收藏</a></li>\n" +
                 "            <li ><a href=\"/blog/guest_book\">留言</a></li>\n" +
                 "            <li ><a href=\"/blog/profile\">关于我</a></li>\n" +
                 "          </ul>\n" +
                 "    \n" +
                 "          <div class=\"search\">\n" +
                 "            <form action=\"/blog/search\" method=\"get\">\n" +
                 "              <input class=\"search_text\" id=\"query\" name=\"query\" style=\"margin-left: 10px;width: 110px;\" type=\"text\" value=\"\" />\n" +
                 "              <input class=\"submit_search\" type=\"submit\" value=\"\" />\n" +
                 "            </form>\n" +
                 "          </div> \n" +
                 "          <div id=\"fd\"></div>         \n" +
                 "        </div>\n" +
                 "      </div>\n" +
                 "      \n" +
                 "      <div id=\"content\" class=\"clearfix\">\n" +
                 "        <div id=\"main\">\n" +
                 "          \n" +
                 "\n" +
                 "\n" +
                 "\n" +
                 "          \n" +
                 "\n" +
                 "\n" +
                 "<div class=\"blog_main\">\n" +
                 "  <div class=\"blog_title\">\n" +
                 "    <h3>\n" +
                 "      <a href=\"/blog/1191016\">jsoup 解析页面商品信息</a>\n" +
                 "      <em class=\"actions\">      </em>\n" +
                 "    </h3>\n" +
                 "    <ul class='blog_categories'><strong>博客分类：</strong> <li><a href=\"/category/182324\">爬虫</a></li> </ul>\n" +
                 "        <div class='news_tag'>&nbsp;</div>\n" +
                 "  </div>\n" +
                 "\n" +
                 "  <div id=\"blog_content\" class=\"blog_content\">\n" +
                 "    <p>今天用了jsoup 解析页面商品信息，感觉比用xpath获取信息准确多了</p>\n" +
                 "<p> </p>\n" +
                 "<p>下面就记录一下：</p>\n" +
                 "<p>一、首先去 <a href=\"http://jsoup.org/download\">http://jsoup.org/download</a> 下载jsoup的jar包。</p>\n" +
                 "<p> </p>\n" +
                 "<p>二、下面记录下相关代码：</p>\n" +
                 "<p> </p>\n" +
                 "<p> </p>\n" +
                 "<p>      Document doc = Jsoup.connect(url).get();    //将htm转换成Document类型数据结构</p>\n" +
                 "<p> <br>      doc.select(\"div:has(div) div#spec-n1:has(img) img\").first().attr(\"src\"));    //查找div下含有div的标签</p>\n" +
                 "<p>      </p>\n" +
                 "<p>      并且 div的id='spec-n1'，此div第一个img标签，img里属性是src的值。</p>\n" +
                 "<p> </p>\n" +
                 "<p>      doc.select(\"div:has(div) div.crumb:has(a) a:eq(4)\").text();    //查找class='crumb'的div下第4个a标签</p>\n" +
                 "<p>      下的值。</p>\n" +
                 "<p> </p>\n" +
                 "<p>      doc.select(\"div:has(div) div#name:has(h1)\").text();     //查找id='name'的div下的h1标签的值。</p>\n" +
                 "<p> </p>\n" +
                 "<p>      doc.select(\"tbody:has(tr) td.tdTitle:contains(品牌) + td\").text();     //查找class='tdTitle'的td标签里</p>\n" +
                 "<p> </p>\n" +
                 "<p>      含有‘品牌’td的下一个td标签中内容。</p>\n" +
                 "<p> </p>\n" +
                 "<p>      doc.select(\"script[type=text/javascript]:not([src~=[a-zA-Z0-9./\\\\s]+)\");     //查找含有此&lt;script </p>\n" +
                 "<p> </p>\n" +
                 "<p>      type=\"text/javascript\"&gt;……&lt;/script&gt;内容，不含有script标签中有src属性的script，如：</p>\n" +
                 "<p> </p>\n" +
                 "<p>      &lt;script src=\"url\" type=\"text/javascript\"&gt;&lt;/script&gt;。</p>\n" +
                 "  </div>\n" +
                 "\n" +
                 "  \n" +
                 "\n" +
                 "\n" +
                 "  <IFRAME SRC=\"/iframe_ggbd/794\" SCROLLING=no WIDTH=468 HEIGHT=60 FRAMEBORDER=0></IFRAME>\n" +
                 "  \n" +
                 "  <div id=\"bottoms\" class=\"clearfix\">\n" +
                 "    \n" +
                 "    <div id=\"share_weibo\">分享到：\n" +
                 "      <a data-type='sina' href=\"javascript:;\" title=\"分享到新浪微博\"><img src=\"/images/sina.jpg\"></a>\n" +
                 "      <a data-type='qq' href=\"javascript:;\" title=\"分享到腾讯微博\"><img src=\"/images/tec.jpg\"></a>\n" +
                 "    </div>\n" +
                 "  </div>\n" +
                 "\n" +
                 "  <div class=\"blog_nav\">\n" +
                 "    <div class=\"pre_next\">\n" +
                 "      <a href=\"/blog/1310327\" class=\"next\" title=\"ibatis中书写SQL语句时使用in遇到的问题\">ibatis中书写SQL语句时使用in遇到的问题</a>\n" +
                 "      |\n" +
                 "      <a href=\"/blog/1189699\" class=\"pre\" title=\"尚未备份数据库 &quot;***&quot; 的日志尾部。如果该日志包含您不希望丢失的工作，请使用 BACKUP LOG WITH NORECOVERY 备份该日志。请使用 RE\">尚未备份数据库 &quot;***&quot; 的日志尾部。如果该 ...</a>\n" +
                 "    </div>\n" +
                 "  </div>\n" +
                 "  <div class=\"blog_bottom\">\n" +
                 "    <ul>\n" +
                 "      <li>2011-10-12 18:52</li>\n" +
                 "      <li>浏览 692</li>\n" +
                 "      <li><a href=\"#comments\">评论(0)</a></li>\n" +
                 "      \n" +
                 "      \n" +
                 "        <li><a href='/admin/link?user_favorite%5Btitle%5D=jsoup+%E8%A7%A3%E6%9E%90%E9%A1%B5%E9%9D%A2%E5%95%86%E5%93%81%E4%BF%A1%E6%81%AF&amp;user_favorite%5Burl%5D=http%3A%2F%2Fmasong1987.iteye.com%2Fblog%2F1191016' target='_blank' class='favorite' onclick=\"$$('.favorite_form_spinner')[0].show();new Ajax.Request('/admin/link/new_xhr?user_favorite%5Btitle%5D=jsoup+%E8%A7%A3%E6%9E%90%E9%A1%B5%E9%9D%A2%E5%95%86%E5%93%81%E4%BF%A1%E6%81%AF&amp;user_favorite%5Burl%5D=http%3A%2F%2Fmasong1987.iteye.com%2Fblog%2F1191016', {method: 'get', onSuccess: function(response){$(document.getElementsByTagName('body')[0]).insert({bottom:response.responseText});$$('.favorite_form_spinner')[0].hide();}});return false;\">收藏</a><img alt=\"Spinner\" class=\"favorite_form_spinner\" src=\"http://www.iteye.com/images/spinner.gif?1324994303\" style=\"vertical-align:bottom;margin-left:7px;display:none;\" /></li>\n" +
                 "      \n" +
                 "      <li>分类:<a href=\"http://www.iteye.com/blogs/category/opensource\">开源软件</a></li>      \n" +
                 "      <li class='last'><a href=\"http://www.iteye.com/wiki/blog/1191016\" target=\"_blank\" class=\"more\">相关推荐</a></li>\n" +
                 "    </ul>\n" +
                 "  </div>\n" +
                 "\n" +
                 "  <div class=\"blog_comment\">\n" +
                 "    <h5>评论</h5>\n" +
                 "    <a id=\"comments\" name=\"comments\"></a>\n" +
                 "    \n" +
                 "    \n" +
                 "    \n" +
                 "  </div>\n" +
                 "\n" +
                 "  <div class=\"blog_comment\">\n" +
                 "    <h5>发表评论</h5>\n" +
                 "            <form action=\"/blog/1191016\" id=\"comment_form\" method=\"post\" onsubmit=\"return false;\"><div style=\"margin:0;padding:0;display:inline\"><input name=\"authenticity_token\" type=\"hidden\" value=\"TDmn/IsWi1Aj4CXKfdMKZZzALz6jbRU/Biw0/QHnsVw=\" /></div>          \n" +
                 "\n" +
                 "\n" +
                 "  <input type=\"hidden\" id=\"editor_bbcode_flag\"/>\n" +
                 "\n" +
                 "\n" +
                 "\n" +
                 "<div id=\"editor_main\"><textarea class=\"validate-richeditor bad-words min-length-5\" cols=\"40\" id=\"editor_body\" name=\"comment[body]\" rows=\"20\" style=\"width: 500px; height: 350px;\"></textarea></div>\n" +
                 "\n" +
                 "\n" +
                 "<script type=\"text/javascript\">\n" +
                 "  var editor = new Control.TextArea.Editor(\"editor_body\", \"bbcode\", false);\n" +
                 "</script>\n" +
                 "\n" +
                 "          <p style=\"text-align:right;margin-right:30px;\">(快捷键 Alt+S / Ctrl+Enter) <input class=\"submit\" id=\"quick_reply_button\" name=\"commit\" type=\"submit\" value=\"提交\" /></p>\n" +
                 "       </form>\n" +
                 "        <script type=\"text/javascript\">\n" +
                 "          new HotKey(\"s\",function() {$('quick_reply_button').click();},{altKey: true, ctrlKey: false});\n" +
                 "          new HotKey(new Number(13),function() {$('quick_reply_button').click();},{altKey: false, ctrlKey: true});\n" +
                 "\n" +
                 "          new Validation(\"comment_form\", {immediate: false, onFormValidate: function(result, form){\n" +
                 "            if(result) {\n" +
                 "              new Ajax.Request('/blog/create_comment/1191016', {\n" +
                 "                onFailure:function(response){\n" +
                 "                  $('comments').insert({after:response.responseText})\n" +
                 "                  form.spinner.hide();\n" +
                 "                  Element.scrollTo($('comments'));\n" +
                 "                },\n" +
                 "                onSuccess:function(response){\n" +
                 "                  Element.scrollTo($('comments'));\n" +
                 "                  var new_comment = new Element('div', {}).update(response.responseText).firstChild;\n" +
                 "                  var comment_id = new_comment.readAttribute('id');\n" +
                 "\n" +
                 "                  $('comments').insert({after:response.responseText});\n" +
                 "                  $('editor_body').value = \"\";\n" +
                 "\n" +
                 "                  var css_rules = '#' + comment_id + ' pre';\n" +
                 "                  highlightNewAddContent(css_rules);\n" +
                 "                  processComment();\n" +
                 "                  code_favorites_init(css_rules);\n" +
                 "                  \n" +
                 "                  form.spinner.hide();\n" +
                 "                }, parameters:Form.serialize(form)\n" +
                 "              });\n" +
                 "            }\n" +
                 "        }});\n" +
                 "        </script>\n" +
                 "        </div>\n" +
                 "</div>\n" +
                 "\n" +
                 "\n" +
                 "<script type=\"text/javascript\">\n" +
                 "  dp.SyntaxHighlighter.HighlightAll('code', true, true);\n" +
                 "\n" +
                 "  $$('#main .blog_content pre[name=code]').each(function(pre, index){ // blog content\n" +
                 "    var post_id = 1191016;\n" +
                 "    var location = window.location;\n" +
                 "    source_url = location.protocol + \"//\" + location.host + location.pathname + location.search;\n" +
                 "    pre.writeAttribute('codeable_id', post_id);\n" +
                 "    pre.writeAttribute('codeable_type', \"Blog\");\n" +
                 "    pre.writeAttribute('source_url', source_url);\n" +
                 "    pre.writeAttribute('pre_index', index);\n" +
                 "    pre.writeAttribute('title', 'jsoup 解析页面商品信息');\n" +
                 "  });\n" +
                 "\n" +
                 "  fix_image_size($$('div.blog_content img'), 700);\n" +
                 "\n" +
                 "  function processComment() {\n" +
                 "    $$('#main .blog_comment > div').each(function(comment){// comment\n" +
                 "      var post_id = comment.id.substr(2);\n" +
                 "      $$(\"#\"+comment.id+\" pre[name=code]\").each(function(pre, index){\n" +
                 "        var location = window.location;\n" +
                 "        source_url = location.protocol + \"//\" + location.host + location.pathname + location.search;\n" +
                 "        source_url += \"#\" + comment.id;\n" +
                 "        pre.writeAttribute('codeable_id', post_id);\n" +
                 "        pre.writeAttribute('codeable_type', \"BlogComment\");\n" +
                 "        pre.writeAttribute('source_url', source_url);\n" +
                 "        pre.writeAttribute('pre_index', index);\n" +
                 "        pre.writeAttribute('title', 'jsoup 解析页面商品信息');\n" +
                 "      });\n" +
                 "    });\n" +
                 "  }\n" +
                 "\n" +
                 "  function quote_comment(id) {\n" +
                 "    new Ajax.Request('/editor/quote', {\n" +
                 "      parameters: {'id':id, 'type':'BlogComment'},\n" +
                 "      onSuccess:function(response){editor.bbcode_editor.textarea.insertAfterSelection(response.responseText);\n" +
                 "        Element.scrollTo(editor.bbcode_editor.textarea.element);}\n" +
                 "    });\n" +
                 "  }\n" +
                 "\n" +
                 "  code_favorites_init();\n" +
                 "  processComment();\n" +
                 "  new WeiboShare({share_buttons: $('share_weibo'), img_scope: $('blog_content')});\n" +
                 "</script>\n" +
                 "\n" +
                 "\n" +
                 "\n" +
                 "\n" +
                 "        </div>\n" +
                 "\n" +
                 "        <div id=\"local\">\n" +
                 "          <div class=\"local_top\"></div>\n" +
                 "          <div id=\"blog_owner\">\n" +
                 "  <div id=\"blog_owner_logo\"><a href='http://masong1987.iteye.com'><img alt=\"masong1987的博客\" class=\"logo\" src=\"http://www.iteye.com/images/user-logo.gif?1324994303\" title=\"masong1987的博客: \" /></a></div>\n" +
                 "  <div id=\"blog_owner_name\">masong1987</div>\n" +
                 "</div>\n" +
                 "\n" +
                 "          <div id=\"blog_actions\">\n" +
                 "            <ul>\n" +
                 "              <li>浏览: 5401 次</li>\n" +
                 "              <li>性别: <img alt=\"Icon_minigender_1\" src=\"http://www.iteye.com/images/icon_minigender_1.gif?1324994303\" title=\"男\" /></li>\n" +
                 "              <li>来自: 北京</li>\n" +
                 "              <li><img src='/images/status/offline.gif'/></li>\n" +
                 "              \n" +
                 "                <li>\n" +
                 "                  <a href=\"http://my.iteye.com/messages/new?message%5Breceiver_name%5D=masong1987\" class=\"message\" title=\"发送站内短信\">发短消息</a>\n" +
                 "                  \n" +
                 "                    <a href=\"http://my.iteye.com/feed?subscription%5Bsubscribed_user_name%5D=masong1987\" class=\"subscription\" onclick=\"var f = document.createElement('form'); f.style.display = 'none'; this.parentNode.appendChild(f); f.method = 'POST'; f.action = this.href;var s = document.createElement('input'); s.setAttribute('type', 'hidden'); s.setAttribute('name', 'authenticity_token'); s.setAttribute('value', 'TDmn/IsWi1Aj4CXKfdMKZZzALz6jbRU/Biw0/QHnsVw='); f.appendChild(s);f.submit();return false;\">关注</a>\n" +
                 "                  \n" +
                 "                </li>\n" +
                 "              \n" +
                 "            </ul>\n" +
                 "          </div>\n" +
                 "          <div id=\"user_visits\" class=\"clearfix\">\n" +
                 "            <h5>最近访客 <span style='font-weight:normal;font-size:12px;padding-left:30px;'><a href=\"/blog/user_visits\">更多访客&gt;&gt;</a></span></h5>\n" +
                 "            \n" +
                 "              <div class=\"user_visit\">\n" +
                 "                <div class=\"logo\"><a href='http://flashsword20.iteye.com' target='_blank'><img alt=\"flashsword20的博客\" class=\"logo\" src=\"http://www.iteye.com/images/user-logo-thumb.gif?1324994303\" title=\"flashsword20的博客: \" /></a></div>\n" +
                 "                <div class=\"left\"><a href='http://flashsword20.iteye.com' target='_blank' title='flashsword20'>flashsword20</a></div>\n" +
                 "              </div>\n" +
                 "            \n" +
                 "              <div class=\"user_visit\">\n" +
                 "                <div class=\"logo\"><a href='http://dylinshi126.iteye.com' target='_blank'><img alt=\"dylinshi126的博客\" class=\"logo\" src=\"http://www.iteye.com/images/user-logo-thumb.gif?1324994303\" title=\"dylinshi126的博客: \" /></a></div>\n" +
                 "                <div class=\"left\"><a href='http://dylinshi126.iteye.com' target='_blank' title='dylinshi126'>dylinshi126</a></div>\n" +
                 "              </div>\n" +
                 "            \n" +
                 "              <div class=\"user_visit\">\n" +
                 "                <div class=\"logo\"><a href='http://machoo.iteye.com' target='_blank'><img alt=\"machoo的博客\" class=\"logo\" src=\"http://www.iteye.com/upload/logo/user/590501/f3e5a6de-fa04-3ca9-92bd-378230b128c8-thumb.jpg?1321544632\" title=\"machoo的博客: 虚拟机终结者\" /></a></div>\n" +
                 "                <div class=\"left\"><a href='http://machoo.iteye.com' target='_blank' title='machoo'>machoo</a></div>\n" +
                 "              </div>\n" +
                 "            \n" +
                 "              <div class=\"user_visit\">\n" +
                 "                <div class=\"logo\"><a href='http://arson.iteye.com' target='_blank'><img alt=\"arson的博客\" class=\"logo\" src=\"http://www.iteye.com/upload/logo/user/511499/91eafa67-ebbb-32d2-a1c4-fc1c169b5c66-thumb.jpg?1310020715\" title=\"arson的博客: \" /></a></div>\n" +
                 "                <div class=\"left\"><a href='http://arson.iteye.com' target='_blank' title='arson'>arson</a></div>\n" +
                 "              </div>\n" +
                 "            \n" +
                 "          </div>\n" +
                 "\n" +
                 "          \n" +
                 "\n" +
                 "                      <div id=\"blog_menu\">\n" +
                 "              <h5>文章分类</h5>\n" +
                 "              <ul>\n" +
                 "                <li><a href=\"/\">全部博客 (10)</a></li>\n" +
                 "                \n" +
                 "                  <li><a href=\"/category/180178\">java (1)</a></li>\n" +
                 "                \n" +
                 "                  <li><a href=\"/category/178810\">JavaScript (2)</a></li>\n" +
                 "                \n" +
                 "                  <li><a href=\"/category/181978\">SQLServer (1)</a></li>\n" +
                 "                \n" +
                 "                  <li><a href=\"/category/214133\">MySQL (1)</a></li>\n" +
                 "                \n" +
                 "                  <li><a href=\"/category/182324\">爬虫 (1)</a></li>\n" +
                 "                \n" +
                 "                  <li><a href=\"/category/195652\">ibatis (2)</a></li>\n" +
                 "                \n" +
                 "                  <li><a href=\"/category/195881\">Spring (1)</a></li>\n" +
                 "                \n" +
                 "                  <li><a href=\"/category/216639\">tomcat (0)</a></li>\n" +
                 "                \n" +
                 "                  <li><a href=\"/category/217595\">数据结构 (1)</a></li>\n" +
                 "                \n" +
                 "              </ul>\n" +
                 "            </div>\n" +
                 "            <div id='month_blogs'>\n" +
                 "              <h5>社区版块</h5>\n" +
                 "              <ul>\n" +
                 "                <li><a href=\"/blog/news\">我的资讯</a> (0)</li>\n" +
                 "                <li>\n" +
                 "                  <a href=\"/blog/post\">我的论坛</a> (0)\n" +
                 "                </li>\n" +
                 "                <li><a href=\"/blog/answered_problems\">我的问答</a> (0)</li>\n" +
                 "              </ul>\n" +
                 "            </div>\n" +
                 "            <div id=\"month_blogs\">\n" +
                 "              <h5>存档分类</h5>\n" +
                 "              <ul>\n" +
                 "                \n" +
                 "                  <li><a href=\"/blog/monthblog/2012-04\">2012-04</a> (2)</li>\n" +
                 "                \n" +
                 "                  <li><a href=\"/blog/monthblog/2012-03\">2012-03</a> (1)</li>\n" +
                 "                \n" +
                 "                  <li><a href=\"/blog/monthblog/2012-02\">2012-02</a> (1)</li>\n" +
                 "                \n" +
                 "                <li><a href=\"/blog/monthblog_more\">更多存档...</a></li>\n" +
                 "              </ul>\n" +
                 "            </div>\n" +
                 "            \n" +
                 "            \n" +
                 "\n" +
                 "            <div id=\"guest_books\">\n" +
                 "              <h5>最新评论</h5>\n" +
                 "              <ul>\n" +
                 "                \n" +
                 "                <li>\n" +
                 "                  <a href='http://marrymyy.iteye.com' target='_blank' title='marrymyy'>marrymyy</a>： \n" +
                 "                  太好了，刚遇到这个问题，有用<br />\n" +
                 "                  <a href=\"/blog/1189699#bc2305339\">尚未备份数据库 &quot;***&quot; 的日志尾部。如果该日志包含您不希望丢失的工作，请使用 BACKUP LOG WITH NORECOVERY 备份该日志。请使用 RE</a>\n" +
                 "                </li>\n" +
                 "                \n" +
                 "              </ul>\n" +
                 "            </div>\n" +
                 "\n" +
                 "            <div class=\"local_bottom\"></div>\n" +
                 "          \n" +
                 "        </div>\n" +
                 "      </div>\n" +
                 "\n" +
                 "      <div id=\"footer\" class=\"clearfix\">\n" +
                 "        <div id=\"copyright\">\n" +
                 "          <hr/>\n" +
                 "          声明：ITeye文章版权属于作者，受法律保护。没有作者书面许可不得转载。若作者同意转载，必须以超链接形式标明文章原始出处和作者。<br />\n" +
                 "          &copy; 2003-2012 ITeye.com.   All rights reserved.  [ 京ICP证110151号  京公网安备110105010620 ]\n" +
                 "        </div>\n" +
                 "      </div>\n" +
                 "    </div>\n" +
                 "    <script type=\"text/javascript\">\n" +
                 "  document.write(\"<img src='http://stat.iteye.com/?url=\"+ encodeURIComponent(document.location.href) + \"&referrer=\" + encodeURIComponent(document.referrer) + \"&user_id=635408' width='0' height='0' />\");\n" +
                 "</script>\n" +
                 "\n" +
                 "    \n" +
                 "    \n" +
                 "  </body>\n" +
                 "</html>\n";
                           String text2="<div>aaa</div>";
        XpathSelector xpathSelector = new XpathSelector("//div[@id='main']/div[@class='blog_main']/div[1][@class='blog_title']/h3/a");
        String select = xpathSelector.select(text);
        Assert.assertEquals("jsoup 解析页面商品信息",select);
    }

    @Test
    public void testOschina(){
        String html = "\n" +
                "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n" +
                "<html lang='zh-CN' xml:lang='zh-CN' xmlns='http://www.w3.org/1999/xhtml'>\n" +
                "<head>\n" +
                "  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>\n" +
                "  <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"/img/favicon.ico\" />\n" +
                "  <title>再次吐槽easyui - 开源中国 OSChina.NET</title>\n" +
                "      <link rel=\"stylesheet\" href=\"/css/style2013.css?ver=20130411\" type=\"text/css\" media=\"screen\" />\n" +
                "  <link rel=\"stylesheet\" href=\"/css/channel.css?date=20130324_2\" type=\"text/css\" media=\"screen\" />\n" +
                "  <link rel=\"stylesheet\" type=\"text/css\" href=\"/js/2011/fancybox/jquery.fancybox-1.3.4.css\" media=\"screen\" />\n" +
                "  <link rel=\"alternate\" type=\"application/rss+xml\" title=\"最新代码分享列表\" href=\"http://www.oschina.net/code/rss\" />\n" +
                "  <link rel=\"alternate\" type=\"application/rss+xml\" title=\"开源中国 - 源码列表\" href=\"http://www.oschina.net/code/source_rss\" />\n" +
                "  <link rel=\"alternate\" type=\"application/rss+xml\" title=\"最新问题列表\" href=\"http://www.oschina.net/question/rss\" />\n" +
                "  <script type=\"text/javascript\" src=\"/js/2012/jquery-1.7.1.min.js\"></script>\n" +
                "  <script type=\"text/javascript\" src=\"/js/2012/jquery.form.js\"></script>\n" +
                "  <script type=\"text/javascript\" src=\"/js/2011/fancybox/jquery.fancybox-fixed.js?20130327\"></script>\n" +
                "      <link rel=\"stylesheet\" href=\"/js/poshytip/tip-yellowsimple/tip-yellowsimple.css\" type=\"text/css\" />\n" +
                "  <script type=\"text/javascript\" src=\"/js/poshytip/jquery.poshytip.min.js\"></script>\n" +
                "    <script type=\"text/javascript\">\n" +
                "  \tg_msg = {\n" +
                "};\n" +
                "\n" +
                "g_user = {\n" +
                "\tid:190591,\n" +
                "\tname:'黄亿华',\n" +
                "\tlogin:true,\n" +
                "\tbportrait:'<img src=\"http://static.oschina.net/uploads/user/95/190591_50.jpg?t=1347254905000\" align=\"absmiddle\" alt=\"黄亿华\" title=\"黄亿华\" class=\"SmallPortrait\" user=\"190591\"/>'\n" +
                "};  </script>\n" +
                "    <script type=\"text/javascript\" src=\"/js/2011/oschina.js?ver=20121007\"></script>\n" +
                "  <script type=\"text/javascript\" src=\"/js/utils.js\"></script>\n" +
                "  <script type=\"text/javascript\" src=\"/js/channel.js\"></script>\n" +
                "      <style type=\"text/css\">\n" +
                "    body,table,input,textarea,select {font-family:Verdana,sans-serif,宋体;}  \n" +
                "  </style>\n" +
                "  </head>\n" +
                "<body>\n" +
                "<div id='OSC_NavTop'>\n" +
                "\t<div class=\"wp998\">\n" +
                "        <div id=\"OSC_Channels\">\n" +
                "        \t<ul>\n" +
                "        \t<li class=\"item\"><a href=\"http://www.oschina.net/\" class='home'>首页</a></li>        \t<li class=\"item\"><a href=\"http://www.oschina.net/project\" class='project'>开源软件</a></li>\n" +
                "        \t<li class=\"item control_select\">\n" +
                "\t\t\t\t<a href=\"http://www.oschina.net/question\" class='question hl'>讨论区</a>\t\t\t\t\n" +
                "\t\t\t\t<ul class=\"cs_content\">\t\t\t\t\t\n" +
                "                \t<li><a href=\"http://www.oschina.net/question?catalog=1\"> 技术问答 &raquo; </a></li>\n" +
                "                \t<li><a href=\"http://www.oschina.net/question?catalog=2\"> 技术分享 &raquo; </a></li>\n" +
                "                \t<li><a href=\"http://www.oschina.net/question?catalog=3\"> IT大杂烩 &raquo; </a></li>\n" +
                "                \t<li><a href=\"http://www.oschina.net/question?catalog=100\"> 职业生涯 &raquo; </a></li>\n" +
                "                \t<li><a href=\"http://www.oschina.net/question?catalog=4\"> 站务/建议 &raquo; </a></li>\n" +
                "                \t<li><a href=\"http://www.oschina.net/alipay\"> 支付宝专区 &raquo; </a></li>\n" +
                "\t\t\t\t</ul>\n" +
                "\t\t\t</li>\n" +
                "        \t<li class=\"item\"><a href=\"http://www.oschina.net/code/list\" class='code'>代码分享</a></li>\n" +
                "        \t        \t<li class=\"item\"><a href=\"http://www.oschina.net/blog\" class='blog'>博客</a></li>\n" +
                "        \t<li class=\"item\"><a href=\"http://www.oschina.net/translate\" class='tran'>翻译</a></li>\n" +
                "            <li class=\"item\"><a href=\"http://www.oschina.net/news\" class='news'>资讯</a></li>\n" +
                "        \t<li class=\"item control_select\">\n" +
                "\t\t\t\t<a href=\"http://www.oschina.net/android\" class='mobile'>移动开发</a>\n" +
                "\t\t\t\t<ul class=\"cs_content cs_mobile\">\n" +
                "                \t<li class=\"android_\"><a href=\"http://www.oschina.net/android\">Android开发专区</a></li>\n" +
                "                \t<li class=\"ios_\"><a href=\"http://www.oschina.net/ios/home\">iOS开发专区</a></li>\n" +
                "                \t<li class=\"ios_\"><a href=\"http://www.oschina.net/ios/codingList\">iOS代码库</a></li>\n" +
                "                \t<li class=\"wp7_\"><a href=\"http://www.oschina.net/wp7\">WP7开发专区</a></li>\n" +
                "\t\t\t\t</ul>\n" +
                "\t\t\t</li>\n" +
                "        \t<li class=\"item t_job\"><a href=\"http://www.oschina.net/job\" class='job'>招聘</a></li>\n" +
                "        \t</ul>\n" +
                "        </div>\n" +
                "\t\t<div id=\"OSC_Userbar\">\n" +
                "                \t\t    \t\t<em>黄亿华</em>,您好 \n" +
                "\t\t\t<span class=\"control_select\">\n" +
                "\t\t\t\t<a href=\"http://my.oschina.net/flashsword\" id=\"MySpace\" title=\"我的空间\">我的空间</a>\n" +
                "\t\t\t\t<ul class=\"cs_content cs_myspace\">\n" +
                "                \t<li class='msg_'><a href='http://www.oschina.net/home/go?page=admin%2Finbox'>站内留言</a></li>\n" +
                "                \t<li class='discuss_'><a href='http://my.oschina.net/flashsword/?ft=bbs&scope=2&showme=1'>我的讨论记录</a></li>\n" +
                "                \t<li class='code_'><a href='http://www.oschina.net/code/list_by_user?id=190591'>我分享的代码</a></li>\n" +
                "                \t<li class='blog_'><a href='http://www.oschina.net/home/go?page=blog'>我的博客</a></li>\n" +
                "                \t<li class='friends_'><a href='http://www.oschina.net/home/go?page=fellow'>我关注的人</a></li>\n" +
                "                \t<li class='favorites_'><a href='http://www.oschina.net/home/go?page=favorites'>我的收藏夹</a></li>\n" +
                "                \t<li class='profile_'><a href='http://www.oschina.net/home/go?page=admin%2Fprofile'>个人资料修改</a></li>\n" +
                "                \t<li class='portrait_'><a href='http://www.oschina.net/home/go?page=admin%2Fportrait'>更改我的头像</a></li>\n" +
                "\t\t\t\t</ul>\n" +
                "\t\t\t</span>&nbsp;|&nbsp;\n" +
                "\t\t\t<a href=\"http://www.oschina.net/home/go?page=admin%2Fnew-project\">添加软件</a>&nbsp;|&nbsp;<a href=\"http://www.oschina.net/home/go?page=admin%2Fnew-release\">投递新闻</a>&nbsp;|&nbsp;<a href=\"/action/user/logout?session=6db40e6e2d1061998068&goto_page=http%3A%2F%2Fwww.oschina.net%2Fquestion%2F818848_107307\">退出</a>\n" +
                "    \t\t\t\t</div>\n" +
                "\t\t<div class='clear'></div>\n" +
                "\t</div>\n" +
                "</div>\n" +
                "<div id='OSC_Banner'><div class=\"wp998\"><a href='http://www.oschina.net/' class='Logo' title='OSChina 开源中国'>开源中国</a>\n" +
                "<h1><a href='/question'>讨论区</a></h1>\n" +
                "<dl>\n" +
                "\t<dt>当前位置：</dt>\n" +
                "\t<dd>\n" +
                "\t\t\t\t\t        \t\t<a href=\"/question\">讨论区</a>&nbsp;&raquo;\n" +
                "        \t\t<a href=\"/question?catalog=1\">技术问答</a>\t\t\t\t\t\t\t\t&raquo;&nbsp;<a href=\"/p/jquery+easyui\">EasyUI</a>\n" +
                "\t\t\t\t\t\t\t\t\t\t</dd>\n" +
                "</dl>\n" +
                "<form action='http://www.oschina.net/search' class='search'>\n" +
                "\t<input type='hidden' name='scope' value='bbs'/>\n" +
                "\t<input id='channel_q' type='text' name='q' value='' placeholder='资讯、软件、分享、代码、博客' class='TXT'/>\n" +
                "    <button type='submit' class='BTN'>搜 索</button>\n" +
                "</form>\n" +
                "<div class='clear'></div></div></div>\n" +
                "<div id=\"OSC_Screen\">\n" +
                "\t<div id=\"OSC_Content\" class='CenterDiv'>\n" +
                "<script type=\"text/javascript\" src=\"/js/scrolltopcontrol.js\"></script>\n" +
                "<script type=\"text/javascript\">\n" +
                "  \tscrolltotop.offset(100,120);\n" +
                "  \tscrolltotop.init();\n" +
                "\t$(function(){\n" +
                "\t\t$('a.ShowUserOutline img.SmallPortrait').poshytip({\n" +
                "\t\t\tclassName: 'tip-yellowsimple',\n" +
                "\t\t\talignTo: 'target',\n" +
                "\t\t\talignX: 'right',\n" +
                "\t\t\talignY: 'inner-top',\n" +
                "\t\t\toffsetX: 5,\n" +
                "\t\t\toffsetY: 0,\n" +
                "\t\t\tfade: false,\n" +
                "\t\t\tslide: false,\n" +
                "\t\t\tcontent: function(updateCallback) {\n" +
                "\t\t\t\tajax_get(\"/action/ajax/get_user_outline?id=\"+$(this).attr('user'),false,function(html){\n" +
                "\t\t\t\t\tupdateCallback(html);\n" +
                "\t\t\t\t});\n" +
                "\t\t\t\treturn \"<div style='height:100px;'>Loading...</div>\";\n" +
                "\t\t\t}\n" +
                "\t\t});\n" +
                "\t});\n" +
                "\tfunction add_to_favorite(pid,concern_it){\n" +
                "\t\t\tif(concern_it){\n" +
                "\t\t\t$(\"#p_attention_count\").load(\"/action/favorite/add?mailnotify=true&type=2&id=\"+pid, {user: '190591'});\n" +
                "\t\t\t$('#attention_it').html('<a href=\"javascript:add_to_favorite('+pid+',false)\">取消</a>');\t\n" +
                "\t\t}\n" +
                "\t\telse{\n" +
                "\t\t\t$(\"#p_attention_count\").load(\"/action/favorite/cancel?type=2&id=\"+pid, {user: '190591'});\n" +
                "\t\t\t$('#attention_it').html('<a href=\"javascript:add_to_favorite('+pid+',true)\">收藏</a>');\n" +
                "\t\t}\n" +
                "\t\t}\n" +
                "</script>\n" +
                "\n" +
                "\n" +
                "\n" +
                "<div class='Question'>\n" +
                "\t\n" +
                "\t<div class='Body'>\n" +
                "\t<div class='Title'>\n" +
                "\t\t<div class='Asker'><a href=\"http://my.oschina.net/u/818848\" class=\"ShowUserOutline\" target=\"_blank\"><img src=\"http://static.oschina.net/uploads/user/409/818848_50.jpg?t=1357353541000\" align=\"absmiddle\" alt=\"午后冬日\" title=\"午后冬日\" class=\"SmallPortrait\" user=\"818848\"/></a></div>\n" +
                "\t\t<div class='QTitle'>\n" +
                "\t\t\t<h1><a href=\"http://www.oschina.net/question/818848_107307\" hidefocus=\"true\" name='top'>再次吐槽easyui</a></h1>\n" +
                "\t\t\t<div class='stat'>\n" +
                "\t\t\t\t<a href=\"http://my.oschina.net/u/818848\" target=\"_blank\">午后冬日</a>\n" +
                "\t\t\t\t发表于 2013-4-21 02:28 13小时前,\n" +
                "\t\t\t\t<a href='#answers' class='answer_count'>3</a>回/289阅,\n" +
                "\t\t\t\t最后回答: 4小时前\t\t\t\t\t\t\t\t\t\t\t</div>\n" +
                "\t\t</div>\n" +
                "\t\t\n" +
                "\t\t<div class='clear'></div>\n" +
                "\t</div>\n" +
                "\t\t    \t    \t\t\t\t\t\n" +
                "\t\t<p style='color:#A00;font-weight:bold;margin:10px 0 0 3px;'>Java、PHP、Ruby、iOS、Python 等 JetBrains 开发工具低至 99  元（3折），<a href='http://www.oschina.net/shop/jetbrains' target='_blank'>详情&raquo;</a></p>\n" +
                "\t\t<div class='Content'>\n" +
                "\t\t\t\t\t\t<div class='detail'>刚用到easyui treegrid组件，发现这货第一次加载时候并没有传默认参数，展开某一列时候才传递id:xx的参数。这样和后台总是疙里疙瘩，像没事就拌嘴的两口子，查网上都遇到相同问题，最好解决方案就是通过 \n" +
                "<span style=\"font-family:Arial, Helvetica, 'Nimbus Sans L', sans-serif;font-size:14px;line-height:normal;background-color:#FFFFFF;\">onBeforeExpand事件来扩展，自行解决。看到官方例子中简洁的代码，感觉easyui耍流氓了，真搞不懂为何要这样实现</span><div class='clear'></div></div>\n" +
                "\t\t\t\t\t\t<div class='Tags'>\n" +
                "\t\t\t\t<strong>标签：</strong>\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t<a href='http://www.oschina.net/question/tag/jquery+easyui' class='tag project' title='jQuery的UI组件 EasyUI'>EasyUI</a> \t\t\t\t\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t<div class='SameQuestions'>\n" +
                "\t\t\t<span id='RQuestionAction'>\n" +
                "\t\t\t\t\t\t\t\t\t<a href=\"javascript:ask_too(107307,true)\" class='rndbutton'><span>我想问同样的问题</span></a>\n" +
                "\t\t\t\t\t\t</span>\n" +
                "\t\t\t共<em id='c_asker_count'>0</em>个人想要问同样的问题\n" +
                "\t\t\t\t\t\t<a href=\"javascript:make_question_more_detail(107307)\">补充话题说明&raquo;</a>\n" +
                "\t\t\t</div>\n" +
                "\t\t\t\t\t\t<div class='EditLogs'>\n" +
                "\t<ul></ul>\n" +
                "</div>\t\t</div>\n" +
                "\t\t<style type='text/css'>\n" +
                "\t\t#favor_form{width:200px;}\n" +
                "        #favor_form p {color:#666;}\n" +
                "        #favor_form form{height:60px;width:200px;}\n" +
                "        #favor_form form ._favor_input{display:block;margin:2px 0;width:199px;}\n" +
                "        #favor_form form ._favor_button{float:left;padding:2px 5px;}\n" +
                "        .favor_ok {text-align:center;font-size:10.5pt;width:199px;height:60px;margin-top:10px;}\n" +
                "        #TagsSwitcher{cursor:pointer;float:right;margin-top:10px;}\n" +
                "        #MyTags{display:none;width:199px;}\n" +
                "        #MyTags a.tag {float:left; background-color: #E0EAF1;border-bottom: 1px solid #3E6D8E;border-right: 1px solid #7F9FB6;color: #3E6D8E;font-size: 8pt;line-height: 16px;margin: 2px 2px 2px 0;padding: 2px 4px;text-decoration: none;white-space: nowrap;}\n" +
                "\t\t.osc_promotion{ position: relative; display: inline-block; padding: 10px; margin: 10px 0; border: 1px solid #ccc;}\n" +
                "        .osc_promotion .c{ position: absolute; right: -1px; top: -1px;}\n" +
                "\t\t.ask_toolbar {float:right;list-style: none; font-size: 12px; color: #333; height: 28px;_padding-top: 5px; overflow: hidden;margin:20px 0 10px 0;}\n" +
                "        .ask_toolbar div{ float: left; margin-left: 5px; background: url(\"/img/ask-icon.gif\") no-repeat; padding: 6px 0 6px 15px; padding-left: 15px; height: 16px;}\n" +
                "        .ask_toolbar a{ height: 16px; color: #333; text-decoration: none; display:inline-block; zoom:1; vertical-align: middle; }\n" +
                "        .ask_share{width: 89px;vertical-align: bottom; line-height: 15px; _line-height: 14px;}\n" +
                "        .ask_share a{background: url(\"/img/ask-icon.gif\"); width: 16px; }\n" +
                "        a.ask_share_sina{ background: url(\"/img/ask-icon.gif\") 0 -40px no-repeat; margin-left: 5px;  }\n" +
                "        a.ask_share_tencent{background-position: 0 -70px; margin-left: 5px; }\n" +
                "        .ask_toolbar em{ height: 28px; line-height:28px; width: 14px; display: inline-block; float: left; background: url(\"/img/ask-icon.gif\") top right;}\n" +
                "        .ask_collect a,.ask_report a, .ask_vote a, .ask_collected a{padding-left: 20px; line-height: 15px; }\n" +
                "        .ask_collect a{ background: url(\"/img/ask-icon.gif\") 0 -131px no-repeat; }\n" +
                "        .ask_collected a{ background: url(\"/img/ask-icon.gif\") 0 -100px no-repeat; }\n" +
                "        div.ask_collect_count{ background: url(\"/img/ask-icon.gif\") 0 -309px no-repeat; font-weight: bold; font-size: 14px; margin-left: 0; height: 16px;line-height: 16px;}\n" +
                "        .ask_report a{ background: url(\"/img/ask-icon.gif\") 0 -160px no-repeat;}\n" +
                "        em.ask_collect_count_r{background-position: 59px -309px;}\n" +
                "        .ask_vote a{background: url(\"/img/ask-icon.gif\");}\n" +
                "        \t\ta.ask_vote_up{background-position: 3px -190px;}\n" +
                "        a.ask_vote_down{background-position: 0 -280px;}\n" +
                "        a.ask_vote_uped {background-position: 3px -190px;}\n" +
                "        \t\ta.ask_vote_downed {background-position: 0 -280px;}\n" +
                "        .ask_vote span{ display: inline-block; margin: 0 10px; font-weight: bold; font-size: 14px; vertical-align: middle; margin-bottom: 2px; line-height: 16px;}\n" +
                "\t\tspan.vote-down-count{margin:0 3px;}\n" +
                "\t\tspan.vote-up-count{margin:0 3px;}\n" +
                "\t\t</style>\n" +
                "\t\t<div class='clear'></div>\n" +
                "        \n" +
                "\t\t\t\t<div class=\"ask_toolbar\">\n" +
                "\t\t\t<div class=\"ask_share\"><b>分享到</b> <a class=\"ask_share_sina\" title=\"分享到新浪微博\"  href=\"javascript:void((function(s,d,e,r,l,p,t,z,c){var%20f='http://v.t.sina.com.cn/share/share.php?appkey=858381728',u=z||d.location,p=['&url=',e(u),'&title=',e(t||d.title),'&source=',e(r),'&sourceUrl=',e(l),'&content=',c||'gb2312','&pic=',e(p||'')].join('');function%20a(){if(!window.open([f,p].join(''),'mb',['toolbar=0,status=0,resizable=1,width=440,height=430,left=',(s.width-440)/2,',top=',(s.height-430)/2].join('')))u.href=[f,p].join('');};if(/Firefox/.test(navigator.userAgent))setTimeout(a,0);else%20a();})(screen,document,encodeURIComponent,'','','','再次吐槽easyui: 刚用到easyui treegrid组件，发现这货第一次加载时候并没有传默认参数，展开某一列时候才传递id:xx的参数。这样和后台总是疙里疙瘩，像没事就拌嘴的两口子，查网上都遇到...','','utf-8'));\"></a><a class=\"ask_share_tencent\" title=\"分享到腾讯微博\"  href=\"javascript:(function(){window.open('http://v.t.qq.com/share/share.php?url='+encodeURIComponent(document.location)+'&amp;appkey=96f54f97c4de46e393c4835a266207f4&amp;site=&amp;title='+encodeURIComponent(document.title)+encodeURIComponent(': 刚用到easyui treegrid组件，发现这货第一次加载时候并没有传默认参数，展开某一列时候才传递id:xx的参数。这样和后台总是疙里疙瘩，像没事就拌嘴的两口子，查网上都遇到...'),'', 'width=450, height=400, top=0, left=0, toolbar=no, menubar=no, scrollbars=no, location=yes, resizable=no, status=no');}())\"></a></div><em></em>\n" +
                "\t\t\t<div class=\"ask_collect\"><a title=\"收藏此话题\" id=\"favor_trigger\" href=\"javascript:;\">收藏</a></div><em></em>\n" +
                "\t\t\t<div class=\"ask_collect_count\" id=\"p_favor_count\">1</div><em class=\"ask_collect_count_r\"></em>\n" +
                "\t\t\t<div class=\"ask_report\"><a href=\"javascript:report('http://www.oschina.net/question/818848_107307',107307,2)\">举报</a></div><em></em>\n" +
                "\t\t\t<div class='ask_vote' id='Vote'>\n" +
                "\t\t\t\t\t\t\t\t        \t\t\t<a id=\"vote_down\" class=\"ask_vote_down\" href=\"javascript:;\" title=\"踩：这问题不知道在说什么，或者没什么用\">踩</a>\n" +
                "\t\t\t\t\t\t\t\t<span class='vote-down-count'>0</span>\n" +
                "\t\t\t\t|\n" +
                "\t\t\t\t\t\t\t\t        \t\t\t<a id=\"vote_up\" class=\"ask_vote_up\" href=\"javascript:;\" title=\"顶：这问题很有用或者很清晰明了\">顶</a>\n" +
                "\t\t\t\t\t\t\t\t<span class='vote-up-count'>0</span>\n" +
                "\t\t\t</div>\n" +
                "\t\t\t<em></em>\n" +
                "\t\t</div>\n" +
                "\t\t<div class='clear'></div>\n" +
                "\t\t\t\t\t\t        <div class='QuestionReplies'>\n" +
                "\t\t\t\n" +
                "        \t<h2>\t\t\t\n" +
                "\t\t\t\t<span class='sort'>\n" +
                "\t\t\t\t\t<a href=\"http://www.oschina.net/question/818848_107307#answers\" class='current'>按评价排序</a>&nbsp;|\n" +
                "\t\t\t\t\t<a href=\"?sort=time#answers\">显示最新答案</a>&nbsp;|&nbsp;<a href=\"#top\" style='padding-left:0;'>回页面顶部</a>\n" +
                "\t\t\t\t</span>\n" +
                "\t\t\t\t<a name='answers'></a>共有<em class='answer_count'>3</em>个答案 <a href=\"#answerform\" class='answer'>我要回答&raquo;</a>\n" +
                "\t\t\t</h2>\n" +
                "\t\t\t        \t<ul class='list'><li class='Answer' id='answer_467005'>\n" +
                "\t<div class='user'><a href=\"http://my.oschina.net/u/224858\" class=\"ShowUserOutline\" name=\"AnchorAnswer467005\" target=\"_blank\"><img src=\"http://static.oschina.net/uploads/user/112/224858_50.jpg\" align=\"absmiddle\" alt=\"布谷鸟\" title=\"布谷鸟\" class=\"SmallPortrait\" user=\"224858\"/></a></div>\n" +
                "\t<div class='body'>\n" +
                "\t\t<div class='time'><a href=\"http://my.oschina.net/u/224858\" target=\"_blank\">布谷鸟</a> 回答于 2013-04-21 09:28 </div>\t\t\n" +
                "    \t<div class='opts'>\n" +
                "\t\t\t    \t\t    \t\t<a href=\"javascript:report('http://www.oschina.net/question/818848_107307#AnchorAnswer467005',467005,17)\">举报</a>\n" +
                "    \t</div>\n" +
                "\t\t<div class='clear'></div>\n" +
                "\t\t<div class='detail'>对话框、日期控件和选项卡效果还不错，树状菜单没得zTree好用，建议楼主不要全部效果都依赖于此框架，有些easyui实现不好的地方可以换其它的插件实现嘛，反正我现在再也不用诸如ext和easyui之类的东西了，感觉好肥</div>\n" +
                "\t</div>\n" +
                "\t<div class='clear'></div>\n" +
                "\t<div class='replies' id='PostReplies_467005'><strong>--- 共有 1 条评论 --- </strong>\n" +
                "<ul>\n" +
                "\t\t<li id='PostReply_467044'>\n" +
                "\t\t<a href=\"http://my.oschina.net/u/818848\" class='p' name='AnchorAnswer467044'><img src=\"http://static.oschina.net/uploads/user/409/818848_50.jpg?t=1357353541000\" align=\"absmiddle\" alt=\"午后冬日\" title=\"午后冬日\" class=\"SmallPortrait\" user=\"818848\"/></a>\n" +
                "\t\t<span class='b'>\n" +
                "\t\t<span class='c'>前端水平实在有限，自己搞的总是感觉不伦不类，只能用这些框架，再集成其它插件，切换主题时风格又不一致。</span>\n" +
                "\t\t<span class='t'>(4小时前 by 午后冬日)</span>\n" +
                "\t\t<span class='opts'><a href=\"javascript:reply_to_post(467005,818848)\">回复</a></span>\n" +
                "\t\t</span>\n" +
                "\t\t<div class='clear'></div>\n" +
                "\t</li>\n" +
                "\t</ul>\n" +
                "<div class='PagerLinks'>\n" +
                "</div>\n" +
                "</div>\n" +
                "\t<div class='votes'>\t\t\t\t\t\t<a id='a_post_voteup_467005' href=\"javascript:vote_answer(467005,true,true)\" title=\"这是一个好答案，能解决问题\">有帮助</a><em id='post_voteup_467005'>(1)</em>&nbsp;|\n" +
                "\t\t<a id='a_post_votedown_467005' href=\"javascript:vote_answer(467005,false,true)\" title=\"这答案无法解决问题，或者模糊不清\">没帮助</a><em id='post_votedown_467005'>(0)</em>&nbsp;|\n" +
                "\t\t<a href=\"javascript:reply_to_post(467005, 0)\">评论</a><em>(1)</em>&nbsp;|\n" +
                "    \t<a href=\"/question/answer?question=107307&amp;answer=467005\">引用此答案</a>\t</div>\n" +
                "</li><li class='Answer' id='answer_467039'>\n" +
                "\t<div class='user'><a href=\"http://my.oschina.net/rox\" class=\"ShowUserOutline\" name=\"AnchorAnswer467039\" target=\"_blank\"><img src=\"http://static.oschina.net/uploads/user/0/180_50.jpg\" align=\"absmiddle\" alt=\"静风流云\" title=\"静风流云\" class=\"SmallPortrait\" user=\"180\"/></a></div>\n" +
                "\t<div class='body'>\n" +
                "\t\t<div class='time'><a href=\"http://my.oschina.net/rox\" target=\"_blank\">静风流云</a> 回答于 2013-04-21 11:08 </div>\t\t\n" +
                "    \t<div class='opts'>\n" +
                "\t\t\t    \t\t    \t\t<a href=\"javascript:report('http://www.oschina.net/question/818848_107307#AnchorAnswer467039',467039,17)\">举报</a>\n" +
                "    \t</div>\n" +
                "\t\t<div class='clear'></div>\n" +
                "\t\t<div class='detail'><p> 没办法，原来项目也是因为客户特殊的需求，对layout选型的时候，犹豫了好久，最终放弃了。<br /> 幸亏来了一个厉害的前端，解决问题，够用就好。 </p></div>\n" +
                "\t</div>\n" +
                "\t<div class='clear'></div>\n" +
                "\t<div class='replies' id='PostReplies_467039'><strong>--- 共有 1 条评论 --- </strong>\n" +
                "<ul>\n" +
                "\t\t<li id='PostReply_467046'>\n" +
                "\t\t<a href=\"http://my.oschina.net/u/818848\" class='p' name='AnchorAnswer467046'><img src=\"http://static.oschina.net/uploads/user/409/818848_50.jpg?t=1357353541000\" align=\"absmiddle\" alt=\"午后冬日\" title=\"午后冬日\" class=\"SmallPortrait\" user=\"818848\"/></a>\n" +
                "\t\t<span class='b'>\n" +
                "\t\t<span class='c'>我也是犹豫了好久，看过很多前端框架，总是不太满意。个人开发前台后台数据库全部要自己搞定，郁闷ing</span>\n" +
                "\t\t<span class='t'>(4小时前 by 午后冬日)</span>\n" +
                "\t\t<span class='opts'><a href=\"javascript:reply_to_post(467039,818848)\">回复</a></span>\n" +
                "\t\t</span>\n" +
                "\t\t<div class='clear'></div>\n" +
                "\t</li>\n" +
                "\t</ul>\n" +
                "<div class='PagerLinks'>\n" +
                "</div>\n" +
                "</div>\n" +
                "\t<div class='votes'>\t\t\t\t\t\t<a id='a_post_voteup_467039' href=\"javascript:vote_answer(467039,true,true)\" title=\"这是一个好答案，能解决问题\">有帮助</a><em id='post_voteup_467039'>(0)</em>&nbsp;|\n" +
                "\t\t<a id='a_post_votedown_467039' href=\"javascript:vote_answer(467039,false,true)\" title=\"这答案无法解决问题，或者模糊不清\">没帮助</a><em id='post_votedown_467039'>(0)</em>&nbsp;|\n" +
                "\t\t<a href=\"javascript:reply_to_post(467039, 0)\">评论</a><em>(1)</em>&nbsp;|\n" +
                "    \t<a href=\"/question/answer?question=107307&amp;answer=467039\">引用此答案</a>\t</div>\n" +
                "</li><li class='Answer' id='answer_467051'>\n" +
                "\t<div class='user'><a href=\"http://my.oschina.net/u/224858\" class=\"ShowUserOutline\" name=\"AnchorAnswer467051\" target=\"_blank\"><img src=\"http://static.oschina.net/uploads/user/112/224858_50.jpg\" align=\"absmiddle\" alt=\"布谷鸟\" title=\"布谷鸟\" class=\"SmallPortrait\" user=\"224858\"/></a></div>\n" +
                "\t<div class='body'>\n" +
                "\t\t<div class='time'><a href=\"http://my.oschina.net/u/224858\" target=\"_blank\">布谷鸟</a> 回答于 2013-04-21 11:29 </div>\t\t\n" +
                "    \t<div class='opts'>\n" +
                "\t\t\t    \t\t    \t\t<a href=\"javascript:report('http://www.oschina.net/question/818848_107307#AnchorAnswer467051',467051,17)\">举报</a>\n" +
                "    \t</div>\n" +
                "\t\t<div class='clear'></div>\n" +
                "\t\t<div class='detail'><div class=\"ref\"><h4>引用来自“布谷鸟”的答案</h4><div class=ref_body>对话框、日期控件和选项卡效果还不错，树状菜单没得zTree好用，建议楼主不要全部效果都依赖于此框架，有些easyui实现不好的地方可以换其它的插件实现嘛，反正我现在再也不用诸如ext和easyui之类的东西了，感觉好肥</div></div><div class=a_body>前后端你一个人搞啊？那确实很麻烦。面面俱到的话，工作量很大。但是如果需要实现的功能不是很多，而时间也不紧迫的话，事情干起来也还不错。如非必须，建议逐步弃用这些前端框架，在一些比较能够提升体验的地方选用一些适当的插件即可，如此也不再需要担心风格的问题，你看osc后台截图，界面那叫一个丑，用得方便顺手就够了</div></div>\n" +
                "\t</div>\n" +
                "\t<div class='clear'></div>\n" +
                "\t<div class='replies' id='PostReplies_467051'></div>\n" +
                "\t<div class='votes'>\t\t\t\t\t\t<a id='a_post_voteup_467051' href=\"javascript:vote_answer(467051,true,true)\" title=\"这是一个好答案，能解决问题\">有帮助</a><em id='post_voteup_467051'>(0)</em>&nbsp;|\n" +
                "\t\t<a id='a_post_votedown_467051' href=\"javascript:vote_answer(467051,false,true)\" title=\"这答案无法解决问题，或者模糊不清\">没帮助</a><em id='post_votedown_467051'>(0)</em>&nbsp;|\n" +
                "\t\t<a href=\"javascript:reply_to_post(467051, 0)\">评论</a><em>(0)</em>&nbsp;|\n" +
                "    \t<a href=\"/question/answer?question=107307&amp;answer=467051\">引用此答案</a>\t</div>\n" +
                "</li></ul>\n" +
                "\t\t\t\t        </div> \n" +
                "\t\t<div class='AnswerForm'>\n" +
                "\t\t\t<div class='user'><a href=\"http://my.oschina.net/flashsword\" name=\"answerform\"><img src=\"http://static.oschina.net/uploads/user/95/190591_50.jpg?t=1347254905000\" align=\"absmiddle\" alt=\"黄亿华\" title=\"黄亿华\" class=\"SmallPortrait\" user=\"190591\"/></a></div>\n" +
                "\t\t\t<form id='form_answer' action=\"/action/question/answer?question=107307\" method=\"post\">\n" +
                "\t\t\t\t<input type='hidden' name='user' value='190591'/>\n" +
                "\t\t\t\t<textarea id='txt_answner' name='body' style='width:560px;height:160px;'></textarea>\n" +
                "\t\t\t\t<input type='submit' value=' 我要回答 ' id=\"FormSubmitButton\" class='rndbutton'/>\n" +
                "\t\t\t\t<span id='form_msg' style='display:none;'></span>\n" +
                "\t\t\t\t<br/><br/>\n" +
                "\t\t\t\t<a href=\"#answers\">回答案顶部</a>&nbsp;|&nbsp;<a href=\"#top\">回页面顶部</a>\n" +
                "\t\t\t</form>\n" +
                "\t\t\t<div class='clear'></div>\n" +
                "\t\t\t<script>\t\t\t\n" +
                "            $('#form_answer').ajaxForm({\n" +
                "            \tdataType: 'json',\n" +
                "        \t\tbeforeSerialize: function($form, options) { \n" +
                "        \t\t\teditor.sync();           \n" +
                "                },\n" +
                "        \t\tbeforeSubmit: function(){\n" +
                "        \t\t\t$('#FormSubmitButton').attr('disabled','disabled');\n" +
                "        \t\t\t$('#form_msg').html(\"<span class='ajax_processing'>正在提交答案，请稍候...</span>\");\t\n" +
                "        \t\t\t$('#form_msg').show();\t\n" +
                "        \t\t},\n" +
                "                success: function(json) {\n" +
                "        \t\t\t$('#FormSubmitButton').removeAttr('disabled');\n" +
                "            \t\tif(json.msg){\n" +
                "        \t\t\t\t$('#form_msg').html(\"<span class='error_msg'>\"+json.msg+\"</span>\");\n" +
                "        \t\t\t\t$('#form_msg').show();\n" +
                "        \t\t\t}\n" +
                "            \t\telse if(json.id){\n" +
                "            \t\t\tajax_get(\"/question/show_answer?_answer_id=\"+json.id, true, function(data){\n" +
                "        \t\t\t\t\t            \t\t\t\t$('.QuestionReplies ul.list').append(data);\n" +
                "        \t\t\t\t\t        \t\t\t\t\teditor.html('');\n" +
                "        \t\t\t\t\t$('.answer_count').html(json.answer_count);\n" +
                "            \t\t\t}); \t\t\t\t\n" +
                "        \t\t\t\t$('#form_msg').hide();\n" +
                "            \t\t}\n" +
                "                }\n" +
                "            });\n" +
                "\t\t\t</script>\n" +
                "\t\t</div>\n" +
                "\t</div>\t\n" +
                "\t<script type=\"text/javascript\" src=\"/js/syntax-highlighter-2.1.382/scripts/brush.js\"></script>\n" +
                "<link type=\"text/css\" rel=\"stylesheet\" href=\"/js/syntax-highlighter-2.1.382/styles/shCore.css\"/>\n" +
                "<link type=\"text/css\" rel=\"stylesheet\" href=\"/js/syntax-highlighter-2.1.382/styles/shThemeDefault.css\"/>\n" +
                "<script type='text/javascript'><!--\n" +
                "$(document).ready(function(){\n" +
                "\tSyntaxHighlighter.config.clipboardSwf = '/js/syntax-highlighter-2.1.382/scripts/clipboard.swf';\n" +
                "\tSyntaxHighlighter.all();\n" +
                "});\n" +
                "//-->\n" +
                "</script>\n" +
                "\t<div class='QuestionRelations'>\n" +
                "\t <div style='text-align:center;margin-bottom:10px;'>\n" +
                "    \t<a href=\"http://www.oschina.net/action/visit/ad?id=1033\" target=\"_blank\" title=\"JPush——极光推送\"><img src=\"http://static.oschina.net/uploads/space/2013/0319/103739_17pH_179699.jpg\"/></a>\n" +
                "\t</div>\n" +
                "\t\t<div id='QuestionWizard'>\n" +
                "\t\t\t有什么技术问题吗？\n" +
                "\t\t\t<a href='/question/ask' class='rndbutton'><span>我要提问</span></a>\n" +
                "\t\t\t<div class='clear'></div>\n" +
                "\t\t</div>\n" +
                "\t\t\n" +
                "\t\t\t\t\t\t<div id='OtherQuestionsOfUser' class='Qlist'>\n" +
                "\t\t\t<strong><a href=\"http://my.oschina.net/u/818848/?ft=bbs&scope=2&showme=1\" class=\"more\">全部(29)...</a><em>午后冬日</em>的其他问题</strong>\n" +
                "\t\t\t<ul>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"http://www.oschina.net/question/818848_106829\" title=\"是jsf还是ajax框架，这是个问题\">是jsf还是ajax框架，这是个问题</a><span class='date'>(4回/194阅,4天前)</span></li>\t\t\t\t\t\t<li><a href=\"http://www.oschina.net/question/818848_106805\" title=\"关于ireport的问题\">关于ireport的问题</a><span class='date'>(0回/4阅,4天前)</span></li>\t\t\t\t\t\t<li><a href=\"http://www.oschina.net/question/818848_106539\" title=\"关于JasperReports的问题\">关于JasperReports的问题</a><span class='date'>(2回/47阅,6天前)</span></li>\t\t\t\t\t\t<li><a href=\"http://www.oschina.net/question/818848_105917\" title=\"IDEA代码编辑窗口能不能上下分屏\">IDEA代码编辑窗口能不能上下分屏</a><span class='date'>(2回/53阅,10天前)</span></li>\t\t\t\t\t\t</ul>\n" +
                "\t\t</div>\n" +
                "\t\t\t\t<div style='text-align:center;margin-top:20px;'>\n" +
                "\t\t<script type=\"text/javascript\" src=\"/js/ad/question.js\"></script>\n" +
                "\t\t</div>\n" +
                "\t\t\n" +
                "\t\t<div id='Similarity' class='Qlist'>\n" +
                "\t\t\t<strong>类似的话题</strong>\n" +
                "\t\t\t<ul>\n" +
                "        \t\t\t\t<li><a href=\"http://www.oschina.net/question/267632_49688\" title=\"jQuery easyUI 分页(Pagination)用法\">jQuery easyUI 分页(Pagination)用法</a><span class='date'>(2回/1228阅,1年前)</span></li>\t\t\t\t\t\t<li><a href=\"http://www.oschina.net/question/138848_49846\" title=\"谨慎使用EasyUI\">谨慎使用EasyUI</a><span class='date'>(1回/1361阅,1年前)</span></li>\t\t\t\t\t\t<li><a href=\"http://www.oschina.net/question/205548_31992\" title=\"easyui datagird 初始化加载俩次\">easyui datagird 初始化加载俩次</a><span class='date'>(6回/690阅,1年前)</span></li>\t\t\t\t\t\t<li><a href=\"http://www.oschina.net/question/84535_32061\" title=\"打算使用easyui,求源码,求建议~\">打算使用easyui,求源码,求建议~</a><span class='date'>(17回/4105阅,1年前)</span></li>\t\t\t\t\t\t<li><a href=\"http://www.oschina.net/question/201422_32682\" title=\"jquery easyui form 有没好的设计\">jquery easyui form 有没好的设计</a><span class='date'>(2回/812阅,1年前)</span></li>\t\t\t\t\t\t<li><a href=\"http://www.oschina.net/question/183509_32885\" title=\"jeasyui 中combobox的onselect事件怎么做下拉框的级联\">jeasyui 中combobox的onselect事件怎么做下拉框的级联</a><span class='date'>(1回/741阅,1年前)</span></li>\t\t\t\t\t\t<li><a href=\"http://www.oschina.net/question/161511_36411\" title=\"easyui  treegrid行编辑 效率慢怎么解决?\">easyui  treegrid行编辑 效率慢怎么解决?</a><span class='date'>(1回/671阅,1年前)</span></li>\t\t\t\t\t\t<li><a href=\"http://www.oschina.net/question/166022_24392\" title=\"ComboGrid怎么动态绑定ds呢？\">ComboGrid怎么动态绑定ds呢？</a><span class='date'>(2回/427阅,1年前)</span></li>\t\t\t\t\t\t<li><a href=\"http://www.oschina.net/question/146658_24974\" title=\"easyui中怎么显示一个list的数据？\">easyui中怎么显示一个list的数据？</a><span class='date'>(1回/594阅,1年前)</span></li>\t\t\t\t\t\t<li><a href=\"http://www.oschina.net/question/97507_26165\" title=\"jquery easyui 組件無法顯示\">jquery easyui 組件無法顯示</a><span class='date'>(2回/671阅,1年前)</span></li>\t\t\t\t\t\t<li><a href=\"http://www.oschina.net/question/46586_16818\" title=\"关于jQuery EasyUI Form的问题\">关于jQuery EasyUI Form的问题</a><span class='date'>(2回/1103阅,2年前)</span></li>\t\t\t\t\t\t<li><a href=\"http://www.oschina.net/question/59256_17359\" title=\"jquery easyUI \">jquery easyUI </a><span class='date'>(1回/557阅,2年前)</span></li>\t\t\t\t\t\t<li><a href=\"http://www.oschina.net/question/188775_77569\" title=\"easyui中有没有点击datagrid的一个单元格 ，就使这个单元格变成可编辑的办法呢 \">easyui中有没有点击datagrid的一个单元格 ，就使这个单元格变成可编辑的办法呢 </a><span class='date'>(1回/890阅,5个月前)</span></li>\t\t\t\t\t\t<li><a href=\"http://www.oschina.net/question/256315_79207\" title=\"jQuery easyui：点击tree控件后无法获取node属性\">jQuery easyui：点击tree控件后无法获取node属性</a><span class='date'>(3回/533阅,5个月前)</span></li>\t\t\t\t\t\t<li><a href=\"http://www.oschina.net/question/580112_79227\" title=\"EasyUI 中tab标签的选项卡 置于左边是怎么实现的\">EasyUI 中tab标签的选项卡 置于左边是怎么实现的</a><span class='date'>(5回/426阅,5个月前)</span></li>\t\t\t\t\t\t<li><a href=\"http://www.oschina.net/question/868642_79423\" title=\"easyui无法跳转到 指定action   各位帮忙看看哪里有问题么？\">easyui无法跳转到 指定action   各位帮忙看看哪里有问题么？</a><span class='date'>(2回/162阅,5个月前)</span></li>\t\t\t\t\t\t</ul>\n" +
                "\t\t</div>\n" +
                "\t</div>\n" +
                "\t<div class='clear'></div>   \n" +
                "</div>\n" +
                "<script type='text/javascript' src='/js/ke/kindeditor-min.js?v=4.1.4' charset='utf-8'></script>\n" +
                "<script type='text/javascript'>\n" +
                "<!--\n" +
                "var editor;\n" +
                "KindEditor.ready(function(K) {\n" +
                "    editor = K.create('#txt_answner', {\n" +
                "\t\tthemeType : 'oschina',\n" +
                "\t\tresizeType : 1,\n" +
                "\t\turlType: 'domain',\n" +
                "\t\tshadowMode : false,\n" +
                "\t\tallowPreviewEmoticons : false,\n" +
                "\t\tallowImageUpload : true,\n" +
                "\t\tallowFlashUpload : false,\n" +
                "\t\tcssPath : '/css/ke-oschina.css',\n" +
                "\t\tuploadJson : '/action/blog/upload_img',\n" +
                "\t\tafterCreate : function(){\n" +
                "\t\t\t/*\n" +
                "\t\t\tK.ctrl(this.edit.iframe.get(0).contentWindow.document, 13, function() {\n" +
                "\t\t\t\t$(\"#txt_answner\").parent().submit();\n" +
                "\t\t\t});\n" +
                "\t\t\t*/\n" +
                "\t\t\t$(this.edit.iframe.get(0).contentWindow.document).keydown(function(e) {\n" +
                "\t\t\t\tif ((e.ctrlKey || e.metaKey) && e.which == 13 && !e.shiftKey && !e.altKey){\n" +
                "\t\t\t\t\t$(\"#txt_answner\").parent().submit();\n" +
                "\t\t\t\t}\n" +
                "\t\t\t});\n" +
                "\t\t},\n" +
                "\t\tafterChange : function() {\n" +
                "\t\t\tthis.sync();\n" +
                "\t\t},\n" +
                "\t\titems : ['bold', 'italic', 'underline', 'strikethrough', 'removeformat','|','insertorderedlist', 'insertunorderedlist', \n" +
                "\t\t\t\t 'forecolor', 'hilitecolor', 'fontname', 'fontsize',  '|', 'link', 'unlink', 'emoticons', \n" +
                "\t\t\t\t 'shcode', 'image', 'flash', 'quote', '|', 'source','about'],\n" +
                "\t\thtmlTags:\n" +
                "\t\t{\n" +
                "\t\t\tscript : ['src'],\n" +
                "            font : ['color', 'size', 'face', '.background-color'],\n" +
                "            span : [\n" +
                "                    '.color', '.background-color', '.font-size', '.font-family', '.background',\n" +
                "                    '.font-weight', '.font-style', '.text-decoration', '.vertical-align', '.line-height'\n" +
                "            ],\n" +
                "            div : [\n" +
                "                    'class', 'align', '.border', '.margin', '.padding', '.text-align', '.color',\n" +
                "                    '.background-color', '.font-size', '.font-family', '.font-weight', '.background',\n" +
                "                    '.font-style', '.text-decoration', '.vertical-align', '.margin-left'\n" +
                "            ],\n" +
                "            table: [\n" +
                "                    'border', 'cellspacing', 'cellpadding', 'width', 'height', 'align', 'bordercolor',\n" +
                "                    '.padding', '.margin', '.border', 'bgcolor', '.text-align', '.color', '.background-color',\n" +
                "                    '.font-size', '.font-family', '.font-weight', '.font-style', '.text-decoration', '.background',\n" +
                "                    '.width', '.height', '.border-collapse'\n" +
                "            ],\n" +
                "            'td,th': [\n" +
                "                    'align', 'valign', 'width', 'height', 'colspan', 'rowspan', 'bgcolor',\n" +
                "                    '.text-align', '.color', '.background-color', '.font-size', '.font-family', '.font-weight',\n" +
                "                    '.font-style', '.text-decoration', '.vertical-align', '.background', '.border'\n" +
                "            ],\n" +
                "            a : ['href', 'target', 'name'],\n" +
                "            embed : ['src', 'width', 'height', 'type', 'loop', 'autostart', 'quality', '.width', '.height', 'align', 'allowscriptaccess'],\n" +
                "            img : ['src', 'width', 'height', 'border', 'alt', 'title', 'align', '.width', '.height', '.border'],\n" +
                "            'p,ol,ul,li,blockquote,h1,h2,h3,h4,h5,h6' : [\n" +
                "                    'align', '.text-align', '.color', '.background-color', '.font-size', '.font-family', '.background',\n" +
                "                    '.font-weight', '.font-style', '.text-decoration', '.vertical-align', '.text-indent', '.margin-left'\n" +
                "            ],\n" +
                "            pre : ['class'],\n" +
                "            hr : ['class', '.page-break-after'],\n" +
                "            'br,tbody,tr,strong,b,sub,sup,em,i,u,strike,s,del' : []\n" +
                "\t\t}\n" +
                "    });\n" +
                "});\n" +
                "//-->\n" +
                "</script>\n" +
                "<!--[if lt IE 7]>\n" +
                "<script type=\"text/javascript\" src=\"/js/minmax.js\"></script>\n" +
                "<![endif]-->\n" +
                "<script type=\"text/javascript\" src=\"/action/visit/question?id=107307\"></script>\n" +
                "<script type='text/javascript'>\n" +
                "<!--\n" +
                "$(document).ready(function() {\n" +
                "\t$('.Answer .replies li').hover(\n" +
                "\t\tfunction(){$(this).addClass('hover');},\n" +
                "\t\tfunction(){$(this).removeClass('hover');}\n" +
                "\t);\t\n" +
                "\t\n" +
                "    $('.detail img').css('cursor','pointer');\n" +
                "    jQuery.each($('.detail img'),function(idx,v){\n" +
                "    \t$(v).wrap(\"<a href='\"+$(this).attr('src')+\"' target='_blank'></a>\");\n" +
                "    });\n" +
                "\t\n" +
                "\t$('#c').bind('mouseover mouseout',function(){\n" +
                "\t\t$('#c_on').toggle();\n" +
                "\t\t$('#c_off').toggle();\n" +
                "\t});\n" +
                "\t\n" +
                "\t$('#favor_trigger').click(function(){\n" +
                "\t\t\tadd_to_favor(107307,2);\n" +
                "\t\t});\n" +
                "});\n" +
                "function ask_too(qid, ask){\n" +
                "\tajax_post(\"/action/question/ask_too?id=\"+qid+\"&ask=\"+ask,\"\",function(html){\n" +
                "\t\tjson = eval('('+html+')');\n" +
                "\t\tif(json.asker_count >= 0){\n" +
                "\t\t\t$('#c_asker_count').html(json.asker_count);\n" +
                "\t\t\tif(json.ask_mode)\n" +
                "\t\t\t\t$('#RQuestionAction').html(\"<span class='rect'>已问同一问题 | <a href='javascript:ask_too(107307,false)'>取消？</a></span>\");\n" +
                "\t\t\telse\n" +
                "\t\t\t\t$('#RQuestionAction').html(\"<a href='javascript:ask_too(107307,true)' class='rndbutton'><span>我想问同样的问题</span></a>\");\t\t\t\n" +
                "\t\t}\n" +
                "\t\telse{\n" +
                "\t\t\t$('#RQuestionAction').poshytip({\n" +
                "\t\t\t\tclassName: 'tip-yellowsimple',\n" +
                "\t\t\t\tcontent: json.msg,\n" +
                "\t\t\t\tshowOn: 'none',\n" +
                "\t\t\t\talignTo: 'target',\n" +
                "\t\t\t\talignX: 'center',\n" +
                "\t\t\t\talignY: 'top',\n" +
                "\t\t\t\toffsetY: 6\n" +
                "\t\t\t});\n" +
                "\t\t\t$('#RQuestionAction').poshytip('show');\n" +
                "\t\t\tvar t = setTimeout(function(){\n" +
                "\t\t\t\tclearTimeout(t);\n" +
                "\t\t\t\t$('#RQuestionAction').poshytip('destroy');\n" +
                "\t\t\t},4000);\n" +
                "\t\t}\n" +
                "\t});\n" +
                "}\n" +
                "function delete_q(qid){\n" +
                "\tif(!confirm(\"您确认要删除此问题吗，删除的数据不可恢复？\"))\n" +
                "\t\treturn ;\n" +
                "\t\tajax_post(\"/action/question/delete?id=\"+qid+\"&hash=-500641190\",\"\",function(html){\n" +
                "\t\tif(html.length>0)\n" +
                "\t\t\talert(html);\n" +
                "\t\telse{\n" +
                "\t\t\tlocation.href = \"/question\";\n" +
                "\t\t}\n" +
                "\t});\n" +
                "}\n" +
                "function edit_answer(aid){\n" +
                "\tlocation.href=\"/question/edit_answer?id=\"+aid;\n" +
                "}\n" +
                "function delete_answer(aid,hash){\n" +
                "\tif(!confirm(\"您确认要删除此答案吗，删除的数据不可恢复？\"))\n" +
                "\t\treturn ;\n" +
                "\tajax_post(\"/action/question/delete_answer?id=\"+aid+\"&hash=\"+hash,\"\",function(html){\n" +
                "\t\tif(html.length>0)\n" +
                "\t\t\talert(html);\n" +
                "\t\telse{\n" +
                "\t\t\t$('#answer_'+aid).fadeOut();\n" +
                "\t\t}\n" +
                "\t});\n" +
                "}\n" +
                "function delete_post_reply(aid,hash){\n" +
                "\tif(!confirm(\"您确认要删除此评论吗，删除的数据不可恢复？\"))\n" +
                "\t\treturn ;\n" +
                "\tajax_post(\"/action/question/delete_answer?id=\"+aid+\"&hash=\"+hash,\"\",function(html){\n" +
                "\t\tif(html.length>0)\n" +
                "\t\t\talert(html);\n" +
                "\t\telse{\n" +
                "\t\t\t$('#PostReply_'+aid).fadeOut();\n" +
                "\t\t}\n" +
                "\t});\n" +
                "}\n" +
                "function delete_q_rpl(qid, rid){\n" +
                "\tif(!confirm(\"删除补充说明会被扣威望值，是否继续？\"))\n" +
                "\t\treturn ;\n" +
                "\tajax_post(\"/action/question/delete_detail?id=\"+rid,\"\",function(html){\n" +
                "\t\tif(html.length>0)\n" +
                "\t\t\talert(html);\n" +
                "\t\telse\n" +
                "\t\t\t$(\"#q_reply_\"+rid).fadeOut();\n" +
                "\t});\n" +
                "}\n" +
                "function close_tip(tid){$('#'+tid).poshytip('destroy');}\n" +
                "//答案投票\n" +
                "function vote_answer(qid, vote_up, need_confirm){\n" +
                "\tif(need_confirm && !vote_up){\n" +
                "\t\tif(!$('#a_post_votedown_' + qid).hasClass('bold')){\n" +
                "\t\t\tvar vote_down_confirm_msg = \"<p>此操作将会扣掉你1个积分，是否继续？</p><p style='margin-top:10px;'><a href='javascript:vote_answer(\"+qid+\",false,false)' class='rbtn' style='margin:0 10px 0 50px;'><span>确定</span></a><a href=\\\"javascript:close_tip('a_post_votedown_\" + qid +\"')\\\" class='rbtn'><span>取消</span></a></p>\";\t\t\t\n" +
                "\t\t\t$('#a_post_votedown_' + qid).poshytip({\n" +
                "\t\t\t\tclassName: 'tip-yellowsimple',\n" +
                "\t\t\t\tcontent: vote_down_confirm_msg,\n" +
                "\t\t\t\tshowOn: 'none',\n" +
                "\t\t\t\tslide: false,\n" +
                "\t\t\t\tfade: false,\n" +
                "\t\t\t\talignTo: 'target',\n" +
                "\t\t\t\talignX: 'center',\n" +
                "\t\t\t\toffsetY: 8\n" +
                "\t\t\t});\n" +
                "\t\t\t$('#a_post_votedown_' + qid).poshytip('show');\n" +
                "\t\t\treturn;\n" +
                "\t\t}\n" +
                "\t}\n" +
                "\tif(!need_confirm){\n" +
                "\t\t$('#a_post_votedown_' + qid).poshytip('destroy');\n" +
                "\t}\n" +
                "\tajax_post(\"/action/question/vote_answer?id=\"+qid+\"&vote=\"+vote_up+\"&user=190591\",\"\",function(data){\n" +
                "\t\tjson = eval('('+data+')');\n" +
                "\t\tif(json.msg){\n" +
                "\t\t\tvar aid = vote_up?\"a_post_voteup_\":\"a_post_votedown_\";\n" +
                "\t\t\taid += qid;\n" +
                "\t\t\t$('#'+aid).poshytip({\n" +
                "\t\t\t\tclassName: 'tip-yellowsimple',\n" +
                "\t\t\t\tcontent: json.msg,\n" +
                "\t\t\t\tshowOn: 'none',\n" +
                "\t\t\t\talignTo: 'target',\n" +
                "\t\t\t\talignX: 'center',\n" +
                "\t\t\t\talignY: 'top',\n" +
                "\t\t\t\toffsetY: 6\n" +
                "\t\t\t});\n" +
                "\t\t\t$('#'+aid).poshytip('show');\n" +
                "\t\t\tvar t = setTimeout(function(){\n" +
                "\t\t\t\tclearTimeout(t);\n" +
                "\t\t\t\t$('#'+aid).poshytip('destroy');\n" +
                "\t\t\t},2000);\n" +
                "\t\t\t//jQuery.fancybox(\"<div class='error_box'>\"+json.msg+\"</div>\");\n" +
                "\t\t}\n" +
                "\t\telse{\n" +
                "\t\t\tif(vote_up){\n" +
                "\t\t\t\t$('#post_voteup_'+qid).html('('+json.vote+')');\n" +
                "\t\t\t\t$('#a_post_voteup_'+qid).toggleClass('bold');\n" +
                "\t\t\t}\n" +
                "\t\t\telse{\n" +
                "\t\t\t\t$('#post_votedown_'+qid).html('('+json.vote+')');\n" +
                "\t\t\t\t$('#a_post_votedown_'+qid).toggleClass('bold');\n" +
                "\t\t\t}\n" +
                "\t\t}\n" +
                "\t});\n" +
                "}\n" +
                "//问题投票 \n" +
                "$('#vote_up').click(function(){\n" +
                "\tif(this.clickTimeout){\n" +
                "        // 双击\n" +
                "        clearTimeout(this.clickTimeout);\n" +
                "        this.clickTimeout = null;\n" +
                "\t\talert(\"不用那么费劲啦，点击一下就够了:)\");\n" +
                "    }\n" +
                "    else{\n" +
                "        // 单击\n" +
                "        var elem = this;\n" +
                "        this.clickTimeout = setTimeout(function(){\n" +
                "            // 执行点击动作\n" +
                "            elem.clickTimeout = null;\n" +
                "\t\t\tvote_question(107307,true, true);\n" +
                "        }, 250);\n" +
                "    }\n" +
                "    //阻止链接onclick时的默认行为\n" +
                "    return false;\n" +
                "});\n" +
                "$('#vote_down').click(function(){\n" +
                "\tvote_question(107307,false, true);\n" +
                "\t/*\n" +
                "\tif(this.clickTimeout){\n" +
                "        // 双击\n" +
                "        clearTimeout(this.clickTimeout);\n" +
                "        this.clickTimeout = null;\n" +
                "\t\talert(\"不用那么费劲啦，点击一下就够了:)\");\n" +
                "    }\n" +
                "    else{\n" +
                "        // 单击\n" +
                "        var elem = this;\n" +
                "        this.clickTimeout = setTimeout(function(){\n" +
                "            // 执行点击动作\n" +
                "            elem.clickTimeout = null;\n" +
                "\t\t\tvote_question(107307,false, true);\n" +
                "        }, 250);\n" +
                "    }\n" +
                "    //阻止链接onclick时的默认行为\n" +
                "\t*/\n" +
                "    return false;\n" +
                "});\n" +
                "function vote_question(qid, vote_up, need_confirm){\n" +
                "\tif(need_confirm && !vote_up){\n" +
                "\t\tif($('#Vote #vote_down').hasClass('ask_vote_down')){\n" +
                "\t\t\tvar vote_down_confirm_msg = \"<p>踩问题将会扣掉你1个积分，是否继续？</p><p style='margin-top:10px;'><a href='javascript:vote_question(107307,false,false)' class='rbtn' style='margin-right:10px;'><span>确定</span></a><a href=\\\"javascript:close_tip('vote_down')\\\" class='rbtn'><span>取消</span></a></p>\";\n" +
                "\t\t\t$('#Vote #vote_down').poshytip({\n" +
                "\t\t\t\tclassName: 'tip-yellowsimple',\n" +
                "\t\t\t\tcontent: vote_down_confirm_msg,\n" +
                "\t\t\t\tslide: false,\n" +
                "\t\t\t\tfade: false,\n" +
                "\t\t\t\tshowOn: 'none',\n" +
                "\t\t\t\talignTo: 'target',\n" +
                "\t\t\t\talignX: 'inner-right',\n" +
                "\t\t\t\talignY: 'bottom',\n" +
                "\t\t\t\toffsetX: -30,\n" +
                "\t\t\t\toffsetY: 15\n" +
                "\t\t\t});\n" +
                "\t\t\t$('#Vote #vote_down').poshytip('show');\n" +
                "\t\t\treturn;\n" +
                "\t\t}\n" +
                "\t}\n" +
                "\tif(!need_confirm){\n" +
                "\t\t$('#Vote #vote_down').poshytip('destroy');\n" +
                "\t}\n" +
                "\tajax_post(\"/action/question/vote?user=190591&id=\"+qid+\"&vote=\"+vote_up,\"\",function(data){\n" +
                "\t\tjson = eval('('+data+')');\n" +
                "\t\tif(json.msg){\n" +
                "\t\t\tvar aid = vote_up?\"vote_up\":\"vote_down\";\n" +
                "\t\t\t$('#'+aid).poshytip({\n" +
                "\t\t\t\tclassName: 'tip-yellowsimple',\n" +
                "\t\t\t\tcontent: json.msg,\n" +
                "\t\t\t\tshowOn: 'none',\n" +
                "\t\t\t\talignTo: 'target',\n" +
                "\t\t\t\talignX: 'inner-right',\n" +
                "\t\t\t\talignY: 'bottom',\n" +
                "\t\t\t\toffsetX: 5,\n" +
                "\t\t\t\toffsetX: -35\n" +
                "\t\t\t});\n" +
                "\t\t\t$('#'+aid).poshytip('show');\n" +
                "\t\t\tvar t = setTimeout(function(){\n" +
                "\t\t\t\tclearTimeout(t);\n" +
                "\t\t\t\t$('#'+aid).poshytip('destroy');\n" +
                "\t\t\t},2000);\n" +
                "\t\t}\n" +
                "\t\telse{\n" +
                "\t\t\t\t\t\tif(vote_up){\n" +
                "\t\t\t\t$('#Vote .vote-up-count').html(json.vote_up);\n" +
                "\t\t\t\t$('#Vote #vote_up').toggleClass('ask_vote_up');\n" +
                "\t\t\t\t$('#Vote #vote_up').toggleClass('ask_vote_uped');\n" +
                "\t\t\t}\n" +
                "\t\t\telse{\n" +
                "\t\t\t\t$('#Vote .vote-down-count').html(json.vote_down);\n" +
                "\t\t\t\t$('#Vote #vote_down').toggleClass('ask_vote_down');\n" +
                "\t\t\t\t$('#Vote #vote_down').toggleClass('ask_vote_downed');\n" +
                "\t\t\t}\n" +
                "\t\t}\n" +
                "\t});\n" +
                "}\n" +
                "//评论答案\n" +
                "function reply_to_post(postid,uid){\n" +
                "\tpopup(\"/action/ajax/reply_to_post?id=\" + postid + \"&refer=\"+uid);\n" +
                "\t}\n" +
                "\n" +
                "function show_rp_next(postid,current,total){\n" +
                "\tif(current < total){\n" +
                "\t\tvar next_page = current + 1;\n" +
                "    \tvar url = \"/question/post_replies?answer=\"+postid+\"&rp=\"+next_page;\n" +
                "    \tajax_post(url,\"\",function(html){\n" +
                "    \t\t$('#PostReplies_'+postid).html(html);\n" +
                "\t\t\t\taddRepliesHoverEvent();\n" +
                "\t\t\t});\n" +
                "\t}\n" +
                "}\n" +
                "\n" +
                "function addRepliesHoverEvent(){\n" +
                "\t$(\"li [id ^= 'PostReply']\").hover(function(){\n" +
                "\t\t$(this).addClass(\"hover\");\n" +
                "\t},function(){\n" +
                "\t\t$(this).removeClass(\"hover\");\n" +
                "\t});\n" +
                "}\n" +
                "\n" +
                "function show_rp_prev(postid,current,total){\n" +
                "\tif(current > 1){\n" +
                "\t\tvar next_page = current - 1;\n" +
                "    \tvar url = \"/question/post_replies?answer=\"+postid+\"&rp=\"+next_page;\n" +
                "    \tajax_post(url,\"\",function(html){\n" +
                "    \t\t$('#PostReplies_'+postid).html(html);\n" +
                "\t\t\taddRepliesHoverEvent();\n" +
                "    \t});\n" +
                "\t}\n" +
                "}\n" +
                "function mark_as_top(qid, as_top) {\n" +
                "\tvar args = \"id=\"+qid+\"&top=\"+as_top;\n" +
                "\tajax_post(\"/action/question/mark_as_top\",args,function(html){\n" +
                "\t\talert(html);\n" +
                "\t});\n" +
                "}\n" +
                "function mark_as_best(postid, is_best){\n" +
                "\tvar args = \"id=\"+postid+\"&best=\"+(is_best?1:0);\n" +
                "\tajax_post(\"/action/question/mark_as_best\",args,function(html){\n" +
                "    \tif(html.length>0){\n" +
                "    \t\t$('#best_answer_'+postid).poshytip({\n" +
                "    \t\t\tclassName: 'tip-yellowsimple',\n" +
                "    \t\t\tcontent: html,\n" +
                "    \t\t\tshowOn: 'none',\n" +
                "    \t\t\talignTo: 'target',\n" +
                "    \t\t\talignX: 'center',\n" +
                "    \t\t\talignY: 'top',\n" +
                "    \t\t\toffsetY: 6\n" +
                "    \t\t});\n" +
                "    \t\t$('#best_answer_'+postid).poshytip('show');\n" +
                "    \t\tvar t = setTimeout(function(){\n" +
                "    \t\t\tclearTimeout(t);\n" +
                "    \t\t\t$('#best_answer_'+postid).poshytip('destroy');\n" +
                "    \t\t},2000);\n" +
                "    \t}\n" +
                "    \telse{\n" +
                "\t\t\tif(is_best)\n" +
                "\t\t\t\t$('#answer_'+postid).addClass('Best');\n" +
                "\t\t\telse\n" +
                "\t\t\t\t$('#answer_'+postid).removeClass('Best');\n" +
                "    \t}\n" +
                "\t});\n" +
                "}\n" +
                "function edit_tags(qid){\n" +
                "\tpopup(\"/question/edit_tags?question=\"+qid);\n" +
                "}\n" +
                "function edit_catalogs(qid){\n" +
                "\tpopup(\"/admin/catalog/set-catalogs?parent=1&type=2&id=\"+qid);\n" +
                "}\n" +
                "function event_apply(event_id){\t\n" +
                "\tpopup(\"/action/ajax/event_apply\",\"id=\"+event_id);\n" +
                "}\n" +
                "function cancel_apply(event_id){\n" +
                "\tif(confirm(\"您确认要取消参加此次活动吗？\")){\n" +
                "\t\tajax_post(\"/action/event/cancel\",\"event=\"+event_id,function(html){\n" +
                "\t\t\tif(html.length>0)\n" +
                "\t\t\t\talert(html);\n" +
                "\t\t\telse\n" +
                "\t\t\t\talert('已取消参加此次活动，感谢您的支持:)');\n" +
                "\t\t});\n" +
                "\t}\n" +
                "}\n" +
                "\n" +
                "var favor_ok = \"<p class='favor_ok'>已成功添加到收藏夹<br/><br/> <a href='http://my.oschina.net/flashsword/favorites?type=$DAISY_OBJ_TYPE'>我的收藏夹</a> | <a href='javascript:close_favor()'>关闭</a></p>\";\n" +
                "function delete_favor(obi_id, obj_type){\n" +
                "\tif(!confirm('确定取消收藏？')) return;\n" +
                "\t$.post(\"/action/favorite/cancel?type=\"+obj_type+\"&id=\"+obi_id+\"&user=190591\",function(html){\n" +
                "\t\t$('#favor_trigger').parent('div').removeClass('ask_collected').addClass('ask_collect');\n" +
                "\t\t$('#favor_trigger').attr('title','添加到收藏');\n" +
                "    \t$('#p_favor_count').html(html);\n" +
                "\t\t$('#favor_trigger').unbind('click');\n" +
                "\t\t$('#favor_trigger').click(function(){add_to_favor(107307,2);});\n" +
                "\t});\n" +
                "}\n" +
                "function add_to_favor(obj_id, obj_type){\n" +
                "    var dlg_favor = \"<div id='favor_form'><p>多个标签使用逗号(,)隔开，最多三个</p><form action='/action/favorite/add?user=190591' height='60px' width='200px' method='POST'>\";\n" +
                "\tdlg_favor += \"<input type='hidden' name='id' value='\"+obj_id+\"'/>\";\n" +
                "\tdlg_favor += \"<input type='hidden' name='type' value='\"+obj_type+\"'/>\";\n" +
                "\tdlg_favor += \"<input type='text' name='tags' size='25' class='_favor_input' id='_favor_tags'/>\";\n" +
                "\tdlg_favor += \"<input type='submit' value='收藏' class='_favor_button'/><input type='button' value='取消' onclick='close_favor();' class='_favor_button'/><a id='TagsSwitcher' state='off'>选取标签↓</a></form>\";\n" +
                "\tdlg_favor += \"<div id='MyTags' ></div></div>\";\n" +
                "    $('#favor_trigger').poshytip('destroy');\n" +
                "    $('#favor_trigger').poshytip({\n" +
                "    \tclassName: 'tip-yellowsimple',\n" +
                "    \tcontent: dlg_favor,\n" +
                "    \tshowOn: 'none',\n" +
                "    \talignTo: 'target',\t\n" +
                "\t\talignX: 'inner-right',\n" +
                "\t\talignY: 'bottom',\n" +
                "\t\toffsetX: -20,\n" +
                "\t\toffsetY: 15\n" +
                "    });\n" +
                "    $('#favor_trigger').poshytip('show');\n" +
                "\t$('#_favor_tags').focus();\n" +
                "\t$('#favor_form form').ajaxForm({\n" +
                "\t\tsuccess: function(html) {\n" +
                "\t\t\t$('#favor_trigger').parent('div').removeClass('ask_collect').addClass('ask_collected');\n" +
                "\t\t\t$('#favor_trigger').attr('title','取消收藏');\n" +
                "\t\t\t$('#p_favor_count').html(html);\n" +
                "\t\t\t$('#favor_trigger').unbind('click');\n" +
                "\t\t\t$('#favor_trigger').click(function(){delete_favor(107307,2);});\n" +
                "\t\t\t$('#favor_form').html(favor_ok);\n" +
                "\t\t\tsetTimeout(\"close_favor()\",3000);\n" +
                "\t\t}\n" +
                "\t});\n" +
                "\t$(\"#TagsSwitcher\").one(\"click\",function(){\n" +
                "\t\t//加载标签数据\n" +
                "\t\t$(\"#MyTags\").load('/action/ajax/get_my_tags');\n" +
                "       \t$(\"#MyTags\").toggle();\n" +
                "\t\t$(this).html(\"收起标签↑\");\n" +
                "        $(this).attr(\"state\",'on');\n" +
                "        $(this).click(function(){\n" +
                "        \t$(\"#MyTags\").toggle();\n" +
                "        \tvar state = $(this).attr(\"state\");\n" +
                "        \tif(state=='off'){\n" +
                "        \t\t$(this).html(\"收起标签↑\");\n" +
                "        \t\t$(this).attr(\"state\",'on');\n" +
                "        \t}else{\n" +
                "        \t\t$(this).html(\"选取标签↓\");\n" +
                "        \t\t$(this).attr(\"state\",'off');\n" +
                "        \t}\n" +
                "        });\n" +
                "\t});\n" +
                "\n" +
                "}\n" +
                "function close_favor(elem_id){\n" +
                "    $('#favor_trigger').poshytip('destroy');\n" +
                "}\n" +
                "function setTag(tv){\n" +
                "\tvar t = $(\"._favor_input\");\n" +
                "\tvar value = t.val();\n" +
                "\tif(value!=\"\")\n" +
                "\t\tt.val(value+\",\"+tv);\n" +
                "\telse\n" +
                "\t\tt.val(tv)\n" +
                "}\n" +
                "//-->\n" +
                "</script><div class='clear'></div></div>\n" +
                "\t<div id=\"OSC_Footer\" class='CenterDiv'><style>\n" +
                ".oscapp {text-align:left; width:220px;}\n" +
                ".oscapp span {float:left;width:140px;}\n" +
                ".oscapp a {float:left;text-indent:-9999em;width:16px;margin-left:8px;}\n" +
                ".oscapp a.android {background:url('/img/android.gif') no-repeat left center;}\n" +
                ".oscapp a.iphone {background:url('/img/iphone.gif') no-repeat left center;}\n" +
                ".oscapp a.wp7 {background:url('/img/wp7.gif') no-repeat left center;}\n" +
                "</style>\n" +
                "<table width='100%'><tr>\n" +
                "<td align='left'>&copy; 开源中国(OsChina.NET) | <a href=\"http://www.oschina.net/home/about\">关于我们</a> | <a href=\"mailto:oschina.net@gmail.com\">广告联系</a> | <a href=\"http://weibo.com/oschina2010\" target=\"_blank\">@新浪微博</a> | <a href=\"http://m.oschina.net/\">开源中国手机版</a> | <a href='http://www.miitbeian.gov.cn/' target='_blank' style='color:#737573;text-decoration:none;'>粤ICP备12009483号-3</a></td>\n" +
                "<td class='oscapp'>\n" +
                "\t<span>开源中国手机客户端：</span>\n" +
                "\t<a href=\"http://www.oschina.net/app\" class='android' title='Android客户端'>Android</a>\n" +
                "\t<a href=\"http://www.oschina.net/app\" class='iphone' title='iPhone 客户端'>iPhone</a>\n" +
                "\t<a href=\"http://www.oschina.net/app\" class='wp7' title='Windows Phone 客户端'>WP7</a>\n" +
                "</td>\n" +
                "</tr>\n" +
                "</table>\n" +
                "<script type='text/javascript'>\n" +
                "<!--\n" +
                "if (top.location != self.location)top.location=self.location;\n" +
                "//-->\n" +
                "</script></div>\n" +
                "</div>\n" +
                "</body>\n" +
                "</html>\n" +
                "<!-- Generated by OsChina.NET (init:1[ms],page:43[ms],ip:60.55.11.77) -->";
        Html html1 = new Html(html);
        Assert.assertEquals("再次吐槽easyui",html1.x(".//*[@class='QTitle']/h1/a").toString());
    }
}
