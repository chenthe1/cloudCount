<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>cloud log system</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="./css/logon.css" media="screen">
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
		
		#contentdivs {
			padding:0px 0;
			margin:0 auto;
			width:100%;
			text-align:left;
		}
	
	</style>
  </head>
  
  <body>
  	<div id="head">
		<div id="headdiv">
			<h1>
				<img style="border-style:none;" src="./images/logo.png"/>
				<b>商用WiFi运维管理系统</b>
			</h1>
			<div class="clearfix">&nbsp;</div>
		</div>
	</div>
	<div id="content" >
		<div id="contentdivs" >
			<div id="pageFooter">修改成功 ... </div>
	    </div>
    </div>
 	<div id="pageFooter">百米</div>
  	<div class="footer-bar"> 
		<div class="footer footercontent">
			<ul>
			<li>
				2015 ©百米生活
			</li>
			</ul>
		</div>
		<span id="rightContent" class="rightContent">业务咨询电话  400-8888-8888      运维客服电话  15013697163</span> 
	</div>
  </body>
</html>
