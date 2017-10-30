<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<title>注册考试科目</title>
	<link href="/EM/student/css_paper/sjadd.css" rel="stylesheet" type="text/css">
</head>
<body>
<form action="student_addSubjects" method="post">
	<div class="container">
		<h1 class="h1">科目注册</h1>
		<h2 class="h2">ADD SUBJECTS</h2>

		<div class="title">
			<div class="title_content">
				<i class="icon"></i>
				<span>注册</span>
			</div>
		</div>
		<div class="content">
			<label class="word">科目名称:</label>
			<select type="text" class="input1" name="subjectChecked" >
				<c:forEach items="${subjectList}" var="list" varStatus="index">
       				 <option value="${list.fdId}" selected>${list.fdCname}</option>
				</c:forEach>
			</select>
		</div>
<!--
		<div class="content">
			<label class="word">多选题： 共</label>
			<input type="text" class="input2" name="multipleNums">
			<label class="word">题，每题</label>
			<input type="text" class="input2">
			<label class="word">分，难度提数：难</label>
			<input type="text" class="input2" name="diffiNums2">
			<label class="word">中</label>
			<input type="text" class="input2" name="middNums2">
			<label class="word">易</label>
			<input type="text" class="input2" name="easyNums2">
		</div>
		--><div class="buttons">
			<button type="submit" class="button-list">注册</button>
			<button type="button" class="button-list">返回</button>
		</div>
	</div>
	</form>
</body>
</html>