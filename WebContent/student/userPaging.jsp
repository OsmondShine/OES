<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="/student/base/base.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link type="text/css" rel="stylesheet" href="${ctx}/css/paging.css" />
<script type="text/javascript" src="${ctx }/js/jquery-2.1.1.min.js"></script>
<script type="text/javascript">
	var pages;
	$(document).ready(function(){
		//alert(1);
		paging();
	});
	
	function paging() {
		var params = $("#pagingForm").serialize();
		//ajax进行分页
		$.ajax({
			url:"${ctx}/userJson!paging.action",
			type:"post",
			dataType:"json",
			data:params,
			success:function(result) {
				pages = result.paging.pageCount;
				// 每次查询新的先清除旧的
				$("#pagingTab>tbody").html("");
				var htmlStr = "当前第" + result.paging.currentPage + "页,共" + result.paging.pageCount + "页," + result.paging.totalCount + "条数据";
				$("#tip").html(htmlStr);
				//同步当前页
				$("#page").val(result.paging.currentPage);
				var str = getBody(result.paging.results);
				$("#pagingTab>tbody").append(str); 
			}
		});
	}
	
	function setTd(value) {
		return "<td style='text-align:center;'>"+value+"</td>";
	}
	
	function getBody(list) {
		var str = new Array();
		//alert(3);
		$(list).each(function(i,o){
			str.push("<tr>");
			//序号
			str.push(setTd(i+1));
			//宿舍
			//str.push(setTd(o.dorm.fdNo));
			//用户名
			str.push(setTd(o.fdUserName));
			//用户密码
			str.push(setTd(o.fdPwd));
			//学生姓名
			str.push(setTd(o.fdName));
			//学生电话
			str.push(setTd(o.fdPhone));
			//学生类型
			str.push(setTd(o.fdType));
			//学生院系
			str.push(setTd(o.fdMajor));
			//学生年龄
			str.push(setTd(o.fdAge));
			//学号(唯一)
			str.push(setTd(o.fdNo));
			//学生邮箱
			str.push(setTd(o.fdEmail));
			//删除，修改
			str.push(setTd("<a style='text-decoration:none' onclick='deleteUser("+o.fdId+");' href='javascript:;'>删除</a>"));
			str.push(setTd("<a onclick='userIdQuery("+o.fdId+");'href='javascript:;'><img style='height:16px;width:16px;position: relative;top:2px;' src='${ctx }/index/images/t02.png'>修改</a>"));
			str.push("</tr>");
			
		});
		return str.join("");
	}
	
	//上一页
	function prePage() {
		var page = $("#page").val();
		$("#page").val(parseInt(page) - 1);
		paging();
	}
	//下一页
	function nextPage() {
		var page = $("#page").val();
		if(page < pages) {
			$("#page").val(parseInt(page) + 1);
		}
		paging();
	}
	
	//首页
	function fistPage () {
		$("#page").val(1);
		paging();
	}
	
	//尾页
	function endPage (){
		$("#page").val(pages);
		paging();
	}
	
	//删除
	function deleteUser(id) {
		if(!confirm("确认删除" + id + "的数据？")) return;
		$.post("${ctx}/userJson!delete.action","user.fdId=" + id,function(data){
			//alert(data);
			if(data.result > 0) {
				alert("删除成功!");
			}
			paging();
		},"json");
	}
	
	//根据id去查询对象
	function userIdQuery(id) {
		$("#userId").val(id);
		$("#pagingForm").attr("action","${ctx}/user!queryId.action");
		$("#pagingForm").submit();
	}
	
	//模糊查询
	function queryLike() {
		$("#pagingForm").attr("action","${ctx}/userJson!queryLike.action");
		$("#pagingForm").submit();
	}
</script>
<style type="text/css">
	a{
		text-decoration: none;
	}
</style>
<title>学员分页</title>
</head>
<body>
	<font color="red">${msg }</font>    
	<c:remove var="msg" scope="session" />
	
	<form id="pagingForm">
		<input id="page" value="1" type="hidden" name="paging.currentPage" />
		<input id="userId" value="${user.fdId }" name="user.userId" type="hidden"  />
		
	</form>
	<table cellspacing="1" cellpadding="0" width="820" id="pagingTab">
		<thead>
			<tr id="tab_head">
				<th>序号</th>
				<th>宿舍</th>
				<th>用户名</th>
				<th>用户密码</th>
				<th>学生姓名</th>
				<th>学生电话</th>
				<th>学生类型</th>
				<th>学生院系</th>
				<th>学生年龄</th>
				<th>学号</th>
				<th>学生邮箱</th>
				<th>操作</th>
			</tr>
		</thead>
		
		<tbody></tbody>
		
		<tfoot>
			<tr style="background-color:#F8F8F8;">
				<td align="left" colspan="6" >
					<span id="tip"></span>
				</td>
				<td id="d5" align="right" colspan="6">
					<a class="d5_a" href="javascript:;" onclick="fistPage()">首页</a>
					<a class="d5_a" href="javascript:;" onclick="prePage()">上一页</a>
					<a class="d5_a" href="javascript:;" onclick="nextPage()">下一页</a>
					<a class="d5_a" href="javascript:;" onclick="endPage()">尾页</a>
				</td>
			</tr>
		</tfoot>
	</table>
</body>
</html>