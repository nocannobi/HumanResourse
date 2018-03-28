<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/3/26
  Time: 22:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>奖惩管理</title>
    <link href="/styles/bootstrap.min.css" rel="stylesheet">
    <script src="/scripts/jquery-3.0.0.js"></script>
    <script src="/scripts/bootstrap.min.js"></script>
    <style>
        .container{
            margin-top: 10%;
            margin-left: 20%;
        }
        a{
            color: white;
        }
    </style>
</head>
<body>
<nav class="navbar navbar-default" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">奖惩管理</a>
        </div>
        <div>
            <a class="navbar-text navbar-right" href="/admin/rewardView.view">历史奖惩记录</a>
        </div>
    </div>
</nav>
<div class="container">
    <div class="row">
        <div class="col-md-11">
            <form class="form-horizontal" method="post" action="/admin/addReward.do" >
                <div class="form-group">
                    <label class="control-label col-sm-2">员工id：</label>
                    <div class="col-sm-4">
                        <select id="employeeId" name="employeeId" class="form-control">
                            <option value="">请选择员工编号</option>
                            <c:forEach items="${sessionScope.employees}" var="employee">
                                <option value="${employee.id}">${employee.id}</option>
                            </c:forEach>
                        </select>
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">奖惩内容：</label>
                    <div class="col-sm-4">
                        <input type="text" class="form-control" name="rewardPunishmentContent">
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">奖惩金额：</label>
                    <div class="col-sm-4">
                        <input type="number" class="form-control" name="rewardPunishmentConn">
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">奖or罚：</label>
                    <div class="col-sm-4">
                        <select name="isRewardPunishment" class="form-control">
                            <option value="奖or罚">奖or罚</option>
                            <option value="0">奖</option>
                            <option value="1">罚</option>
                        </select>
                    </div>
                </div>

                <div class="form-group">
                    <div class="div1 col-sm-3 col-sm-offset-2">
                        <input class="btn btn-primary" type="submit" value="确认提交">
                    </div>
                    <div class="div1 col-sm-3 col-sm-offset-2">
                        <button type="submit" class="btn btn-primary">
                            <a href="/admin/adminView.view">返回</a>
                        </button>
                    </div>
                </div>
            </form>
        </div>

    </div>
</div>
</body>
</html>
