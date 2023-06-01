<%--
  Created by IntelliJ IDEA.
  User: damian
  Date: 01.06.2023
  Time: 13:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Jsp2</title>
</head>
<body>
    <c:forEach begin="${start}" end="${end}" var="i">
        ${i}
    </c:forEach>

</body>
</html>
