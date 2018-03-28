<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/3/27
  Time: 13:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>职位详情</title>
    <link href="/styles/bootstrap.min.css" rel="stylesheet">
    <script src="/scripts/jquery-3.0.0.js"></script>
    <script src="/scripts/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <div class="row">
        <form class="form-horizontal" method="post" action="">
            <div class="form-group">
                <label class="control-label col-sm-2">公司名：</label>
                <div class="col-sm-4">
                    ${sessionScope.recruitment.company}
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-2">职位名称:</label>
                <div class="col-sm-4">
                    ${sessionScope.recruitment.job}
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-2">招工数量:</label>
                <div class="col-sm-4">
                    ${sessionScope.recruitment.jobNumber}
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-2">薪资:</label>
                <div class="col-sm-4">
                    ${sessionScope.recruitment.salary}
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-2">职位描述：</label>
                <div class="col-sm-4">
                    ${sessionScope.recruitment.jobContent}
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-2">公司详情:</label>
                <div class="col-sm-4">
                    ${sessionScope.recruitment.companyDetail}
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-2">公司地址:</label>
                <div class="col-sm-4">
                    ${sessionScope.recruitment.companyAddress}
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-2">发布时间:</label>
                <div class="col-sm-4">
                    ${sessionScope.recruitment.recruitmentCreateTime}
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-3 col-sm-offset-1">
                    <button type="submit">
                        <a href="/admin/recruitmentView.view">返回</a>
                    </button>
                </div>
            </div>
        </form>
    </div>
</div>
</body>
</html>
