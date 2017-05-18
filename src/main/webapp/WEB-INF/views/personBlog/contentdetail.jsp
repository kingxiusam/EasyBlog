<%@ page import="java.util.Date" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/4/10
  Time: 22:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
String path=request.getContextPath();
%>
<!DOCTYPE html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>帖子详情页</title>
    <!--==========Dependency============-->
    <link rel="stylesheet" href="<%=path%>/css/bootstrap.min.css">
    <link rel="stylesheet" href="<%=path%>/css/font-awesome.min.css">
    <link rel="stylesheet" href="<%=path%>/js/vendors/owl-carousel/assets/owl.carousel.css">
    <link rel="stylesheet" href="<%=path%>/js/vendors/magnific-popup/magnific-popup.css">
    <link rel="stylesheet" href="<%=path%>/js/vendors/flexslider/flexslider.css">

    <%--<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Kanit:500">--%>
    <%--<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Josefin+Sans:600,700italic">--%>
    <%--<link href='https://fonts.googleapis.com/css?family=Dosis:400,200,300,500,600,800,700' rel='stylesheet' type='text/css'>--%>
    <%--<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Muli:400,300,300italic,400italic">--%>
    <%--<link href='https://fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500italic,500,700italic,700,900,900italic' rel='stylesheet' type='text/css'>--%>
    <%--<link href='https://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>--%>
    <%--<link href='https://fonts.googleapis.com/css?family=Fredoka+One' rel='stylesheet' type='text/css'>--%>

    <!--==========Theme Styles==========-->
    <link href="<%=path%>/css/style.css" rel="stylesheet">
    <link href="<%=path%>/css/theme/green.css" rel="stylesheet">
    <script src="<%=path%>/js/blog.js"></script>
    <script src="<%=path%>/js/single.js"></script>
    <script src="<%=path%>/js/html5shiv.min.js"></script>
    <script src="<%=path%>/js/respond.min.js"></script>

</head>
<body class="home">
<%--在后台上传的文章都会在这个页面显示对应的链接--%>
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
                            <li style="color: #0d90d1"><a style="color: #0d90d1" href="<%=path%>/single/showMoreSingle.html">更多 >></a></li>
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


<section class="row content-wrap">
    <div class="container">





        <div class="row">
            <div class="col-md-8 single-post-contents">
                <%--显示帖子链接--%>
                <div>

                    <h4 style="color: #0f88eb;"><img src="<%=path%>/images/category-main-icon.png">最新帖子</h4>
                    <hr/>
                    <div id="newest">

                        <c:forEach items="${postsForTime}" var="content">
                            <a href="javascript:void(0);" onclick="countNum('${content.postText}','${content.postId}')">${content.postTitle}</a>
                            <span style="float: right">发表时间:<span style="color: #3f4b55">${content.createTime}</span><span style="margin-left: 20px;">浏览次数:${content.browNum}</span></span>
                        <br/>
                        </c:forEach>




                    </div>
                    <hr/>
                    <h4 style="color: #0f88eb"><img src="<%=path%>/images/category-main-icon.png">最热帖子</h4>
                    <div id="hotest">
                        <c:forEach items="${postsForNum}" var="content">
                            <a href="javascript:void(0);" onclick="countNum('${content.postText}','${content.postId}')">${content.postTitle}</a>
                            <span style="float: right">发表时间:<span style="color: #3f4b55">${content.createTime}</span><span style="margin-left: 20px;">浏览次数:${content.browNum}</span></span>
                        <br/>
                        </c:forEach>
                    </div>
                </div>
            </div>

            <!--Author Widget-->
            <aside class="col-sm-4 widget-author widget widget-with-posts post">
                <div class="widget-author-inner row">
                    <div class="author-avatar row"><a href="#"><img src="<%=path%>/images/author.png" alt="" class="img-circle"></a></div>
                    <a href="#"><h2 class="author-name">HuangDong</h2></a>
                    <h5 class="author-title">stationmaster</h5>
                    <p>无厚积何以薄发</p>
                    <a href="<%=path%>/about.jsp" class="know-more">know more</a>
                </div>
                <ul class="nav social-nav">
                    <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                    <li><a href="#"><i class="fa fa-facebook-official"></i></a></li>
                    <li><a href="#"><i class="fa fa-google-plus"></i></a></li>
                    <li><a href="#"><i class="fa fa-instagram"></i></a></li>
                    <li><a href="#"><i class="fa fa-envelope"></i></a></li>
                </ul>
            </aside>
            <!--Twitter Widget-->
            <div class="col-md-4 sidebar">

                <aside class="row m0 widget widget-twitter">
                    <div class="widget-twitter-inner">
                        <h5 class="widget-meta"><i class="fa fa-twitter"></i>博客园<a href="http://www.cnblogs.com/ZengHuangDong/">@HuangDong</a></h5>
                        <div class="row tweet-texts">
                            <p>在博客园查看我的新博客 <a href="http://www.cnblogs.com/ZengHuangDong/">#natureshot</a> <a href="http://www.cnblogs.com/ZengHuangDong/">http://www.cnblogs.com/ZengHuangDong/</a></p>
                        </div>
                        <%

                            String time=new Date().toString();
                            pageContext.setAttribute("sysTime",time);
                        %>
                        <div class="row timepast">${sysTime}</div>
                    </div>
                </aside>
                <!--Instagram Widget-->
                <aside class="row m0 widget widget-instagram">
                    <div class="widget-instagram-inner">
                        <h5 class="widget-meta"><i class="fa fa-twitter"></i>github<a href="https://github.com/kingxiusam/">@kingxiusam</a></h5>
                        <div id="instafeed"></div>
                    </div>
                </aside>
            </div>
        </div>
    </div>
</section>







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
                        <li><a href="<%=path%>/contact/aboutMe.html">关于</a></li>
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
<script src="<%=path%>/js/jquery-2.2.0.min.js"></script>
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
