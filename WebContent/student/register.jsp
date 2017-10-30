<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta charset="UTF-8">
		<title>欢迎注册</title>
		<link rel="stylesheet" href="css/iframe.css" />
		<link rel="stylesheet" href="css/standard.css" />
	</head>
	<script type="text/javascript">
 		function register1(){
			var sno = document.getElementById("sno").value;
			if (sno == ""){
				alert("学号不能为空！");
			}
		}
		function register2(){
			var fdName = document.getElementById("fdName").value;
			if (fdName == ""){
				alert("姓名不能为空！");
			}
		}
		function register3(){
			var fdSexuality = document.getElementById("fdSexuality").value;
			if (fdSexuality == ""){
				alert("性别不能为空！");
			}
		}
		function register4(){
			var fdPassword = document.getElementById("fdPassword").value;
			if (fdPassword == ""){
				alert("密码不能为空！");
			}
		}	function register5(){
			var fdClass = document.getElementById("fdClass").value;
			if (fdClass == ""){
				alert("专业不能为空！");
				document.
			}
		}
	</script>
	<body class="white_words">
		
		<div class="margin_top">
		<div style="text-align: center;">
			欢迎注册系统
		</div>
		<s:form action="student_register" method="post" theme="simple" enctype="multipart/form-data"> 
			<table class="table_mi">
				<tr><td><span>学号：</span><input type="text" name="student.fdSno" id="sno" onblur="register1();"/></td></tr>
				<tr><td><span>姓名：</span><input type="text" name="student.fdName" id="fdName" onblur="register2();"/></td></tr>
				<tr><td><span>性别：</span><select type="text" name="student.fdSexuality" id="fdSexuality" onblur="register3();"><option>男</option><option>女 </option></select></td></tr>
				<tr><td><span>密码：</span><input type="password" name="student.fdPassword" id="fdPassword" onblur="register4();"/></td></tr>
				<tr><td><span>专业：</span><input type="text" name="student.fdClass" id="fdClass" onblur="register5();"/></td></tr>
				<tr><td><button type="submit"><span>提交</span></button></td></tr>
			</table>
		</s:form>
		</div>
	</body>
</html>