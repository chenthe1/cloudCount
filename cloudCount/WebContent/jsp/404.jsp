<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP '404.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<style type="text/css">
		html, body{
			font: normal 12px "Microsoft Yahei","SimSun", Arial;
			background: transparent;
		}
		
		body {
			font: normal 12px "Microsoft Yahei", SimSun, Arial, Helvetica, sans-serif;
			padding: 0;
			margin: 0;
			background: #eee;
		}
		
		#pageLocation {
			border-bottom: 1px solid #2f5bb7;
			background: #eee;
			height: 30px;
			margin-bottom:10px;
			text-align: left;
			line-height:30px;
			overflow:hidden;
			font-size: 15px;
		}
		
		#pageFooter {
			border-top: 1px solid #2f5bb7;
			background: #eee;
			height: 30px;
			margin-bottom:10px;
			text-align: left;
			line-height:30px;
			overflow:hidden;
			font-size: 15px;
			width: 100%;
		}
	
	</style>
</head>
<body>
	<div id="pageLocation">信息提示</div>
	<div style="padding-left: 20px; height:50px;">
		<div style="float:left; line-height:50px; padding-left:10px;">
			对不起,该页面不存在！
		</div>
		<div style="float:left;"><img style="border-style:none; margin-left: 50%;" src="<%=request.getContextPath()%>/images/notfound.gif"/></div>
	</div>
	<div id="pageFooter">百米</div>
</body>
</html>
