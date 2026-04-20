<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Result</title>

<style>
.box {
    width: 350px;
    margin: auto;
    border: 1px solid #ccc;
    padding: 20px;
}
.pass { color: green; }
.fail { color: red; }
.error { color: red; }
</style>
</head>

<body>

<div class="box">
<h2>Student Result</h2>

<%
String msg = (String)request.getAttribute("message");
boolean isError = msg != null && msg.toLowerCase().contains("error");
%>

<p class="<%= isError ? "error" : "" %>"><%= msg %></p>

<% if(request.getAttribute("rollno") != null) { %>

<p>Roll No: <%= request.getAttribute("rollno") %></p>
<p>Name: <%= request.getAttribute("name") %></p>

<p>Sub1: <%= request.getAttribute("sub1") %></p>
<p>Sub2: <%= request.getAttribute("sub2") %></p>
<p>Sub3: <%= request.getAttribute("sub3") %></p>
<p>Sub4: <%= request.getAttribute("sub4") %></p>
<p>Sub5: <%= request.getAttribute("sub5") %></p>

<p>Average: <%= request.getAttribute("average") %></p>

<%
String res = (String)request.getAttribute("result");
%>

<p class="<%= res.equals("PASS") ? "pass" : "fail" %>">
Result: <%= res %>
</p>

<% } %>

<br>
<a href="index.jsp">Go Back to Form</a>

</div>

</body>
</html>