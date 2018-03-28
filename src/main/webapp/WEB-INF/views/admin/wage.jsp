<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/3/25
  Time: 20:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>工资管理</title>
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
            <a class="navbar-brand" href="#">工资管理</a>
        </div>
        <div>
            <a class="navbar-text navbar-right" href="/admin/wageView.view">历史工资记录</a>
        </div>
    </div>
</nav>
<div class="container">
    <div class="row">
        <div class="col-md-11">
            <form class="form-horizontal" method="post" action="/admin/addWage.do" >
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
                    <label class="control-label col-sm-2">社保金额：</label>
                    <div class="col-sm-4">
                        <input type="text" class="form-control" name="socialInsurance">
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">其他金额：</label>
                    <div class="col-sm-4">
                        <input type="text" class="form-control" name="socialInsurance">
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">总金额：</label>
                    <div class="col-sm-4">
                        <input type="text" class="form-control" name="rewardPunishment">
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">是否发放：</label>
                    <div class="col-sm-4">
                        <select name="isGive" class="form-control">
                            <option value="是否发放">是否发放</option>
                            <option value="1">是</option>
                            <option value="0">否</option>
                        </select>
                    </div>
                </div>


                <div class="form-group">
                    <div class="div1 col-sm-3 col-sm-offset-2">
                        <input class="btn btn-primary" type="submit" value="确认提交" onblur="addCustomerId()">
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
