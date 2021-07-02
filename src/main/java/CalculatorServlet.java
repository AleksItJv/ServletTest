import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        proccessRequest(req, resp);
    }

    private void proccessRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");



        double value1 = Double.valueOf(request.getParameter("v1"));
        System.out.println(value1);
        double value2 = Double.valueOf(request.getParameter("v2"));
        System.out.println(value2);
        String action = request.getParameter("action");
        System.out.println(action);
        String result = "";

        switch (action){
            case "add": {
                result =value1+" + "+value2+" = " + (value1 + value2);
                break;            }
            case "sub": {
                result =value1+" - "+value2+" = " + (value1 - value2);
                break;            }
            case "mult": {
                result =value1+" * "+value2+" = " + (value1 * value2);
                break;            }
            case "div": {
                result =value1+" / "+value2+" = " + (value1 / value2);
                break;            }
            default:
                try {
                    throw new Exception();
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("Incorrect input");
                }
        }

        PrintWriter writer;
        try {
            writer =response.getWriter();

            writer.println("<html>");
            writer.println("<head>");
            writer.println("<title>");
            writer.println("Hello My Friend!!");
            writer.println("</title>");
            writer.println("</head>");
            writer.println("<body>");
            writer.println("<h1>");
            writer.println("Calculator");
            writer.println("</h1>");
            writer.println("<p>");
            writer.println(result);
            writer.println("</p>");
            writer.println("<p>");
            writer.println("navigation");
            writer.println("</p>");
            writer.println("<a href=\"index.jsp\">");
            writer.println("start page");
            writer.println("</a");
            writer.println("</body");
            writer.println("</html>");

            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
