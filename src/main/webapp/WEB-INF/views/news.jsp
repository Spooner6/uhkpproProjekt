<%--
  Created by IntelliJ IDEA.
  User: 42060
  Date: 23.01.2019
  Time: 21:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
    <title>List Users</title>
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
            </ul>
        </div>
    </div>
</nav>


<main role="main" class="flex-shrink-0">
    <div class="container">
        <h1 class="mt-5">Přehled aktualit</h1>

        <input type="button" value="Přidat novinku" onclick="window.location.href='showFormForAdd'; return false;"/>


        <table>
            <tr>
                <th>Popis</th>
                <th>Text</th>
            </tr>

            <!-- loop over and print our customers -->
            <c:forEach var="tempNews" items="${news}">

                <tr>
                    <td> ${tempNews.description} </td>
                    <td> ${tempNews.text} </td>
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