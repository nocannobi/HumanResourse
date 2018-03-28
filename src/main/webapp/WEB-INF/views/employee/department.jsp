<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/3/27
  Time: 15:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>部门查看</title>
    <link href="/styles/bootstrap.min.css" rel="stylesheet">
    <script src="/scripts/jquery-3.0.0.js"></script>
    <script src="/scripts/bootstrap.min.js"></script>
    <script>
        function selectEmployee() {
            $.ajax({
                type:"post",
                url:"/admin/selectEmployee.do",
                data:"jobName=" + $("#job").val(),
                success:function (msg) {
                    var arr = eval(msg);
                    if(arr.length != 0){
                        var d= "<select name='employeeId' id='employeeId' class='form-control' onchange='selectEmployee()' >";
                        d += "<option value=''>部门员工</option>"
                        for(var i=0; i<arr.length; i++){
                            var employeeId = arr[i].id;
                            d += "<option value='"+employeeId+"'>"+ employeeId + "</option>";

                        }
                        $("#content1").html(d);
                    }
                }
            })

        }

        function selectDepartment() {
            $.ajax({
                type:"post",
                url:"/admin/selectJob.do",
                data:"departmentName=" + $("#department").val(),
                success:function (msg) {
                    var arr = eval(msg);
                    if(arr.length != 0){
                        var c= "<select name='job' id='job' class='form-control' onchange='selectEmployee()' >";
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
</head>
<body>
<div class="container">
    <div class="row">
        <div class="form-group">
            <label class="control-label col-sm-2">部&nbsp;&nbsp;门：</label>
            <div class="col-sm-4">
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
            <div id="content" class="col-sm-4">

            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2"></label>
            <div id="content1" class="col-sm-4">

            </div>
        </div>
    </div>
</div>
<div class="div1  col-sm-offset-2">
    <button class="btn btn-primary">
        <a class="a" href="/employee/employeeView.view">返回</a>
    </button>
</div>
</body>
</body>
</html>
