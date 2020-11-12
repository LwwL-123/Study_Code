<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/9/27
  Time: 11:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <script src="js/jquery.min.js"></script>
    <script>
        //页面加载,绑定点击事件
        $(function (){
            $("#btn").click(function (){
                alert("hello btn")
            });
        });

    </script>
</head>
<body>
    <a href="user/testString">testString</a>
    <br/>

    <a href="user/tsetVoid">tsetVoid</a>
    <br/>

    <a href="user/tsetModelAndView">ModelAndView</a>
    <br/>

    <button id="btn">发送ajax请求</button>

</body>
</html>
