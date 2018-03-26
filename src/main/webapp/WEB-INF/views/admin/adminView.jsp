<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/3/16
  Time: 17:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员界面</title>
    <link href="/styles/bootstrap.min.css" rel="stylesheet">
    <script src="/scripts/jquery-3.0.0.js"></script>
    <script src="/scripts/bootstrap.min.js"></script>
    <script>
        function getMsgCount(){
            $.post('getMsgCount.do',
                function(m){
                    $("#getMsg").html(m);
                })
            setTimeout("getMsgCount()",2000);
        }
        function getMsg(){
            $.post('getMsg.do',
                function(m){
                    $("#msgBox > li").remove();
                    for(var i = 0;i<m.length;i++){
                        var newLi = '<li><a href="hasRead.do?msgowner='+m[i].msgowner+'">'+m[i].msgowner+',注册成功!</a></li>';
                        $("#msgBox").append(newLi);
                    }

                })
        }
    </script>
</head>
<body>
<nav class="navbar navbar-default" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">首&nbsp;&nbsp;页</a>
        </div>
        <div>
            <ul class="nav navbar-nav col-md-11">
                <li class="active"><a href="/admin/employee.view">员工管理</a></li>
                <li class="active"><a href="/admin/recruitment.view">招聘管理</a></li>
                <li class="active "><a href="/admin/department.view">部门管理</a></li>
                <li class="active "><a href="/admin/attendance.view">考勤管理</a></li>
                <li class="active "><a href="/admin/training.view">培训管理</a></li>
                <li class="active "><a href="/admin/reward.view">奖惩管理</a></li>
                <li class="active "><a href="/admin/wage.view">工资管理</a></li>
                <li class="active "><a href="#">消息管理</a></li>
                <li class="active "><a href="#">退出</a></li>
            </ul>
        </div>
    </div>
</nav>
</body>
</html>
