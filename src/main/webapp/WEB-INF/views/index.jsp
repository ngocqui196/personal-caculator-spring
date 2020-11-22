<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/22/2020
  Time: 3:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/calculator" method="post">
    <input type="number" name="input1">
    <input type="number" name="input2"><br>
    <input type="submit" name="calcul" value="+">
    <input type="submit" name="calcul" value="-">
    <input type="submit" name="calcul" value="*">
    <input type="submit" name="calcul" value="/">
  </form>
  <div>${result}</div>
  </body>
</html>
