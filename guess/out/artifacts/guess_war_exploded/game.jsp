<%--
  Created by IntelliJ IDEA.
  User: Bint-Lahdad
  Date: 23-Jul-20
  Time: 10:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Game</title>
</head>
<body>
<h1 text align="center">Lets play the Game</h1>
<form method="post" action="GuessServlet.java">
    <h3>Guess a number between 0 and 100</h3>
    <table>
        <tr>
            <td>Guess a number</td>
            <td><input type="number" name="number"></td>
        </tr>
        <tr>
            <td><input type="button" value="play"></td>
        </tr>
    </table>
</form>
</body>
</html>
