<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/3/18
  Time: 12:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>招聘管理</title>
    <link href="/styles/bootstrap.min.css" rel="stylesheet">
    <script src="/scripts/jquery-3.0.0.js"></script>
    <script src="/scripts/bootstrap.min.js"></script>
    <script>
       function selectDepartment() {
           $.ajax({
             type:"post",
             url:"/admin/selectJob.do",
             data:"departmentName=" + $("#department").val(),
             success:function (msg) {
                 var arr = eval(msg);
                 if(arr.length != 0){
                     var c= "<select name='job' id='job' class='form-control' >";
                        c += "<option value=''>选择职位</option>"
                        for(var i=0; i<arr.length; i++){
                            var job = arr[i].jobName;
                         c += "<option value='"+job+"'>"+ job + "</option>";

                        }
                        $("#content").html(c);
                 }
             }

           })
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
<nav class="navbar navbar-default" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">招聘管理</a>
        </div>
        <div>
            <a class="navbar-text navbar-right" href="/admin/recruitmentView.view">历史招聘记录</a>
        </div>
    </div>
</nav>
<div class="container">
    <div class="row">
        <div class="col-md-8">
            <form class="form-horizontal" name="form1" method="post" action="/admin/recruitment.do">
                <input type="hidden" name="adminId" value="${sessionScope.employee.id}">
                <div class="form-group">
                    <label class="control-label col-sm-2">公&nbsp;&nbsp;司：</label>
                    <div class="col-sm-5">
                        <input class="form-control" type="text" name="company" placeholder="请输入公司名" >
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">部&nbsp;&nbsp;门：</label>
                    <div class="col-sm-5">
                        <select id="department" name="department" class="form-control" onchange="selectDepartment()">
                            <option value="">请选择部门</option>
                            <c:forEach items="${sessionScope.departments}" var="department">
                                <option value="${department.departmentName}">${department.departmentName}</option>
                            </c:forEach>
                        </select>
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2"></label>
                    <div id="content" class="col-sm-5">

                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">招工量：</label>
                    <div class="col-sm-5">
                        <input class="form-control" type="text" name="jobNumber" placeholder="请输入招工数量" >
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">薪&nbsp;&nbsp;资：</label>
                    <div class="col-sm-5">
                        <input class="form-control" type="text" name="salary" placeholder="请输入薪资">
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">公司地址:</label>
                    <div class="col-sm-5">
                        <input class="form-control" type="text" name="companyAddress" placeholder="请输入公司地址">
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">工作描述：</label>
                    <div class="col-sm-5">
                        <textarea cols="40px" rows="5px" name="jobContent"></textarea>
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">公司详情：</label>
                    <div class="col-sm-5">
                        <textarea cols="40px" rows="5px" name="jobDetail"></textarea>
                    </div>
                </div>
                <div class="form-group">
                    <div class="div1 col-sm-offset-2">
                        <input class="btn btn-primary" type="submit" value="保存">
                    </div>
                    <div class="div1 col-sm-offset-1">
                        <button class="btn btn-primary">
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
