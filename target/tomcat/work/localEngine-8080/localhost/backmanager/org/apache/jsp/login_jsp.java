package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    String context=request.getContextPath();
    request.setAttribute("context",context);

      out.write("\r\n");
      out.write("<html lang=\"zh-CN\"><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\r\n");
      out.write("    <meta name=\"apple-itunes-app\" content=\"app-id=432274380\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("    <meta name=\"renderer\" content=\"webkit\">\r\n");
      out.write("    <meta name=\"description\" content=\"一个真实的网络问答个人社区，帮助你寻找答案，分享知识。\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"user-scalable=no, width=device-width, initial-scale=1.0, maximum-scale=1.0\">\r\n");
      out.write("    <title>学习吧 - 分享 成长 进步 快乐</title>\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"http://zenghuangdong.cn/images/huangdong.jpg\" type=\"image/x-icon\">\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/main.e87dad73.css\">\r\n");
      out.write("\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-3.0.0.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/login.js\"></script>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\" src=\"http://qzonestyle.gtimg.cn/qzone/openapi/qc_loader.js\" data-appid=\"APPID\" data-redirecturi=\"REDIRECTURI\" charset=\"utf-8\"></script>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"height: auto;width: auto\">\r\n");
      out.write("<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/bg.jpg\"  style=\"position: absolute;left:0px;top:0px;width:100%;height:100%;z-index: -1\">\r\n");
      out.write("<div class=\"index-main\" >\r\n");
      out.write("    <div class=\"index-main-body\" style=\"position: fixed;top: 0px;left: 0px;right: 0px;margin: auto;\">\r\n");
      out.write("        <div class=\"index-header\">\r\n");
      out.write("\r\n");
      out.write("            <h1 class=\"logo\">学&nbsp&nbsp习&nbsp&nbsp吧</h1>\r\n");
      out.write("       <img src=\"images/title_picture.png\">\r\n");
      out.write("            <h2 class=\"subtitle\">分享&nbsp&nbsp&nbsp成长&nbsp&nbsp&nbsp进步&nbsp&nbsp&nbsp快乐</h2>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"desk-front sign-flow clearfix sign-flow-simple\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"index-tab-navs\">\r\n");
      out.write("                <div class=\"navs-slider\" data-active-index=\"1\">\r\n");
      out.write("                    <a href=\"register.jsp\" class=\"\">注册</a>\r\n");
      out.write("                    <a href=\"#\" class=\"active\">登录</a>\r\n");
      out.write("                    <span class=\"navs-slider-bar\"></span>\r\n");
      out.write("                </div>\r\n");
      out.write("                <span id=\"qqLoginBtn\"></span>\r\n");
      out.write("                <script type=\"text/javascript\">\r\n");
      out.write("                    QC.Login({\r\n");
      out.write("                        btnId:\"qqLoginBtn\"    //插入按钮的节点id\r\n");
      out.write("                    });\r\n");
      out.write("                </script>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"view view-signin\" data-za-module=\"SignInForm\" style=\"display: block;\">\r\n");
      out.write("                <form method=\"POST\" novalidate=\"novalidate\"/>\r\n");
      out.write("                    <input type=\"hidden\" name=\"_xsrf\" value=\"527ae7bdeb664821becfe1152275aca9\">\r\n");
      out.write("                    <div class=\"group-inputs\">\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"account input-wrapper\">\r\n");
      out.write("\r\n");
      out.write("                            <input type=\"text\" name=\"userName\" id=\"username\" aria-label=\"姓名\" placeholder=\"姓名\" required=\"\" class=\"username\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"verification input-wrapper\">\r\n");
      out.write("                            <input type=\"password\" name=\"passWord\" id=\"password\" aria-label=\"密码\" class=\"password\" placeholder=\"密码\" required=\"\"><button type=\"button\" class=\"send-code-button\">获取验证码</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"input-wrapper captcha-module\" data-type=\"en\">\r\n");
      out.write("                            <input name=\"captcha\" placeholder=\"验证码\" required=\"\" data-rule-required=\"true\" data-msg-required=\"请填写验证码\">\r\n");
      out.write("                            <div class=\"captcha-container\">\r\n");
      out.write("\r\n");
      out.write("                                <img class=\"js-refreshCaptcha captcha\" width=\"120\" height=\"30\" data-tooltip=\"s$t$看不清楚？换一张\" alt=\"验证码\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"button-wrapper command\">\r\n");
      out.write("                        <button class=\"sign-button submit\" id=\"submit\" type=\"button\" onclick=\"myconfirm()\">登录</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                <div id=\"UserResult\"></div>\r\n");
      out.write("                <div id=\"PasswordResult\"></div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"signin-misc-wrapper clearfix\">\r\n");
      out.write("\r\n");
      out.write("                        <button type=\"button\" class=\"signin-switch-button\">手机验证码登录</button>\r\n");
      out.write("\r\n");
      out.write("                        <a class=\"unable-login\" href=\"https://www.zenghuangdong.cn/#\">无法登录？</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </form>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"view view-signup selected\" data-za-module=\"SignUpForm\" style=\"display: none;\">\r\n");
      out.write("                <form class=\"zu-side-login-box\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/email/subscribe.html\" id=\"sign-form-1\" autocomplete=\"off\" method=\"POST\" novalidate=\"novalidate\">\r\n");
      out.write("                    <input type=\"password\" hidden=\"\">\r\n");
      out.write("                    <input type=\"hidden\" name=\"_xsrf\" value=\"527ae7bdeb664821becfe1152275aca9\">\r\n");
      out.write("                    <div class=\"group-inputs\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"name input-wrapper\">\r\n");
      out.write("                            <input required=\"\" type=\"text\" name=\"fullname\" aria-label=\"姓名\" placeholder=\"姓名\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"email input-wrapper\">\r\n");
      out.write("\r\n");
      out.write("                            <input required=\"\" type=\"text\" class=\"account\" name=\"phone_num\" aria-label=\"手机号（仅支持中国大陆）\" placeholder=\"手机号（仅支持中国大陆）\">\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"input-wrapper\">\r\n");
      out.write("                            <input required=\"\" type=\"password\" name=\"password\" aria-label=\"密码\" placeholder=\"密码（不少于 6 位）\" autocomplete=\"off\">\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"Captcha input-wrapper\" data-type=\"cn\" data-za-module=\"Captcha\">\r\n");
      out.write("                            <div class=\"Captcha-operate\">\r\n");
      out.write("                                <input type=\"hidden\" name=\"captcha\" required=\"\" data-rule-required=\"true\" data-msg-required=\"请点击图中所有倒立的文字\" value=\"\">\r\n");
      out.write("                                <input type=\"hidden\" name=\"captcha_type\" value=\"cn\" required=\"\">\r\n");
      out.write("                                <label class=\"Captcha-prompt\">请点击图中所有倒立的文字</label>\r\n");
      out.write("                                <span class=\"Captcha-refresh js-refreshCaptcha sprite-index-icon-refresh\"></span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"Captcha-imageConatiner\">\r\n");
      out.write("                                <img class=\"Captcha-image\" alt=\"验证码\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"UserResult\"></div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"button-wrapper command\">\r\n");
      out.write("                        <button class=\"sign-button submit\" type=\"submit\">注册学习吧</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("\r\n");
      out.write("                <p class=\"agreement-tip\">点击「注册」按钮，即代表你同意<a href=\"https://www.zenghuangdong.cn/terms\" target=\"_blank\">《学习吧协议》</a></p>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"footer\" style=\"position: fixed;bottom: 0px;left: 0px;right: 0px;margin: auto;\">\r\n");
      out.write("\r\n");
      out.write("    <span>© 2017 学习吧</span>\r\n");
      out.write("    <span class=\"dot\">·</span>\r\n");
      out.write("    <a target=\"_blank\" href=\"http://www.zenghuangdong.cn/backmanager/roundtable\">学习吧圆桌</a>\r\n");
      out.write("    <span class=\"dot\">·</span>\r\n");
      out.write("    <a target=\"_blank\" href=\"http://www.zenghuangdong.cn/backmanager/roundtable\" data-za-c=\"explore\" data-za-a=\"visit_explore\" data-za-l=\"home_bottom_explore\">发现</a>\r\n");
      out.write("    <span class=\"dot\">·</span>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <a href=\"https://www.zenghuangdong.cn/backmanager/signin\" class=\"footer-mobile-show\">使用机构帐号登录</a>\r\n");
      out.write("\r\n");
      out.write("    <span class=\"dot footer-mobile-show\">·</span>\r\n");
      out.write("\r\n");
      out.write("    <a href=\"http://www.zenghuangdong.cn/backmanager/contact.jsp\" class=\"footer-mobile-show\">联系我</a>\r\n");
      out.write("    <span class=\"dot\">·</span>\r\n");
      out.write("    <br>\r\n");
      out.write("    <span><a href=\"http://www.miitbeian.gov.cn/\" style=\"color: #0d79d1\">粤ICP备 17033983 号</a></span>\r\n");
      out.write("    <span class=\"dot\">·</span>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body></html>\r\n");
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
