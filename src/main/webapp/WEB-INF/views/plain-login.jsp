<!DOCTYPE html>
<%--
  Created by IntelliJ IDEA.
  User: 42060
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
        .failed {
            color: red;
        }

        body {
            height: 100%;
            display: -ms-flexbox;
            display: flex;
            -ms-flex-align: center;
            align-items: center;
            padding-top: 40px;
            padding-bottom: 40px;
            background-color: #f5f5f5;
        }

        .form-signin {
            width: 100%;
            max-width: 330px;
            padding: 15px;
            margin: auto;
        }

        .form-signin .checkbox {
            font-weight: 400;
        }

        .form-signin .form-control {
            position: relative;
            box-sizing: border-box;
            height: auto;
            padding: 10px;
            font-size: 16px;
        }

        .form-signin .form-control:focus {
            z-index: 2;
        }

        .form-signin input[type="email"] {
            margin-bottom: -1px;
            border-bottom-right-radius: 0;
            border-bottom-left-radius: 0;
        }

        .form-signin input[type="password"] {
            margin-bottom: 10px;
            border-top-left-radius: 0;
            border-top-right-radius: 0;
        }
    </style>
    <%-- Bootstrap, jquery--%>
    <link rel="stylesheet"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"></script>
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




