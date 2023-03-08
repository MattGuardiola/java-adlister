<%--
  Created by IntelliJ IDEA.
  User: mattguardiola
  Date: 3/8/23
  Time: 10:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>LogIN</title>
    <jsp:include page="partials/head.jsp"/>
</head>
<body>
<jsp:include page="partials/navbar.jsp"/>
    <h1>Login</h1>
    <form action="login.jsp" method="post">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username"><br><br>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password"><br><br>
        <input type="submit" value="Login">
    </form>
    <%
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username != null && username.equals("admin") && password != null && password.equals("password")) {
            response.sendRedirect("profile.jsp");
        }
    %>
</body>
</html>
