<%@ page import="java.util.Date" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" %>
<%
    String path = request.getContextPath();
    String userName=request.getParameter("userName");
    pageContext.setAttribute("userName",userName);
    session.setAttribute("userName",userName);
%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!--========== The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags ==========-->
<title>Home</title>

<!--==========Dependency============-->
<link rel="stylesheet" href="<%=path%>/css/bootstrap.min.css">
<link rel="stylesheet" href="<%=path%>/css/font-awesome.min.css">
<link rel="stylesheet" href="<%=path%>/js/vendors/owl-carousel/assets/owl.carousel.css">
<link rel="stylesheet" href="<%=path%>/js/vendors/magnific-popup/magnific-popup.css">

<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Kanit:500">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Josefin+Sans:600,700italic">
<link href='https://fonts.googleapis.com/css?family=Dosis:400,200,300,500,600,800,700' rel='stylesheet' type='text/css'>
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Muli:400,300,300italic,400italic">
<link href='https://fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500italic,500,700italic,700,900,900italic' rel='stylesheet' type='text/css'>

<!--==========Theme Styles==========-->
<link href="<%=path%>/css/style.css" rel="stylesheet">
<link href="<%=path%>/css/theme/green.css" rel="stylesheet">
    <script src="<%=path%>/js/blog.js"></script>
    <script type="text/javascript" src="<%=path%>/js/single.js"></script>
    <script type="text/javascript"
            src="http://qzonestyle.gtimg.cn/qzone/openapi/qc_loader.js" charset="utf-8" data-callback="true"></script>
<!--========== HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries ==========-->
<!--========== WARNING: Respond.js doesn't work if you view the page via file:// ==========-->
<!--==========[if lt IE 9]>
    <script src="<%=path%>/js/html5shiv.min.js"></script>
    <script src="<%=path%>/js/respond.min.js"></script>

    <![endif]==========-->
</head>
<body class="home">
<script type="text/javascript">
    var paras = {};

    //用JS SDK调用OpenAPI
    QC.api("get_user_info", paras)
    //指定接口访问成功的接收函数，s为成功返回Response对象
            .success(function(s){
                //成功回调，通过s.data获取OpenAPI的返回数据
                alert("获取用户信息成功！当前用户昵称为："+s.data.nickname);
            })
            //指定接口访问失败的接收函数，f为失败返回Response对象
            .error(function(f){
                //失败回调
                alert("获取用户信息失败！");
            })
            //指定接口完成请求后的接收函数，c为完成请求返回Response对象
            .complete(function(c){
                //完成请求回调
                alert("获取用户信息完成！");
            });

</script>

<script type="text/javascript">
    var paras = {content : "从此学习吧就是你的成长园地"};

    QC.api("add_t", paras)
            .success(function(s){//成功回调
                alert("发送微博成功，请到腾讯微博内查看！");
            })
            .error(function(f){//失败回调
                alert("发送微博失败！");
            })
            .complete(function(c){//完成请求回调
                alert("发送微博完成！");
            });
</script>

<script type="text/javascript">
    if(QC.Login.check()){//如果已登录
        QC.Login.getMe(function(openId, accessToken){
            alert(["当前登录用户的", "openId为："+openId, "accessToken为："+accessToken].join("\n"));
        });
        //这里可以调用自己的保存接口
        url:'/doLogin/qqLoginSaving.html';
    }
</script>
<header class="row transparent black header1" data-spy="affix" data-offset-top="0" id="header">
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
                            <li style="color: #0d90d1"><a style="color: #0d90d1" href="<%=path%>/single/showMoreSingle.html">更多 >></a></li>
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


<section class="row content-wrap">
    <div class="container">
        <div class="row" id="post-masonry">
            <!--Blog Post-->
            <c:forEach items="${postsForTime}" var="post">

            <article class="col-sm-4 post post-masonry post-format-image">
                <div class="post-wrapper row">
                    <div class="featured-content row">
                        <a href="javascript:void(0);" onclick="countNum('${post.postText}','${post.postId}')"><img src="<%=path%>/images/posts/masonry/1.jpg" alt="" class="img-responsive"></a>
                    </div>
                    <div class="post-excerpt row">
                        <h5 class="post-meta">
                            <a href="#" class="date">${post.createTime}</a>
                            <span class="post-author"><i>by</i><a href="#">HuangDong</a></span>
                        </h5>
                        <h3 class="post-title"><a href="javascript:void(0);" onclick="countNum('${post.postText}','${post.postId}')">${post.postTitle}</a></h3>
                        <footer class="row">
                            <h5 class="taxonomy"><i>in</i> <a href="#">${post.postType}</a></h5>
                            <div class="response-count">阅读(${post.browNum})</div>
                            <div class="response-count"><img src="<%=path%>/images/comment-icon-gray.png" alt="">评论(${post.commentNum})</div>

                        </footer>
                    </div>
                </div>
            </article>

            </c:forEach>
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


        </div>
    </div>
</section>

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
                        <li style="color: #0d90d1"><a style="color: #0d90d1" href="<%=path%>/single/showMoreSingle.html">更多 >></a></li>
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
<script src="<%=path%>/js/jquery-2.2.0.min.js"></script>
<script src="<%=path%>/js/bootstrap.min.js"></script>
<script src="<%=path%>/js/vendors/owl-carousel/owl.carousel.min.js"></script>
<script src="<%=path%>/js/vendors/magnific-popup/jquery.magnific-popup.min.js"></script>
<script src="<%=path%>/js/vendors/instafeed/instafeed.min.js"></script>
<script src="<%=path%>/js/vendors/imagesLoaded/imagesloaded.pkgd.min.js"></script>
<script src="<%=path%>/js/vendors/isotope/isotope.pkgd.min.js"></script>
<script src="<%=path%>/js/theme.js"></script>
</body>
</html>
