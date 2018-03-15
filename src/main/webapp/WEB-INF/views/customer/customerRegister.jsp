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
    <title>游客注册</title>
    <link href="/styles/bootstrap.min.css" rel="stylesheet">
    <script src="/scripts/jquery-3.0.0.js"></script>
    <script src="/scripts/bootstrap.min.js"></script>
    <style>
        .container{
            margin-top: 5%;
            margin-left: 10%;
        }
        .div1{
            float: left;
        }
        a{
            color: white;
        }
        h3{
            margin-left: 20%;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-8">
            <form class="form-horizontal" action="/customer/customerRegister.do">
                <div class="form-group">
                    <h3>用户注册</h3>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">用户名：</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="text" name="customerName" placeholder="请输入用户名" >
                    </div>
                    <span id="checkCustomerName"></span>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">密&nbsp;&nbsp;码&nbsp;：</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="password" name="customerPassword" placeholder="请输入密码">
                    </div>
                    <span id="checkCustomerPassword"></span>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">邮&nbsp;&nbsp;箱&nbsp;：</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="email" name="customerEmail" placeholder="请输入邮箱" >
                    </div>
                    <span id="checkCustomerEmail"></span>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">手机号：</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="tel" name="customerPhone" placeholder="请输入手机">
                    </div>
                    <span id="checkCustomerPhone"></span>
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
