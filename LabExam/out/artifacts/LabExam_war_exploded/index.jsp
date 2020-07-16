<%--
  Created by IntelliJ IDEA.
  User: Bint-Lahdad
  Date: 16-Jul-20
  Time: 11:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>LabExam</title>
  </head>
  <body>
  <H1>STUDENT REGISTRATION FORM</H1>
  <form action="examServlet" method="post">
    <p><label>Name: <input type="text" name="name" required=""></label></p>
    <p><label>Registration No: <input type="text" name="regno" required=""></label></p>
    <p><label>Grade: <input type="text" name="grade" required=""></label></p>
    <p><label>Phone Number: <input type="text" name="phone" required=""></label></p>
    <p><label>Email-ID: <input type="email" name="email" required=""></label></p>
    <p><label><input type="radio" name="gender" value="gender">Male </label></p>
    <p><label><input type="radio" name="gender" value="gender">Female </label></p>
      <p><label>Semester Information:<select name="info" >
        <option name="info">First</option>
        <option name="info">Second</option>
        <option name="info">Third</option>
      </select></label></p>
      <p><label>
        <input type="submit" value="submit">
        <input type="reset" value="reset">
      </label></p>
  </form>
  </body>
</html>
