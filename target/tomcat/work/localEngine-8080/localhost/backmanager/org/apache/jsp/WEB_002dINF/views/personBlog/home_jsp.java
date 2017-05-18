package org.apache.jsp.WEB_002dINF.views.personBlog;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write('\n');

    String path = request.getContextPath();
    String userName=request.getParameter("userName");
    pageContext.setAttribute("userName",userName);
    session.setAttribute("userName",userName);

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<!--========== The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags ==========-->\n");
      out.write("<title>Home</title>\n");
      out.write("\n");
      out.write("<!--==========Dependency============-->\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(path);
      out.write("/css/bootstrap.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(path);
      out.write("/css/font-awesome.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(path);
      out.write("/js/vendors/owl-carousel/assets/owl.carousel.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(path);
      out.write("/js/vendors/magnific-popup/magnific-popup.css\">\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Kanit:500\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Josefin+Sans:600,700italic\">\n");
      out.write("<link href='https://fonts.googleapis.com/css?family=Dosis:400,200,300,500,600,800,700' rel='stylesheet' type='text/css'>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Muli:400,300,300italic,400italic\">\n");
      out.write("<link href='https://fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500italic,500,700italic,700,900,900italic' rel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("<!--==========Theme Styles==========-->\n");
      out.write("<link href=\"");
      out.print(path);
      out.write("/css/style.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"");
      out.print(path);
      out.write("/css/theme/green.css\" rel=\"stylesheet\">\n");
      out.write("    <script src=\"");
      out.print(path);
      out.write("/js/blog.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/js/single.js\"></script>\n");
      out.write("    <script type=\"text/javascript\"\n");
      out.write("            src=\"http://qzonestyle.gtimg.cn/qzone/openapi/qc_loader.js\" charset=\"utf-8\" data-callback=\"true\"></script>\n");
      out.write("<!--========== HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries ==========-->\n");
      out.write("<!--========== WARNING: Respond.js doesn't work if you view the page via file:// ==========-->\n");
      out.write("<!--==========[if lt IE 9]>\n");
      out.write("    <script src=\"");
      out.print(path);
      out.write("/js/html5shiv.min.js\"></script>\n");
      out.write("    <script src=\"");
      out.print(path);
      out.write("/js/respond.min.js\"></script>\n");
      out.write("\n");
      out.write("    <![endif]==========-->\n");
      out.write("</head>\n");
      out.write("<body class=\"home\">\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    var paras = {};\n");
      out.write("\n");
      out.write("    //用JS SDK调用OpenAPI\n");
      out.write("    QC.api(\"get_user_info\", paras)\n");
      out.write("    //指定接口访问成功的接收函数，s为成功返回Response对象\n");
      out.write("            .success(function(s){\n");
      out.write("                //成功回调，通过s.data获取OpenAPI的返回数据\n");
      out.write("                alert(\"获取用户信息成功！当前用户昵称为：\"+s.data.nickname);\n");
      out.write("            })\n");
      out.write("            //指定接口访问失败的接收函数，f为失败返回Response对象\n");
      out.write("            .error(function(f){\n");
      out.write("                //失败回调\n");
      out.write("                alert(\"获取用户信息失败！\");\n");
      out.write("            })\n");
      out.write("            //指定接口完成请求后的接收函数，c为完成请求返回Response对象\n");
      out.write("            .complete(function(c){\n");
      out.write("                //完成请求回调\n");
      out.write("                alert(\"获取用户信息完成！\");\n");
      out.write("            });\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    var paras = {content : \"从此学习吧就是你的成长园地\"};\n");
      out.write("\n");
      out.write("    QC.api(\"add_t\", paras)\n");
      out.write("            .success(function(s){//成功回调\n");
      out.write("                alert(\"发送微博成功，请到腾讯微博内查看！\");\n");
      out.write("            })\n");
      out.write("            .error(function(f){//失败回调\n");
      out.write("                alert(\"发送微博失败！\");\n");
      out.write("            })\n");
      out.write("            .complete(function(c){//完成请求回调\n");
      out.write("                alert(\"发送微博完成！\");\n");
      out.write("            });\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    if(QC.Login.check()){//如果已登录\n");
      out.write("        QC.Login.getMe(function(openId, accessToken){\n");
      out.write("            alert([\"当前登录用户的\", \"openId为：\"+openId, \"accessToken为：\"+accessToken].join(\"\\n\"));\n");
      out.write("        });\n");
      out.write("        //这里可以调用自己的保存接口\n");
      out.write("        url:'/doLogin/qqLoginSaving.html';\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("<header class=\"row transparent black header1\" data-spy=\"affix\" data-offset-top=\"0\" id=\"header\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row top-header\">\n");
      out.write("            <div class=\"col-sm-4 search-form-col\">\n");
      out.write("                <form action=\"");
      out.print(path);
      out.write("/single/searchContent.html\" method=\"post\" class=\"search-form\">\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <span class=\"input-group-addon\"><img src=\"");
      out.print(path);
      out.write("/images/search-icon-dark.png\" alt=\"\"></span>\n");
      out.write("                        <input type=\"search\" name=\"postTitle\" class=\"form-control\" placeholder=\"输入你要查找的帖子主题关键字\">\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-4 logo-col text-center\">\n");
      out.write("                <a href=\"#\"><img src=\"");
      out.print(path);
      out.write("/images/title_picture.png\" alt=\"\"></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-4 menu-trigger-col\">\n");
      out.write("                <span><a href=\"");
      out.print(path);
      out.write("/index.jsp\">退出</a></span>\n");
      out.write("                ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /WEB-INF/views/personBlog/home.jsp(110,16) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty userName}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <span><img src=\"");
          out.print(path);
          out.write("/images/support.png\"><a href=\"#\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</a><span style=\"color: #3b618b\">&nbsp;&nbsp;欢迎登录!</span></span>\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      out.write("\n");
      out.write("                <button class=\"menu-trigger pull-right\">\n");
      out.write("                    <span class=\"active-page\">Details</span>\n");
      out.write("                    <img src=\"");
      out.print(path);
      out.write("/images/menu-align-white.png\" alt=\"\" class=\"icon-burger\">\n");
      out.write("                    <img src=\"");
      out.print(path);
      out.write("/images/menu-close-white.png\" alt=\"\" class=\"icon-cross\">\n");
      out.write("                </button>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>        \n");
      out.write("    </div>\n");
      out.write("    <div class=\"row menu-section\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-8 menu-col\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <ul class=\"nav column-menu black-bg\">\n");
      out.write("                            <li class=\"active dropdown\">\n");
      out.write("                                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">主页 <span class=\"caret\"></span></a>\n");
      out.write("                                <ul class=\"dropdown-menu\">\n");
      out.write("                                    <li><a href=\"");
      out.print(path);
      out.write("/single/showMoreSingle.html\">最近发表</a></li>\n");
      out.write("                                    <li><a href=\"");
      out.print(path);
      out.write("/single/showMoreSingle.html\">最新文章</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"");
      out.print(path);
      out.write("/about.jsp\">关于</a></li>\n");
      out.write("                            <li><a href=\"");
      out.print(path);
      out.write("/single/showSingle1.html\">Blog Single 1</a></li>\n");
      out.write("                            <li><a href=\"");
      out.print(path);
      out.write("/single/showSingle2.html\">Blog Single 2</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                        <ul class=\"nav column-menu black-bg\">\n");
      out.write("                            <li><a href=\"");
      out.print(path);
      out.write("/single/showSingle3.html\">Blog Single 3</a></li>\n");
      out.write("                            <li style=\"color: #0d90d1\"><a style=\"color: #0d90d1\" href=\"");
      out.print(path);
      out.write("/single/showMoreSingle.html\">更多 >></a></li>\n");
      out.write("                            <li><a href=\"");
      out.print(path);
      out.write("/contact.jsp\">联系我</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-4 subscribe-col\">\n");
      out.write("                    <h5 class=\"widget-title\">邮件订阅</h5>\n");
      out.write("                    <form method=\"post\" class=\"form-inline subscribe-form\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"email\" class=\"form-control\" placeholder=\"Email\" id=\"mail\">\n");
      out.write("                        </div>\n");
      out.write("                        <input type=\"hidden\" class=\"form-control\" id=\"sName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\n");
      out.write("\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary btn-sm\" onclick=\"topFilter()\"><span>send</span></button>\n");
      out.write("                    </form>\n");
      out.write("                    <ul class=\"nav social-nav dark\">\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-facebook-official\"></i></a></li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-google-plus\"></i></a></li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-instagram\"></i></a></li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-envelope\"></i></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("\n");
      out.write("<section class=\"row content-wrap\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\" id=\"post-masonry\">\n");
      out.write("            <!--Blog Post-->\n");
      out.write("            ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/views/personBlog/home.jsp(174,12) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/personBlog/home.jsp(174,12) '${postsForTime}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${postsForTime}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /WEB-INF/views/personBlog/home.jsp(174,12) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("post");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("\n");
            out.write("            <article class=\"col-sm-4 post post-masonry post-format-image\">\n");
            out.write("                <div class=\"post-wrapper row\">\n");
            out.write("                    <div class=\"featured-content row\">\n");
            out.write("                        <a href=\"javascript:void(0);\" onclick=\"countNum('");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post.postText}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write('\'');
            out.write(',');
            out.write('\'');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post.postId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("')\"><img src=\"");
            out.print(path);
            out.write("/images/posts/masonry/1.jpg\" alt=\"\" class=\"img-responsive\"></a>\n");
            out.write("                    </div>\n");
            out.write("                    <div class=\"post-excerpt row\">\n");
            out.write("                        <h5 class=\"post-meta\">\n");
            out.write("                            <a href=\"#\" class=\"date\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post.createTime}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("</a>\n");
            out.write("                            <span class=\"post-author\"><i>by</i><a href=\"#\">HuangDong</a></span>\n");
            out.write("                        </h5>\n");
            out.write("                        <h3 class=\"post-title\"><a href=\"javascript:void(0);\" onclick=\"countNum('");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post.postText}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write('\'');
            out.write(',');
            out.write('\'');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post.postId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("')\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post.postTitle}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("</a></h3>\n");
            out.write("                        <footer class=\"row\">\n");
            out.write("                            <h5 class=\"taxonomy\"><i>in</i> <a href=\"#\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post.postType}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("</a></h5>\n");
            out.write("                            <div class=\"response-count\">阅读(");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post.browNum}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write(")</div>\n");
            out.write("                            <div class=\"response-count\"><img src=\"");
            out.print(path);
            out.write("/images/comment-icon-gray.png\" alt=\"\">评论(");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post.commentNum}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write(")</div>\n");
            out.write("\n");
            out.write("                        </footer>\n");
            out.write("                    </div>\n");
            out.write("                </div>\n");
            out.write("            </article>\n");
            out.write("\n");
            out.write("            ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
        _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      }
      out.write("\n");
      out.write("            <!--Author Widget-->\n");
      out.write("            <aside class=\"col-sm-4 widget-author widget widget-with-posts post\">\n");
      out.write("                <div class=\"widget-author-inner row\">\n");
      out.write("                    <div class=\"author-avatar row\"><a href=\"#\"><img src=\"");
      out.print(path);
      out.write("/images/author.png\" alt=\"\" class=\"img-circle\"></a></div>\n");
      out.write("                    <a href=\"#\"><h2 class=\"author-name\">HuangDong</h2></a>\n");
      out.write("                    <h5 class=\"author-title\">stationmaster</h5>\n");
      out.write("                    <p>无厚积何以薄发</p>\n");
      out.write("                    <a href=\"");
      out.print(path);
      out.write("/about.jsp\" class=\"know-more\">know more</a>\n");
      out.write("                </div>\n");
      out.write("                <ul class=\"nav social-nav\">\n");
      out.write("                    <li><a href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("                    <li><a href=\"#\"><i class=\"fa fa-facebook-official\"></i></a></li>\n");
      out.write("                    <li><a href=\"#\"><i class=\"fa fa-google-plus\"></i></a></li>\n");
      out.write("                    <li><a href=\"#\"><i class=\"fa fa-instagram\"></i></a></li>\n");
      out.write("                    <li><a href=\"#\"><i class=\"fa fa-envelope\"></i></a></li>\n");
      out.write("                </ul>\n");
      out.write("            </aside>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<!--Footer-->\n");
      out.write("<footer class=\"row\" id=\"footer\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row top-footer\">\n");
      out.write("            <div class=\"widget col-sm-3 widget-about\">\n");
      out.write("                <div class=\"row m0\"><a href=\"#\"><img src=\"");
      out.print(path);
      out.write("/images/huangdong.jpg\" alt=\"\"></a></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"widget col-sm-5 widget-menu\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <ul class=\"nav column-menu white-bg\">\n");
      out.write("\n");
      out.write("                        <li class=\"active\"><a href=\"");
      out.print(path);
      out.write("/index.jsp\">主页</a></li>\n");
      out.write("                        <li><a href=\"");
      out.print(path);
      out.write("/single/showMoreSingle.html\">最近发表</a></li>\n");
      out.write("                        <li><a href=\"");
      out.print(path);
      out.write("/single/showMoreSingle.html\">最新文章</a></li>\n");
      out.write("                        <li><a href=\"");
      out.print(path);
      out.write("/user/personBlog/about.jsp\">关于</a></li>\n");
      out.write("                        <li><a href=\"");
      out.print(path);
      out.write("/community/showCommunity/1.html\">Blog Single 1</a></li>\n");
      out.write("                        <li><a href=\"");
      out.print(path);
      out.write("/community/showCommunity/2.html\">Blog Single 2</a></li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                    <ul class=\"nav column-menu white-bg\">\n");
      out.write("                        <li><a href=\"");
      out.print(path);
      out.write("/community/showCommunity/3.html\">Blog Single 3</a></li>\n");
      out.write("                        <li style=\"color: #0d90d1\"><a style=\"color: #0d90d1\" href=\"");
      out.print(path);
      out.write("/single/showMoreSingle.html\">更多 >></a></li>\n");
      out.write("                        <li><a href=\"");
      out.print(path);
      out.write("/contact.jsp\">联系</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"widget col-sm-4 widget-subscribe\">\n");
      out.write("                <h5 class=\"widget-title\">邮件订阅</h5>\n");
      out.write("                <form method=\"post\" class=\"form-inline subscribe-form\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <input type=\"email\" class=\"form-control\" placeholder=\"Email\" id=\"u_mail\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <input type=\"hidden\" class=\"form-control\" id=\"senderName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\n");
      out.write("                    </div>\n");
      out.write("                    <button class=\"btn btn-primary btn-sm\" onclick=\"filter()\"><span>send</span></button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("   <center> <h5 class=\"copyright\">Copyright &copy; 2017.zenghuangdong.cn All rights reserved.</h5></center>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("<!--========== jQuery (necessary for Bootstrap's JavaScript plugins) ==========-->\n");
      out.write("<script src=\"");
      out.print(path);
      out.write("/js/jquery-2.2.0.min.js\"></script>\n");
      out.write("<script src=\"");
      out.print(path);
      out.write("/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"");
      out.print(path);
      out.write("/js/vendors/owl-carousel/owl.carousel.min.js\"></script>\n");
      out.write("<script src=\"");
      out.print(path);
      out.write("/js/vendors/magnific-popup/jquery.magnific-popup.min.js\"></script>\n");
      out.write("<script src=\"");
      out.print(path);
      out.write("/js/vendors/instafeed/instafeed.min.js\"></script>\n");
      out.write("<script src=\"");
      out.print(path);
      out.write("/js/vendors/imagesLoaded/imagesloaded.pkgd.min.js\"></script>\n");
      out.write("<script src=\"");
      out.print(path);
      out.write("/js/vendors/isotope/isotope.pkgd.min.js\"></script>\n");
      out.write("<script src=\"");
      out.print(path);
      out.write("/js/theme.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
