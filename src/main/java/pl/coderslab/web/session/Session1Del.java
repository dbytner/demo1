package pl.coderslab.web.session;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Session1Del", value = "/session1Del")
public class Session1Del extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getSession().getAttribute("counter") != null){
            request.getSession().removeAttribute("counter");
            response.getWriter().println("usunięto klucz counter z sesji");
        } else {
            response.getWriter().println("nie ma klucza counter w sessji");
        }
    }


}