package pl.coderslab.web.session;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Session1Get", value = "/session1Get")
public class Session1Get extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        if(request.getSession().getAttribute("counter") == null){
            response.getWriter().println("Empty");
        }else {
            int value = (int) request.getSession().getAttribute("counter");
            response.getWriter().println(value);
            request.getSession().setAttribute("counter", value);
        }
    }


}