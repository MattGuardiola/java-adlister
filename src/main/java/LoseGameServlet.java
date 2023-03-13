import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "lossGameServlet", urlPatterns = "/incorrect")
public class LoseGameServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
    }
}