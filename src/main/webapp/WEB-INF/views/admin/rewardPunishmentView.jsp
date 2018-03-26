<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/3/26
  Time: 22:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>奖惩记录</title>
    <style>
        #table table {
            width: 100%;
            font-size: 14px;
            border: 1px solid #eee
        }

        #table {
            padding: 0 10px;
        }

        table thead th {
            background: #f5f5f5;
            padding: 10px;
            text-align: left;
        }

        table tbody td {
            padding: 10px;
            text-align: left;
            border-bottom: 1px solid #eee;
            border-right: 1px solid #eee;
        }

        table tbody td span {
            margin: 0 10px;
            cursor: pointer;
        }

        #table1 table {
            width: 100%;
            font-size: 14px;
            border: 1px solid #eee
        }

        #table1 {
            padding: 0 10px;
        }



        .delete {
            color: red;
        }

        .edit {
            color: #008cd5;
        }

        .add {
            border: 1px solid #eee;
            margin: 10px 0;
            padding: 15px;
        }

        input {
            border: 1px solid #ccc;
            padding: 5px;
            border-radius: 3px;
            margin-right: 15px;
        }

        button {
            background: #008cd5;
            border: 0;
            padding: 4px 15px;
            border-radius: 3px;
            color: #fff;
        }

        #mask {
            background: rgba(0, 0, 0, .5);
            width: 100%;
            height: 100%;
            position: fixed;
            z-index: 4;
            top: 0;
            left: 0;
        }

        .mask {
            width: 300px;
            height: 250px;
            background: rgba(255, 255, 255, 1);
            position: absolute;
            left: 0;
            top: 0;
            right: 0;
            bottom: 0;
            margin: auto;
            z-index: 47;
            border-radius: 5px;
        }

        .title {
            padding: 10px;
            border-bottom: 1px solid #eee;
        }

        .title span {
            float: right;
            cursor: pointer;
        }

        .content {
            padding: 10px;
        }

        .content input {
            width: 270px;
            margin-bottom: 15px;
        }
    </style>
</head>
<body>
<table cellpadding="0" cellspacing="0">
    <thead>
    <tr>
        <th>序号</th>
        <th>员工编号</th>
        <th>奖惩主题</th>
        <th>奖惩金额</th>
        <th>奖or罚</th>
        <th>奖惩时间</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${sessionScope.rewardPunishments}" varStatus="status" var="reward">
        <tr>
            <td width="5%">${status.count}</td>
            <td width="10%">${reward.employeeId}</td>
            <td width="10%">${reward.rewardPunishmentContent}</td>
            <td width="10%">${reward.rewardPunishmentConn}</td>
            <td width="10%">${reward.isRewardPunishment}</td>
            <td width="10%">${reward.createTime}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<div class="form-group">
    <div class="col-sm-3 col-sm-offset-1">
        <button type="submit">
            <a href="/admin/reward.view">返回</a>
        </button>
    </div>
</div>
</body>
</html>
