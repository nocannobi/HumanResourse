<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/3/17
  Time: 19:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员登录</title>
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
<div class="container">
    <div class="row">
        <div class="col-md-8">
            <form class="form-horizontal" method="post" action="/admin/adminLogin.do">
                <div class="form-group">
                    <h3>管理员登录</h3>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">用户名:</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="text" name="employeeName" >
                    </div>
                    <span id="checkEmployeeName"></span>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">密&nbsp;&nbsp;码&nbsp;:</label>
                    <div class="col-sm-4">
                        <input class="form-control col-sm-4" type="password" name="employeePassword" >
                    </div>
                    <span id="checkEmployeePassword"></span>
                </div>
                <div class="form-group">
                    <div class="div1 col-sm-offset-1">
                        <input class="btn btn-primary" type="submit" value="登录">
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
