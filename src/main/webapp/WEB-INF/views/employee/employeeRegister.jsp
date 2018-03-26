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
    <link href="/styles/bootstrap.min.css" rel="stylesheet">
    <script src="/scripts/jquery-3.0.0.js"></script>
    <script src="/scripts/bootstrap.min.js"></script>
    <script>

        var checkEmployeeName;

        function checkName(value) {
            if(checkName2(value)){
               $.ajax({
                   type:"get",
                   url:"/employee/checkEmployeeName.do",
                   data:"employeeName="+ $("#employeeName").val,
                   success:function (msg) {
                       if(msg.trim() == "is_exit"){
                           $("#checkName").html("用户名已存在").css("color","red");
                           checkEmployeeName = false;
                       }else{
                           checkEmployeeName = true;
                       }
                   }
               })
                return checkEmployeeName;
            }
        }

        function checkName2(value) {
            var reg = /^[a-z0-9_-]{3,16}$/;
            if(value == ""){
                $("#checkName").html("用户名不能为空").css("color","red");
                return false;
            }else if(!reg.test(value)){
                $("#checkName").html("用户名不符合规则，请重新输入").css("color","red");
                return false;
            }else{
                $("#checkName").html("");
                return true;
            }
        }

        function checkEmployeePassword(value) {
            var reg = /^[a-z0-9_-]{6,18}$/;
            if(value == ""){
                $("#checkPassword").html("密码不能为空").css("color","red");
                return false;
            }else if(!reg.test(value)){
                $("#checkPassword").html("密码只能为6-18位，请重新输入").css("color","red");
                return false;
            }else{
                $("#checkPassword").html("");
                return true;
            }

        }

        function checkSecondPassword(value) {
            var reg = /^[a-z0-9_-]{6,18}$/;
            if(value == ""){
                $("#checkSecondPassword").html("密码不能为空").css("color","red");
                return false;
            }else if(value != $("#employeePassword").val()) {
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

        function checkEmployee() {
            if(checkName($("#employeeName").val()) && checkEmployeePassword($("#employeePassword").val())
            && checkSecondPassword($("#SecondPassword").val())){
                return true;
            }else{
                alert("注册失败");
                return false;
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
            <form method="post" class="form-horizontal"  action="/employee/employeeRegister.do" onsubmit="return checkEmployee()">
                <div class="form-group">
                    <h3>员工注册</h3>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">用户名：</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="text" id="employeeName" name="employeeName" placeholder="请输入用户名" onblur="checkName(this.value)" >
                    </div>
                    <span id="checkName"></span>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">密&nbsp;&nbsp;码&nbsp;：</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="password" id="employeePassword" name="employeePassword" placeholder="请输入密码" onblur="checkEmployeePassword(this.value)">
                    </div>
                    <span id="checkPassword"></span>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">确认密码：</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="password" id="SecondPassword" name="SecondPassword" placeholder="请输入密码" onblur="checkSecondPassword(this.value)">
                    </div>
                    <span id="checkSecondPassword"></span>
                </div>
                <div class="form-group">
                    <div class="div1 col-sm-offset-2">
                        <input class="btn btn-primary" type="submit" value="注册">
                    </div>
                    <div class="div1 col-sm-offset-1">
                        <button class="btn btn-primary">
                            <a href="employee/employeeLogin.view">返回</a>
                        </button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
