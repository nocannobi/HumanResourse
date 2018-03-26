<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/3/23
  Time: 23:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查看简历</title>
    <link href="/styles/bootstrap.min.css" rel="stylesheet">
    <script src="/scripts/jquery-3.0.0.js"></script>
    <script src="/scripts/bootstrap.min.js"></script>
    <script src="/scripts/address.js"></script>

</head>
<body>
<div class="container">
    <div class="row">
        <div class="container">
            <div class="row">
                <div class="col-md-11">
                    <form class="form-horizontal">
                        <script>
                            ${sessionScope.resume.idCard}
                        </script>
                        <div class="form-group">
                            <label class="control-label col-sm-2">姓&nbsp;&nbsp;名：</label>
                            <div class="col-sm-4">
                                ${sessionScope.resume.realName}
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2">身份证号：</label>
                            <div class="col-sm-4">
                                ${sessionScope.resume.idCard}
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2">民&nbsp;&nbsp;族：</label>
                            <div class="col-sm-4">
                                ${sessionScope.resume.nation}
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2">性&nbsp;&nbsp;别：</label>
                            <div class="col-sm-4">
                                ${sessionScope.resume.sex}
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2">出生日期：</label>
                            <div class="col-sm-4">
                                ${sessionScope.resume.birth}
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2">地&nbsp;&nbsp;址：</label>
                                <div class="col-sm-4">
                                    ${sessionScope.resume.address}
                                </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2">手机号：</label>
                            <div class="col-sm-4">
                                ${sessionScope.resume.phone}
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2">邮&nbsp;&nbsp;箱：</label>
                            <div class="col-sm-4">
                                ${sessionScope.resume.email}
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2">毕业学校：</label>
                            <div class="col-sm-4">
                                ${sessionScope.resume.graduation}
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2">学&nbsp;&nbsp;历：</label>
                            <div class="col-sm-4">
                                ${sessionScope.resume.education}
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2">个人评价：</label>
                            <div class="col-sm-4">
                                ${sessionScope.resume.personalEvaluation}
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2">工作经验：</label>
                            <div class="col-sm-4">
                                ${sessionScope.resume.workExperience}
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="div1 col-sm-3 col-sm-offset-2">
                                <button type="submit" class="btn btn-primary">
                                    <a href="#">返回</a>
                                </button>
                            </div>
                        </div>
                    </form>
                </div>

            </div>
        </div>
    </div>
</div>
</body>
</html>
