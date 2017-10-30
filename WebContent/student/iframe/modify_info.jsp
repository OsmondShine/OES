<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta charset="UTF-8">
		<title>个人信息修改</title>
		<link rel="stylesheet" href="../css/iframe.css" />
	</head>
	<body>
	<form action="student_update" method="post"> 
		<table class="table_mi">
			<tr><td><span>学号：</span><input type="text" name="student.fdSno" value="${student.fdSno }"></td></tr>
			<tr><td><span>姓名：</span><input type="text" name="student.fdName" value="${student.fdName }"></td></tr>
			<tr><td><span>性别：</span><input type="text" name="student.fdSexuality" value="${student.fdSexuality }"></td></tr>
			<tr><td><span>密码：</span><input type="text" name="student.fdPassword" value="${student.fdPassword }"></td></tr>
			<tr><td><span style="position:relative;left:-33px;">专业班级：</span><input  style="position:relative;left:-33px;" type="text" name="student.fdClass" value="${student.fdClass }"></td></tr>
			<tr><td><button type="submit"><span>提交</span></button></td></tr>
		</table>
	</form>
	</body>
</html>
