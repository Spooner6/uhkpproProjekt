<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <style>
        body { padding-top: 70px; }
    </style>
    <title>Domovská stránka</title>
    <link rel="stylesheet"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>

    <script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<body>
<nav class="navbar navbar-default navbar-fixed-top">
    <div class="container">
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <p class="navbar-text navbar-right">Přihlášen jako <security:authentication
                    property="principal.username"/> <a href="#" class="navbar-link">Role: <security:authentication property="principal.authorities"/></a></p>
            <ul class="nav navbar-nav">
                <li class="active"><a href="${pageContext.request.contextPath}/">Domovská stránka<span class="sr-only">(current)</span></a></li>
                <li><a href="${pageContext.request.contextPath}/novinky">Novinky</a></li>
                <li><a href="${pageContext.request.contextPath}/users">Zaměstnanci</a></li>
            </ul>
                </li>
            </ul>
        </div>
    </div>
</nav>

<main role="main" class="flex-shrink-0">
    <div class="container">
        <h1 class="mt-5">Název firmy?</h1>
        <p>Tady by to chtelo asi hromadu kecu o firme?</p>

        </p>
        <security:authorize access="hasRole('MANAGER')">
            <p>
                <a href="${pageContext.request.contextPath}/leaders">Leadership meeting</a>
            </p>
        </security:authorize>
        <!-- Add a logout button -->
        <form:form action="${pageContext.request.contextPath}/logout"
                   method="POST">
            <input type="submit" value="Logout" />
        </form:form>

        <div class="row">
            <div class="col-md-4">
                <h2>Heading</h2>
                <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
                <p><a class="btn btn-secondary" href="#" role="button">View details &raquo;</a></p>
            </div>
            <div class="col-md-4">
                <h2>Heading</h2>
                <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
                <p><a class="btn btn-secondary" href="#" role="button">View details &raquo;</a></p>
            </div>
            <div class="col-md-4">
                <h2>Heading</h2>
                <p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Vestibulum id ligula porta felis euismod semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</p>
                <p><a class="btn btn-secondary" href="#" role="button">View details &raquo;</a></p>
            </div>
        </div>
        <hr>
    </div>
</main>

<footer class="container">
    <p>&copy; We are fucking awesome 2019</p>
</footer>
</body>

</html>


