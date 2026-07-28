import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        // Set the response content type
        response.setContentType("text/html");
        
        // Print the message to the browser
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Hello from Tomcat!</h1>");
        out.println("</body></html>");
    }
}
