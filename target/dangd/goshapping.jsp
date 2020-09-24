<%--
  Created by IntelliJ IDEA.
  User: hrj
  Date: 2020/9/16
  Time: 16:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>购物车</title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style>
        .btn-primary{
            background: #4cae4c !important;
        }
    </style>
</head>
<body>
<nav class="navbar navbar-default" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">购物车</a>
        </div>
        <ul class="nav navbar-nav navbar-right">
            <li><a href="index.jsp"><span class="glyphicon ">返回首页</span> </a></li>
        </ul>
    </div>
</nav>
<div class="table-responsive m-t">
    <table class="table invoice-table">
        <thead>
        <tr>
            <th>清单</th>
            <th>数量</th>
            <th>单价</th>
            <th>税率</th>
            <th>总价</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>
                <div><strong>尚都比拉2013冬装新款女装 韩版修身呢子大衣 秋冬气质羊毛呢外套</strong>
                </div>
            </td>
            <td>1</td>
            <td>&yen;26.00</td>
            <td>&yen;1.20</td>
            <td>&yen;31,98</td>
        </tr>
        <tr>
            <td>
                <div><strong>11*11夏娜 新款斗篷毛呢外套 女秋冬呢子大衣 韩版大码宽松呢大衣</strong>
                </div>
                <small>双十一特价
                </small>
            </td>
            <td>2</td>
            <td>&yen;80.00</td>
            <td>&yen;1.20</td>
            <td>&yen;196.80</td>
        </tr>
        <tr>
            <td>
                <div><strong>2013秋装 新款女装韩版学生秋冬加厚加绒保暖开衫卫衣 百搭女外套</strong>
                </div>
            </td>
            <td>3</td>
            <td>&yen;420.00</td>
            <td>&yen;1.20</td>
            <td>&yen;1033.20</td>
        </tr>

        </tbody>
    </table>
</div>
<!-- /table-responsive -->

<table class="table invoice-total">
    <tbody>
    <tr>
        <td><strong>总价：</strong>
        </td>
        <td>&yen;1026.00</td>
    </tr>
    <tr>
        <td><strong>税：</strong>
        </td>
        <td>&yen;235.98</td>
    </tr>
    <tr>
        <td><strong>总计</strong>
        </td>
        <td>&yen;1261.98</td>
    </tr>
    </tbody>
</table>
<div class="text-right">
    <button class="btn btn-primary"><i class="fa fa-dollar"></i> 去付款</button>
</div>

<div class="well m-t"><strong>注意：</strong> 请在30日内完成付款，否则订单会自动取消。
</div>
</div>
</body>
</html>