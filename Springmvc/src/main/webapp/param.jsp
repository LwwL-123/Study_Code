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
    <%--<a href="param/testParam?username=hehe&mima=123456">请求参数绑定</a>--%>

    <%--把数据封装到Acoount类中--%>
<%--    <form action="param/savaAccount" method="post">--%>
<%--        姓名:<input type="text" name ="username"/><br/>--%>
<%--        密码:<input type="text" name="password"><br/>--%>
<%--        金额:<input type="text" name="money"><br/>--%>
<%--        用户的姓名:<input type="text" name="user.uname"><br/>--%>
<%--        用户的年龄:<input type="text" name="user.age"><br/>--%>
<%--        <input type="submit" value="提交"/>--%>
<%--    </form>--%>

    <%--把数据封装到Acoount类中,类中存在list和map集合--%>
    <form action="param/savaAccount" method="post">
        姓名:<input type="text" name ="username"/><br/>
        密码:<input type="text" name="password"><br/>
        金额:<input type="text" name="money"><br/><br/>

        姓名:<input type="text" name ="list[0].uname"/><br/>
        密码:<input type="text" name="list[0].age"><br/><br/>

        姓名:<input type="text" name ="map['one'].uname"/><br/>
        密码:<input type="text" name="map['one'].age"><br/>

        <input type="submit" value="提交"/>
    </form>
</body>
</html>