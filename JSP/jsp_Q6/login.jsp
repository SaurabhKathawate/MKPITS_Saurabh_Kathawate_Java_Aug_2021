<%--
  Created by IntelliJ IDEA.
  User: Arnav
  Date: 02-02-2022
  Time: 15:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Welcome to login page
<%
    String name=request.getParameter("username");
    out.println(name);
%>
</body>
</html>
