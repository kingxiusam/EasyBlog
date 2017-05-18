<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path=request.getContextPath();
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>操作成功</title>
<script language=javascript>
   setTimeout("window.history.go(-1);",1000)
</script>
</head>
<script>
	//具体时间由于网速产生负值
	//获取当前时间
	startday = new Date();
	clockStart = startday.getTime();
	function initStopwatch(){
		var myTime = new Date();
		var timeNow = myTime.getTime();
		var timeDiff = timeNow - clockStart;    //获取间隔时间
		this.diffSecs = timeDiff/1000;
		// 因为时间以毫秒为单位
		return(this.diffSecs);                  //返回间隔秒数

	}
	function getSecs()
	{
		var mySecs = initStopwatch();
		var mySecs1 = ""+mySecs;
		//以倒计时方式显示时间
		mySecs1 = 10 - eval(mySecs1.substring(0,mySecs1.indexOf("."))) + "秒";
		//noinspection JSValidateTypes
		document.getElementById("time").innerHTML(mySecs1);
	}
</script>
<div style="width: 100%;height: 30%">
	<img src="<%=path%>/images/gou.gif" alt="" style="margin-left: 40px;">
	${operationMsg}<span id="time">10</span>秒后自动跳转，请等待......
</div>

<br>
<a onClick="window.history.go(-1);">若不能跳转点击这里</a>
</body>
</html>
