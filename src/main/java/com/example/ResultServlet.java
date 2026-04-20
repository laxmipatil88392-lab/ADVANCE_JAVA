package com.example;
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ResultServlet")
public class ResultServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String rollno = request.getParameter("rollno");
        String name = request.getParameter("name");

        String s1 = request.getParameter("sub1");
        String s2 = request.getParameter("sub2");
        String s3 = request.getParameter("sub3");
        String s4 = request.getParameter("sub4");
        String s5 = request.getParameter("sub5");

        String message = "";
        int sub1=0, sub2=0, sub3=0, sub4=0, sub5=0;
        double avg = 0;
        String result = "";

        try {
            // Server-side validation
            if (rollno == null || rollno.isEmpty() || name == null || name.isEmpty()) {
                message = "Error: All fields are required";
            } else {
                sub1 = Integer.parseInt(s1);
                sub2 = Integer.parseInt(s2);
                sub3 = Integer.parseInt(s3);
                sub4 = Integer.parseInt(s4);
                sub5 = Integer.parseInt(s5);

                // Check marks range
                if (sub1<0||sub2<0||sub3<0||sub4<0||sub5<0) {
                    message = "Error: Marks must be positive";
                } else {

                    avg = (sub1 + sub2 + sub3 + sub4 + sub5) / 5.0;

                    // Pass condition
                    if (sub1>=40 && sub2>=40 && sub3>=40 && sub4>=40 && sub5>=40) {
                        result = "PASS";
                    } else {
                        result = "FAIL";
                    }

                    message = "Result Processed Successfully";

                    // Set attributes
                    request.setAttribute("rollno", rollno);
                    request.setAttribute("name", name);
                    request.setAttribute("sub1", sub1);
                    request.setAttribute("sub2", sub2);
                    request.setAttribute("sub3", sub3);
                    request.setAttribute("sub4", sub4);
                    request.setAttribute("sub5", sub5);
                    request.setAttribute("average", avg);
                    request.setAttribute("result", result);
                }
            }

        } catch (Exception e) {
            message = "Error: Invalid input";
        }

        request.setAttribute("message", message);

        RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
        rd.forward(request, response);
    }
}