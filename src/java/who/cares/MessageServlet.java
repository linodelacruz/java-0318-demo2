package who.cares;

import java.io.IOException;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/messages")
public class MessageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().setAttribute("message", "This is the application scope");
        request.setAttribute("message", "I also like Taco Deli");
        request.getSession().setAttribute("message", "Yeah, it's the session " + new Date());
        
        getServletContext().getRequestDispatcher("/WEB-INF/messages.jsp").forward(request, response);
    }

}
