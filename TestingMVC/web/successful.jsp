<%@ page import="com.Login" %><%--
  Created by IntelliJ IDEA.
  User: Bint-Lahdad
  Date: 22-Jul-20
  Time: 4:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="com.Login"%>
<html>
<head>
    <title>Login Success Page</title>
</head>
<body>
<p>You are successfully logged in!</p>
<%
    Login bean=(Login)request.getAttribute("bean");
    out.print("Welcome, "+bean.getName());
%>
</body>
</html>
