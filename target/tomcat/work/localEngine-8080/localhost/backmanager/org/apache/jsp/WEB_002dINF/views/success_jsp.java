package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class success_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	String path=request.getContextPath();

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>操作成功</title>\r\n");
      out.write("<script language=javascript>\r\n");
      out.write("   setTimeout(\"window.history.go(-1);\",1000)\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<script>\r\n");
      out.write("\t//具体时间由于网速产生负值\r\n");
      out.write("\t//获取当前时间\r\n");
      out.write("\tstartday = new Date();\r\n");
      out.write("\tclockStart = startday.getTime();\r\n");
      out.write("\tfunction initStopwatch(){\r\n");
      out.write("\t\tvar myTime = new Date();\r\n");
      out.write("\t\tvar timeNow = myTime.getTime();\r\n");
      out.write("\t\tvar timeDiff = timeNow - clockStart;    //获取间隔时间\r\n");
      out.write("\t\tthis.diffSecs = timeDiff/1000;\r\n");
      out.write("\t\t// 因为时间以毫秒为单位\r\n");
      out.write("\t\treturn(this.diffSecs);                  //返回间隔秒数\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction getSecs()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar mySecs = initStopwatch();\r\n");
      out.write("\t\tvar mySecs1 = \"\"+mySecs;\r\n");
      out.write("\t\t//以倒计时方式显示时间\r\n");
      out.write("\t\tmySecs1 = 10 - eval(mySecs1.substring(0,mySecs1.indexOf(\".\"))) + \"秒\";\r\n");
      out.write("\t\t//noinspection JSValidateTypes\r\n");
      out.write("\t\tdocument.getElementById(\"time\").innerHTML(mySecs1);\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("<div style=\"width: 100%;height: 30%\">\r\n");
      out.write("\t<img src=\"");
      out.print(path);
      out.write("/images/gou.gif\" alt=\"\" style=\"margin-left: 40px;\">\r\n");
      out.write("\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${operationMsg}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("<span id=\"time\">10</span>秒后自动跳转，请等待......\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<a onClick=\"window.history.go(-1);\">若不能跳转点击这里</a>\r\n");
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
