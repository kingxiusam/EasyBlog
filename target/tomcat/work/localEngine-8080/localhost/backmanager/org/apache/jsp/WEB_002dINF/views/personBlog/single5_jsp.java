package org.apache.jsp.WEB_002dINF.views.personBlog;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class single5_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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

    String path = request.getContextPath();
//    pageContext.setAttribute("singleNum","1");


      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <!--========== The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags ==========-->\r\n");
      out.write("    <title>HuangDong single</title>\r\n");
      out.write("\r\n");
      out.write("    <!--==========Dependency============-->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(path);
      out.write("/css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(path);
      out.write("/css/font-awesome.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(path);
      out.write("/js/vendors/owl-carousel/assets/owl.carousel.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(path);
      out.write("/js/vendors/magnific-popup/magnific-popup.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(path);
      out.write("/js/vendors/flexslider/flexslider.css\">\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Kanit:500\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Josefin+Sans:600,700italic\">\r\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Dosis:400,200,300,500,600,800,700' rel='stylesheet' type='text/css'>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Muli:400,300,300italic,400italic\">\r\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500italic,500,700italic,700,900,900italic' rel='stylesheet' type='text/css'>\r\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>\r\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Fredoka+One' rel='stylesheet' type='text/css'>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!--==========Theme Styles==========-->\r\n");
      out.write("    <link href=\"");
      out.print(path);
      out.write("/css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"");
      out.print(path);
      out.write("/css/theme/green.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(path);
      out.write("/css/main.e87dad73.css\">\r\n");
      out.write("    <script src=\"");
      out.print(path);
      out.write("/js/blog.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(path);
      out.write("/js/single.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/js/jquery-1.8.3.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/js/jquery.validate.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/js/messageValidate.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"");
      out.print(path);
      out.write("/js/html5shiv.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(path);
      out.write("/js/respond.min.js\"></script>\r\n");
      out.write("    <![endif]==========-->\r\n");
      out.write("\r\n");
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
      out.write("                       <h3>JAVA反射机制是在运行状态中，对于任意一个类，都能够知道这个类的所有属性和方法；对于任意一个对象，都能够调用它的任意方法和属性；这种动态获取信息以及动态调用对象方法的功能称为java语言的反射机制。\r\n");
      out.write("                        JAVA反射（放射）机制：“程序运行时，允许改变程序结构或变量类型，这种语言称为动态语言”。从这个观点看，Perl，Python，Ruby是动态语言，C++，Java，C#不是动态语言。但是JAVA有着一个非常突出的动态相关机制：Reflection，用在Java身上指的是我们可以于运行时加载、探知、使用编译期间完全未知的classes。换句话说，Java程序可以加载一个运行时才得知名称的class，获悉其完整构造（但不包括methods定义），并生成其对象实体、或对其fields设值、或唤起其methods。\r\n");
      out.write("                       </h3>\r\n");
      out.write("\r\n");
      out.write("                        <h4>Java反射机制主要提供了以下功能： 在运行时判断任意一个对象所属的类；在运行时构造任意一个类的对象；在运行时判断任意一个类所具有的成员变量和方法；在运行时调用任意一个对象的方法；生成动态代理。\r\n");
      out.write("                            有时候我们说某个语言具有很强的动态性，有时候我们会区分动态和静态的不同技术与作法。我们朗朗上口动态绑定（dynamic binding）、动态链接（dynamic linking）、动态加载（dynamic loading）等。然而“动态”一词其实没有绝对而普遍适用的严格定义，有时候甚至像面向对象当初被导入编程领域一样，一人一把号，各吹各的调。\r\n");
      out.write("                            一般而言，开发者社群说到动态语言，大致认同的一个定义是：“程序运行时，允许改变程序结构或变量类型，这种语言称为动态语言”。从这个观点看，Perl，Python，Ruby是动态语言，C++，Java，C#不是动态语言。\r\n");
      out.write("                            尽管在这样的定义与分类下Java不是动态语言，它却有着一个非常突出的动态相关机制：Reflection。这个字的意思是“反射、映象、倒影”，用在Java身上指的是我们可以于运行时加载、探知、使用编译期间完全未知的classes。换句话说，Java程序可以加载一个运行时才得知名称的class，获悉其完整构造（但不包括methods定义），并生成其对象实体、或对其fields设值、或唤起其methods。这种“看透class”的能力（the ability of the program to examine itself）被称为introspection（内省、内观、反省）。Reflection和introspection是常被并提的两个术语。\r\n");
      out.write("                            Java如何能够做出上述的动态特性呢？这是一个深远话题，本文对此只简单介绍一些概念。整个篇幅最主要还是介绍Reflection APIs，也就是让读者知道如何探索class的结构、如何对某个“运行时才获知名称的class”生成一份实体、为其fields设值、调用其methods。本文将谈到java.lang.Class，以及java.lang.reflect中的Method、Field、Constructor等等classes。\r\n");
      out.write("                        </h4>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"row m0 tags\">\r\n");
      out.write("                        <a href=\"#\" class=\"tag\">it</a>\r\n");
      out.write("                        <a href=\"#\" class=\"tag\">java反射</a>\r\n");
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
      // /WEB-INF/views/personBlog/single5.jsp(174,28) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("message");
      // /WEB-INF/views/personBlog/single5.jsp(174,28) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/personBlog/single5.jsp(174,28) '${communityList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${communityList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
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
            // /WEB-INF/views/personBlog/single5.jsp(184,40) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message.owner==userName}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
            int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
            if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              do {
                out.write("|<a href=\"");
                out.print(path);
                out.write("/community/5/deleteCommunity.html?messageId=");
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
      out.write("                <form action=\"");
      out.print(path);
      out.write("/community/addOneCommunity/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/5.html\" method=\"post\" id=\"messageForm\" class=\"comment-form row\">\r\n");
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
      out.write("\r\n");
      out.write("<!--========== jQuery (necessary for Bootstrap's JavaScript plugins) ==========-->\r\n");
      out.write("<script src=\"");
      out.print(path);
      out.write("/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(path);
      out.write("/js/vendors/owl-carousel/owl.carousel.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(path);
      out.write("/js/vendors/magnific-popup/jquery.magnific-popup.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(path);
      out.write("/js/vendors/instafeed/instafeed.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(path);
      out.write("/js/vendors/imagesLoaded/imagesloaded.pkgd.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(path);
      out.write("/js/vendors/isotope/isotope.pkgd.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(path);
      out.write("/js/vendors/flexslider/jquery.flexslider-min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(path);
      out.write("/js/theme.js\"></script>\r\n");
      out.write("\r\n");
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
