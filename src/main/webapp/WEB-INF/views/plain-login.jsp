<%--
  Created by IntelliJ IDEA.
  User: 42060
  Date: 17.01.2019
  Time: 9:33
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
    <title>Custom Login Page</title>
    <link href="webjars/bootstrap/4.2.1/css/bootstrap.min.css" rel="stylesheet">


    <style>
        .failed {
            color: red;
        }
    </style>

</head>

<body>

<h3>My Custom Login Page</h3>

<form:form action="${pageContext.request.contextPath}/authenticateTheUser"
           method="POST">

    <!-- Check for login error -->

    <c:if test="${param.error != null}">

        <i class="failed">Sorry! You entered invalid username/password.</i>

    </c:if>

    <p>
        User name: <input type="text" name="username" />
    </p>

    <p>
        Password: <input type="password" name="password" />
    </p>

    <input type="submit" value="Login" />

</form:form>
<br><br>
<a href="${pageContext.request.contextPath}/employee-list">Go to my Employee list</a>

<script src="webjars/jquery/3.3.1-1/jquery.min.js"></script>
<script src="webjars/bootstrap/4.2.1/js/bootstrap.min.js"></script>
</body>

</html>




