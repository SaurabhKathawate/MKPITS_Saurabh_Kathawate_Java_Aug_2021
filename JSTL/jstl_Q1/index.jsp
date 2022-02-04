<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="m" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSTL</title>
</head>
<body>
Welcome to JSTL

<m:set var="num1" value="34"></m:set>

<m:out value="${num1}"></m:out>

<m:if test="${num1>33}">
    <h1>num1 is greater</h1>
</m:if>

<m:forEach var="i" begin="1" end="10">
    <h1>JSTL loop</h1>
</m:forEach>

</body>
</html>