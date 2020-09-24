<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>登录</title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="css/me.css">
    <style>
        body{
            margin-top: -40px;
        }
        .row-center{
            text-align:center;
            margin-top: 120px;
        }
        .col-center {
            display:inline-block;
            float:none;
            text-align:left;
            width: 400px;
            margin-left: 32%;
        }
        #yong {
            margin-left: 221px;
            font-size: 12px;
        }
        #mi {
            margin-left: 216px;
            font-size: 12px;
        }
     /*   body{
            background-image: url("/static/img/登录背景.jpg");
            background-size: 100%;
        }*/
    </style>
</head>
<body>
<div class="container">
    <div  class="row  row-center" >
        <div class="col-center">
            <form action="users" id="form" method="post">
                <div style=" padding: 28px;border-radius: 8px;border-color: #c059a3;border-width: 2px  ">
                    <div style="height: 80px;">
                        <h3 style="text-align: center;color: #000000; font-size: 35px;">会员登录</h3>
<%--                        <span style="color: red;margin-left: 253px" id="shu">--%>
<%--                            <%=request.getAttribute("msg")==null?"":request.getAttribute("msg")%>--%>
<%--                        </span>--%>
                    </div>

                    <div  class="form-group">
                        <input name="username" class="form-control " placeholder="请输入您的用户名" id="yonghu" value="<%=request.getAttribute("name")==null?"":request.getAttribute("name")%>"
                               onfocus="this.placeholder=''" onblur="this.placeholder='请输入您的用户名'">
                        <span id="yong">请输入正确格式的号码</span>
                    </div>


                    <div class="form-group">
                        <input name="password" type="password" class="form-control" placeholder="请输入您的密码" id="mima"
                               onfocus="this.placeholder=''" onblur="this.placeholder='请输入您的密码'">
                        <span id="mi">请输入6到16位数字密码</span>
                    </div>
                    <div class="form-group checked-1">
                       <input type="text" name="code" class="form-control" id="ver" placeholder="验证码"/>
                        <img class="checked checked-1" src="code"  onclick="changecode()"><div style="margin-top: 30px;float: right"><a style="margin-top: 20px;margin-left: 0px" href="javascript:changecode()"  >看不清换一张</a></div><br>
                    </div>

                    <div style="margin-top: 15px">
<%--                        <button style="border-radius:10px; background-color: #75a0ff;color: white" id="button" class="btn btn-lg  btn-login btn-block">登录</button>--%>
                        <input type="button" style="border-radius:10px; background-color: #75a0ff;color: white" id="button" class="btn btn-lg  btn-login btn-block" value="登录">
                    </div>
                    <div class="form-group" style="margin-top: 10px">
                        <a class="a_reg" href="registered.html" target="_blank">还未拥有账号？注册</a>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
</div>

<%--<script src="js/jquery-3.3.1.js"></script>--%>
<%--<script src="js/bootstrap.min.js"></script>--%>
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
            $("#yong").css({"color": "red",
            "margin-left":"292px"
            });
            $("#yong").text("输入错误");

        } else {
            $("#yong").css({"color": "black",
                "margin-left":"292px"});
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
            $("#mi").css({"color": "red",
                "margin-left":"292px"});
            $("#mi").text("输入错误");
        } else {
            $("#mi").css({"color": "black",
                "margin-left":"292px"});
            $("#mi").text("格式正确");
        }
    }

    $("body").click(function () {
        $("#shu").text("");
    })


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
<script type="text/javascript">
    function changecode(){
        //得到图片元素
        var img = document.getElementsByTagName("img")[0];
        img.src = "${pageContext.request.contextPath}/code?time="+new Date().getTime();//最新
        alert(${pageContext.request.contextPath});
        console.log(${pageContext.request.contextPath});
    }
</script>
<script>
    function a() {
        var flag="<%=request.getAttribute("error")%>";
        var msg ="<%=request.getAttribute("msg")%>";
        if(flag=="false"){
            alert("用户名或密码错误");
        }
        if(msg=="msg"){
            alert("验证码错误");
        }
        <%
        request.setAttribute("flag","");
        request.setAttribute("msg","");
        %>
    }
   window.onload=a;
</script>
</body>
</html>