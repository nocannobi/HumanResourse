<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/3/14
  Time: 11:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工登录</title>
    <link href="/styles/bootstrap.min.css" rel="stylesheet">
    <script src="/scripts/jquery-3.0.0.js"></script>
    <script src="/scripts/bootstrap.min.js"></script>
</head>
<body>
        <div class="container">
            <div class="row">
                <div class="col-md-8">
                    <form class="form-horizontal" action="/employee/employeeLogin.do" >
                        <div class="form-group">
                            <label class="control-label col-sm-2">用户名:</label>
                            <div class="col-sm-4">
                                <input class="form-control">
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
</body>
</html>
