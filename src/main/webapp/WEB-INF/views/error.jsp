<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/3/14
  Time: 15:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path=request.getContextPath();
%>
<html>
<head>
    <title>操作失败提示页面</title>
</head>
<body>
<div style="width: 100%;height: 30%">
    <img src="<%=path%>/images/cha.jpg" alt="" style="margin-left: 40px;">
    <span style="color: #8e3630">温馨提示:${operationMsg}</span>
</div>

<input type="button"  value="返回" onClick="window.history.go(-1);">
</body>
</html>
