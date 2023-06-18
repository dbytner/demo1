<%--
  Created by IntelliJ IDEA.
  User: damian
  Date: 01.06.2023
  Time: 14:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>ResultList</title>
</head>
<body>
Lista książek:
<c:forEach items="${books}" var="book">
    <ol>
        <li>${book.title}, ${book.author}, ${book.isbn}</li>
    </ol>
</c:forEach>
</body>
</html>
