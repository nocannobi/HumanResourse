<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

    <script>

        var checkPhone;
        var checkName;
        var checkEmail;

        $(document).ready(function () {
            if(${requestScope.info eq null}){
                $("#alert").hide();
            }else{
                $("#alert").show();
                var alertId = document.getElementById("alert");
                hideAlert(alertId);
            }
        })



        function checkCustomerName(value) {
            if(checkCustomerName2(value)){
                $.ajax({
                    type:"get",
                    url:"/customer/checkName.do",
                    data:"customerName="+$("#customerName").val(),
                    success:function (msg) {
                        if(msg.trim() == "is_exit"){
                            $("#checkCustomerName").html("用户名已存在").css("color","red");
                            checkName = false;
                        }else{
                           $("#checkCustomerName").html("");
                            checkName = true;
                        }
                    }
                })
                return checkName;
            }
        }

        function checkCustomerPhone(value) {
            if(checkCustomerPhone2(value)){
                $.ajax({
                    type:"get",
                    url:"/customer/checkPhone.do",
                    data:"customerPhone=" + $("#customerPhone").val(),

                    success:function (msg) {
                       if(msg.trim() == "is_exit"){
                           $("#checkCustomerPhone").html("手机号已存在").css("color","red");
                           checkPhone = false;
                       } else {
                           $("#checkCustomerPhone").html("");
                           checkPhone = true;
                       }
                    }
                })
                return checkPhone;
            }
        }

        function checkCustomerEmail(value) {
            if(checkCustomerEmail2(value)){
               $.ajax({
                   type:"get",
                   url:"/customer/checkEmail.do",
                   data:"customerEmail="+$("#customerEmail").val(),
                   success:function (msg) {
                       if(msg.trim() == "is_exit"){
                           $("#checkCustomerEmail").html("邮箱已存在").css("color","red");
                            checkEmail = false;
                       }else {
                           $("#checkCustomerEmail").html("");
                           checkEmail = true;
                       }
                   }
               })
                return checkEmail;
            }
        }

        function checkCustomerName2(value) {
            var reg = /^[a-z0-9_-]{3,16}$/;
            if(value == ""){
                $("#checkCustomerName").html("用户名不能为空").css("color","red");
                return false;
            }else if(!reg.test(value)){
                $("#checkCustomerName").html("用户名不符合规则，请重新输入").css("color","red");
                return false;
            }else{
                $("#checkCustomerName").html("");
                return true;
            }
        }

        function checkCustomerPassword(value) {
            var reg = /^[a-z0-9_-]{6,18}$/;
            if(value == ""){
                $("#checkCustomerPassword").html("密码不能为空").css("color","red");
                return false;
            }else if(!reg.test(value)){
                $("#checkCustomerPassword").html("密码只能为6-18位，请重新输入").css("color","red");
                return false;
            }else{
                $("#checkCustomerPassword").html("");
                return true;
            }

        }

        function checkSecondPassword(value) {
            var reg = /^[a-z0-9_-]{6,18}$/;
            if(value == ""){
                $("#checkSecondPassword").html("密码不能为空").css("color","red");
                return false;
            }else if(value != $("#customerPassword").val()) {
                $("#checkSecondPassword").html("密码不相等，请重新输入").css("color", "red");
                return false;
            }else if(!reg.test(value)){
                $("#checkSecondPassword").html("密码只能为6-18位，请重新输入").css("color","red");
                return false;
            }else {
                $("#checkSecondPassword").html("");
                return true;
            }
        }

        function checkCustomerEmail2(value) {
            var reg = /^([a-z0-9_\.-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$/;
            if (value == "") {
                $("#checkCustomerEmail").html("邮箱不能为空").css("color", "red");
                return false;
            } else if (!reg.test(value)) {
                $("#checkCustomerEmail").html("邮箱不符合规则，请重新输入").css("color", "red");
                return false;
            } else {
                $("#checkCustomerEmail").html("");
                return true;
            }
        }

        function checkCustomerPhone2(value) {
            var reg = /^((1[3,5,8][0-9])|(14[5,7])|(17[0,6,7,8])|(19[7]))\d{8}$/;
            if(value == ""){
                $("#checkCustomerPhone").html("手机号不能为空").css("color","red");
                return false;
            }else if(!reg.test(value)) {
                $("#checkCustomerPhone").html("手机号不符合规则，请重新输入").css("color","red");
                return false;
            }else{
                $("#checkCustomerPhone").html("");
                return true;
            }
        }

        function checkRegister() {
            if(checkCustomerName2($("#customerName").val()) && checkCustomerEmail2($("#customerEmail").val())
                && checkCustomerPhone2($("#customerPhone").val())){
                if(checkCustomerName($("#customerName").val()) && checkCustomerPassword($("#customerPassword").val())
                    && checkSecondPassword($("#customerSecondPassword").val()) && checkCustomerEmail($("#customerEmail").val())
                    && checkCustomerPhone($("#customerPhone").val())){
                    return true;
                }else{
                    alert("注册失败");
                    return false;
                }
            }
        }

    </script>

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
            <form class="form-horizontal" action="/customer/customerRegister.do" onsubmit="return checkRegister()">
                <div id="alert">
                    <c:out value="${requestScope.info}"></c:out>
                </div>
                <div class="form-group">
                    <h3>用户注册</h3>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">用户名：</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="text" id="customerName" name="customerName" placeholder="请输入用户名" onblur="checkCustomerName(this.value)" >
                    </div>
                    <span id="checkCustomerName"></span>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">密&nbsp;&nbsp;码&nbsp;：</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="password" id="customerPassword" name="customerPassword" placeholder="请输入密码" onblur="checkCustomerPassword(this.value)">
                    </div>
                    <span id="checkCustomerPassword"></span>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">确认密码：</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="password" id="customerSecondPassword" name="customerSecondPassword" placeholder="请输入密码" onblur="checkSecondPassword(this.value)">
                    </div>
                    <span id="checkSecondPassword"></span>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">邮&nbsp;&nbsp;箱&nbsp;：</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="email" id="customerEmail" name="customerEmail" placeholder="请输入邮箱" onblur="checkCustomerEmail(this.value)">
                    </div>
                    <span id="checkCustomerEmail"></span>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">手机号：</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="tel" id="customerPhone" name="customerPhone" placeholder="请输入手机" onblur="checkCustomerPhone(this.value)">
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
