<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/3/26
  Time: 21:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>个人信息</title>
    <link href="/styles/bootstrap.min.css" rel="stylesheet">
    <script src="/scripts/jquery-3.0.0.js"></script>
    <script src="/scripts/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <div class="row">
        <form class="form-horizontal">
            <div class="form-group">
                <label class="control-label col-sm-2">员工编号：</label>
                <div class="col-sm-4">
                    ${sessionScope.employeeDetail.employeeId}
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-2">姓&nbsp;&nbsp;名:</label>
                <div class="col-sm-4">
                    ${sessionScope.employeeDetail.employeeRealName}
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-2">头&nbsp;&nbsp;像:</label>
                <div class="col-sm-4">
                    ${sessionScope.employeeDetail.employeeHeadImage}
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-2">年&nbsp;&nbsp;龄:</label>
                <div class="col-sm-4">
                    ${sessionScope.employeeDetail.employeeAge}
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-2">性&nbsp;&nbsp;别：</label>
                <div class="col-sm-4">
                    ${sessionScope.employeeDetail.employeeSex}
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-2">身份证:</label>
                <div class="col-sm-4">
                    ${sessionScope.employeeDetail.employeeIdCard}
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-2">邮&nbsp;&nbsp;箱:</label>
                <div class="col-sm-4">
                    ${sessionScope.employeeDetail.employeeEmail}
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-2">手&nbsp;&nbsp;机:</label>
                <div class="col-sm-4">
                    ${sessionScope.employeeDetail.employeePhone}
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-2">地&nbsp;&nbsp;址:</label>
                <div class="col-sm-4">
                    ${sessionScope.employeeDetail.employeeAddress}
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-2">部&nbsp;&nbsp;门：</label>
                <div class="col-sm-4">
                    ${sessionScope.employeeDetail.employeeDepartment}
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-2"></label>
                <div class="col-sm-4">
                    ${sessionScope.employeeDetail.employeeJob}
                </div>
            </div>
            <div class="form-group">
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
</body>
</html>
