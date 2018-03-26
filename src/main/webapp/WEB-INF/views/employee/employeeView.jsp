<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/3/15
  Time: 22:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工界面</title>
    <link href="/styles/bootstrap.min.css" rel="stylesheet">
    <script src="/scripts/jquery-3.0.0.js"></script>
    <script src="/scripts/bootstrap.min.js"></script>
    <script>

    </script>
</head>
<body>
<nav class="navbar navbar-default" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">首页</a>
        </div>
        <div>
            <ul class="nav navbar-nav">
                <li class="active"><a href="/employee/attendance.view">考勤打卡</a></li>
                <li class="active"><a href="/employee/detailView.view">个人信息</a></li>
                <li class="active"><a href="/employee/recordView.view">培训记录</a></li>
                <li class="active"><a href="#">部门信息</a></li>
                <li class="active"><a href="/employee/rewardView.view">奖惩记录</a></li>
                <li class="active"><a href="/employee/wageView.view">薪资记录</a></li>
                <li class="active">
                    <a href="#">消息记录</a>
                    <span id="getMessage"></span>
                </li>
                <li class="active"><a href="/employee/send.view">我要申请</a></li>
                <li class="active"><a href="#">退出</a></li>

            </ul>
        </div>
    </div>
</nav>
<div class="container">
    <div class="row">
        <form class="form-horizontal">
            <div class="form-group" id="on_work">
                <button class="btn bg-primary" type="submit" onclick="addWorkTime()">上班打卡</button>
            </div>
            <div class="form-group" id="off_work">
                <input class="hidden" type="time" name="offTime" value="offTime">
                <button class="btn bg-primary" type="submit">下班打卡</button>
            </div>
        </form>
    </div>
</div>
</body>
</html>
