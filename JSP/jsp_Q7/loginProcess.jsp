<%@ page import="java.sql.*" %><%--
  Created by IntelliJ IDEA.
  User: Arnav
  Date: 03-02-2022
  Time: 02:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
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
        out.println("databse connected");
%>
<%--<font color="green" size="5">Account creates successfully</font> <br>--%>
<%
    PreparedStatement ps=con.prepareStatement("select * from table2 where username=? and password=?");
    ps.setString(1,username);
    ps.setString(2,password);
    ResultSet rs = ps.executeQuery();

    if(rs.next())
    {
          response.sendRedirect("success.jsp");
//        out.println("succcess");
    }
    else
    {
        response.sendRedirect("failure.jsp");
//        out.println("fail");
    }
%>
<%--<font color="blue" size="5">Record inserted successfully</font>--%>
<%
    }catch(Exception ee) {
        out.println(ee.toString());
    } %>
</body>
</html>
