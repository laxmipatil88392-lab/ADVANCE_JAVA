//8a. Build a servlet program to create a cookie to get your name through text box and press submit button(
//through HTML) to display the message by greeting Welcome back your name ! , you have visited this page
//n times ( n = number of your visit ) along with the list of cookies and demonstrate the expiry of cookie also.
package com.example;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {

protected void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {

response.setContentType("text/html");
PrintWriter out = response.getWriter();

String name = request.getParameter("username");
int count = 1;

Cookie[] cookies = request.getCookies();

// Read cookies
if (cookies != null) {
for (Cookie c : cookies) {
if (c.getName().equals("visitCount")) {
count = Integer.parseInt(c.getValue());
count++;
}
if (c.getName().equals("username") && name == null) {
name = c.getValue();
}
}
}

// Create cookies
Cookie nameCookie = new Cookie("username", name);
Cookie countCookie = new Cookie("visitCount", String.valueOf(count));

// Set expiry (30 seconds)
nameCookie.setMaxAge(30);
countCookie.setMaxAge(30);

// Add cookies
response.addCookie(nameCookie);
response.addCookie(countCookie);

// Output
out.println("<html><body>");

out.println("<h2>Welcome back " + name + "!</h2>");
out.println("<h3>You have visited this page " + count + " times</h3>");

out.println("<h3>Cookie List:</h3>");

if (cookies != null) {
for (Cookie c : cookies) {
out.println("Name: " + c.getName() + " | Value: " + c.getValue() + "<br>");
}
} else {
out.println("No cookies found");
}

out.println("<h4>Cookie will expire in 30 seconds</h4>");

out.println("</body></html>");
}

// Fix 405 error
protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
doPost(request, response);
}
}
