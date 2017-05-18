<%@ page import="java.util.Date" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%
    String path = request.getContextPath();

%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!--========== The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags ==========-->
<title>Huangdong</title>

<!--==========Dependency============-->
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/font-awesome.min.css">
<link rel="stylesheet" href="WEB-INF/views/personBlog/vendors/owl-carousel/assets/owl.carousel.css">
<link rel="stylesheet" href="WEB-INF/views/personBlog/vendors/magnific-popup/magnific-popup.css">

<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Kanit:500">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Josefin+Sans:600,700italic">
<link href='https://fonts.googleapis.com/css?family=Dosis:400,200,300,500,600,800,700' rel='stylesheet' type='text/css'>
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Muli:400,300,300italic,400italic">
<link href='https://fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500italic,500,700italic,700,900,900italic' rel='stylesheet' type='text/css'>

<!--==========Theme Styles==========-->
<link href="css/style.css" rel="stylesheet">
<link href="WEB-INF/views/personBlog/css/theme/green.css" rel="stylesheet">

<!--========== HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries ==========-->
<!--========== WARNING: Respond.js doesn't work if you view the page via file:// ==========-->
<!--==========[if lt IE 9]>
    <script src="WEB-INF/views/personBlog/js/html5shiv.min.js"></script>
    <script src="WEB-INF/views/personBlog/js/respond.min.js"></script>
    <![endif]==========-->
</head>
<body class="home">

<header class="row transparent black header1" data-spy="affix" data-offset-top="0" id="header">
    <div class="container">
        <div class="row top-header">
            <div class="col-sm-4 search-form-col">
                <form action="" method="get" class="search-form">
                    <div class="input-group">
                        <span class="input-group-addon"><img src="<%=path%>/images/search-icon-white.png" alt=""></span>
                        <input type="search" class="form-control" placeholder="search">
                    </div>
                </form>
            </div>
            <div class="col-sm-4 logo-col text-center">
                <a href="#"><img src="<%=path%>/images/title_picture.png" alt=""></a>
            </div>
            <div class="col-sm-4 menu-trigger-col">
                <span><a href="<%=path%>/index.jsp">退出</a></span>
                <c:if test="${!empty userName}">
                    <span><img src="<%=path%>/images/support.png"><a href="#">${userName}</a><span style="color: #3b618b">&nbsp;&nbsp;欢迎登录!</span></span>
                </c:if>
                <button class="menu-trigger pull-right">
                    <span class="active-page">Details</span>
                    <img src="<%=path%>/images/menu-align-white.png" alt="" class="icon-burger">
                    <img src="<%=path%>/images/menu-close-white.png" alt="" class="icon-cross">
                </button>

            </div>
        </div>
    </div>
    <div class="row menu-section">
        <div class="container">
            <div class="row">
                <div class="col-sm-8 menu-col">
                    <div class="row">
                        <ul class="nav column-menu black-bg">
                            <li class="active dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">主页 <span class="caret"></span></a>
                                <ul class="dropdown-menu">
                                    <li><a href="<%=path%>/single/showMoreSingle.html">最近发表</a></li>
                                    <li><a href="<%=path%>/single/showMoreSingle.html">最新文章</a></li>
                                </ul>
                            </li>
                            <li><a href="<%=path%>/about.jsp">关于</a></li>
                            <li><a href="<%=path%>/single/showSingle1.html">Blog Single 1</a></li>
                            <li><a href="<%=path%>/single/showSingle2.html">Blog Single 2</a></li>
                        </ul>
                        <ul class="nav column-menu black-bg">
                            <li><a href="<%=path%>/single/showSingle3.html">Blog Single 3</a></li>
                            <li style="color: #0d90d1">更多<a style="color: #0d90d1" href="<%=path%>/single/showMoreSingle.html">>></a></li>
                            <li><a href="<%=path%>/contact.jsp">联系我</a></li>
                        </ul>
                    </div>
                </div>
                <div class="col-sm-4 subscribe-col">
                    <h5 class="widget-title">邮件订阅</h5>
                    <form method="post" class="form-inline subscribe-form">
                        <div class="form-group">
                            <input type="email" class="form-control" placeholder="Email" id="mail">
                        </div>
                        <input type="hidden" class="form-control" id="sName" value="${userName}">

                        <button type="submit" class="btn btn-primary btn-sm" onclick="topFilter()"><span>send</span></button>
                    </form>
                    <ul class="nav social-nav dark">
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

<section class="row page-content-wrap">
    <div class="container">
        <h2 class="page-title text-center">contact</h2>
        <div class="row">
            <div class="col-md-8 page-contents">
                <div class="row page-content">
                    <div class="contents row">
                        <h4>Mark Samder, lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.</h4>
                    
                        <p>It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</p>
                        <br>
                        <form action="<%=path%>/contact/sendContactMessage.html" method="post" class="comment-form row" id="comment-form">
                            <h5 class="form-title">leave a reply</h5>
                            <div class="form-group col-sm-6">
                                <label for="name">full name*</label>
                                <input type="text" id="name" name="name" class="form-control" placeholder="Your name" required>
                            </div>
                            <div class="form-group col-sm-6">
                                <label for="email">full name*</label>
                                <input type="email" id="email" name="email" class="form-control" placeholder="Your email address here" required>
                            </div>
                            <div class="form-group col-sm-6">
                                <label for="website">website</label>
                                <input type="url" id="website" name="website" class="form-control" placeholder="Your website url" >
                            </div>
                            <div class="form-group col-sm-6">
                                <label for="subject">subject</label>
                                <input type="text" id="subject" name="subject" class="form-control" placeholder="Write subject here" required>
                            </div>
                            <div class="form-group col-sm-12">
                                <label for="message">message</label>
                                <textarea name="message" id="message" name="message" class="form-control" placeholder="Write message here"></textarea>
                            </div>
                            <div class="col-sm-12">
                                <button type="submit" class="btn-primary"><span>send</span></button>
                                <h5 class="pull-right">*required fields</h5>
                            </div>
                        </form>
                    </div>                    
                </div>
            </div>
            <div class="col-md-4 sidebar">
                <!--Author Widget-->
                <aside class="col-sm-4 widget-author widget widget-with-posts post">
                    <div class="widget-author-inner row">
                        <div class="author-avatar row"><a href="#"><img src="<%=path%>/images/author.png" alt="" class="img-circle"></a></div>
                        <a href="#"><h2 class="author-name">HuangDong</h2></a>
                        <h5 class="author-title">stationmaster</h5>
                        <p>无厚积何以勃发</p>
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
                <aside class="col-sm-4 widget widget-twitter widget-with-posts post">
                    <div class="widget-twitter-inner">
                        <h5 class="widget-meta"><i class="fa fa-twitter"></i>博客园<a href="http://www.cnblogs.com/ZengHuangDong/">@HuangDong</a></h5>
                        <div class="row tweet-texts">
                            <p>在博客园查看我的新博客 <a href="http://www.cnblogs.com/ZengHuangDong/">#HuangDong</a> <a href="http://www.cnblogs.com/ZengHuangDong/">http://www.cnblogs.com/ZengHuangDong/</a></p>
                        </div>
                        <%

                            String time=new Date().toString();
                            pageContext.setAttribute("sysTime",time);
                        %>
                        <div class="row timepast">${sysTime}</div>
                    </div>
                </aside>


<!--Footer-->
<footer class="row" id="footer">
    <div class="container">
        <div class="row top-footer">
            <div class="widget col-sm-3 widget-about">
                <div class="row m0"><a href="#"><img src="<%=path%>/images/huangdong.jpg" alt=""></a></div>
            </div>
            <div class="widget col-sm-5 widget-menu">
                <div class="row">
                    <ul class="nav column-menu white-bg">

                        <li class="active"><a href="<%=path%>/index.jsp">主页</a></li>
                        <li><a href="<%=path%>/single/showMoreSingle.html">最近发表</a></li>
                        <li><a href="<%=path%>/single/showMoreSingle.html">最新文章</a></li>
                        <li><a href="<%=path%>/user/personBlog/about.jsp">关于</a></li>
                        <li><a href="<%=path%>/community/showCommunity/1.html">Blog Single 1</a></li>
                        <li><a href="<%=path%>/community/showCommunity/2.html">Blog Single 2</a></li>

                    </ul>

                    <ul class="nav column-menu white-bg">
                        <li><a href="<%=path%>/community/showCommunity/3.html">Blog Single 3</a></li>
                        <li style="color: #0d90d1">更多<a style="color: #0d90d1" href="<%=path%>/single/showMoreSingle.html">>></a></li>
                        <li><a href="<%=path%>/contact.jsp">联系</a></li>
                    </ul>
                </div>
            </div>
            <div class="widget col-sm-4 widget-subscribe">
                <h5 class="widget-title">邮件订阅</h5>
                <form method="post" class="form-inline subscribe-form">
                    <div class="form-group">
                        <input type="email" class="form-control" placeholder="Email" id="u_mail">
                    </div>
                    <div class="form-group">
                        <input type="hidden" class="form-control" id="senderName" value="${userName}">
                    </div>
                    <button class="btn btn-primary btn-sm" onclick="filter()"><span>send</span></button>
                </form>
            </div>
        </div>
    </div>
    <center> <h5 class="copyright">Copyright &copy; 2017.zenghuangdong.cn All rights reserved.</h5></center>
</footer>

<!--========== jQuery (necessary for Bootstrap's JavaScript plugins) ==========-->
<script src="js/jquery-2.2.0.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="WEB-INF/views/personBlog/vendors/owl-carousel/owl.carousel.min.js"></script>
<script src="WEB-INF/views/personBlog/vendors/magnific-popup/jquery.magnific-popup.min.js"></script>
<script src="WEB-INF/views/personBlog/vendors/instafeed/instafeed.min.js"></script>
<script src="WEB-INF/views/personBlog/vendors/imagesLoaded/imagesloaded.pkgd.min.js"></script>
<script src="WEB-INF/views/personBlog/vendors/isotope/isotope.pkgd.min.js"></script>
<script src="js/theme.js"></script>
</body>
</html>
