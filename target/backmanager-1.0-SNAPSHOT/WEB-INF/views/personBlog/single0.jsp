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
<meta name="viewport" content="width=device-width, initial-scale=1"><title>观察者模式在个人网站邮件发布与订阅中的实践</title><link rel="stylesheet" href="<%=path%>/css/bootstrap.min.css">
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
    <script src="<%=path%>/js/respond.min.js"></script></head>
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
<br />
&nbsp;&nbsp;&nbsp;&nbsp;每次分享分布式服务框架，讲到带来的价值时， <br />
<br />
像什么可靠高性能，服务治理等等一些常规价值，大家还能听我们吹吹， <br />
<br />
但有几条不明显的价值经常被质疑，所以写下来，省点口舌， <br />
<br />
<strong>(1) 可以减少DB连接数：</strong> <br />
<br />
其实原因很简单，当集群特别大时，比如应用集群上万台时， <br />
<br />
如果每台连接池最小连接数为一，也要持有一万连接， <br />
<br />
当加一个中间层，让很少的中间层集群访问数据库，就会减少很多， <br />
<br />
因为某个兄弟公司就是因为这个原因才做分布式拆分的，所以我们才把它列为价值的一条。 <br />
<br />
<strong>(2)可以提高资源利用率：</strong> <br />
<br />
因为服务通常是无状态或少量状态的可并行的一些业务逻辑， <br />
<br />
可以说是计算密集型程序，基本上适用Amdahl's Law原则： <br />
<br />
Amdahl's Law：<a target="_blank" href="http://en.wikipedia.org/wiki/Amdahl%27s_law">http://en.wikipedia.org/wiki/Amdahl's_law</a> <br />
<br />
<img src="http://dl.iteye.com/upload/attachment/343852/9bd784bb-786f-3cd8-9167-2b37e4a3e997.png" /> <br />
<br />
加速度S等于： <br />
<br />
<img src="http://dl.iteye.com/upload/attachment/343854/d8b1f0dd-76df-3447-9310-cf14e460d16d.png" /> <br />
<br />
其中，P为程序的可并行比率，N为处理器个数(也就是机器数)。 <br />
<br />
分布式切分应用后： <br />
<br />
(1) 缩小了集群规模，小规模增加机器收益最高。 <br />
<br />
(2) 分离了串行因素，使多数集群并行因子增大。 <br />
<br />
所以可以用更少的机器来加速应用，也就提升了资源的利用率。
                    <div class="row m0 tags">
                        <a href="#" class="tag">科技                        </a>
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
                                        <c:if test="${message.owner==userName}">|<a href="<%=path%>/community/0/deleteCommunity.html?messageId=${message.messageId}" class="reply-link" onclick="delConfirm();">delete</a></c:if>
                                    </div>
                                </div>

                            </c:forEach>
                        </div>
                    </div>

                </article>
                <form action="<%=path%>/community/addOneCommunity/${userName}/0.html" method="post" id="messageForm" class="comment-form row">
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
</section><footer class="row" id="footer">
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