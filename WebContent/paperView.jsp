<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<title>试卷管理</title>
	<link href="css_paper/view.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="container">
		<h1 class="h1">试卷管理</h1>
		<h2 class="h2">EXAMS MANAGEMENT</h2>

		<table class="table">
			<tr class="tr thead">
				<td style="width:5%;position:relative;"></td>
				<td style="width:75%;position:relative; text-align:left;">试卷列表</td>
				<td style="width:20%;position:relative;">
					<button type="button" name="button" value="添加试卷" style="height:30px;width:100%" onclick="window.location.href='paperAdd.jsp'">添加试卷</button>
				</td>
			</tr>
		</table>
		<table class="table">
			<tr >
				<th>ID</th>
				<th>考试名称</th>
				<th>组卷人</th>
				<th>状态</th>
				<th>考试时长</th>
				<th>难题比重</th>
				<th>操作</th>
			</tr>
			
			<c:forEach items="${listRecord}" var="list">
			<tr>
				<td>${list.fdPno }</td>
				<td>${list.fdPname }</td>
				<td>谢亮</td>
				<td>启用</td>
				<td>${list.fdTime }</td>
				<td>${list.fdDiffNums/list.fdNums }%</td>
				<td>
				<!-- 	<button type="button" style="width:70%; position:relative;"> -->
					<a style="text-decoration: none;" href="record_delete?record.fdPno=${list.fdPno }&kw=">删除</a>
				<!-- 	</button> -->
				</td>
			</tr>
			</c:forEach>
		</table>

		<form class="table" action="record_find" method="post">
			<label>搜索：</label>
			<input class="input1" type="text" name="kw"  class="text" placeholder="请输入考试名称">
			<button  type="submit" style="width:50px">查询</button>
		</form>
	</div>
</body>
</html>