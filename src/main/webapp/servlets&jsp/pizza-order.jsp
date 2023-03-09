<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Pizza Order Form</title>
</head>
<body>
<h1>Pizza Order Form</h1>
<form method="POST">
    <label>Crust Type:</label>
    <select name="crust">
        <option value="thin">Thin</option>
        <option value="thick">Thick</option>
        <option value="stuffed">Stuffed</option>
    </select><br><br>

    <label>Sauce Type:</label>
    <select name="sauce">
        <option value="tomato">Tomato</option>
        <option value="bbq">BBQ</option>
        <option value="pesto">Pesto</option>
    </select><br><br>

    <label>Size:</label>
    <select name="size">
        <option value="small">Small</option>
        <option value="medium">Medium</option>
        <option value="large">Large</option>
    </select><br><br>

    <label>Toppings:</label><br>
    <input type="checkbox" name="toppings" value="pepperoni">Pepperoni<br>
    <input type="checkbox" name="toppings" value="mushrooms">Mushrooms<br>
    <input type="checkbox" name="toppings" value="olives">Olives<br>
    <input type="checkbox" name="toppings" value="pineapple">Pineapple<br><br>

    <label>Delivery Address:</label>
    <input type="text" name="address"><br><br>

    <input type="submit" value="Submit">
</form>
</body>
</html>