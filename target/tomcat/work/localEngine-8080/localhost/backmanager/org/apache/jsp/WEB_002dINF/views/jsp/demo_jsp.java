package org.apache.jsp.WEB_002dINF.views.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class demo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

request.setCharacterEncoding("UTF-8");
String path = request.getContextPath();

      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"utf-8\" />\r\n");
      out.write("\t<title>前台网页编辑CMS系统</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.print(path);
      out.write("/kindeditor/themes/default/default.css\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.print(path);
      out.write("/kindeditor/plugins/code/prettify.css\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.print(path);
      out.write("/css/main.e87dad73.css\">\r\n");
      out.write("\t<!--==========Theme Styles==========-->\r\n");
      out.write("\t<link href=\"");
      out.print(path);
      out.write("/css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<link href=\"");
      out.print(path);
      out.write("/css/theme/green.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<script charset=\"utf-8\" src=\"");
      out.print(path);
      out.write("/kindeditor/kindeditor.js\"></script>\r\n");
      out.write("\t<script charset=\"utf-8\" src=\"");
      out.print(path);
      out.write("/kindeditor/lang/zh_CN.js\"></script>\r\n");
      out.write("\t<script charset=\"utf-8\" src=\"");
      out.print(path);
      out.write("/kindeditor/plugins/code/prettify.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tKindEditor.ready(function(K) {\r\n");
      out.write("\t\t\tvar editor1 = K.create('textarea[name=\"content1\"]', {\r\n");
      out.write("\t\t\t\tcssPath : '");
      out.print(path);
      out.write("/kindeditor/plugins/code/prettify.css',\r\n");
      out.write("\t\t\t\tuploadJson : 'http://localhost:8080/backmanager/page/uploadJson.html',\r\n");
      out.write("\t\t\t\tfileManagerJson : 'http://localhost:8080/backmanager/page/jsonManager.html',\r\n");
      out.write("\t\t\t\tallowFileManager : true,\r\n");
      out.write("\t\t\t\tafterCreate : function() {\r\n");
      out.write("\t\t\t\t\tvar self = this;\r\n");
      out.write("\t\t\t\t\tK.ctrl(document, 13, function() {\r\n");
      out.write("\t\t\t\t\t\tself.sync();\r\n");
      out.write("\t\t\t\t\t\tdocument.forms['example'].submit();\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\tK.ctrl(self.edit.doc, 13, function() {\r\n");
      out.write("\t\t\t\t\t\tself.sync();\r\n");
      out.write("\t\t\t\t\t\tdocument.forms['example'].submit();\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\tprettyPrint();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t<form name=\"example\" method=\"post\" action=\"");
      out.print(path);
      out.write("/file/pageCreate.html\">\r\n");
      out.write("\r\n");
      out.write("\t\t<h5 class=\"form-title\">== 编辑帖子 ==</h5>\r\n");
      out.write("\t\t<div class=\"form-group col-sm-6\">\r\n");
      out.write("\t\t\t<label for=\"title\">帖子标题*</label>\r\n");
      out.write("\t\t\t<input type=\"text\" id=\"title\" name=\"title\" class=\"form-control\" placeholder=\"输入帖子标题\" >\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"form-group col-sm-6\">\r\n");
      out.write("\t\t\t<label for=\"type\">帖子类型*</label>\r\n");
      out.write("\t\t\t<input type=\"text\" id=\"type\" name=\"type\" class=\"form-control\" placeholder=\"输入帖子类型\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"form-group col-sm-6\">\r\n");
      out.write("\t\t\t<label for=\"tag\">标签*</label>\r\n");
      out.write("\t\t\t<input type=\"text\" id=\"tag\" name=\"tag\" class=\"form-control\" placeholder=\"输入帖子类型\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<br/>\r\n");
      out.write("\t\t<textarea name=\"content1\" cols=\"100\" rows=\"8\" style=\"width:700px;height:200px;visibility:hidden;\"></textarea>\r\n");
      out.write("\t\t<br />\r\n");
      out.write("\t\t<input type=\"submit\" name=\"button\" value=\"提交内容\" /> (提交快捷键: Ctrl + Enter)\r\n");
      out.write("\t</form>\r\n");
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
