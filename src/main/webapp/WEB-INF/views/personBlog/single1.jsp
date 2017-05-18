<%@ page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=utf-8" %>
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
<body class="home">

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
                            <li style="color: #0d90d1">更多<a style="color: #0d90d1" href="<%=path%>/single/showMoreSingle.html">>></a></li>
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
                <article class="single-post-content row m0 post">
                    <header class="row">                        
                        <h5 class="post-meta">
                            <a href="#" class="date">feb 17, 2016</a>
                            <span class="post-author"><i>by</i><a href="#">Mark Sanders</a></span>
                        </h5>
                        <h2 class="post-title">Nature, in the broadest sense, is the natural, physical, or material world or universe.</h2>
                        <div class="row">
                            <h5 class="taxonomy pull-left"><i>in</i> <a href="#">image</a>, <a href="#">entertainment</a></h5>
                            <div class="response-count pull-right"><img src="<%=path%>/images/comment-icon-gray.png" alt="">5</div>
                        </div>
                    </header>
                    <div class="featured-content row m0">
                        <a href="#"><img src="<%=path%>/images/posts/6.jpg" alt=""></a>
                    </div>
                    <div class="post-content row">
                        <h4>Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.</h4>
                        <br>
                        <h3>Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</h3>
                        <br>
                        <p>It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</p>
                        <br>
                        <blockquote class="has-sign row m0">
                            <div>
                                <p>If everybody learns this simple art of loving his work, whatever it is, enjoying it without asking for any recognition, we would have more beautiful and celebrating world.</p>
                                <footer>OSHO</footer>
                            </div>
                        </blockquote>
                        <h3>Sunt in culpa qui officia deserunt mollit anim id est laborum.</h3>
                        <br>
                        <ul class="triangle-list nav">
                            <li>It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.</li>
                            <li>Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</li>
                        </ul>
                        <ul class="circle-list nav">
                            <li>Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.</li>
                            <li>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</li>
                        </ul>
                        <br>
                        <blockquote class="no-sign">
                            <p>Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt.</p>
                        </blockquote>
                        <br>
                        <div class="row">
                            <div class="col-sm-6">
                                <p>It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</p>
                            </div>
                            <div class="col-sm-6">
                                <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt.</p>
                            </div>
                        </div>
                        <br>
                        <br>
                        
                        <!-- Place somewhere in the <body> of your page -->
                        <div class="thumbCarousel row m0">
                            <div id="slider" class="flexslider">
                                <ul class="slides">
                                    <li><img src="<%=path%>/images/posts/gallery/1.jpg" alt=""></li>
                                    <li><img src="<%=path%>/images/posts/gallery/2.jpg" alt=""></li>
                                    <li><img src="<%=path%>/images/posts/gallery/3.jpg" alt=""></li>
                                    <li><img src="<%=path%>/images/posts/gallery/4.jpg" alt=""></li>
                                    <li><img src="<%=path%>/images/posts/gallery/1.jpg" alt=""></li>
                                    <li><img src="<%=path%>/images/posts/gallery/2.jpg" alt=""></li>
                                    <li><img src="<%=path%>/images/posts/gallery/3.jpg" alt=""></li>
                                </ul>
                            </div>
                            <div id="carousel" class="flexslider">
                                <ul class="slides">
                                    <li><img src="<%=path%>/images/posts/gallery/s1.jpg" alt=""></li>
                                    <li><img src="<%=path%>/images/posts/gallery/s2.jpg" alt=""></li>
                                    <li><img src="<%=path%>/images/posts/gallery/s3.jpg" alt=""></li>
                                    <li><img src="<%=path%>/images/posts/gallery/s4.jpg" alt=""></li>
                                    <li><img src="<%=path%>/images/posts/gallery/s1.jpg" alt=""></li>
                                    <li><img src="<%=path%>/images/posts/gallery/s2.jpg" alt=""></li>
                                    <li><img src="<%=path%>/images/posts/gallery/s3.jpg" alt=""></li>
                                </ul>
                            </div>
                        </div>
                        <br>
                        <p>It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</p>
                    </div>
                    <div class="row m0 tags">
                        <a href="#" class="tag">music</a>
                        <a href="#" class="tag">tegs</a>
                        <a href="#" class="tag">tegs hover</a>
                    </div>
                    
                   <hr/>
                    
                    <div class="row m0 comments">
                        <h5 class="response-count">${fn:length(communityList)} comments<a href="#comment-form" class="btn btn-primary pull-right"><span>add comment</span></a></h5>

                        <!--Comments-->
                        <div class="media comment">

                            <c:forEach var="message" items="${communityList}">
                                <div class="media comment reply">
                                    <div class="media-left">
                                        <a href="#"><img src="<%=path%>/images/posts/c2s.jpg" alt="" class="img-circle"></a>
                                    </div>
                                    <div class="media-body">
                                        <h4><a href="#">${message.owner}</a></h4>
                                        <h5><a href="#" class="date">${message.time}</a> | <a href="#" class="reply-link">reply</a></h5>
                                        <p>${message.message}</p>|
                                        <c:if test="${message.owner==userName}">
                                        <a href="<%=path%>/community/1/deleteCommunity.html?messageId=${message.messageId}" class="reply-link" onclick="delConfirm();">delete</a>
                                        </c:if>
                                    </div>
                                </div>
                            </c:forEach>
                        </div>
                    </div>

                </article>
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
            <div class="col-md-4 sidebar">

                <!--Twitter Widget-->
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


                <form action="<%=path%>/community/addOneCommunity/${userName}/1.html" id="messageForm" method="post" class="comment-form row">
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
