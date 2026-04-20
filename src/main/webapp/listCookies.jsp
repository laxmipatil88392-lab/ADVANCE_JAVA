<%@ page import="javax.servlet.http.Cookie" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Active Cookies</title>
</head>
<body>

<h2>Active Cookie List</h2>

<%
Cookie[] cookies = request.getCookies();

if (cookies != null) {
    for (Cookie c : cookies) {
%>
        <p>
        Name: <%= c.getName() %> <br>
        Value: <%= c.getValue() %>
        </p>
        <hr>
<%
    }
} else {
%>
    <p>No cookies found</p>
<%
}
%>

<br>
<a href="index.jsp">Add Another Cookie</a>

</body>
</html>