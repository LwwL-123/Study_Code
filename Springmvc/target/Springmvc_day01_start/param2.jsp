<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/9/23
  Time: 13:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--请求参数绑定--%>
<%-- --%>
<form action="param/savaUser" method="post">

    用户的姓名:<input type="text" name="uname"><br/>
    用户的年龄:<input type="text" name="age"><br/>
    用户的生日:<input type="text" name="date"><br/>

    <input type="submit" value="提交"/>
</form>


</body>
</html>