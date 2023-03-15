<%--
  Created by IntelliJ IDEA.
  User: mattguardiola
  Date: 3/15/23
  Time: 1:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <jsp:include page="/WEB-INF/partials/head.jsp">
    <jsp:param name="title" value="Please Log In" />
  </jsp:include>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp" />
<div class="container">
  <h1>Create an account</h1>
  <form action="/register" method="POST">
    <div class="form-group">
      <label for="newfirstname">First Name</label>
      <input id="newfirstname" name="newfirstname" class="form-control" type="text">
    </div>
    <div class="form-group">
      <label for="newlastname">Last Name</label>
      <input id="newlastname" name="newlastname" class="form-control" type="text">
    </div>
    <div class="form-group">
      <label for="newusername">New Username</label>
      <input id="newusername" name="newusername" class="form-control" type="text">
    </div>
    <div class="form-group">
      <label for="newemail">Email</label>
      <input id="newemail" name="newemail" class="form-control" type="text">
    </div>
    <div class="form-group">
      <label for="newpassword">New Password</label>
      <input id="newpassword" name="newpassword" class="form-control" type="text">
    </div>
    <input type="submit" class="btn btn-primary btn-block" value="Create account">
  </form>
</div>
</body>
</html>
