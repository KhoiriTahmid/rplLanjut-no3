<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hitung Akar Persamaan Kuadrat ==> ax2 - bx +c" %></h1>
<form action="hello-servlet" method="post">
    <label for="a">Nilai a:</label>
    <input type="number" step="any" id="a" name="a" required><br><br>
    <label for="b">Nilai b:</label>
    <input type="number" step="any" id="b" name="b" required><br><br>
    <label for="c">Nilai c:</label>
    <input type="number" step="any" id="c" name="c" required><br><br>
    <button type="submit">Hitung</button>
</form>
</body>
</html>