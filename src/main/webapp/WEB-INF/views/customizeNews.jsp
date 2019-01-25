<%--
  Created by IntelliJ IDEA.
  User: 42060
  Date: 24.01.2019
  Time: 16:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fom" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
    <title>List Customers</title>

    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/style.css" />
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">

    <script src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>

    <script	src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>

</head>

<body>
<nav class="navbar navbar-default navbar-fixed-top">
    <div class="container">
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <p class="navbar-text navbar-right"><a href="#" class="navbar-link"></a></p>
            <ul class="nav navbar-nav">
                <li><a href="${pageContext.request.contextPath}/">Domovská stránka</a></li>
                <li class="active"><a href="${pageContext.request.contextPath}/novinky">Novinky<span class="sr-only">(current)</span></a></li>
                <li><a href="${pageContext.request.contextPath}/users">Zaměstnanci</a></li>
            </ul>
            </li>
        </div>
    </div>
</nav>


<main role="main" class="flex-shrink-0">
    <div class="container">
        <h1 class="mt-5">Přidání novinky</h1>
            <form:form action="saveNews" modelAttribute="news" method="post">
                <table>
                    <tbody>
                    <tr>
                        <td><label>Předmět: </label></td>
                        <td><fom:input path="description"/></td>
                    </tr>

                    <tr>
                        <td><label>Text: </label></td>
                        <td><fom:input path="text"/></td>
                    </tr>
                    <tr>
                        <td><label></label></td>
                        <td><input type="submit" value="Save"/></td>
                    </tr>
                    </tbody>
                </table>
            </form:form>

        <p>
            <a href="${pageContext.request.contextPath}/novinky">Zpět na přehled novinek</a>
        </p>
        <hr>
    </div>
</main>
<footer class="container">
    <p>&copy; We are fucking awesome 2019</p>
</footer>

</body>

</html>