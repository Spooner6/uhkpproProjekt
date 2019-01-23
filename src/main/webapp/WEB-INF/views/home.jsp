<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <style>
        body { padding-top: 70px; }
    </style>
    <title>luv2code Company Home Page</title>
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
                <li class="active"><a href="${pageContext.request.contextPath}/novinky">Novinky<span class="sr-only">(current)</span></a></li>
                <li><a href="${pageContext.request.contextPath}/users">Zaměstnanci</a></li>
            </ul>
                </li>
            </ul>
        </div>
    </div>
</nav>

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
</body>

</html>


