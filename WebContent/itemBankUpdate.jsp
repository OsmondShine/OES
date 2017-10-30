
<html><%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<html>
<head>
    <title></title>
    <link rel="stylesheet" type="text/css" href="Css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="Css/bootstrap-responsive.css" />
    <link rel="stylesheet" type="text/css" href="Css/style.css" />
    <script type="text/javascript" src="Js/jquery.js"></script>
    <script type="text/javascript" src="Js/jquery.sorted.js"></script>
    <script type="text/javascript" src="Js/bootstrap.js"></script>
    <script type="text/javascript" src="Js/ckform.js"></script>
    <script type="text/javascript" src="Js/common.js"></script>
    <script type="text/javascript" src="js/showdate.js"></script>
    <style type="text/css">
        body {font-size: 20px;
             padding-bottom: 40px;
             background-color:#e9e7ef;
             font-size:17px;
        }
        .sidebar-nav {
            padding: 9px 0;
        }

        @media (max-width: 980px) {
            /* Enable use of floated navbar text */
            .navbar-text.pull-right {
                float: none;
                padding-left: 5px;
                padding-right: 5px;
            }
        }


    </style>
</head>
<form action="itemBank_update" method="post">
<table class="table table-bordered table-hover definewidth m10" style="margin-left:3%;margin-top:2%;">
    
    <tr>
        <td width="10%" class="tableleft" >试题编号</td>
       
        <td><input type="hidden" name="itemBank.qno" value="${itemBank.qno}" style="height: 41px; width: 546px"/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">题干</td>
        <td><input type="text" name="itemBank.question" value="${itemBank.question}" style="height: 41px; width: 546px"/></td>
     
    </tr>
    <tr>
        <td class="tableleft">试题内容</td>
        <td><input type="text" name="itemBank.content" value="${itemBank.content}" style="height: 93px; width: 546px"/></td>
    </tr> 
    <tr>
        <td width="10%" class="tableleft">答案</td>
        <td><input type="text" name="itemBank.answer" value="${itemBank.answer}" style="height: 41px; width: 546px"/></td>
     
    </tr> 
        <tr>
        <td width="10%" class="tableleft">难度</td>
        <td><input type="text" name="itemBank.difficulty" value="${itemBank.difficulty}" style="height: 41px; width: 546px"/></td>
     
    </tr> 
    <tr>
        <td class="tableleft"></td>
        <td>
            <button style="margin-left:180px;" type="submit" class="btn btn-primary" type="button">保存修改</button>&nbsp;&nbsp;<button type="button" ><a href="itemBankQuery.jsp">返回列表</a></button>
        </td>
    </tr>
</table>
</form>
</body>
</html>
<script>
function jump(){
 window.location.href="placardQuery.html";
}
</script>

