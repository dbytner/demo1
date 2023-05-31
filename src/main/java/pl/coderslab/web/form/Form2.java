package pl.coderslab.web.form;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Form2", value = "/post2")
public class Form2 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String text = request.getParameter("text");
        String doCensorship = request.getParameter("doCensorship");
        if( doCensorship == null) {
            response.getWriter().println(Censor.doCensorship(text));
        } else {
            response.getWriter().println(text);
        }
    }
}