package servlet;

import java.io.IOException;
import java.io.PrintWriter;

// Simple example servlet from slides
// servlet library
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
// servlet library
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// The @WebServletannotation is used to declare a servlet
@WebServlet(name = "FirstServlet", urlPatterns = { "/hello" })
public class TimsinaHello extends HttpServlet // Inheriting from HttpServlet makes this a servlet
{
   public void doGet(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
      response.setContentType("text/html"); // Tells the web container what we're sending back
      PrintWriter out = response.getWriter(); // Make it appear as if we're "writing" to the browser window

      out.println("<html>");
      out.println("<head>");
      out.println("<title>Servlet example</title>");
      out.println("</head>");
      out.println("<body>");
      out.println("<p>My first servlet.</p>");
      out.println("<p>Hello rtimsin</p>");
      out.println("</body>");
      out.println("</html>");
      out.close();
   } // end doGet()
} // end Hello
