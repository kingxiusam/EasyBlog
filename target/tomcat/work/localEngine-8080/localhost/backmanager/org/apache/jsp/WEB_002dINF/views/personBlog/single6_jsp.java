package org.apache.jsp.WEB_002dINF.views.personBlog;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;

public final class single6_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:length", org.apache.taglibs.standard.functions.Functions.class, "length", new Class[] {java.lang.Object.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    String path = request.getContextPath();


      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"><title>观察者模式在个人网站邮件发布与订阅中的实践</title><link rel=\"stylesheet\" href=\"");
      out.print(path);
      out.write("/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(path);
      out.write("/css/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(path);
      out.write("/js/vendors/owl-carousel/assets/owl.carousel.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(path);
      out.write("/js/vendors/magnific-popup/magnific-popup.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(path);
      out.write("/js/vendors/flexslider/flexslider.css\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Kanit:500\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Josefin+Sans:600,700italic\">\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Dosis:400,200,300,500,600,800,700' rel='stylesheet' type='text/css'>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Muli:400,300,300italic,400italic\">\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500italic,500,700italic,700,900,900italic' rel='stylesheet' type='text/css'>\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Fredoka+One' rel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!--==========Theme Styles==========-->\n");
      out.write("    <link href=\"");
      out.print(path);
      out.write("/css/style.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"");
      out.print(path);
      out.write("/css/theme/green.css\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(path);
      out.write("/css/main.e87dad73.css\">\n");
      out.write("    <script src=\"");
      out.print(path);
      out.write("/js/blog.js\"></script>\n");
      out.write("    <script src=\"");
      out.print(path);
      out.write("/js/single.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/js/jquery-1.8.3.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/js/jquery.validate.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/js/messageValidate.js\"></script>\n");
      out.write("\n");
      out.write("    <script src=\"");
      out.print(path);
      out.write("/js/html5shiv.min.js\"></script>\n");
      out.write("    <script src=\"");
      out.print(path);
      out.write("/js/respond.min.js\"></script></head>\n");
      out.write("<body class=\"home\">\n");
      out.write("<header class=\"row transparent white\" data-spy=\"affix\" data-offset-top=\"300\" id=\"header\">\n");
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
      out.write("\n");
      out.write("            <div class=\"col-sm-4 logo-col text-center\">\n");
      out.write("                <a href=\"#\"><img src=\"");
      out.print(path);
      out.write("/images/title_picture.png\" alt=\"\"></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-4 menu-trigger-col\">\n");
      out.write("                <button class=\"menu-trigger black pull-right\">\n");
      out.write("                    <span class=\"active-page\">Details</span>\n");
      out.write("                    <img src=\"");
      out.print(path);
      out.write("/images/menu-align-dark.png\" alt=\"\" class=\"icon-burger\">\n");
      out.write("                    <img src=\"");
      out.print(path);
      out.write("/images/menu-close-dark.png\" alt=\"\" class=\"icon-cross\">\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("        </div>        \n");
      out.write("    </div>\n");
      out.write("    <div class=\"row menu-section\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-8 menu-col\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <ul class=\"nav column-menu white-bg\">\n");
      out.write("                            <li class=\"active dropdown\">\n");
      out.write("                                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Home <span class=\"caret\"></span></a>\n");
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
      out.write("                            <li><a href=\"/single/showSingle1.html\">Blog Single 1</a></li>\n");
      out.write("                            <li><a href=\"/single/showSingle2.html\">Blog Single 2</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                        <ul class=\"nav column-menu white-bg\">\n");
      out.write("                            <li><a href=\"/single/showSingle3.html\">Blog Single 3</a></li>\n");
      out.write("                            <li style=\"color: #0d90d1\"><a style=\"color: #0d90d1\" href=\"");
      out.print(path);
      out.write("/single/showMoreSingle.html\">更多>></a></li>\n");
      out.write("                            <li><a href=\"");
      out.print(path);
      out.write("/contact.jsp\">联系我</a></li>\n");
      out.write("                            <li><a href=\"");
      out.print(path);
      out.write("/index.jsp\">退出</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-4 subscribe-col\">\n");
      out.write("                    <h5 class=\"widget-title\">邮件订阅.</h5>\n");
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
      out.write("                    <ul class=\"nav social-nav white\">\n");
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
      out.write("<section class=\"row content-wrap single-nosidebar\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-12 single-post-contents\">\n");
      out.write("                <article class=\"single-post-content v2 row m0 post\">\n");
      out.write("                    <header class=\"row\">\n");
      out.write("                        <h5 class=\"post-meta\">\n");
      out.write("                            <a href=\"#\" class=\"date\">  </a>\n");
      out.write("                            <span class=\"post-author\"><i>by</i><a href=\"#\">HuangDong</a></span>\n");
      out.write("                        </h5>\n");
      out.write("                        <h2 class=\"post-title\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post.postTitle}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</h2>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <h5 class=\"taxonomy pull-left\"><i>in</i> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post.postType}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</h5>\n");
      out.write("                            <div class=\"response-count pull-right\"><img src=\"");
      out.print(path);
      out.write("/images/comment-icon-gray.png\" alt=\"\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:length(communityList)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
      out.write(" comments</div>\n");
      out.write("                        </div>\n");
      out.write("                    </header>\n");
      out.write("<br />\r\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;每次分享分布式服务框架，讲到带来的价值时， <br />\r\n");
      out.write("<br />\r\n");
      out.write("像什么可靠高性能，服务治理等等一些常规价值，大家还能听我们吹吹， <br />\r\n");
      out.write("<br />\r\n");
      out.write("但有几条不明显的价值经常被质疑，所以写下来，省点口舌， <br />\r\n");
      out.write("<br />\r\n");
      out.write("<strong>(1) 可以减少DB连接数：</strong> <br />\r\n");
      out.write("<br />\r\n");
      out.write("其实原因很简单，当集群特别大时，比如应用集群上万台时， <br />\r\n");
      out.write("<br />\r\n");
      out.write("如果每台连接池最小连接数为一，也要持有一万连接， <br />\r\n");
      out.write("<br />\r\n");
      out.write("当加一个中间层，让很少的中间层集群访问数据库，就会减少很多， <br />\r\n");
      out.write("<br />\r\n");
      out.write("因为某个兄弟公司就是因为这个原因才做分布式拆分的，所以我们才把它列为价值的一条。 <br />\r\n");
      out.write("<br />\r\n");
      out.write("<strong>(2)可以提高资源利用率：</strong> <br />\r\n");
      out.write("<br />\r\n");
      out.write("因为服务通常是无状态或少量状态的可并行的一些业务逻辑， <br />\r\n");
      out.write("<br />\r\n");
      out.write("可以说是计算密集型程序，基本上适用Amdahl's Law原则： <br />\r\n");
      out.write("<br />\r\n");
      out.write("Amdahl's Law：<a target=\"_blank\" href=\"http://en.wikipedia.org/wiki/Amdahl%27s_law\">http://en.wikipedia.org/wiki/Amdahl's_law</a> <br />\r\n");
      out.write("<br />\r\n");
      out.write("<img src=\"http://dl.iteye.com/upload/attachment/343852/9bd784bb-786f-3cd8-9167-2b37e4a3e997.png\" /> <br />\r\n");
      out.write("<br />\r\n");
      out.write("加速度S等于： <br />\r\n");
      out.write("<br />\r\n");
      out.write("<img src=\"http://dl.iteye.com/upload/attachment/343854/d8b1f0dd-76df-3447-9310-cf14e460d16d.png\" /> <br />\r\n");
      out.write("<br />\r\n");
      out.write("其中，P为程序的可并行比率，N为处理器个数(也就是机器数)。 <br />\r\n");
      out.write("<br />\r\n");
      out.write("分布式切分应用后： <br />\r\n");
      out.write("<br />\r\n");
      out.write("(1) 缩小了集群规模，小规模增加机器收益最高。 <br />\r\n");
      out.write("<br />\r\n");
      out.write("(2) 分离了串行因素，使多数集群并行因子增大。 <br />\r\n");
      out.write("<br />\r\n");
      out.write("所以可以用更少的机器来加速应用，也就提升了资源的利用率。\n");
      out.write("                    <div class=\"row m0 tags\">\n");
      out.write("                        <a href=\"#\" class=\"tag\">科技                        </a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <hr/>\n");
      out.write("\n");
      out.write("                    <div class=\"row m0 comments\">\n");
      out.write("                        <h5 class=\"response-count\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:length(communityList)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
      out.write(" comments<a href=\"#comment-form\" class=\"btn btn-primary pull-right\"><span>add comment</span></a></h5>\n");
      out.write("\n");
      out.write("                        <!--Comments-->\n");
      out.write("                        <div class=\"media comment\">\n");
      out.write("\n");
      out.write("                            ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/views/personBlog/single6.jsp(181,28) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("message");
      // /WEB-INF/views/personBlog/single6.jsp(181,28) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/personBlog/single6.jsp(181,28) '${communityList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${communityList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("                                <div class=\"media comment reply\">\n");
            out.write("                                    <div class=\"media-left\">\n");
            out.write("                                        <a href=\"#\"><img src=\"");
            out.print(path);
            out.write("/images/posts/c2.jpg\" alt=\"\" class=\"img-circle\"></a>\n");
            out.write("                                    </div>\n");
            out.write("                                    <div class=\"media-body\">\n");
            out.write("                                        <h4><a href=\"#\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message.owner}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("</a></h4>\n");
            out.write("                                        <h5><a href=\"#\" class=\"date\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message.time}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("</a> | <a href=\"#\" class=\"reply-link\">reply</a></h5>\n");
            out.write("\n");
            out.write("                                        <p>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message.message}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("</p>\n");
            out.write("                                        ");
            //  c:if
            org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
            _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
            _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
            // /WEB-INF/views/personBlog/single6.jsp(191,40) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message.owner==userName}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
            int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
            if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              do {
                out.write("|<a href=\"");
                out.print(path);
                out.write("/community/6/deleteCommunity.html?messageId=");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message.messageId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                out.write("\" class=\"reply-link\" onclick=\"delConfirm();\">delete</a>");
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
            out.write("                                    </div>\n");
            out.write("                                </div>\n");
            out.write("\n");
            out.write("                            ");
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
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </article>\n");
      out.write("                <form action=\"");
      out.print(path);
      out.write("/community/addOneCommunity/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/6.html\" method=\"post\" id=\"messageForm\" class=\"comment-form row\">\n");
      out.write("                    <h5 class=\"form-title\">@留言@</h5>\n");
      out.write("                    <div class=\"form-group col-sm-6\">\n");
      out.write("                        <label for=\"name\">姓名*</label>\n");
      out.write("                        <input type=\"text\" id=\"name\" name=\"name\" class=\"form-control\" placeholder=\"Your name\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group col-sm-6\">\n");
      out.write("                        <label for=\"email\">Email*</label>\n");
      out.write("                        <input type=\"email\" id=\"email\" name=\"email\" class=\"form-control\" placeholder=\"Your email address here,eg:1459951296@qq.com\" >\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group col-sm-6\">\n");
      out.write("                        <label for=\"website\">网址</label>\n");
      out.write("                        <input type=\"url\" id=\"website\" name=\"website\" class=\"form-control\" placeholder=\"Your website url,eg:http://www.zenghuangdong.cn\" >\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group col-sm-6\">\n");
      out.write("                        <label for=\"subject\">兴趣爱好</label>\n");
      out.write("                        <input type=\"text\" id=\"subject\" name=\"subject\" class=\"form-control\" placeholder=\"Write subject here\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group col-sm-12\">\n");
      out.write("                        <label for=\"message\">评论*</label>\n");
      out.write("                        <textarea name=\"message\" id=\"message\" name=\"message\" class=\"form-control\" placeholder=\"Write message here\"></textarea>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-12\">\n");
      out.write("                        <input type=\"submit\" class=\"btn-primary\" value=\"提交\">\n");
      out.write("                        <h5 class=\"pull-right\">*必填</h5>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</section><footer class=\"row\" id=\"footer\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row top-footer\">\n");
      out.write("            <div class=\"widget col-sm-3 widget-about\">\n");
      out.write("                <div class=\"row m0\"><a href=\"/user/person.html\"><img src=\"");
      out.print(path);
      out.write("/images/huangdong.jpg\" alt=\"\"></a></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"widget col-sm-5 widget-menu\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <ul class=\"nav column-menu white-bg\">\n");
      out.write("                        <li class=\"active\"><a href=\"/user/person.html\">主页</a></li>\n");
      out.write("                        <li><a href=\"");
      out.print(path);
      out.write("/single/showMoreSingle.html\">最近发表</a></li>\n");
      out.write("                        <li><a href=\"");
      out.print(path);
      out.write("/single/showMoreSingle.html\">最新文章</a></li>\n");
      out.write("                        <li><a href=\"");
      out.print(path);
      out.write("/about.jsp\">关于</a></li>\n");
      out.write("                        <li><a href=\"");
      out.print(path);
      out.write("/single/showSingle1.html\">Blog Single 1</a></li>\n");
      out.write("                        <li><a href=\"");
      out.print(path);
      out.write("/single/showSingle2.html\">Blog Single 2</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"nav column-menu white-bg\">\n");
      out.write("                        <li><a href=\"");
      out.print(path);
      out.write("/single/showSingle3.html\">Blog Single 3</a></li>\n");
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
      out.write("                <h5 class=\"widget-title\">邮件订阅.</h5>\n");
      out.write("                <form method=\"post\" class=\"form-inline subscribe-form\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <input type=\"email\" class=\"form-control\" placeholder=\"Email\" id=\"u_mail\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <input type=\"hidden\" class=\"form-control\" id=\"senderName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\n");
      out.write("\n");
      out.write("                    <button  class=\"btn btn-primary btn-sm\" onclick=\"filter()\"><span>send</span></button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("      <center> <h5 class=\"copyright\">Copyright &copy; 2017.zenghuangdong.cn All rights reserved.</h5></center>\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
      out.write("\n");
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
      out.write("/js/vendors/flexslider/jquery.flexslider-min.js\"></script>\n");
      out.write("<script src=\"");
      out.print(path);
      out.write("/js/theme.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
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
