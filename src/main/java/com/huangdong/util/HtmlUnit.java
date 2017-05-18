package com.huangdong.util;

/**
 * Created by Administrator on 2017/5/8.
 */
public class HtmlUnit {


    public static  String getHtmlHeader(String title){
        String header=
                    "<%@ page import=\"java.util.Date\" %>\n" +
                    "<%@ page language=\"java\" contentType=\"text/html; charset=utf-8\" %>\n" +
                    "<%@ taglib prefix=\"c\" uri=\"http://java.sun.com/jsp/jstl/core\" %>\n" +
                    "<%@ taglib prefix=\"fn\" uri=\"http://java.sun.com/jsp/jstl/functions\" %>\n" +
                    "<%\n" +
                    "    String path = request.getContextPath();\n" +
                    "\n" +
                    "%>\n" +
                    "<!DOCTYPE html>\n" +
                    "<html lang=\"en\">\n" +
                    "<head>\n" +
                    "<meta charset=\"utf-8\">\n" +
                    "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                    "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">" +
                    "<title>"+
               title+
                    "</title>" +
                    "<link rel=\"stylesheet\" href=\"<%=path%>/css/bootstrap.min.css\">\n" +
                            "    <link rel=\"stylesheet\" href=\"<%=path%>/css/font-awesome.min.css\">\n" +
                            "    <link rel=\"stylesheet\" href=\"<%=path%>/js/vendors/owl-carousel/assets/owl.carousel.css\">\n" +
                            "    <link rel=\"stylesheet\" href=\"<%=path%>/js/vendors/magnific-popup/magnific-popup.css\">\n" +
                            "    <link rel=\"stylesheet\" href=\"<%=path%>/js/vendors/flexslider/flexslider.css\">\n" +
                            "\n" +
                            "    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Kanit:500\">\n" +
                            "    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Josefin+Sans:600,700italic\">\n" +
                            "    <link href='https://fonts.googleapis.com/css?family=Dosis:400,200,300,500,600,800,700' rel='stylesheet' type='text/css'>\n" +
                            "    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Muli:400,300,300italic,400italic\">\n" +
                            "    <link href='https://fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500italic,500,700italic,700,900,900italic' rel='stylesheet' type='text/css'>\n" +
                            "    <link href='https://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>\n" +
                            "    <link href='https://fonts.googleapis.com/css?family=Fredoka+One' rel='stylesheet' type='text/css'>\n" +
                            "\n" +
                            "\n" +
                            "    <!--==========Theme Styles==========-->\n" +
                            "    <link href=\"<%=path%>/css/style.css\" rel=\"stylesheet\">\n" +
                            "    <link href=\"<%=path%>/css/theme/green.css\" rel=\"stylesheet\">\n" +
                            "    <link rel=\"stylesheet\" href=\"<%=path%>/css/main.e87dad73.css\">\n" +
                            "    <script src=\"<%=path%>/js/blog.js\"></script>\n" +
                            "    <script src=\"<%=path%>/js/single.js\"></script>\n" +
                            "    <script type=\"text/javascript\" src=\"<%=path%>/js/jquery-1.8.3.min.js\"></script>\n" +
                            "    <script type=\"text/javascript\" src=\"<%=path%>/js/jquery.validate.min.js\"></script>\n" +
                            "    <script type=\"text/javascript\" src=\"<%=path%>/js/messageValidate.js\"></script>\n" +
                            "\n" +
                            "    <script src=\"<%=path%>/js/html5shiv.min.js\"></script>\n" +
                            "    <script src=\"<%=path%>/js/respond.min.js\"></script>"+
                    "</head>\n" +
                    "<body class=\"home\">\n" +
                    "<header class=\"row transparent white\" data-spy=\"affix\" data-offset-top=\"300\" id=\"header\">\n" +
                    "    <div class=\"container\">\n" +
                    "        <div class=\"row top-header\">\n" +
                    "            <div class=\"col-sm-4 search-form-col\">\n" +
                    "                <form action=\"<%=path%>/single/searchContent.html\" method=\"post\" class=\"search-form\">\n" +
                    "                    <div class=\"input-group\">\n" +
                    "                        <span class=\"input-group-addon\"><img src=\"<%=path%>/images/search-icon-dark.png\" alt=\"\"></span>\n" +
                    "                        <input type=\"search\" name=\"postTitle\" class=\"form-control\" placeholder=\"输入你要查找的帖子主题关键字\">\n" +
                    "                    </div>\n" +
                    "                </form>\n" +
                    "            </div>\n" +
                    "\n" +
                    "            <div class=\"col-sm-4 logo-col text-center\">\n" +
                    "                <a href=\"#\"><img src=\"<%=path%>/images/title_picture.png\" alt=\"\"></a>\n" +
                    "            </div>\n" +
                    "            <div class=\"col-sm-4 menu-trigger-col\">\n" +
                    "                <button class=\"menu-trigger black pull-right\">\n" +
                    "                    <span class=\"active-page\">Details</span>\n" +
                    "                    <img src=\"<%=path%>/images/menu-align-dark.png\" alt=\"\" class=\"icon-burger\">\n" +
                    "                    <img src=\"<%=path%>/images/menu-close-dark.png\" alt=\"\" class=\"icon-cross\">\n" +
                    "                </button>\n" +
                    "            </div>\n" +
                    "        </div>        \n" +
                    "    </div>\n" +
                    "    <div class=\"row menu-section\">\n" +
                    "        <div class=\"container\">\n" +
                    "            <div class=\"row\">\n" +
                    "                <div class=\"col-sm-8 menu-col\">\n" +
                    "                    <div class=\"row\">\n" +
                    "                        <ul class=\"nav column-menu white-bg\">\n" +
                    "                            <li class=\"active dropdown\">\n" +
                    "                                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Home <span class=\"caret\"></span></a>\n" +
                    "                                <ul class=\"dropdown-menu\">\n" +
                    "                                    <li><a href=\"<%=path%>/single/showMoreSingle.html\">最近发表</a></li>\n" +
                    "                                    <li><a href=\"<%=path%>/single/showMoreSingle.html\">最新文章</a></li>\n" +
                    "                                </ul>\n" +
                    "                            </li>\n" +
                    "                            <li><a href=\"<%=path%>/about.jsp\">关于</a></li>\n" +
                    "                            <li><a href=\"/single/showSingle1.html\">Blog Single 1</a></li>\n" +
                    "                            <li><a href=\"/single/showSingle2.html\">Blog Single 2</a></li>\n" +
                    "                        </ul>\n" +
                    "                        <ul class=\"nav column-menu white-bg\">\n" +
                    "                            <li><a href=\"/single/showSingle3.html\">Blog Single 3</a></li>\n" +
                    "                            <li style=\"color: #0d90d1\"><a style=\"color: #0d90d1\" href=\"<%=path%>/single/showMoreSingle.html\">更多>></a></li>\n" +
                    "                            <li><a href=\"<%=path%>/contact.jsp\">联系我</a></li>\n" +
                    "                            <li><a href=\"<%=path%>/index.jsp\">退出</a></li>\n" +
                    "                        </ul>\n" +
                    "                    </div>\n" +
                    "                </div>\n" +
                    "                <div class=\"col-sm-4 subscribe-col\">\n" +
                    "                    <h5 class=\"widget-title\">邮件订阅.</h5>\n" +
                    "                    <form method=\"post\" class=\"form-inline subscribe-form\">\n" +
                    "                        <div class=\"form-group\">\n" +
                    "                            <input type=\"email\" class=\"form-control\" placeholder=\"Email\" id=\"mail\">\n" +
                    "                        </div>\n" +
                    "                        <input type=\"hidden\" class=\"form-control\" id=\"sName\" value=\"${userName}\">\n" +
                    "\n" +
                    "                        <button type=\"submit\" class=\"btn btn-primary btn-sm\" onclick=\"topFilter()\"><span>send</span></button>\n" +
                    "                    </form>\n" +
                    "                    <ul class=\"nav social-nav white\">\n" +
                    "                        <li><a href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\n" +
                    "                        <li><a href=\"#\"><i class=\"fa fa-facebook-official\"></i></a></li>\n" +
                    "                        <li><a href=\"#\"><i class=\"fa fa-google-plus\"></i></a></li>\n" +
                    "                        <li><a href=\"#\"><i class=\"fa fa-instagram\"></i></a></li>\n" +
                    "                        <li><a href=\"#\"><i class=\"fa fa-envelope\"></i></a></li>\n" +
                    "                    </ul>\n" +
                    "                </div>\n" +
                    "            </div>\n" +
                    "        </div>\n" +
                    "    </div>\n" +
                    "</header>\n";

        return header;
    }



    public static String getContent(String htmlData,int singleNum,String tag){

        String content ="<section class=\"row content-wrap single-nosidebar\">\n" +
                "    <div class=\"container\">\n" +
                "        <div class=\"row\">\n" +
                "            <div class=\"col-sm-12 single-post-contents\">\n" +
                "                <article class=\"single-post-content v2 row m0 post\">\n" +
                "                    <header class=\"row\">\n" +
                "                        <h5 class=\"post-meta\">\n" +
                "                            <a href=\"#\" class=\"date\">  </a>\n" +
                "                            <span class=\"post-author\"><i>by</i><a href=\"#\">HuangDong</a></span>\n" +
                "                        </h5>\n" +
                "                        <h2 class=\"post-title\">${post.postTitle}</h2>\n" +
                "                        <div class=\"row\">\n" +
                "                            <h5 class=\"taxonomy pull-left\"><i>in</i> ${post.postType}</h5>\n" +
                "                            <div class=\"response-count pull-right\"><img src=\"<%=path%>/images/comment-icon-gray.png\" alt=\"\">${fn:length(communityList)} comments</div>\n" +
                "                        </div>\n" +
                "                    </header>\n" +

                htmlData+                    //设置后台编辑的帖子正文内容

                "\n" +
                "                    <div class=\"row m0 tags\">\n" +
                "                        <a href=\"#\" class=\"tag\">"+

                tag+                        //设置标签

                "                        </a>\n" +
                "                    </div>\n" +
                "\n" +
                "                    <hr/>\n" +
                "\n" +
                "                    <div class=\"row m0 comments\">\n" +
                "                        <h5 class=\"response-count\">${fn:length(communityList)} comments<a href=\"#comment-form\" class=\"btn btn-primary pull-right\"><span>add comment</span></a></h5>\n" +
                "\n" +
                "                        <!--Comments-->\n" +
                "                        <div class=\"media comment\">\n" +
                "\n" +
                "                            <c:forEach var=\"message\" items=\"${communityList}\">\n" +
                "                                <div class=\"media comment reply\">\n" +
                "                                    <div class=\"media-left\">\n" +
                "                                        <a href=\"#\"><img src=\"<%=path%>/images/posts/c2.jpg\" alt=\"\" class=\"img-circle\"></a>\n" +
                "                                    </div>\n" +
                "                                    <div class=\"media-body\">\n" +
                "                                        <h4><a href=\"#\">${message.owner}</a></h4>\n" +
                "                                        <h5><a href=\"#\" class=\"date\">${message.time}</a> | <a href=\"#\" class=\"reply-link\">reply</a></h5>\n" +
                "\n" +
                "                                        <p>${message.message}</p>\n" +
                "                                        <c:if test=\"${message.owner==userName}\">|<a href=\"<%=path%>/community/"+
                singleNum+              //设置帖子页面编号

                "/deleteCommunity.html?messageId=${message.messageId}\" class=\"reply-link\" onclick=\"delConfirm();\">delete</a></c:if>\n" +
                "                                    </div>\n" +
                "                                </div>\n" +
                "\n" +
                "                            </c:forEach>\n" +
                "                        </div>\n" +
                "                    </div>\n" +
                "\n" +
                "                </article>\n" +
                "                <form action=\"<%=path%>/community/addOneCommunity/${userName}/"+

                singleNum+               //设置帖子页面编号

                ".html\" method=\"post\" id=\"messageForm\" class=\"comment-form row\">\n" +
                "                    <h5 class=\"form-title\">@留言@</h5>\n" +
                "                    <div class=\"form-group col-sm-6\">\n" +
                "                        <label for=\"name\">姓名*</label>\n" +
                "                        <input type=\"text\" id=\"name\" name=\"name\" class=\"form-control\" placeholder=\"Your name\">\n" +
                "                    </div>\n" +
                "                    <div class=\"form-group col-sm-6\">\n" +
                "                        <label for=\"email\">Email*</label>\n" +
                "                        <input type=\"email\" id=\"email\" name=\"email\" class=\"form-control\" placeholder=\"Your email address here,eg:1459951296@qq.com\" >\n" +
                "                    </div>\n" +
                "                    <div class=\"form-group col-sm-6\">\n" +
                "                        <label for=\"website\">网址</label>\n" +
                "                        <input type=\"url\" id=\"website\" name=\"website\" class=\"form-control\" placeholder=\"Your website url,eg:http://www.zenghuangdong.cn\" >\n" +
                "                    </div>\n" +
                "                    <div class=\"form-group col-sm-6\">\n" +
                "                        <label for=\"subject\">兴趣爱好</label>\n" +
                "                        <input type=\"text\" id=\"subject\" name=\"subject\" class=\"form-control\" placeholder=\"Write subject here\">\n" +
                "                    </div>\n" +
                "                    <div class=\"form-group col-sm-12\">\n" +
                "                        <label for=\"message\">评论*</label>\n" +
                "                        <textarea name=\"message\" id=\"message\" name=\"message\" class=\"form-control\" placeholder=\"Write message here\"></textarea>\n" +
                "                    </div>\n" +
                "                    <div class=\"col-sm-12\">\n" +
                "                        <input type=\"submit\" class=\"btn-primary\" value=\"提交\">\n" +
                "                        <h5 class=\"pull-right\">*必填</h5>\n" +
                "                    </div>\n" +
                "                </form>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</section>";
        return content;

    }




    public final static String htmlFooter="<footer class=\"row\" id=\"footer\">\n" +
            "    <div class=\"container\">\n" +
            "        <div class=\"row top-footer\">\n" +
            "            <div class=\"widget col-sm-3 widget-about\">\n" +
            "                <div class=\"row m0\"><a href=\"<%=path%>/user/person.html\"><img src=\"<%=path%>/images/huangdong.jpg\" alt=\"\"></a></div>\n" +
            "            </div>\n" +
            "            <div class=\"widget col-sm-5 widget-menu\">\n" +
            "                <div class=\"row\">\n" +
            "                    <ul class=\"nav column-menu white-bg\">\n" +
            "                        <li class=\"active\"><a href=\"<%=path%>/user/person.html\">主页</a></li>\n" +
            "                        <li><a href=\"<%=path%>/single/showMoreSingle.html\">最近发表</a></li>\n" +
            "                        <li><a href=\"<%=path%>/single/showMoreSingle.html\">最新文章</a></li>\n" +
            "                        <li><a href=\"<%=path%>/about.jsp\">关于</a></li>\n" +
            "                        <li><a href=\"<%=path%>/single/showSingle1.html\">Blog Single 1</a></li>\n" +
            "                        <li><a href=\"<%=path%>/single/showSingle2.html\">Blog Single 2</a></li>\n" +
            "                    </ul>\n" +
            "                    <ul class=\"nav column-menu white-bg\">\n" +
            "                        <li><a href=\"<%=path%>/single/showSingle3.html\">Blog Single 3</a></li>\n" +
            "                        <li style=\"color: #0d90d1\"><a style=\"color: #0d90d1\" href=\"<%=path%>/single/showMoreSingle.html\">更多 >></a></li>\n" +
            "                        <li><a href=\"<%=path%>/contact.jsp\">联系</a></li>\n" +
            "                    </ul>\n" +
            "                </div>\n" +
            "            </div>\n" +
            "            <div class=\"widget col-sm-4 widget-subscribe\">\n" +
            "                <h5 class=\"widget-title\">邮件订阅.</h5>\n" +
            "                <form method=\"post\" class=\"form-inline subscribe-form\">\n" +
            "                    <div class=\"form-group\">\n" +
            "                        <input type=\"email\" class=\"form-control\" placeholder=\"Email\" id=\"u_mail\">\n" +
            "                    </div>\n" +
            "\n" +
            "                    <input type=\"hidden\" class=\"form-control\" id=\"senderName\" value=\"${userName}\">\n" +
            "\n" +
            "                    <button  class=\"btn btn-primary btn-sm\" onclick=\"filter()\"><span>send</span></button>\n" +
            "                </form>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "      <center> <h5 class=\"copyright\">Copyright &copy; 2017.zenghuangdong.cn All rights reserved.</h5></center>\n" +
            "    </div>\n" +
            "</footer>\n" +
            "\n" +
            "<script src=\"<%=path%>/js/bootstrap.min.js\"></script>\n" +
            "<script src=\"<%=path%>/js/vendors/owl-carousel/owl.carousel.min.js\"></script>\n" +
            "<script src=\"<%=path%>/js/vendors/magnific-popup/jquery.magnific-popup.min.js\"></script>\n" +
            "<script src=\"<%=path%>/js/vendors/instafeed/instafeed.min.js\"></script>\n" +
            "<script src=\"<%=path%>/js/vendors/imagesLoaded/imagesloaded.pkgd.min.js\"></script>\n" +
            "<script src=\"<%=path%>/js/vendors/isotope/isotope.pkgd.min.js\"></script>\n" +
            "<script src=\"<%=path%>/js/vendors/flexslider/jquery.flexslider-min.js\"></script>\n" +
            "<script src=\"<%=path%>/js/theme.js\"></script>\n" +
            "</body>\n" +
            "</html>";


}
