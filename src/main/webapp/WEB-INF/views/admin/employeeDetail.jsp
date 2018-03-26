<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/3/17
  Time: 9:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工信息</title>
    <link href="/styles/bootstrap.min.css" rel="stylesheet">
    <script src="/scripts/jquery-3.0.0.js"></script>
    <script src="/scripts/bootstrap.min.js"></script>
    <script>
        function selectDepartment() {
            $.ajax({
                type:"post",
                url:"/admin/selectJob.do",
                data:"departmentId=" + $("#department").val(),
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
</head>
<body>
    <div class="container">
        <div class="row">
            <form class="form-horizontal" action="/admin/update.do">
                <div class="form-group">
                    <label class="control-label col-sm-2">员工编号：</label>
                    <div class="col-sm-4">
                        <select id="employeeId" name="employeeId" class="form-control" onchange="selectDepartment()">
                            <option value="">请选择员工编号</option>
                            <c:forEach items="${sessionScope.employees}" var="employee">
                                <option value="${employee.id}">${employee.id}</option>
                            </c:forEach>
                        </select>
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">姓&nbsp;&nbsp;名:</label>
                    <div class="col-sm-4">
                        <input class="form-control" name="employeeRealName">
                    </div>
                    <span id="checkRealName"></span>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">头&nbsp;&nbsp;像:</label>
                    <div class="col-sm-4">
                        <input class="form-control" name="headImage">
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">年&nbsp;&nbsp;龄:</label>
                    <div class="col-sm-4">
                        <input class="form-control" name="employeeAge">
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">性&nbsp;&nbsp;别：</label>
                    <div class="col-sm-4">
                        <select name="employeeSex" class="form-control">
                            <option value="性别">性别</option>
                            <option value="男">男</option>
                            <option value="女">女</option>
                        </select>
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">身份证:</label>
                    <div class="col-sm-4">
                        <input class="form-control" name="employeeIdCard">
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">邮&nbsp;&nbsp;箱:</label>
                    <div class="col-sm-4">
                        <input class="form-control" name="employeeEmail">
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">手&nbsp;&nbsp;机:</label>
                    <div class="col-sm-4">
                        <input class="form-control" name="employeePhone">
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">地&nbsp;&nbsp;址:</label>
                    <div class="col-sm-4">
                        <input class="form-control" name="employeeAddress">
                    </div>
                </div>
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
                    <div id="content" class="col-sm-5">

                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-3 col-sm-offset-2">
                       <input class="btn btn-primary" type="submit" value="保存">
                    </div>
                    <div class="col-sm-3 col-sm-offset-1">
                        <button type="submit">
                            <a href="/employee/employeeView.view">返回</a>
                        </button>
                    </div>

                </div>
            </form>
        </div>
    </div>
</body>
</html>
