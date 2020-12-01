<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/12/1
  Time: 13:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>


  <%--
    JSP表达式
    作用：用来将程序的输出，输出到客户端
    <%= 变量或者表达式 %>
  --%>
  <%= new java.util.Date() %>

  <hr>

  <%--jsp脚本片段--%>
  <%
    int sum = 0;
    for (int i = 0; i < 100; i++) {
      sum+=i;
    }
    out.println("<h1>Sum = "+sum+"</h1>");
  %>

  <%--在代码中嵌入html元素--%>
  <%
    for (int i = 0; i < 5; i++) {
  %>
    <h4>hello <%=i%> </h4>
  <%
    }
  %>




  </body>
</html>
