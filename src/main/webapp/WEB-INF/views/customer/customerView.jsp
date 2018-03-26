<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/3/15
  Time: 18:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户界面</title>
    <link href="/styles/bootstrap.min.css" rel="stylesheet">
    <script src="/scripts/jquery-3.0.0.js"></script>
    <script src="/scripts/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-default" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">首页</a>
        </div>
        <div>
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">职位搜索</a></li>
                <li class="active"><a href="#">投递信息</a></li>
                <li class="active"><a href="/customer/resumeView.view">查看简历</a></li>
                <li class="active"><a href="#">消息中心</a></li>
                <li class="dropdown">
                    <div class=""></div>
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        个人中心
                        <b class="caret"></b>
                    </a>
                    <ul class="dropdown-menu">
                        <li><a href="/customer/resume.view">修改简历</a></li>
                        <li class="divider"></li>
                        <li><a href="/customer/customerLogin.view">退出</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</nav>
</body>
</html>
