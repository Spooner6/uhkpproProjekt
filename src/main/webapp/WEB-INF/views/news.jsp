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
    <title>List Customers</title>

    <!-- reference our style sheet -->

    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/style.css" />

</head>

<body>

<div id="wrapper">
    <div id="header">
        <h2>CRM - Customer Relationship Manager</h2>
    </div>
</div>
<div id="container">

    <div id="content">

        <!--  add our html table here -->

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

    </div>

</div>


</body>

</html>