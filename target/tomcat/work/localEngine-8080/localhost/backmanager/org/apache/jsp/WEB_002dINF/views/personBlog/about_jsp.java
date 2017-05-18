package org.apache.jsp.WEB_002dINF.views.personBlog;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    String path = request.getContextPath();

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<!--========== The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags ==========-->\n");
      out.write("<title>Chivalric</title>\n");
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
      out.write("\n");
      out.write("<!--========== HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries ==========-->\n");
      out.write("<!--========== WARNING: Respond.js doesn't work if you view the page via file:// ==========-->\n");
      out.write("<!--==========[if lt IE 9]>\n");
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
      out.write("                <form action=\"#\" method=\"get\" class=\"search-form\">\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <span class=\"input-group-addon\"><img src=\"");
      out.print(path);
      out.write("/images/search-icon-dark.png\" alt=\"\"></span>\n");
      out.write("                        <input type=\"search\" class=\"form-control\" placeholder=\"search\">\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-4 logo-col text-center\">\n");
      out.write("                <a href=\"/user/person.html\"><img src=\"");
      out.print(path);
      out.write("/images/title_picture.png\" alt=\"\"></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-4 menu-trigger-col\">\n");
      out.write("                <button class=\"menu-trigger black pull-right\">\n");
      out.write("                    <span class=\"active-page\">About</span>\n");
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
      out.write("                            <li class=\"dropdown\">\n");
      out.write("                                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">主页 <span class=\"caret\"></span></a>\n");
      out.write("                                <ul class=\"dropdown-menu\">\n");
      out.write("                                    <li><a href=\"index1.html\">Home Option 1</a></li>\n");
      out.write("                                    <li><a href=\"index2.html\">Home Option 2</a></li>\n");
      out.write("                                    <li><a href=\"index3.html\">Home Option 3</a></li>\n");
      out.write("                                    <li><a href=\"index4.html\">Home Option 4</a></li>\n");
      out.write("                                    <li><a href=\"index5.html\">Home Option 5</a></li>\n");
      out.write("                                    <li><a href=\"index6.html\">Home Option 6</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"active\"><a href=\"#\">关于</a></li>\n");
      out.write("                            <li><a href=\"/single/showSingle1.html\">Blog Single 1</a></li>\n");
      out.write("                            <li><a href=\"/single/showSingle2.html\">Blog Single 2</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                        <ul class=\"nav column-menu white-bg\">\n");
      out.write("                            <li><a href=\"/single/showSingle3.html\">Blog Single 3</a></li>\n");
      out.write("                            \n");
      out.write("                            <li><a href=\"#\">contact</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-4 subscribe-col\">\n");
      out.write("                    <h5 class=\"widget-title\">邮件订阅.</h5>\n");
      out.write("                    <form action=\"#\" method=\"post\" class=\"form-inline subscribe-form\">                    \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"email\" class=\"form-control\" placeholder=\"Email\">\n");
      out.write("                        </div>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary btn-sm\"><span>send</span></button>\n");
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
      out.write("<section class=\"row page-content-wrap\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h2 class=\"page-title text-center\">about me</h2>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-8 page-contents\">\n");
      out.write("                <div class=\"row page-content\">\n");
      out.write("                    <img src=\"");
      out.print(path);
      out.write("/images/author.jpg\" alt=\"\" class=\"img-responsive\">\n");
      out.write("                    \n");
      out.write("                    <div class=\"contents row\">\n");
      out.write("                        <h4>Mark Samder, lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.</h4>\n");
      out.write("                    \n");
      out.write("                        <p>It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</p>\n");
      out.write("                        <br>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <p>It has survived not only five centuries, remaining essentially unchanged. <a href=\"www.mywebsite.com\">www.mywebsite.com</a> it was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt.</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4 sidebar\">  \n");
      out.write("                <!--Twitter Widget-->\n");
      out.write("                <aside class=\"row m0 widget widget-twitter\">\n");
      out.write("                    <div class=\"widget-twitter-inner\">\n");
      out.write("                        <h5 class=\"widget-meta\"><i class=\"fa fa-twitter\"></i>Twitter feed <a href=\"http://twitter.com/chivalricblog\">@chivalricblog</a></h5>\n");
      out.write("                        <div class=\"row tweet-texts\">\n");
      out.write("                            <p>Check out new post on my blog <a href=\"http://twitter.com/#natureshot\">#natureshot</a> <a href=\"http://bit.ly/blog\">http://bit.ly/blog</a></p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row timepast\">1 day ago</div>\n");
      out.write("                    </div>\n");
      out.write("                </aside>\n");
      out.write("                <!--Instagram Widget-->\n");
      out.write("                <aside class=\"row m0 widget widget-instagram\">\n");
      out.write("                    <div class=\"widget-instagram-inner\">\n");
      out.write("                        <h5 class=\"widget-meta\"><i class=\"fa fa-twitter\"></i>instagram feed <a href=\"http://twitter.com/chivalricblog\">@chivalricblog</a></h5>\n");
      out.write("                        <div id=\"instafeed\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </aside>\n");
      out.write("                <aside class=\"row m0 widget widget-facebook\">\n");
      out.write("                    <div class=\"widget-inner widget-facebook-inner\">\n");
      out.write("                        <a href=\"#\" class=\"facebook-link\"><i class=\"fa fa-facebook-square\"></i>find us on facebook</a>\n");
      out.write("                    </div>                    \n");
      out.write("                    <ul class=\"nav social-nav\">\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-facebook-official\"></i></a></li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-google-plus\"></i></a></li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-instagram\"></i></a></li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-envelope\"></i></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </aside>\n");
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
      out.write("                        <li class=\"active\"><a href=\"/user/person.html\">Home</a></li>\n");
      out.write("                        <li><a href=\"#\">About</a></li>\n");
      out.write("                        <li><a href=\"/single/showSingle1.html\">Blog Single 1</a></li>\n");
      out.write("                        <li><a href=\"/single/showSingle2.html\">Blog Single 2</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"nav column-menu white-bg\">\n");
      out.write("                        <li><a href=\"/single/showSingle3.html\">Blog Single 3</a></li>\n");
      out.write("                        \n");
      out.write("                        <li><a href=\"#\">contact</a></li>\n");
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
      out.write("        <h5 class=\"copyright\">Copyright &copy; 2017.zenghuangdong.cn name All rights reserved</h5>\n");
      out.write("    </div>\n");
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
