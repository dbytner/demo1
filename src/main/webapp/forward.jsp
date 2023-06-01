<%--
  Created by IntelliJ IDEA.
  User: damian
  Date: 01.06.2023
  Time: 11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    Witaj ${user} !
    <c:out value="${user}" default="brak użytkownika"/>

    <ol>
        <c:forEach items="${products}" var="product">
            <li> ${product} </li>
        </c:forEach>
    </ol>

    <table>
        <c:forEach items="${books}" var="book">

        </c:forEach>
    </table>
</body>
</html>
