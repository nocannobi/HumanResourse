<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/3/19
  Time: 17:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>培训管理</title>
    <link href="/styles/bootstrap.min.css" rel="stylesheet">
    <script src="/scripts/jquery-3.0.0.js"></script>
    <script src="/scripts/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-default" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">培训管理</a>
        </div>
        <div>
            <a class="navbar-text navbar-right" href="/admin/trainingRecord.view">培训记录</a>
        </div>
    </div>
</nav>
<div class="container">
    <div class="row">
        <div class="col-md-8">
            <form class="form-horizontal" method="post" action="/admin/addTraining.do">
                <div class="form-group">
                    <label class="control-label col-sm-2">培训名称：</label>
                    <div class="col-sm-5">
                        <input class="form-control" type="text" name="trainingName" placeholder="请输入培训名称" >
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">培训时间：</label>
                    <div class="col-sm-5">
                        <input class="form-control" type="text" name="trainingTime" placeholder="请输入培训时间">
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">培训地点：</label>
                    <div class="col-sm-5">
                        <input class="form-control" type="text" name="trainingLocation" placeholder="请输入培训地点" >
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">培训内容：</label>
                    <div class="col-sm-4">
                        <textarea rows="5" class="form-control" name="trainingContent"></textarea>
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
