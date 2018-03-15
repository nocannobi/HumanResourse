<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/3/15
  Time: 22:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工注册</title>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-8">
            <form class="form-horizontal" action="/customer/customerRegister.do">
                <div class="form-group">
                    <h3>员工注册</h3>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">用户名：</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="text" name="employeeName" placeholder="请输入用户名" >
                    </div>
                    <span id="checkEmployeeName"></span>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">密&nbsp;&nbsp;码&nbsp;：</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="password" name="employeePassword" placeholder="请输入密码">
                    </div>
                    <span id="checkEmployeePassword"></span>
                </div>
                <div class="form-group">
                    <div class="div1 col-sm-offset-2">
                        <input class="btn btn-primary" type="submit" value="注册">
                    </div>
                    <div class="div1 col-sm-offset-1">
                        <button class="btn btn-primary">
                            <a href="/customer/customerLogin.view">返回</a>
                        </button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
