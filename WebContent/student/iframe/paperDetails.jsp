<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>试卷页面</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">background: #80CBF3
	-->
		<style>
html { *
	overflow: auto;
	_overflow-x: hidden;
	-webkit-text-size-adjust: none;
	height: 100%;
	
}

body {
	margin: 0;
	height: 100%;
	font-family: "Microsoft YaHei", tahoma, arial, simsun;
}

p,h1,h2,h3,h4 {
	margin-top: 0;
	margin-bottom: 0;
}

.main {
	width: 950px;
	margin: 0 auto;
}

.container {
	padding-left: 700px;
	padding-top: 20px;
}

h2 {
	font-size: 28px;
	margin-top: 2px;
	margin-bottom: 2px;
	font-weight: bold;
	margin-left:30px;
}

.Countdown {
	
	padding-right: 30px;
	font-size: 30px;
	font-family: tahoma, arial, simsun;
	color: #4A4A4A;
	font-size: 30px;
}

.Countdown span {
	display: inline-block; *
	display: inline; *
	zoom: 1;
	width: 55px;
	line-height: 55px;
	text-align: center;
	background-color: #fff;
	margin-left: 2px;
	
}

.Countdown .bd {
	width: 16px;
	background-image: none;
	padding-right: 30px;
}

:root .Countdown span {
	
}
</style>
		<script>
var m = 14;//传个分钟数到这里
var s = 59;
function showtime(){
	document.getElementById('m').innerHTML = m;
	document.getElementById('s').innerHTML = s;
	s = s-1;
	if(s==0){
		m = m -1;
		s = 60
	}
	if(m==0){
		window.location='paper_handIn?record.fdPno=${record.fdPno }';//倒计时结束,自动交卷
	}
}
clearInterval(settime); 
var settime = setInterval(function(){
	showtime();
},1000);

</script>
<script type="text/javascript">
function handIn(){
 confirm("是否确认交卷？");
 var radios = document.getElementsByName("answer${list.qno }");
 var planid;
 var result = false;
 debugger();
   //根据 name集合长度 遍历name集合  
    for(var i=0;i<radios.length;i++)  
    {   
        //判断那个单选按钮为选中状态  
        if(radios[i].checked)  
        {  
            //弹出选中单选按钮的值  
            alert(radios[i].value);  
        }   
  }
 }
 

</script>
	</head>

	<body>
		<div class="main">
			<h2 style="text-align: center; margin-top: 30px;float:left;margin-left:350px">
				${record.fdPname }
			</h2>
			<div class="container">
				<div>

				</div>
				<div class="Countdown" id="time">
					<h2>
						剩余时间：
					</h2>
					<span id="m"></span><span class="bd">:</span><span id="s"></span>
				</div>
			</div>
		</div>
	</head>

	<body>
	
		<form action="paper_handIn?record.fdPno=${record.fdPno }&recordFdPname=${record.fdPname}"
			method="post" style="padding-left:30px;">
			<div style="margin-left:450px;margin-bottom:30px">
				<h3 >
					满分：${record.fdNums*record.fdScore }分
				</h3>
			</div>
			<h3>
				一、选择题（共${record.fdNums }题，每题${record.fdScore }分）
			</h3>
			<table>
				<c:forEach items="${gquList}" var="list" varStatus="status">
					<tr>
						<td id="${status.count }">
							【${status.count }】 ${list.question}
						</td>
					<tr>
						<td>
							&nbsp;&nbsp;&nbsp;
							<input type="radio" name="option${list.fdQno }" value="A" />
							${list.optionA }
						</td>
					</tr>
					<tr>
						<td>
							&nbsp;&nbsp;&nbsp;
							<input type="radio" name="option${list.fdQno }" value="B" />
							${list.optionB }
						</td>
					</tr>
					<tr>
						<td>
							&nbsp;&nbsp;&nbsp;
							<input type="radio" name="option${list.fdQno }" value="C" />
							${list.optionC }
						</td>
					</tr>
					<tr>
						<td>
							&nbsp;&nbsp;&nbsp;
							<input type="radio" name="option${list.fdQno }" value="D" />
							${list.optionD }
						</td>
					</tr>

				</c:forEach>
			</table>
			&nbsp;&nbsp;&nbsp;&nbsp;
			<button type="submit" onclick="handIn();">
				交卷
			</button>
		</form>
	</body>
</html>
