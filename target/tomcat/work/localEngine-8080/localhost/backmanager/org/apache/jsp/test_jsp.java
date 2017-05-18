package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class test_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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


      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
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
      out.write("    <title>Title</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form action=\"");
      out.print(path);
      out.write("/community/addOneCommunity/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/2.html\" method=\"post\" id=\"messageForm\" class=\"comment-form row\">\r\n");
      out.write("    <h5 class=\"form-title\">@留言@</h5>\r\n");
      out.write("    <div class=\"form-group col-sm-6\">\r\n");
      out.write("        <label for=\"name\">姓名*</label>\r\n");
      out.write("        <input type=\"text\" id=\"name\" name=\"name\" class=\"form-control\" placeholder=\"Your name\">\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"form-group col-sm-6\">\r\n");
      out.write("        <label for=\"email\">Email*</label>\r\n");
      out.write("        <input type=\"email\" id=\"email\" name=\"email\" class=\"form-control\" placeholder=\"Your email address here,eg:1459951296@qq.com\" >\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"form-group col-sm-6\">\r\n");
      out.write("        <label for=\"website\">网址</label>\r\n");
      out.write("        <input type=\"url\" id=\"website\" name=\"website\" class=\"form-control\" placeholder=\"Your website url,eg:http://www.zenghuangdong.cn\" >\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"form-group col-sm-6\">\r\n");
      out.write("        <label for=\"subject\">兴趣爱好</label>\r\n");
      out.write("        <input type=\"text\" id=\"subject\" name=\"subject\" class=\"form-control\" placeholder=\"Write subject here\">\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"form-group col-sm-12\">\r\n");
      out.write("        <label for=\"message\">评论*</label>\r\n");
      out.write("        <textarea name=\"message\" id=\"message\" name=\"message\" class=\"form-control\" placeholder=\"Write message here\"></textarea>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-sm-12\">\r\n");
      out.write("        <input type=\"submit\" class=\"btn-primary\" value=\"提交\">\r\n");
      out.write("        <h5 class=\"pull-right\">*必填</h5>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
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
