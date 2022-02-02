<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<%
    String col[]={"red","blue","green","yellow","purple"};
%>
<%
    for(int i=0;i<5;i++)
    {
%>
<font color="<%=" "+col[i]%>" size="<%=" "+i%>">Welcome</font><br>
<%
    }
%>
</body>
</html>