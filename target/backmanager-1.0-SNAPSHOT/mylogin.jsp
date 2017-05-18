<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>LOGIN</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	 <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
    <link href="<%=path%>/plugins/bootstrap/css/bootstrap.css" rel="stylesheet" media="screen">
    <script src="<%=basePath%>plugins/jquery/jquery-1.10.2.js"></script>
    <script src="<%=basePath%>plugins/bootstrap/js/bootstrap.min.js"></script>
    <script src="<%=path%>/js/login.js"></script>

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
    
  </head>
  
  <body>
  <div class="container">
<h1 class="page-header">管理员用户登录</h1>
<form class="form-horizontal" method="post">

  <div class="form-group">
    <label for="userName" class="col-xs-2 control-label">用户名</label>
    <div class="col-xs-3">
      <input type="text" class="form-control" id="userName" name="userName" placeholder="UserName">
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword" class="col-xs-2 control-label">密码</label>
    <div class="col-xs-3">
      <input type="password" class="form-control" name="passWord" id="inputPassword" placeholder="Password">
    </div>
  </div>
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <div class="checkbox">
        <label>
          <input type="checkbox">记住我
        </label>
      </div>
    </div>
  </div>
  <div class="form-group">
   <div class="col-xs-offset-2 col-xs-3">
      <button type="button" id="submit" class="btn btn-success btn-block" onclick="confirm()">登录</button>
    </div>
  </div>
  <div id="UserResult"></div>
  <div id="PasswordResult"></div>
</form>

 </div> 

  </body>
</html>
