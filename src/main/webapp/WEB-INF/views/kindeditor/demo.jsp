<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");
String path = request.getContextPath();
%>
<!doctype html>
<html>
<head>
	<meta charset="utf-8" />
	<title>前台网页编辑CMS系统</title>
	<link rel="stylesheet" href="<%=path%>/kindeditor/themes/default/default.css" />
	<link rel="stylesheet" href="<%=path%>/kindeditor/plugins/code/prettify.css" />
	<link rel="stylesheet" href="<%=path%>/css/main.e87dad73.css">
	<!--==========Theme Styles==========-->
	<link href="<%=path%>/css/style.css" rel="stylesheet">
	<link href="<%=path%>/css/theme/green.css" rel="stylesheet">
	<script charset="utf-8" src="<%=path%>/kindeditor/kindeditor.js"></script>
	<script charset="utf-8" src="<%=path%>/kindeditor/lang/zh_CN.js"></script>
	<script charset="utf-8" src="<%=path%>/kindeditor/plugins/code/prettify.js"></script>
	<script>
		KindEditor.ready(function(K) {
			var editor1 = K.create('textarea[name="content1"]', {
				cssPath : '<%=path%>/kindeditor/plugins/code/prettify.css',
				uploadJson : 'http://www.zenghuangdong.cn/backmanager/page/uploadJson.html',
				fileManagerJson : 'http://www.zenghuangdong.cn/backmanager/page/jsonManager.html',
				allowFileManager : true,
				afterCreate : function() {
					var self = this;
					K.ctrl(document, 13, function() {
						self.sync();
						document.forms['example'].submit();
					});
					K.ctrl(self.edit.doc, 13, function() {
						self.sync();
						document.forms['example'].submit();
					});
				}
			});
			prettyPrint();
		});
	</script>
</head>
<body>


	<%--<%=htmlData%>--%>
	<form name="example" method="post" action="<%=path%>/file/pageCreate.html" style="margin-left: 20%">

		<h5 class="form-title">== 编辑帖子 ==</h5>
		<div class="form-group col-sm-6">
			<label for="title">帖子标题*</label>
			<input type="text" id="title" name="title" class="form-control" placeholder="输入帖子标题" >
		</div>
		<div class="form-group col-sm-6">
			<label for="type">帖子类型*</label>
			<input type="text" id="type" name="type" class="form-control" placeholder="输入帖子类型">
		</div>

		<div class="form-group col-sm-6">
			<label for="tag">标签*</label>
			<input type="text" id="tag" name="tag" class="form-control" placeholder="输入帖子类型">
		</div>

		<br/>
		<textarea name="content1" cols="100" rows="8" style="width:700px;height:200px;visibility:hidden;"></textarea>
		<br />
		<input type="submit" name="button" value="提交内容" /> (提交快捷键: Ctrl + Enter)
	</form>
</body>
</html>
