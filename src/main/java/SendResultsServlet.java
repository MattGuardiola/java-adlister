import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "SendResultsServlet", urlPatterns = "/guess")
public class SendResultsServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        req.getRequestDispatcher("/servlets&jsp/guessing-game.jsp").forward(req, res);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        int correctNumber = (int) (Math.random() * (3 - 1 + 1) + 1);
        int guess = Integer.parseInt(req.getParameter("userNumber"));

        if (guess == correctNumber) {
            req.setAttribute("outcome", "correct");
            res.sendRedirect("/servlets&jsp/results-game.jsp?guess=" + guess + "&outcome=correct");
        } else {
            req.setAttribute("outcome", "wrong");
            res.sendRedirect("/servlets&jsp/results-game.jsp?guess=" + guess + "&outcome=wrong");
        }

    }
}