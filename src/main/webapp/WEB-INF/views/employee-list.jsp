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
    <title>List of users</title>
</head>
<body>
<h1>our Employee list</h1>

<div id="wrapper">
        <div id="header">
            <h2>Customer relationship Manager</h2>
        </div>

    <div id="container">
        <div id="content">

                        <table>
                            <tr>
                                <th>Uživatelské jméno</th>
                                <th>Heslo</th>
                            </tr>

                            <c:forEach var="tempUser" items="${users}">
                                <tr>
                                    <td>${tempUser.username}</td>
                                    <td>${tempUser.password}</td>
                                </tr>

                            </c:forEach>
          </table>

      </div>

  </div>
</div>

</body>
</html>
