<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Statement" %><%--
  Created by IntelliJ IDEA.
  User: Arnav
  Date: 03-02-2022
  Time: 00:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String username = request.getParameter("uname");
    String password = request.getParameter("pass");
%>
<%
    try
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/database","root","root");
%>
<font color="green" size="5">Account created successfully</font> <br>
<%
    Statement stmt=con.createStatement();
    String query=("insert into table2 values ('"+username+"','"+password+"')");
    stmt.executeUpdate(query);
%>
<%--<font color="blue" size="5">Record inserted successfully</font>--%>
<%
    }catch(Exception ee) {
        out.println(ee.toString());
    } %>
<a href="login.jsp">click here to login</a>
</body>
</html>
