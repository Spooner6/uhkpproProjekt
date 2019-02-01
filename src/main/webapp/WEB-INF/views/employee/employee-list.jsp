<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Ondra
  Date: 25.1.2019
  Time: 22:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Creative - Start Bootstrap Theme</title>

    <!-- Bootstrap core CSS -->
    <link href="${pageContext.request.contextPath}/resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom fonts for this template -->
    <link href="${pageContext.request.contextPath}/resources/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>

    <!-- Plugin CSS -->
    <link href="${pageContext.request.contextPath}/resources/vendor/magnific-popup/magnific-popup.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${pageContext.request.contextPath}/resources/css/creative.min.css" rel="stylesheet">

</head>

<body id="page-top">

<!-- Navigation -->
<nav class="navbar navbar-expand-lg navbar-light fixed-top" id="mainNav">
    <div class="container">

        <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
            <ul class="navbar-nav ml-auto">

                <li class="nav-item">
                    <a class="nav-link js-scroll-trigger" href="${pageContext.request.contextPath}/">Domovská stránka<span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link js-scroll-trigger" href="${pageContext.request.contextPath}/novinky">Novinky</a>
                </li>
                <security:authorize access="hasRole('MANAGER')">
                    <li class="nav-item">
                        <a class="nav-link js-scroll-trigger" href="${pageContext.request.contextPath}/users">Zaměstnanci</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link js-scroll-trigger" href="${pageContext.request.contextPath}/requests">Dotazy</a>
                    </li>
                </security:authorize>
                <li class="nav-item">
                    <a class="nav-link js-scroll-trigger" href="${pageContext.request.contextPath}/addRequests">Přidat dotazy</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<header class="masthead text-center text-white d-flex">
    <div class="container my-auto">
        <div class="row">
            <div class="col-lg-10 mx-auto">
                <h1 class="text-uppercase">
                    <strong>Zaměstnanci</strong>
                </h1>
                <hr>
            </div>
            <div class="col-lg-8 mx-auto">
                <p>Přehled</p>
            </div>
        </div>
    </div>
</header>

<div class="container">
<security:authorize access="hasRole('MANAGER')">
    <input type="button" class="btn btn-dark" value="Přidat uživatele" onclick="window.location.href='addUser'; return false;"/>
</security:authorize>

    <table class="table table-dark">
        <tr>
            <th scope="col">Uživatelské jméno</th>
            <th scope="col">Jméno</th>
            <th scope="col">Příjmení</th>
            <th scope="col">Adresa</th>
            <th scope="col">Číslo kreditní karty</th>
        </tr>

        <c:forEach var="tempUser" items="${users}">
            <c:url var="updateLink" value="/updateUser">
                <c:param name="userId" value="${tempUser.userName}"></c:param>
            </c:url>
            <c:url var="deleteLink" value="/deleteUser">
                <c:param name="userId" value="${tempUser.userName}"></c:param>
            </c:url>
            <tr>
                <td>${tempUser.userName}</td>
                <td>${tempUser.firstName}</td>
                <td>${tempUser.lastName}</td>
                <td>${tempUser.adress}</td>
                <td>${tempUser.cardNumber}</td>
                <td>
                    <button type="button" class="btn btn-light"><a href="${updateLink}">Upravit  </a></button>
                        <%--onclick .. kousek JavaScript. Opravdu chcete smazat novinku?--%>
                    <button type="button" class="btn btn-light"><a href="${deleteLink}"
                                                                   onclick="if (!(confirm('Opravdu chcete uživatele smazat?'))) return false"
                    >Smazat</a></button>
                </td>
            </tr>
        </c:forEach>
    </table>
    <hr>
</div>
<!-- Bootstrap core JavaScript -->
<script src="${pageContext.request.contextPath}/resources/vendor/jquery/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

<!-- Plugin JavaScript -->
<script src="${pageContext.request.contextPath}/resources/vendor/jquery-easing/jquery.easing.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/vendor/scrollreveal/scrollreveal.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/vendor/magnific-popup/jquery.magnific-popup.min.js"></script>

<!-- Custom scripts for this template -->
<script src="${pageContext.request.contextPath}/resources/js/creative.min.js"></script>

</body>

</html>

