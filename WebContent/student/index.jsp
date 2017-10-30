<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<title>计算机考试系统</title>
	<head>
		<title></title>
		<link rel="stylesheet" href="css/standard.css" />
		<link rel="stylesheet" href="css/drop.css" />
		<link rel="stylesheet" href="css/iframe.css" />

	</head>

	<body><div class="name_logout">欢迎你：${student.fdName }            <a href="student_deleteSession">退出</a> </div>
		<div id="container">
			<!--头图显示-->
			<div class="header center">

				<img class="imgCenter" src="img/titlewords.png" />
			
			</div>
			<!--头图结束-->

			<!--下方内容-->
			<div class="center">
				<!--左边栏-->
				<div style="float:left" class="greyB">
<!--个人中心-->
					<div class="dropdown">
						<div class="dropbtn"> <img src="img/geren.png">
						</div>
						<div class="dropdown-content">
							<a href="/EM/student/iframe/exam_inform.jsp" target="frame_info">考试通知</a>
							<a href="/EM/student/iframe/subjectView.jsp" target="frame_info">科目管理</a>
							<a href="/EM/student/iframe/modify_info.jsp" target="frame_info">修改信息</a>
						</div>
					</div>
<!--查询成绩-->
					<div onclick="window.open('iframe/score_findMyScore?studentFdId=${student.fdId }','frame_info');" class="dropdown grade">
						<div class="dropbtn"> <img src="img/chaxun.png">

						</div>
						<div class="dropdown-content">

						</div>
					</div>
<!--获取帮助-->
					<div class="dropdown">
						<div class="dropbtn"> <img src="img/huoqu.png">
						</div>
						<div class="dropdown-content">
							<a href="/EM/student/iframe/online_help.html" target="frame_info">提交问题</a>
							<a href="/EM/student/iframe/about_system.html" target="frame_info">关于系统</a>

						</div>
					</div>
					
				</div>

				<!--右边内容-->
				<div class="content">
					<iframe src="about:blank" name="frame_info">
					
					
				</iframe>

				</div>
			</div>
		</div>

	</body>

</html>