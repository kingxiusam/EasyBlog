package org.apache.jsp.WEB_002dINF.views.personBlog;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;

public final class single4_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    String path = request.getContextPath();
//    pageContext.setAttribute("singleNum","1");


      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <head>\r\n");
      out.write("        <!--==========Dependency============-->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.print(path);
      out.write("/css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.print(path);
      out.write("/css/font-awesome.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.print(path);
      out.write("/js/vendors/owl-carousel/assets/owl.carousel.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.print(path);
      out.write("/js/vendors/magnific-popup/magnific-popup.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.print(path);
      out.write("/js/vendors/flexslider/flexslider.css\">\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Kanit:500\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Josefin+Sans:600,700italic\">\r\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Dosis:400,200,300,500,600,800,700' rel='stylesheet' type='text/css'>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Muli:400,300,300italic,400italic\">\r\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500italic,500,700italic,700,900,900italic' rel='stylesheet' type='text/css'>\r\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>\r\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Fredoka+One' rel='stylesheet' type='text/css'>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!--==========Theme Styles==========-->\r\n");
      out.write("        <link href=\"");
      out.print(path);
      out.write("/css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"");
      out.print(path);
      out.write("/css/theme/green.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.print(path);
      out.write("/css/main.e87dad73.css\">\r\n");
      out.write("        <script src=\"");
      out.print(path);
      out.write("/js/blog.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.print(path);
      out.write("/js/single.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/js/jquery-1.8.3.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/js/jquery.validate.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/js/messageValidate.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"");
      out.print(path);
      out.write("/js/html5shiv.min.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.print(path);
      out.write("/js/respond.min.js\"></script>\r\n");
      out.write("        <![endif]==========-->\r\n");
      out.write("    <title>HuangDong single</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<header class=\"row transparent white\" data-spy=\"affix\" data-offset-top=\"300\" id=\"header\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row top-header\">\r\n");
      out.write("            <div class=\"col-sm-4 search-form-col\">\r\n");
      out.write("                <form action=\"");
      out.print(path);
      out.write("/single/searchContent.html\" method=\"post\" class=\"search-form\">\r\n");
      out.write("                    <div class=\"input-group\">\r\n");
      out.write("                        <span class=\"input-group-addon\"><img src=\"");
      out.print(path);
      out.write("/images/search-icon-dark.png\" alt=\"\"></span>\r\n");
      out.write("                        <input type=\"search\" name=\"postTitle\" class=\"form-control\" placeholder=\"输入你要查找的帖子主题关键字\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-sm-4 logo-col text-center\">\r\n");
      out.write("                <a href=\"#\"><img src=\"");
      out.print(path);
      out.write("/images/title_picture.png\" alt=\"\"></a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-sm-4 menu-trigger-col\">\r\n");
      out.write("                <button class=\"menu-trigger black pull-right\">\r\n");
      out.write("                    <span class=\"active-page\">Details</span>\r\n");
      out.write("                    <img src=\"");
      out.print(path);
      out.write("/images/menu-align-dark.png\" alt=\"\" class=\"icon-burger\">\r\n");
      out.write("                    <img src=\"");
      out.print(path);
      out.write("/images/menu-close-dark.png\" alt=\"\" class=\"icon-cross\">\r\n");
      out.write("                </button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"row menu-section\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-sm-8 menu-col\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <ul class=\"nav column-menu white-bg\">\r\n");
      out.write("                            <li class=\"active dropdown\">\r\n");
      out.write("                                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Home <span class=\"caret\"></span></a>\r\n");
      out.write("                                <ul class=\"dropdown-menu\">\r\n");
      out.write("                                    <li><a href=\"");
      out.print(path);
      out.write("/single/showMoreSingle.html\">最近发表</a></li>\r\n");
      out.write("                                    <li><a href=\"");
      out.print(path);
      out.write("/single/showMoreSingle.html\">最新文章</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li><a href=\"");
      out.print(path);
      out.write("/about.jsp\">关于</a></li>\r\n");
      out.write("                            <li><a href=\"/single/showSingle1.html\">Blog Single 1</a></li>\r\n");
      out.write("                            <li><a href=\"/single/showSingle2.html\">Blog Single 2</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                        <ul class=\"nav column-menu white-bg\">\r\n");
      out.write("                            <li><a href=\"/single/showSingle3.html\">Blog Single 3</a></li>\r\n");
      out.write("                            <li style=\"color: #0d90d1\"><a style=\"color: #0d90d1\" href=\"");
      out.print(path);
      out.write("/single/showMoreSingle.html\">更多>></a></li>\r\n");
      out.write("                            <li><a href=\"");
      out.print(path);
      out.write("/contact.jsp\">联系我</a></li>\r\n");
      out.write("                            <li><a href=\"");
      out.print(path);
      out.write("/index.jsp\">退出</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-sm-4 subscribe-col\">\r\n");
      out.write("                    <h5 class=\"widget-title\">邮件订阅.</h5>\r\n");
      out.write("                    <form method=\"post\" class=\"form-inline subscribe-form\">\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <input type=\"email\" class=\"form-control\" placeholder=\"Email\" id=\"mail\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <input type=\"hidden\" class=\"form-control\" id=\"sName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary btn-sm\" onclick=\"topFilter()\"><span>send</span></button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                    <ul class=\"nav social-nav white\">\r\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\r\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-facebook-official\"></i></a></li>\r\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-google-plus\"></i></a></li>\r\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-instagram\"></i></a></li>\r\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-envelope\"></i></a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<section class=\"row content-wrap single-nosidebar\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-sm-12 single-post-contents\">\r\n");
      out.write("                <article class=\"single-post-content v2 row m0 post\">\r\n");
      out.write("                    <header class=\"row\">\r\n");
      out.write("                        <h5 class=\"post-meta\">\r\n");
      out.write("                            <a href=\"#\" class=\"date\">  </a>\r\n");
      out.write("                            <span class=\"post-author\"><i>by</i><a href=\"#\">HuangDong</a></span>\r\n");
      out.write("                        </h5>\r\n");
      out.write("                        <h2 class=\"post-title\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post.postTitle}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</h2>\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <h5 class=\"taxonomy pull-left\"><i>in</i> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post.postType}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</h5>\r\n");
      out.write("                            <div class=\"response-count pull-right\"><img src=\"");
      out.print(path);
      out.write("/images/comment-icon-gray.png\" alt=\"\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:length(communityList)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
      out.write(" comments</div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </header>\r\n");
      out.write("                    <div class=\"featured-content row m0\">\r\n");
      out.write("                        <a href=\"#\"><img src=\"");
      out.print(path);
      out.write("/images/featured-posts/3.jpg\" alt=\"\"></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"post-content row\">\r\n");
      out.write("                        ython在设计上坚持了清晰划一的风格，这使得Python成为一门易读、易维护，并且被大量用户所欢迎的、用途广泛的语言。\r\n");
      out.write("                        设计者开发时总的指导思想是，对于一个特定的问题，只要有一种最好的方法来解决就好了。这在由Tim Peters写的Python格言（称为The Zen of Python）里面表述为：There should be one-- and preferably only one --obvious way to do it. 这正好和Perl语言（另一种功能类似的高级动态语言）的中心思想TMTOWTDI（There's More Than One Way To Do It）完全相反。\r\n");
      out.write("                        Python的作者有意的设计限制性很强的语法，使得不好的编程习惯（例如if语句的下一行不向右缩进）都不能通过编译。其中很重要的一项就是Python的缩进规则。\r\n");
      out.write("                        一个和其他大多数语言（如C）的区别就是，一个模块的界限，完全是由每行的首字符在这一行的位置来决定的（而C语言是用一对花括号{}来明确的定出模块的边界的，与字符的位置毫无关系）。这一点曾经引起过争议。因为自从C这类的语言诞生后，语言的语法含义与字符的排列方式分离开来，曾经被认为是一种程序语言的进步。不过不可否认的是，通过强制程序员们缩进（包括if，for和函数定义等所有需要使用模块的地方），Python确实使得程序更加清晰和美观。\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row m0 tags\">\r\n");
      out.write("                        <a href=\"#\" class=\"tag\">it</a>\r\n");
      out.write("                        <a href=\"#\" class=\"tag\">python</a>\r\n");
      out.write("                        <a href=\"#\" class=\"tag\">基础</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <hr/>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"row m0 comments\">\r\n");
      out.write("                        <h5 class=\"response-count\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:length(communityList)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
      out.write(" comments<a href=\"#comment-form\" class=\"btn btn-primary pull-right\"><span>add comment</span></a></h5>\r\n");
      out.write("\r\n");
      out.write("                        <!--Comments-->\r\n");
      out.write("                        <div class=\"media comment\">\r\n");
      out.write("\r\n");
      out.write("                            ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/views/personBlog/single4.jsp(166,28) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("message");
      // /WEB-INF/views/personBlog/single4.jsp(166,28) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/personBlog/single4.jsp(166,28) '${communityList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${communityList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                                <div class=\"media comment reply\">\r\n");
            out.write("                                    <div class=\"media-left\">\r\n");
            out.write("                                        <a href=\"#\"><img src=\"");
            out.print(path);
            out.write("/images/posts/c2.jpg\" alt=\"\" class=\"img-circle\"></a>\r\n");
            out.write("                                    </div>\r\n");
            out.write("                                    <div class=\"media-body\">\r\n");
            out.write("                                        <h4><a href=\"#\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message.owner}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("</a></h4>\r\n");
            out.write("                                        <h5><a href=\"#\" class=\"date\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message.time}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("</a> | <a href=\"#\" class=\"reply-link\">reply</a></h5>\r\n");
            out.write("\r\n");
            out.write("                                        <p>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message.message}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("</p>\r\n");
            out.write("                                        ");
            //  c:if
            org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
            _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
            _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
            // /WEB-INF/views/personBlog/single4.jsp(176,40) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message.owner==userName}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
            int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
            if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              do {
                out.write("|<a href=\"");
                out.print(path);
                out.write("/community/4/deleteCommunity.html?messageId=");
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
            out.write("\r\n");
            out.write("                                    </div>\r\n");
            out.write("                                </div>\r\n");
            out.write("\r\n");
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
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </article>\r\n");
      out.write("\r\n");
      out.write("                <form action=\"");
      out.print(path);
      out.write("/community/addOneCommunity/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/4.html\" method=\"post\" id=\"messageForm\" class=\"comment-form row\">\r\n");
      out.write("                    <h5 class=\"form-title\">@留言@</h5>\r\n");
      out.write("                    <div class=\"form-group col-sm-6\">\r\n");
      out.write("                        <label for=\"name\">姓名*</label>\r\n");
      out.write("                        <input type=\"text\" id=\"name\" name=\"name\" class=\"form-control\" placeholder=\"Your name\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group col-sm-6\">\r\n");
      out.write("                        <label for=\"email\">Email*</label>\r\n");
      out.write("                        <input type=\"email\" id=\"email\" name=\"email\" class=\"form-control\" placeholder=\"Your email address here,eg:1459951296@qq.com\" >\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group col-sm-6\">\r\n");
      out.write("                        <label for=\"website\">网址</label>\r\n");
      out.write("                        <input type=\"url\" id=\"website\" name=\"website\" class=\"form-control\" placeholder=\"Your website url,eg:http://www.zenghuangdong.cn\" >\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group col-sm-6\">\r\n");
      out.write("                        <label for=\"subject\">兴趣爱好</label>\r\n");
      out.write("                        <input type=\"text\" id=\"subject\" name=\"subject\" class=\"form-control\" placeholder=\"Write subject here\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group col-sm-12\">\r\n");
      out.write("                        <label for=\"message\">评论*</label>\r\n");
      out.write("                        <textarea name=\"message\" id=\"message\" name=\"message\" class=\"form-control\" placeholder=\"Write message here\"></textarea>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-12\">\r\n");
      out.write("                        <input type=\"submit\" class=\"btn-primary\" value=\"提交\">\r\n");
      out.write("                        <h5 class=\"pull-right\">*必填</h5>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--Footer-->\r\n");
      out.write("<footer class=\"row\" id=\"footer\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row top-footer\">\r\n");
      out.write("            <div class=\"widget col-sm-3 widget-about\">\r\n");
      out.write("                <div class=\"row m0\"><a href=\"/user/person.html\"><img src=\"");
      out.print(path);
      out.write("/images/huangdong.jpg\" alt=\"\"></a></div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"widget col-sm-5 widget-menu\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <ul class=\"nav column-menu white-bg\">\r\n");
      out.write("                        <li class=\"active\"><a href=\"/user/person.html\">主页</a></li>\r\n");
      out.write("                        <li><a href=\"");
      out.print(path);
      out.write("/single/showMoreSingle.html\">最近发表</a></li>\r\n");
      out.write("                        <li><a href=\"");
      out.print(path);
      out.write("/single/showMoreSingle.html\">最新文章</a></li>\r\n");
      out.write("                        <li><a href=\"");
      out.print(path);
      out.write("/about.jsp\">关于</a></li>\r\n");
      out.write("                        <li><a href=\"");
      out.print(path);
      out.write("/single/showSingle1.html\">Blog Single 1</a></li>\r\n");
      out.write("                        <li><a href=\"");
      out.print(path);
      out.write("/single/showSingle2.html\">Blog Single 2</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <ul class=\"nav column-menu white-bg\">\r\n");
      out.write("                        <li><a href=\"");
      out.print(path);
      out.write("/single/showSingle3.html\">Blog Single 3</a></li>\r\n");
      out.write("                        <li style=\"color: #0d90d1\"><a style=\"color: #0d90d1\" href=\"");
      out.print(path);
      out.write("/single/showMoreSingle.html\">更多 >></a></li>\r\n");
      out.write("                        <li><a href=\"");
      out.print(path);
      out.write("/contact.jsp\">联系</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"widget col-sm-4 widget-subscribe\">\r\n");
      out.write("                <h5 class=\"widget-title\">邮件订阅.</h5>\r\n");
      out.write("                <form method=\"post\" class=\"form-inline subscribe-form\">\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <input type=\"email\" class=\"form-control\" placeholder=\"Email\" id=\"u_mail\">\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <input type=\"hidden\" class=\"form-control\" id=\"senderName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("                    <button  class=\"btn btn-primary btn-sm\" onclick=\"filter()\"><span>send</span></button>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <center> <h5 class=\"copyright\">Copyright &copy; 2017.zenghuangdong.cn All rights reserved.</h5></center>\r\n");
      out.write("    </div>\r\n");
      out.write("</footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
