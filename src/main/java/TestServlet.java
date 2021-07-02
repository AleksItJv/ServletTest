import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class TestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        PrintWriter writer = null;
        try {
            writer = response.getWriter();

            writer.println("<html>");
            writer.println("<head>");
            writer.println("<title>");
            writer.println("Hello My Friend!!");
            writer.println("</title>");
            writer.println("</head>");
            writer.println("<body>");
            writer.println("<h1>");
            writer.println("Parametrs!");
            writer.println("</h1>");
            writer.println("<p>");
            writer.println("Parametr 1: " + request.getParameter("p1"));
            writer.println("</p>");
            writer.println("<p>");
            writer.println("Parametr 2: " + request.getParameter("p2"));
            writer.println("</p>");
            writer.println("<p>");
            writer.println("navigation");
            writer.println("</p>");
            writer.println("<a href=\"index.jsp\">");
            writer.println("start page");
            writer.println("</a");
            writer.println("<span>");
            writer.println("or");
            writer.println("</span>");
            writer.println("<a href=\"hello\">");
            writer.println("hello page");
            writer.println("</a");
            writer.println("<span>");
            writer.println("or");
            writer.println("</span>");
            writer.println("<a href=\"calculator\">");
            writer.println("calculator");
            writer.println("</a");
            writer.println("</body");
            writer.println("</html>");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }
}