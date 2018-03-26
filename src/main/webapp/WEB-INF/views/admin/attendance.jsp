<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/3/23
  Time: 19:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>考勤记录</title>
    <link href="/styles/bootstrap.min.css" rel="stylesheet">
    <script src="/scripts/jquery-3.0.0.js"></script>
    <script src="/scripts/bootstrap.min.js"></script>
</head>
<body>
<table cellpadding="0" cellspacing="0">
    <thead>
    <tr>
        <th>序号</th>
        <th>员工编号</th>
        <th>上班打卡时间</th>
        <th>下班打卡时间</th>
        <th>打卡状态</th>
        <th>打卡日期</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${sessionScope.attendances}" varStatus="status" var="attendance">
        <tr>
            <td width="5%">${status.count}</td>
            <td width="10%">${attendance.employeeId}</td>
            <td width="10%">${attendance.punchWorkTime}</td>
            <td width="10%">${attendance.punchOffTime}</td>
            <td width="10%">${attendance.employeeState}</td>
            <td width="10%">${attendance.attendanceCreateTime}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<div  class="form-group">
    <div class="div1  col-sm-offset-1">
        <button class="btn btn-primary">
            <a class="a" href="/employee/employeeView.view">返回</a>
        </button>
    </div>
</div>

</body>
</html>
