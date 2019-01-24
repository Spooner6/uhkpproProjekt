<%--
  Created by IntelliJ IDEA.
  User: 42060
  Date: 20.01.2019
  Time: 19:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Seznam zaměstnanců</title>
    <style>
        body { padding-top: 70px; }
    </style>
    <link rel="stylesheet"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>

    <script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-default navbar-fixed-top">
    <div class="container">
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <p class="navbar-text navbar-right"><a href="#" class="navbar-link"></a></p>
            <ul class="nav navbar-nav">
                <li><a href="${pageContext.request.contextPath}/">Domovská stránka</a></li>
                <li><a href="${pageContext.request.contextPath}/novinky">Novinky</a></li>
                <li class="active"><a href="${pageContext.request.contextPath}/users">Zaměstnanci<span class="sr-only">(current)</span></a></li>
            </ul>
            </ul>
        </div>
    </div>
</nav>

<main role="main" class="flex-shrink-0">
    <div class="container">
        <h1 class="mt-5">Seznam zaměstnanců</h1>

        <table>
            <tr>
                <th>Uživatelské jméno</th>
                <th>Heslo</th>
            </tr>

            <c:forEach var="tempUser" items="${users}">
                <tr>
                    <td>${tempUser.userName}</td>
                    <td>${tempUser.password}</td>
                </tr>

            </c:forEach>
        </table>
        <hr>
    </div>
</main>
<footer class="container">
    <p>&copy; We are fucking awesome 2019</p>
</footer>
</body>
</html>
