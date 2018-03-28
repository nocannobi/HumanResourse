<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/3/25
  Time: 22:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工培训记录</title>
    <link href="/styles/bootstrap.min.css" rel="stylesheet">
    <script src="/scripts/jquery-3.0.0.js"></script>
    <script src="/scripts/bootstrap.min.js"></script>
    <style>
        #table table {
            width: 100%;
            font-size: 14px;
            border: 1px solid #eee
        }

        #table {
            padding: 0 10px;
        }

        table thead th {
            background: #f5f5f5;
            padding: 10px;
            text-align: left;
        }

        table tbody td {
            padding: 10px;
            text-align: left;
            border-bottom: 1px solid #eee;
            border-right: 1px solid #eee;
        }

        table tbody td span {
            margin: 0 10px;
            cursor: pointer;
        }

        .delete {
            color: red;
        }

        .edit {
            color: #008cd5;
        }

        .add {
            border: 1px solid #eee;
            margin: 10px 0;
            padding: 15px;
        }

        input {
            border: 1px solid #ccc;
            padding: 5px;
            border-radius: 3px;
            margin-right: 15px;
        }

        button {
            background: #008cd5;
            border: 0;
            padding: 4px 15px;
            border-radius: 3px;
            color: #fff;
        }

        #mask {
            background: rgba(0, 0, 0, .5);
            width: 100%;
            height: 100%;
            position: fixed;
            z-index: 4;
            top: 0;
            left: 0;
        }

        .mask {
            width: 300px;
            height: 250px;
            background: rgba(255, 255, 255, 1);
            position: absolute;
            left: 0;
            top: 0;
            right: 0;
            bottom: 0;
            margin: auto;
            z-index: 47;
            border-radius: 5px;
        }

        .title {
            padding: 10px;
            border-bottom: 1px solid #eee;
        }

        .title span {
            float: right;
            cursor: pointer;
        }

        .content {
            padding: 10px;
        }

        .content input {
            width: 270px;
            margin-bottom: 15px;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="row">
        <form method="post" action="/admin/addEmployee.do">
            <div class="col-md-8"></div>
            <div class="form-group">
                <label class="control-label col-sm-2">培训名称：</label>
                <div class="col-sm-5">
                    <select id="trainingName" name="trainingName" class="form-control" >
                        <option value="">请选择培训名称</option>
                        <c:forEach items="${sessionScope.trainings}" var="training">
                            <option value="${training.trainingName}">${training.trainingName}</option>
                        </c:forEach>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-2">增加员工：</label>
                <div class="col-sm-5">
                    <select id="employeeId" name="employeeId" class="form-control" >
                        <option value="">请选择员工</option>
                        <c:forEach items="${sessionScope.employeeDetail}" var="employee">
                            <option value="${employee.id}">${employee.id}</option>
                        </c:forEach>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <div class="div1 col-sm-offset-2">
                    <input class="btn btn-primary" type="submit" value="保存">
                </div>
                <div class="div1 col-sm-offset-1">
                    <button class="btn btn-primary">
                        <a href="/admin/trainingRecord.view">返回</a>
                    </button>
                </div>
            </div>
        </form>
    </div>
</div>
</body>
</html>
