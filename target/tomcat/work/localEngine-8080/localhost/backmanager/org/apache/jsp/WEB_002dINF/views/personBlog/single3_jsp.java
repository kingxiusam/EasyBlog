package org.apache.jsp.WEB_002dINF.views.personBlog;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class single3_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
      out.write('\n');

    String path = request.getContextPath();

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<!--========== The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags ==========-->\n");
      out.write("<title>HuangDong single</title>\n");
      out.write("\n");
      out.write("    <!--==========Dependency============-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
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
      out.write("/js/respond.min.js\"></script>\n");
      out.write("    <![endif]==========-->\n");
      out.write("</head>\n");
      out.write("<body class=\"home\">\n");
      out.write("\n");
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
      out.write("        </div>\n");
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
      out.write("\n");
      out.write("<section class=\"row content-wrap single-nosidebar\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-12 single-post-contents\">\n");
      out.write("                <article class=\"single-post-content v2 v2p1 row m0 post\">\n");
      out.write("                    <header class=\"row\">                        \n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <h5 class=\"taxonomy pull-left\"><i>in</i> <a href=\"#\">image</a>, <a href=\"#\">entertainment</a></h5>\n");
      out.write("                            <div class=\"response-count pull-right\"><img src=\"");
      out.print(path);
      out.write("/images/comment-icon-gray.png\" alt=\"\">5</div>\n");
      out.write("                        </div>                        \n");
      out.write("                        <h2 class=\"post-title\">Nature, in the broadest sense, is the natural, physical, or material world or universe.</h2>\n");
      out.write("                        <h5 class=\"post-meta\">\n");
      out.write("                            By <a href=\"#\">HuangDong</a> | <a href=\"#\" class=\"date\">feb 17, 2016</a>\n");
      out.write("                        </h5>\n");
      out.write("                    </header>\n");
      out.write("                    <div class=\"featured-content row m0\">\n");
      out.write("                        <a href=\"#\"><img src=\"");
      out.print(path);
      out.write("/images/featured-posts/3.jpg\" alt=\"\"></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"post-content row\">\n");
      out.write("                        <div class=\"row m0\">\n");
      out.write("                            <div class=\"col-sm-4 post-author-about\">\n");
      out.write("                                <div class=\"media\">\n");
      out.write("                                    <div class=\"media-left\">\n");
      out.write("                                        <a href=\"#\"><img src=\"");
      out.print(path);
      out.write("/images/author.png\" alt=\"\" class=\"img-circle\"></a>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"media-body\">\n");
      out.write("                                        <h3><a href=\"#\">HuangDong</a></h3>\n");
      out.write("                                        <h5>small title</h5>\n");
      out.write("                                        <ul class=\"nav social-nav white\">\n");
      out.write("                                            <li><a href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("                                            <li><a href=\"#\"><i class=\"fa fa-facebook-official\"></i></a></li>\n");
      out.write("                                            <li><a href=\"#\"><i class=\"fa fa-google-plus\"></i></a></li>\n");
      out.write("                                            <li><a href=\"#\"><i class=\"fa fa-instagram\"></i></a></li>\n");
      out.write("                                            <li><a href=\"#\"><i class=\"fa fa-pinterest\"></i></a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <p>The word nature is derived from the Latin word natura, or \"essential qualities, innate disposition\", and in ancient times, literally meant \"birth\".</p>\n");
      out.write("                            </div>\n");
      out.write("                            <h4>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</h4>\n");
      out.write("                        </div>\n");
      out.write("                        <br>\n");
      out.write("                        <h3>Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</h3>\n");
      out.write("                        <br>\n");
      out.write("                        <p>It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</p>\n");
      out.write("                        <br>\n");
      out.write("                        <blockquote class=\"has-sign row m0\">                            \n");
      out.write("                            <div>\n");
      out.write("                                <p>If everybody learns this simple art of loving his work, whatever it is, enjoying it without asking for any recognition, we would have more beautiful and celebrating world.</p>\n");
      out.write("                                <footer>OSHO</footer>\n");
      out.write("                            </div>\n");
      out.write("                        </blockquote>\n");
      out.write("                        <h3>Sunt in culpa qui officia deserunt mollit anim id est laborum.</h3>\n");
      out.write("                        <br>\n");
      out.write("                        <ul class=\"triangle-list nav\">\n");
      out.write("                            <li>It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.</li>\n");
      out.write("                            <li>Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</li>\n");
      out.write("                        </ul>\n");
      out.write("                        <ul class=\"circle-list nav\">\n");
      out.write("                            <li>Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.</li>\n");
      out.write("                            <li>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</li>\n");
      out.write("                        </ul>\n");
      out.write("                        <br>\n");
      out.write("                        <blockquote class=\"no-sign\">\n");
      out.write("                            <p>Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt.</p>\n");
      out.write("                        </blockquote>\n");
      out.write("                        <br>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-4\">\n");
      out.write("                                <p>It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-4\">\n");
      out.write("                                <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt.</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-4\">\n");
      out.write("                                <p>It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <br>\n");
      out.write("\n");
      out.write("                        <br>\n");
      out.write("\n");
      out.write("                        <!-- Place somewhere in the <body> of your page -->\n");
      out.write("                        <div class=\"thumbCarousel row m0\">\n");
      out.write("                        <br>\n");
      out.write("                        <p>It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row m0 tags\">\n");
      out.write("                        <a href=\"#\" class=\"tag\">music</a>\n");
      out.write("                        <a href=\"#\" class=\"tag\">tegs</a>\n");
      out.write("                        <a href=\"#\" class=\"tag\">tegs hover</a>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                   <hr/>\n");
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
      // /WEB-INF/views/personBlog/single3.jsp(221,28) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("message");
      // /WEB-INF/views/personBlog/single3.jsp(221,28) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/personBlog/single3.jsp(221,28) '${communityList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${communityList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
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
            out.write("                                        ");
            //  c:if
            org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
            _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
            _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
            // /WEB-INF/views/personBlog/single3.jsp(229,40) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message.owner==userName}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
            int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
            if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              do {
                out.write("   <p>");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message.message}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                out.write("</p>\n");
                out.write("                                        | <a href=\"");
                out.print(path);
                out.write("/community/3/deleteCommunity.html?messageId=");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message.messageId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                out.write("\" class=\"reply-link\" onclick=\"delConfirm();\">delete</a>\n");
                out.write("                                        ");
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
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </article>\n");
      out.write("\n");
      out.write("                <form action=\"");
      out.print(path);
      out.write("/community/addOneCommunity/3.html\" method=\"post\" id=\"messageForm\" class=\"comment-form row\">\n");
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
      out.write("</section>\n");
      out.write("\n");
      out.write("<!--Footer-->\n");
      out.write("<footer class=\"row\" id=\"footer\">\n");
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
      out.write("/single/showMoreSingle.html\">更多>></a></li>\n");
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
      out.write("                        <input type=\"hidden\" class=\"form-control\" id=\"senderName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\n");
      out.write("\n");
      out.write("                    <button  class=\"btn btn-primary btn-sm\" onclick=\"filter()\"><span>send</span></button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <center> <h5 class=\"copyright\">Copyright &copy; 2017.zenghuangdong.cn All rights reserved.</h5></center>\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("<!--========== jQuery (necessary for Bootstrap's JavaScript plugins) ==========-->\n");
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
