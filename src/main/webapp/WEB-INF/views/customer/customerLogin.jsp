<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/3/14
  Time: 11:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>游客登录</title>
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
                    <form class="form-horizontal" action="/customer/customerLogin.do">
                        <div class="form-group">
                            <h3>用户登录</h3>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2">用户名:</label>
                            <div class="col-sm-4">
                                <input class="form-control" type="text" name="customerName" >
                            </div>
                            <span id="checkCustomerName"></span>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2">密&nbsp;&nbsp;码&nbsp;:</label>
                            <div class="col-sm-4">
                                <input class="form-control col-sm-4" type="password" name="customerPassword" >
                            </div>
                            <span id="checkCustomerPassword"></span>
                        </div>
                        <div class="form-group">
                            <div class="div1  col-sm-offset-2">
                                <button class="btn btn-primary">
                                    <a class="a" href="/customer/customerRegister.view">注册</a>
                                </button>
                            </div>
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
