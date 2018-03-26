<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/3/16
  Time: 21:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>个人简历</title>
    <link href="/styles/bootstrap.min.css" rel="stylesheet">
    <script src="/scripts/jquery-3.0.0.js"></script>
    <script src="/scripts/bootstrap.min.js"></script>
    <script src="/scripts/address.js"></script>

    <style>
        .container{
            margin-top: 10%;
            margin-left: 20%;
        }
        a{
            color: white;
        }
    </style>
</head>
<body>

    <div class="container">
        <div class="row">
            <div class="col-md-11">
                <form class="form-horizontal" method="post" action="/customer/resume.do" >
                    <div class="form-group">
                        <input type="hidden" value="${sessionScope.customer.id}" name="customerId">
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2">姓&nbsp;&nbsp;名：</label>
                        <div class="col-sm-4">
                            <input type="text" class="form-control" name="realName">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2">身份证号：</label>
                        <div class="col-sm-4">
                            <input type="text" class="form-control" name="idCard">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2">民&nbsp;&nbsp;族：</label>
                        <div class="col-sm-4">
                            <input type="text" class="form-control" name="nation">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2">性&nbsp;&nbsp;别：</label>
                        <div class="col-sm-4">
                           <select name="sex" class="form-control">
                               <option value="性别">性别</option>
                               <option value="男">男</option>
                               <option value="女">女</option>
                           </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2">出生日期：</label>
                        <div class="col-sm-4">
                            <input type="text" class="form-control" name="birth">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label">详细地址：</label>
                        <select id="province" runat="server" name="province"></select>
                        <label class="control-label">省，直辖市</label>
                        <select id="city" runat="server" name="city"></select>
                        <label class="control-label">市</label>
                        <select id="country" runat="server" name="country"></select>
                        <label class="control-label">乡，县</label>
                        <script type="text/javascript">
                            setup();
                        </script>
                        <div>
                            <label class="control-label col-sm-2">街道</label>
                            <div class="col-sm-4">
                                <input class="form-control" type="text" name="street">
                            </div>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2">手机号：</label>
                        <div class="col-sm-4">
                            <input type="tel" class="form-control" name="phone">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2">邮&nbsp;&nbsp;箱：</label>
                        <div class="col-sm-4">
                            <input type="email" class="form-control" name="email">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2">毕业学校：</label>
                        <div class="col-sm-4">
                            <input type="text" class="form-control" name="graduation">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2">学&nbsp;&nbsp;历：</label>
                        <div class="col-sm-4">
                            <input type="text" class="form-control" name="education">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2">个人评价：</label>
                        <div class="col-sm-4">
                            <textarea rows="5" class="form-control" name="personalEvaluation"></textarea>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2">工作经验：</label>
                        <div class="col-sm-4">
                            <textarea rows="5" class="form-control" name="workExperience"></textarea>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="div1 col-sm-3 col-sm-offset-2">
                            <input class="btn btn-primary" type="submit" value="确认提交" onblur="addCustomerId()">
                        </div>
                        <div class="div1 col-sm-3 col-sm-offset-2">
                        <button type="submit" class="btn btn-primary">
                            <a href="/customer/customerView2.view">返回</a>
                        </button>
                        </div>
                    </div>
                </form>
            </div>

        </div>
    </div>

</body>
</html>
