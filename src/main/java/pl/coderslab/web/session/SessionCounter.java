package pl.coderslab.web.session;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SessionCounter", value = "/counter")
public class SessionCounter extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        if(session.getAttribute("counter") == null){
            session.setAttribute("counter", 1);
        } else {
            int value = (int) session.getAttribute("counter") + 1;
            session.setAttribute("counter", value);
        }
    }


}