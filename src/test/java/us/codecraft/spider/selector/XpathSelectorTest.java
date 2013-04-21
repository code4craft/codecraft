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
}
