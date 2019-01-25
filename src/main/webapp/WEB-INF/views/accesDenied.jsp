<%--
  Created by IntelliJ IDEA.
  User: radek
  Date: 01/01/2019
  Time: 16:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Acces Denied</title>

    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/style.css" />
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">

    <script src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>

    <script	src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>

</head>
<body>
<h2>Acces denied page</h2>
<p>you can go to home page</p>
<a href="${pageContext.request.contextPath}/">Go home!</a>
</body>
</html>
