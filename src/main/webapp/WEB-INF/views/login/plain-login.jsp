<!DOCTYPE html>
<%--
  Created by IntelliJ IDEA.
  User: radek
  Date: 17.01.2019
  Time: 9:33
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="cs">

<head>
    <title>Custom Login Page</title>
    <meta charset="utf-8">
    <%-- META TAGY!!!--%>

    <style>

    </style>
    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/style.css" />
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">

    <script src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>

    <script	src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
</head>

<body class="text-center">
<form:form action="${pageContext.request.contextPath}/authenticateTheUser"
           method="POST" class="form-signin">
    <h1 class="h3 mb-3 font-weight-normal">Přihlašení</h1>

    <c:if test="${param.error != null}">

        <i class="failed">Špatné heslo nebo jméno</i>

    </c:if>
    <label for="inputEmail" class="sr-only">Přihlašovací jméno</label>
    <input id="inputEmail" class="form-control" type="text" name="username"/>
    <label for="inputPassword" class="sr-only">Password</label>
    <input type="password" id="inputPassword" class="form-control" name="password"/>


    <input class="btn btn-lg btn-primary btn-block" type="submit" value="Přihlásit se"/>
    <p class="mt-5 mb-3 text-muted">&copy; We are fucking awesome 2019</p>
</form:form>
</body>
</html>




