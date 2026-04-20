package com.example;


import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String userName = request.getParameter("userName");

        if (userName != null && !userName.isEmpty()) {

            Cookie userCookie = new Cookie("user", userName);
            userCookie.setMaxAge(30);
            response.addCookie(userCookie);

            Cookie countCookie = new Cookie("count", "1");
            countCookie.setMaxAge(30);
            response.addCookie(countCookie);
        }

        Cookie[] cookies = request.getCookies();

        String existingUser = null;
        int count = 0;

        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("user")) {
                    existingUser = c.getValue();
                }
                if (c.getName().equals("count")) {
                    count = Integer.parseInt(c.getValue());
                }
            }
        }

        if (existingUser != null) {
            count++;
            Cookie countCookie = new Cookie("count", String.valueOf(count));
            countCookie.setMaxAge(30);
            response.addCookie(countCookie);
        }

        out.println("<html><body>");

        if (existingUser != null) {
            out.println("<h2 style='color:blue;'>Welcome back, " + existingUser + "!</h2>");
            out.println("<h2 style='color:magenta;'>You have visited this page " + count + " times</h2>");
        } else {
            out.println("<h2 style='color:red;'>No cookie found (expired or first visit)</h2>");
        }

        out.println("<h3>Cookies List:</h3>");

        if (cookies != null) {
            for (Cookie c : cookies) {
                out.println("Name: " + c.getName() + " | Value: " + c.getValue() + "<br>");
            }
        } else {
            out.println("No cookies available");
        }

        out.println("<br><h3>Note: Cookie expires in 30 seconds. Refresh after 30 sec to see expiry.</h3>");

        out.println("</body></html>");
    }
}