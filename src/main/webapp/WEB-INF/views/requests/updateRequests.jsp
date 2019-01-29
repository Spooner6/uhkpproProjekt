<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fom" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: radek
  Date: 28/01/2019
  Time: 11:26
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
                <li class="nav-item">
                    <a class="nav-link js-scroll-trigger" href="${pageContext.request.contextPath}/users">Zaměstnanci</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link js-scroll-trigger" href="${pageContext.request.contextPath}/requests">Dotazy</a>
                </li>
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
                    <strong>Novinky</strong>
                </h1>
                <hr>
            </div>
            <div class="col-lg-8 mx-auto">
                <p>Přidání</p>
            </div>
        </div>
    </div>
</header>

<div class="container">
    <h1 class="mt-5">Přidání dotazu</h1>
    <form:form action="saveRequests" modelAttribute="requests" method="post" class="form-group">
        <%--Drží si id --%>
        <form:hidden path="id"/>
        <label for="examplePredmet">Předmět:</label>
        <fom:input path="desctiption" class="form-control" placeholder="Vyplňte předmět" id="examplePredmet"/>
        <small id="emailHelp" class="form-text text-muted">Popište stručne novinku</small>


        <label for="exampleObsah">Obsah:</label>
        <fom:input path="text" class="form-control" placeholder="Vyplňte obsah" id="exampleObsah"/>

        <input type="submit" value="Save" class="btn btn-primary"/>
    </form:form>

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