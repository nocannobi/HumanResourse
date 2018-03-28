<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/3/26
  Time: 22:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>发送消息</title>
    <link href="/styles/bootstrap.min.css" rel="stylesheet">
    <script src="/scripts/jquery-3.0.0.js"></script>
    <script src="/scripts/bootstrap.min.js"></script>
    <script>
        function selectType() {
            $.ajax({
                type:"post",
                url:"/admin/selectPeople.do",
                data:"people=" + $("#people").val(),
                success:function (msg) {
                    var arr = eval(msg);
                    if(arr.length != 0){
                        var c= "<select name='id' id='id' class='form-control' onchange='selectEmployee()' >";
                        c += "<option value=''>收件人id</option>"
                        for(var i=0; i<arr.length; i++){
                            var id = arr[i].id;
                            c += "<option value='"+id+"'>"+ id + "</option>";

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
<div class="container">
    <div class="row">
        <div class="col-md-8">
            <form class="form-horizontal" method="post" action="/admin/addMessage1.do">
                <div class="form-group">
                    <h3>我的申请</h3>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">收件人：</label>
                    <div class="col-sm-4">
                        <select id="people" name="people" class="form-control" onchange="selectType()">
                            <option value="customer">游客</option>
                            <option value="employee">员工</option>
                        </select>
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2"></label>
                    <div id="content" class="col-sm-4">

                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">申请主题：</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="text" name="messageTheme" placeholder="请输入申请主题" >
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">申请内容：</label>
                    <div class="col-sm-4">
                        <textarea rows="5" class="form-control" name="messageContent"></textarea>
                    </div>
                </div>

                <div class="form-group">
                    <div class="div1 col-sm-offset-2">
                        <input class="btn btn-primary" type="submit" value="确认发送">
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
