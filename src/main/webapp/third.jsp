<%--
  Created by IntelliJ IDEA.
  User: damian
  Date: 01.06.2023
  Time: 10:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Third</title>
</head>
<body>
<h1>
    wartość a: ${empty param.a ? "brak" : param.a}
    wartość b: ${empty param.b ? "brak" : param.b}
    ${param.a == null || param.b == null ? 'brak' : String.format("%s %s", param.a, param.b)}

</h1>
</body>
</html>
