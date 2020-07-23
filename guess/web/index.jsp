<%--
  Created by IntelliJ IDEA.
  User: Bint-Lahdad
  Date: 13-Jul-20
  Time: 7:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Game</title>
  </head>
  <body>
  <h1 text align="center">Guess a number game!</h1>
  <form method="post" action="game.jsp">
    <table>
      <tr>
        <td>Enter your name:<input type="text" name="name" placeholder="Enter your name" required=""></td>
      </tr>
      <tr>
        <td>
          <input type="submit" value="submit">
          <input type="reset" value="clear">
        </td>
      </tr>
    </table>
  </form>
  </body>
</html>
