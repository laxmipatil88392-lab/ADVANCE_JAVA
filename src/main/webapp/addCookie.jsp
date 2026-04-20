<%@ page import="javax.servlet.http.Cookie" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Cookie Created</title>
</head>
<body>

<%
String name = request.getParameter("cname");
String domain = request.getParameter("cdomain");
int age = Integer.parseInt(request.getParameter("cage"));

// Create cookie
Cookie cookie = new Cookie(name, domain);

// Set domain and expiry
cookie.setDomain(domain);
cookie.setMaxAge(age);

// Add cookie
response.addCookie(cookie);
%>

<h2>Cookie Added Successfully!</h2>

<p><b>Name:</b> <%= name %></p>
<p><b>Domain:</b> <%= domain %></p>
<p><b>Max Age:</b> <%= age %> seconds</p>

<br>
<a href="listCookies.jsp">Go to Active Cookie List</a>

</body>
</html>