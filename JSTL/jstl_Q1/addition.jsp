<%--
  Created by IntelliJ IDEA.
  User: Arnav
  Date: 04-02-2022
  Time: 12:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="m" %>
<html>
<head>
    <title>Addition</title>
</head>
<body>
Addition of 2 number<br>
<m:set var="num1" value="10"></m:set>
<m:set var="num2" value="20"></m:set>

<m:out value="${num1+num2}"></m:out>
</body>
</html>
