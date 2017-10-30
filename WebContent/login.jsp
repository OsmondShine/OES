<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="zh">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>考试管理后台管理登录页面</title>

<link rel="stylesheet" type="text/css" href="./css/styles.css">

</head>
<body>


<div class="wrapper">

	<div class="container">
		<h1>考试管理后台管理</h1>
		<form class="form" action="teacher_login" method="post">
			<input type="text" placeholder="账号" name="teacher.tno">
			<input type="password" placeholder="密码" name="teacher.password"><br>
			<button type="submit" ><strong>登陆</strong></button>
			
		</form>
	</div>
	
	<ul class="bg-bubbles">
		<li></li>
		<li></li>
		
	</ul>
	
</div>



</body>
</html>