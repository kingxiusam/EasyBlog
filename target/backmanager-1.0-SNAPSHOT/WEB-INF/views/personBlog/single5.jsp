<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/4/14
  Time: 17:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%
    String path = request.getContextPath();
//    pageContext.setAttribute("singleNum","1");

%>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!--========== The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags ==========-->
    <title>HuangDong single</title>

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
                       <h3>JAVA反射机制是在运行状态中，对于任意一个类，都能够知道这个类的所有属性和方法；对于任意一个对象，都能够调用它的任意方法和属性；这种动态获取信息以及动态调用对象方法的功能称为java语言的反射机制。
                        JAVA反射（放射）机制：“程序运行时，允许改变程序结构或变量类型，这种语言称为动态语言”。从这个观点看，Perl，Python，Ruby是动态语言，C++，Java，C#不是动态语言。但是JAVA有着一个非常突出的动态相关机制：Reflection，用在Java身上指的是我们可以于运行时加载、探知、使用编译期间完全未知的classes。换句话说，Java程序可以加载一个运行时才得知名称的class，获悉其完整构造（但不包括methods定义），并生成其对象实体、或对其fields设值、或唤起其methods。
                       </h3>

                        <h4>Java反射机制主要提供了以下功能： 在运行时判断任意一个对象所属的类；在运行时构造任意一个类的对象；在运行时判断任意一个类所具有的成员变量和方法；在运行时调用任意一个对象的方法；生成动态代理。
                            有时候我们说某个语言具有很强的动态性，有时候我们会区分动态和静态的不同技术与作法。我们朗朗上口动态绑定（dynamic binding）、动态链接（dynamic linking）、动态加载（dynamic loading）等。然而“动态”一词其实没有绝对而普遍适用的严格定义，有时候甚至像面向对象当初被导入编程领域一样，一人一把号，各吹各的调。
                            一般而言，开发者社群说到动态语言，大致认同的一个定义是：“程序运行时，允许改变程序结构或变量类型，这种语言称为动态语言”。从这个观点看，Perl，Python，Ruby是动态语言，C++，Java，C#不是动态语言。
                            尽管在这样的定义与分类下Java不是动态语言，它却有着一个非常突出的动态相关机制：Reflection。这个字的意思是“反射、映象、倒影”，用在Java身上指的是我们可以于运行时加载、探知、使用编译期间完全未知的classes。换句话说，Java程序可以加载一个运行时才得知名称的class，获悉其完整构造（但不包括methods定义），并生成其对象实体、或对其fields设值、或唤起其methods。这种“看透class”的能力（the ability of the program to examine itself）被称为introspection（内省、内观、反省）。Reflection和introspection是常被并提的两个术语。
                            Java如何能够做出上述的动态特性呢？这是一个深远话题，本文对此只简单介绍一些概念。整个篇幅最主要还是介绍Reflection APIs，也就是让读者知道如何探索class的结构、如何对某个“运行时才获知名称的class”生成一份实体、为其fields设值、调用其methods。本文将谈到java.lang.Class，以及java.lang.reflect中的Method、Field、Constructor等等classes。
                        </h4>
                    </div>

                    <div class="row m0 tags">
                        <a href="#" class="tag">it</a>
                        <a href="#" class="tag">java反射</a>
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
                                        <c:if test="${message.owner==userName}">|<a href="<%=path%>/community/5/deleteCommunity.html?messageId=${message.messageId}" class="reply-link" onclick="delConfirm();">delete</a></c:if>
                                    </div>
                                </div>

                            </c:forEach>
                        </div>
                    </div>

                </article>
                <form action="<%=path%>/community/addOneCommunity/${userName}/5.html" method="post" id="messageForm" class="comment-form row">
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
                <div class="row m0"><a href="/user/person.html"><img src="<%=path%>/images/huangdong.jpg" alt=""></a></div>
            </div>
            <div class="widget col-sm-5 widget-menu">
                <div class="row">
                    <ul class="nav column-menu white-bg">
                        <li class="active"><a href="/user/person.html">主页</a></li>
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

<!--========== jQuery (necessary for Bootstrap's JavaScript plugins) ==========-->
<script src="<%=path%>/js/bootstrap.min.js"></script>
<script src="<%=path%>/js/vendors/owl-carousel/owl.carousel.min.js"></script>
<script src="<%=path%>/js/vendors/magnific-popup/jquery.magnific-popup.min.js"></script>
<script src="<%=path%>/js/vendors/instafeed/instafeed.min.js"></script>
<script src="<%=path%>/js/vendors/imagesLoaded/imagesloaded.pkgd.min.js"></script>
<script src="<%=path%>/js/vendors/isotope/isotope.pkgd.min.js"></script>
<script src="<%=path%>/js/vendors/flexslider/jquery.flexslider-min.js"></script>
<script src="<%=path%>/js/theme.js"></script>

</body>
</html>
