<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Pick a Color</title>
</head>
<body>
    <form action="/pickcolor" method="POST">
        <label>What's your favorite color:</label>
        <input type="text" name="color"><br><br>

        <input type="submit" value="Submit">
    </form>
</body>
</html>
