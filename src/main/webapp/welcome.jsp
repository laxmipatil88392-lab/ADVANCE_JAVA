<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Welcome</title>
</head>
<body>

<%
String name = request.getParameter("uname");

// Greeting
out.print("Hello " + name + "!");

// Store in session
session.setAttribute("user", name);

// Set expiry = 60 seconds
session.setMaxInactiveInterval(60);

out.print("<br>Session started...");
out.print("<br>Session will expire in 1 minute");
out.print("<br>Click below link within 1 minute to check session<br>");
%>

<br>
<a href="second.jsp">Check Session</a>

</body>
</html>