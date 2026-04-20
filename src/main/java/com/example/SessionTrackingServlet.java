//9.b Build a Session Management using JSP program set with one minute session expiry time to get your
//name through text box and press submit to display the message by greeting Hello your name!. Check the
//expiry of the session after one minute.
package com.example;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/SessionTracker")
public class SessionTrackingServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Get session (create if not exists)
        HttpSession session = request.getSession(true);

        // Set session expiry to 1 minute (60 seconds)
        session.setMaxInactiveInterval(60);

        // Session details
        Date createTime = new Date(session.getCreationTime());
        Date lastAccessTime = new Date(session.getLastAccessedTime());
        String sessionId = session.getId();

        // Visit count
        Integer visitCount = (Integer) session.getAttribute("visitCount");

        if (visitCount == null) {
            visitCount = 1;
        } else {
            visitCount++;
        }

        session.setAttribute("visitCount", visitCount);

        // Set response type (FIXED ERROR)
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Output
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head><title>Session Tracking Demo</title></head>");
        out.println("<body>");

        out.println("<h2>Session Tracking Information</h2>");
        out.println("<p><b>Session ID:</b> " + sessionId + "</p>");
        out.println("<p><b>Session Creation Time:</b> " + createTime + "</p>");
        out.println("<p><b>Last Access Time:</b> " + lastAccessTime + "</p>");
        out.println("<p><b>Visit Count:</b> " + visitCount + "</p>");

        out.println("<h3>Session expires after 1 minute of inactivity</h3>");

        out.println("</body>");
        out.println("</html>");
    }
}
