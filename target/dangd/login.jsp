<%--
  Created by IntelliJ IDEA.
  User: 12209
  Date: 2020/9/14
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/login.css">
    <script src="js/jquery-3.3.1.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</head>
<body>
<form action="login" method="get" id="form">
    <table>
        <thead>
        <tr>
            <th>
                <a href="registered.jsp">立即注册</a>
                <h5>密码登录

                </h5>
            </th>

        </tr>
        </thead>
        <tbody>
        <tr>
            <td>
                <label>用户：</label>
                <input type="text" placeholder="邮箱/昵称/手机号码" name="username" class="seat" id="yonghu"
                       onfocus="this.placeholder=''" onblur="this.placeholder='邮箱/昵称/手机号码'">
                <div id="yong">请输入正确格式的号码</div>
            </td>
        </tr>
        <tr>
            <td>
                <label>密码：</label>
                <input type="password" placeholder="密码" name="password" class="seat" id="mima"
                       onfocus="this.placeholder=''" onblur="this.placeholder='密码'">
                <div id="mi">请输入6到16位数字密码</div>
            </td>
        </tr>
        <tr>
            <td>
                <label id="lab">验证码：</label>
                <input type="text" name="verif" id="ver">
            </td>
        </tr>
        <tr>
            <td>
                <input type="button" id="button" value="登录">
            </td>
        </tr>
        </tbody>
    </table>


</form>

<script>
    var reg = /^1[3-9]\d{9}$/;
    var reg2= /^[\dA-Za-z]{6,16}$/;
    function a() {
        var plac = $("#yonghu").val();
        if ($("#yonghu").val().length == 0) {
            $("#yong").css({"color": "black"});
            $("#yong").text("请输入正确格式的号码");
            return;
        }
        if (!reg.test(plac)) {
            $("#yong").css({"color": "red"});
            $("#yong").text("输入错误");

        } else {
            $("#yong").css({"color": "black"});
            $("#yong").text("格式正确");

        }
    }

    function b() {
        var plac = $("#mima").val();

        if ($("#mima").val().length == 0) {
            $("#mi").css({"color": "black"});
            $("#mi").text("请输入6到16位数字密码");
            return;
        }
        if (!reg2.test(plac)) {
            $("#mi").css({"color": "red"});
            $("#mi").text("输入错误");
        } else {
            $("#mi").css({"color": "black"});
            $("#mi").text("格式正确");
        }
    }

    $("#yonghu").blur(function () {
        a();
    })


    $("#mima").blur(function () {
        b();
    })


    $("#button").click(function () {
        if ($("#yonghu").val() == "") {
            alert("用户名为空");
            return;
        }
        if ($("#mima").val() == "") {
            alert("密码为空");
            return;
        }
       if($("#ver").val()==""){
           alert("验证码为空");
           return;
       }
       if(!reg.test($("#yonghu").val())){
           alert("用户名格式不正确");
           return;
       }
       if(!reg2.test(($("#mima").val()))){
           alert("密码格式不正确");
           return;
       }
        $("#form").submit();
    })


</script>
<script>
    var errori ="<%=request.getSession().getAttribute("error")%>";
    if(errori=="yes"){
        alert("登录失败!");
    }
</script>
</body>
</html>

