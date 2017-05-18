<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/4/14
  Time: 17:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%
    String path = request.getContextPath();
//    pageContext.setAttribute("singleNum","1");

%>
<html>
<head>
    <head>
        <!--==========Dependency============-->
        <link rel="stylesheet" href="<%=path%>/css/bootstrap.min.css">
        <link rel="stylesheet" href="<%=path%>/css/font-awesome.min.css">
        <link rel="stylesheet" href="<%=path%>/js/vendors/owl-carousel/assets/owl.carousel.css">
        <link rel="stylesheet" href="<%=path%>/js/vendors/magnific-popup/magnific-popup.css">
        <link rel="stylesheet" href="<%=path%>/js/vendors/flexslider/flexslider.css">

        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Kanit:500">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Josefin+Sans:600,700italic">
        <link href='https://fonts.googleapis.com/css?family=Dosis:400,200,300,500,600,800,700' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Muli:400,300,300italic,400italic">
        <link href='https://fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500italic,500,700italic,700,900,900italic' rel='stylesheet' type='text/css'>
        <link href='https://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>
        <link href='https://fonts.googleapis.com/css?family=Fredoka+One' rel='stylesheet' type='text/css'>


        <!--==========Theme Styles==========-->
        <link href="<%=path%>/css/style.css" rel="stylesheet">
        <link href="<%=path%>/css/theme/green.css" rel="stylesheet">
        <link rel="stylesheet" href="<%=path%>/css/main.e87dad73.css">
        <script src="<%=path%>/js/blog.js"></script>
        <script src="<%=path%>/js/single.js"></script>
        <script type="text/javascript" src="<%=path%>/js/jquery-1.8.3.min.js"></script>
        <script type="text/javascript" src="<%=path%>/js/jquery.validate.min.js"></script>
        <script type="text/javascript" src="<%=path%>/js/messageValidate.js"></script>

        <script src="<%=path%>/js/html5shiv.min.js"></script>
        <script src="<%=path%>/js/respond.min.js"></script>
        <![endif]==========-->
    <title>HuangDong single</title>
</head>
<body>
<header class="row transparent white" data-spy="affix" data-offset-top="300" id="header">
    <div class="container">
        <div class="row top-header">
            <div class="col-sm-4 search-form-col">
                <form action="<%=path%>/single/searchContent.html" method="post" class="search-form">
                    <div class="input-group">
                        <span class="input-group-addon"><img src="<%=path%>/images/search-icon-dark.png" alt=""></span>
                        <input type="search" name="postTitle" class="form-control" placeholder="输入你要查找的帖子主题关键字">
                    </div>
                </form>
            </div>

            <div class="col-sm-4 logo-col text-center">
                <a href="#"><img src="<%=path%>/images/title_picture.png" alt=""></a>
            </div>
            <div class="col-sm-4 menu-trigger-col">
                <button class="menu-trigger black pull-right">
                    <span class="active-page">Details</span>
                    <img src="<%=path%>/images/menu-align-dark.png" alt="" class="icon-burger">
                    <img src="<%=path%>/images/menu-close-dark.png" alt="" class="icon-cross">
                </button>
            </div>
        </div>
    </div>
    <div class="row menu-section">
        <div class="container">
            <div class="row">
                <div class="col-sm-8 menu-col">
                    <div class="row">
                        <ul class="nav column-menu white-bg">
                            <li class="active dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Home <span class="caret"></span></a>
                                <ul class="dropdown-menu">
                                    <li><a href="<%=path%>/single/showMoreSingle.html">最近发表</a></li>
                                    <li><a href="<%=path%>/single/showMoreSingle.html">最新文章</a></li>
                                </ul>
                            </li>
                            <li><a href="<%=path%>/about.jsp">关于</a></li>
                            <li><a href="/single/showSingle1.html">Blog Single 1</a></li>
                            <li><a href="/single/showSingle2.html">Blog Single 2</a></li>
                        </ul>
                        <ul class="nav column-menu white-bg">
                            <li><a href="/single/showSingle3.html">Blog Single 3</a></li>
                            <li style="color: #0d90d1"><a style="color: #0d90d1" href="<%=path%>/single/showMoreSingle.html">更多>></a></li>
                            <li><a href="<%=path%>/contact.jsp">联系我</a></li>
                            <li><a href="<%=path%>/index.jsp">退出</a></li>
                        </ul>
                    </div>
                </div>
                <div class="col-sm-4 subscribe-col">
                    <h5 class="widget-title">邮件订阅.</h5>
                    <form method="post" class="form-inline subscribe-form">
                        <div class="form-group">
                            <input type="email" class="form-control" placeholder="Email" id="mail">
                        </div>
                        <input type="hidden" class="form-control" id="sName" value="${userName}">

                        <button type="submit" class="btn btn-primary btn-sm" onclick="topFilter()"><span>send</span></button>
                    </form>
                    <ul class="nav social-nav white">
                        <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                        <li><a href="#"><i class="fa fa-facebook-official"></i></a></li>
                        <li><a href="#"><i class="fa fa-google-plus"></i></a></li>
                        <li><a href="#"><i class="fa fa-instagram"></i></a></li>
                        <li><a href="#"><i class="fa fa-envelope"></i></a></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</header>


<section class="row content-wrap single-nosidebar">
    <div class="container">
        <div class="row">
            <div class="col-sm-12 single-post-contents">
                <article class="single-post-content v2 row m0 post">
                    <header class="row">
                        <h5 class="post-meta">
                            <a href="#" class="date">  </a>
                            <span class="post-author"><i>by</i><a href="#">HuangDong</a></span>
                        </h5>
                        <h2 class="post-title">${post.postTitle}</h2>
                        <div class="row">
                            <h5 class="taxonomy pull-left"><i>in</i> ${post.postType}</h5>
                            <div class="response-count pull-right"><img src="<%=path%>/images/comment-icon-gray.png" alt="">${fn:length(communityList)} comments</div>
                        </div>
                    </header>
                    <div class="featured-content row m0">
                        <a href="#"><img src="<%=path%>/images/featured-posts/3.jpg" alt=""></a>
                    </div>
                    <div class="post-content row">
                        ython在设计上坚持了清晰划一的风格，这使得Python成为一门易读、易维护，并且被大量用户所欢迎的、用途广泛的语言。
                        设计者开发时总的指导思想是，对于一个特定的问题，只要有一种最好的方法来解决就好了。这在由Tim Peters写的Python格言（称为The Zen of Python）里面表述为：There should be one-- and preferably only one --obvious way to do it. 这正好和Perl语言（另一种功能类似的高级动态语言）的中心思想TMTOWTDI（There's More Than One Way To Do It）完全相反。
                        Python的作者有意的设计限制性很强的语法，使得不好的编程习惯（例如if语句的下一行不向右缩进）都不能通过编译。其中很重要的一项就是Python的缩进规则。
                        一个和其他大多数语言（如C）的区别就是，一个模块的界限，完全是由每行的首字符在这一行的位置来决定的（而C语言是用一对花括号{}来明确的定出模块的边界的，与字符的位置毫无关系）。这一点曾经引起过争议。因为自从C这类的语言诞生后，语言的语法含义与字符的排列方式分离开来，曾经被认为是一种程序语言的进步。不过不可否认的是，通过强制程序员们缩进（包括if，for和函数定义等所有需要使用模块的地方），Python确实使得程序更加清晰和美观。


                    </div>
                    <div class="row m0 tags">
                        <a href="#" class="tag">it</a>
                        <a href="#" class="tag">python</a>
                        <a href="#" class="tag">基础</a>
                    </div>

                    <hr/>

                    <div class="row m0 comments">
                        <h5 class="response-count">${fn:length(communityList)} comments<a href="#comment-form" class="btn btn-primary pull-right"><span>add comment</span></a></h5>

                        <!--Comments-->
                        <div class="media comment">

                            <c:forEach var="message" items="${communityList}">
                                <div class="media comment reply">
                                    <div class="media-left">
                                        <a href="#"><img src="<%=path%>/images/posts/c2.jpg" alt="" class="img-circle"></a>
                                    </div>
                                    <div class="media-body">
                                        <h4><a href="#">${message.owner}</a></h4>
                                        <h5><a href="#" class="date">${message.time}</a> | <a href="#" class="reply-link">reply</a></h5>

                                        <p>${message.message}</p>
                                        <c:if test="${message.owner==userName}">|<a href="<%=path%>/community/4/deleteCommunity.html?messageId=${message.messageId}" class="reply-link" onclick="delConfirm();">delete</a></c:if>
                                    </div>
                                </div>

                            </c:forEach>
                        </div>
                    </div>

                </article>

                <form action="<%=path%>/community/addOneCommunity/${userName}/4.html" method="post" id="messageForm" class="comment-form row">
                    <h5 class="form-title">@留言@</h5>
                    <div class="form-group col-sm-6">
                        <label for="name">姓名*</label>
                        <input type="text" id="name" name="name" class="form-control" placeholder="Your name">
                    </div>
                    <div class="form-group col-sm-6">
                        <label for="email">Email*</label>
                        <input type="email" id="email" name="email" class="form-control" placeholder="Your email address here,eg:1459951296@qq.com" >
                    </div>
                    <div class="form-group col-sm-6">
                        <label for="website">网址</label>
                        <input type="url" id="website" name="website" class="form-control" placeholder="Your website url,eg:http://www.zenghuangdong.cn" >
                    </div>
                    <div class="form-group col-sm-6">
                        <label for="subject">兴趣爱好</label>
                        <input type="text" id="subject" name="subject" class="form-control" placeholder="Write subject here">
                    </div>
                    <div class="form-group col-sm-12">
                        <label for="message">评论*</label>
                        <textarea name="message" id="message" name="message" class="form-control" placeholder="Write message here"></textarea>
                    </div>
                    <div class="col-sm-12">
                        <input type="submit" class="btn-primary" value="提交">
                        <h5 class="pull-right">*必填</h5>
                    </div>
                </form>
            </div>
        </div>
    </div>
</section>




<!--Footer-->
<footer class="row" id="footer">
    <div class="container">
        <div class="row top-footer">
            <div class="widget col-sm-3 widget-about">
                <div class="row m0"><a href="<%=path%>/user/person.html"><img src="<%=path%>/images/huangdong.jpg" alt=""></a></div>
            </div>
            <div class="widget col-sm-5 widget-menu">
                <div class="row">
                    <ul class="nav column-menu white-bg">
                        <li class="active"><a href="<%=path%>/user/person.html">主页</a></li>
                        <li><a href="<%=path%>/single/showMoreSingle.html">最近发表</a></li>
                        <li><a href="<%=path%>/single/showMoreSingle.html">最新文章</a></li>
                        <li><a href="<%=path%>/about.jsp">关于</a></li>
                        <li><a href="<%=path%>/single/showSingle1.html">Blog Single 1</a></li>
                        <li><a href="<%=path%>/single/showSingle2.html">Blog Single 2</a></li>
                    </ul>
                    <ul class="nav column-menu white-bg">
                        <li><a href="<%=path%>/single/showSingle3.html">Blog Single 3</a></li>
                        <li style="color: #0d90d1"><a style="color: #0d90d1" href="<%=path%>/single/showMoreSingle.html">更多 >></a></li>
                        <li><a href="<%=path%>/contact.jsp">联系</a></li>
                    </ul>
                </div>
            </div>
            <div class="widget col-sm-4 widget-subscribe">
                <h5 class="widget-title">邮件订阅.</h5>
                <form method="post" class="form-inline subscribe-form">
                    <div class="form-group">
                        <input type="email" class="form-control" placeholder="Email" id="u_mail">
                    </div>

                    <input type="hidden" class="form-control" id="senderName" value="${userName}">

                    <button  class="btn btn-primary btn-sm" onclick="filter()"><span>send</span></button>
                </form>
            </div>
        </div>
        <center> <h5 class="copyright">Copyright &copy; 2017.zenghuangdong.cn All rights reserved.</h5></center>
    </div>
</footer>
</body>
</html>
