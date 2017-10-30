<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta charset="UTF-8">
		<title>欢迎登陆考试管理系统</title>
		<link rel="stylesheet" href="css/standard.css" />
		<link rel="stylesheet" href="css/login.css" />
		<script type="text/javascript">

 function login()
 {
  /*
   下面是提交表单信息，forms[0]代表该页面第一个<form>表单，以此类推forms[1]代表第二个<form>，当然了，这个页面只有一个<form>所以用forms[0];
   你还可以用document.forms("formid").submit()来提交表单
   
  */
  document.forms[0].submit();
 }

</script>
	</head>
	<body>
		<div class="login_form">
			<div class="login_title"></div>
			
			<div class="form_self">
			<!--账号-->
				<form  class="form" action="student_login" name="f" method="post">
					<div class="input_outer">
						
						<span class="u_user"></span>
						<input type="text" class="text" name="student.fdSno" placeholder="账号">
					</div>
					<!--密码-->
					<div class="input_outer">
						
						<span class="us_uer"></span>
						<input type="password" class="text" name="student.fdPassword" placeholder="密码">
					</div>
						<div class="confirm">
						<input type="submit" id="submit" value=" ">
						</div>	
				</form>
						<div class="register">
							<a href="register.jsp">注册账户</a>
						</div>
						
					
					</div>
			
			</div>
			
			
			
			
		</div>
	</body>
</html>
