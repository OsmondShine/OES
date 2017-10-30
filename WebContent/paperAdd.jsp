<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<title>试卷添加</title>
	<link href="css_paper/sjadd.css" rel="stylesheet" type="text/css">
</head>
<body>
<s:form action="record_create" method="post" theme="simple" enctype="multipart/form-data">
	<div class="container">
		<h1 class="h1">添加试卷</h1>
		<h2 class="h2">ADD EXAMS</h2>

		<div class="title">
			<div class="title_content">
				<i class="icon"></i>
				<span>随机组卷</span>
			</div>
		</div>
		<div class="content">
			<label class="word">试卷编号:</label>
			<input type="text" class="input1" name="record.fdPno">
		</div>
		<div class="content">
			<label class="word">试卷名称:</label>
			<input type="text" class="input1" name="record.fdPname">
		</div>
		<div class="content">
			<label class="word">考试时间:</label>
			<input type="text" class="input1" name="record.fdTime"><label class="word">分钟</label>
		</div>
		<div class="content">
			<label class="word">试卷总分:</label>
			<input type="text" class="input1" >
		</div>
		<div class="content">
			<label class="word">单选题： 共</label>
			<input type="text" class="input2" name="record.fdNums">
			<label class="word">题，每题</label>
			<input type="text" class="input2" name="record.fdScore">
			<label class="word">分，难度题数：难</label>
			<input type="text" class="input2" name="record.fdDiffNums">
			<label class="word">中</label>
			<input type="text" class="input2" name="record.fdMiddNums">
			<label class="word">易</label>
			<input type="text" class="input2" name="record.fdEasyNums">
		</div><!--
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
			<button type="submit" class="button-list">组卷</button>
			<button type="button" class="button-list">返回</button>
		</div>
	</div>
	</s:form>
</body>
</html>