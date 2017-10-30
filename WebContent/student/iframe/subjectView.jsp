<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<title>试卷管理</title>
	<link href="/EM/student/css_paper/view.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="container">
		<h1 class="h1">科目管理</h1>
		<h2 class="h2">SUBJECTS MANAGEMENT</h2>

		<table class="table">
			<tr class="tr thead">
				<td style="width:5%;position:relative;"></td>
				<td style="width:75%;position:relative; text-align:left;">科目列表</td>
				<td style="width:20%;position:relative;">
					<a style="text-decoration: none;" href="subject_findSubjectList?param=add&keywords=">添加科目</a>
				</td>
			</tr>
		</table>
		<table class="table">
			<tr >
				<th>科目编号</th>
				<th>科目名称</th>
				<th>操作</th>
			</tr>
			
			<c:forEach items="${subjectList}" var="list">
			<tr>
				<td>${list.fdCno }</td>
				<td>${list.fdCname }</td>
				<td>
					<a style="text-decoration: none;" href="student_deleteSubject?subject.fdId=${list.fdId }">删除</a>
				</td>
			</tr>
			</c:forEach>
		</table>

		<form class="table" action="student_findSubjectList?param=find" method="post">
			<label>搜索：</label>
			<input class="input1" type="text" name="keywords" class="text" placeholder="请输入科目名称">
			<button  type="submit" style="width:50px">查询</button>
		</form>
	</div>
</body>
</html>