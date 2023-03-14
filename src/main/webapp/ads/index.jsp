<%--
  Created by IntelliJ IDEA.
  User: mattguardiola
  Date: 3/10/23
  Time: 2:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>My Ads</title>
</head>
<body>
<h1>Current Ads</h1>
<c:forEach var="ad" items="${ads}">
    <div class="card">
        <h2>${ad.title}</h2>
        <p>${ad.description}</p>
    </div>
</c:forEach>
</body>
</html>