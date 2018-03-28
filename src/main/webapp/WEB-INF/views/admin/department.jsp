<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/3/19
  Time: 22:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>部门添加</title>
    <link href="/styles/bootstrap.min.css" rel="stylesheet">
    <script src="/scripts/jquery-3.0.0.js"></script>
    <script src="/scripts/bootstrap.min.js"></script>

    <style>

        .a{
            color: white;
        }

        .container{
            margin-top: 10%;
            margin-left: 50%;
        }

        h3{
            margin-left: 22%;
        }

        .div1{
            float: left;
        }
    </style>
</head>
<body>
<nav class="navbar navbar-default" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">部门管理</a>
        </div>
        <div>
            <a class="navbar-text navbar-right" href="/admin/departmentDetail.view">查看部门信息</a>
        </div>
    </div>
</nav>
<div class="container">
    <div class="row">
        <div class="col-md-8">
            <form class="form-horizontal" method="post" action="/admin/department.do">
                <div class="form-group">
                    <label class="control-label col-sm-2">部门名称:</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="text" name="departmentName" >
                    </div>
                    <span id="checkDepartmentName"></span>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">职位名称:</label>
                    <div class="col-sm-4">
                        <input class="form-control col-sm-4" type="text" name="jobName" >
                    </div>
                    <span id="checkJobName"></span>
                </div>
                <div class="form-group">
                    <div class="div1 col-sm-offset-1">
                        <input class="btn btn-primary" type="submit" value="保存">
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
<div class="div1  col-sm-offset-2">
    <button class="btn btn-primary">
        <a class="a" href="/admin/adminView.view">返回</a>
    </button>
</div>
</body>
</html>
