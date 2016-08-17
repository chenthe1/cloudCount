<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<%@ include file="/jsp/baseHead.jsp"%>

<html lang="zh-CN">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>商用WiFi运维管理系统修改配置</title>
	<link rel="stylesheet" type="text/css" href="./css/logon.css" media="screen">
	<meta http-equiv="Cache-Control" content="no-store" />
	<meta http-equiv="Pragma" content="no-cache" />
	<meta http-equiv="Expires" content="0" />
</head>
 
<body class="aclogin">
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
	<div id="contentdiv" >
	<div id="lcol">
		<bm:messageTag type="1"/>
		<div id="acloginpod">
		<div class="acloginform">
			<form action="login.do" method="post"><!-- method="post" -->
				<fieldset>
					<label for="name">用户名:</label>
					<input type="text" name="userName" required="required"> 
					<label for="ac_password">密码:</label>
					<input type="password" name="userPassword" required="required"> 
					<label > </label>
					<div style="float:left; width:265px;">
						<div style="float:right; width:265px;">
							<input type="hidden" name="method" value="login"> 
							<input type="submit" value="登录-修改配置" class="btn-login"> 
						</div>
					</div>
				</fieldset>
			</form>
		</div>
		</div>
	</div>
	<div class="rcol">
		<div class="pagecontent">
			<p class="intro">
				该系统，只提供修改系统配置 ...
			</p>
		</div>
	</div>
	<div class="clearfix">&nbsp;</div>
	</div>
	</div>

	<div class="footer-bar"> 
		<div class="footer footercontent">
			<ul>
			<li>
				2015 ©***
			</li>
			</ul>
		</div>
		<span id="rightContent" class="rightContent">业务咨询电话  400-8888-8888      运维客服电话  15013697163</span> 
	</div>
</body>
</html>
