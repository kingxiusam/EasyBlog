<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/5/7
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%
    String path = request.getContextPath();

%>
<html>
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
    <title>Title</title>
</head>
<body>
<form action="<%=path%>/community/addOneCommunity/${userName}/2.html" method="post" id="messageForm" class="comment-form row">
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

</body>
</html>
