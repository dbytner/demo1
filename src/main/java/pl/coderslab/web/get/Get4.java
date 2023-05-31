package pl.coderslab.web.get;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Arrays;

@WebServlet(name = "Get4", value = "/get4")
public class Get4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String company = request.getParameter("company");
        String[] learn = request.getParameterValues("learn");
        if (company == null || learn == null) {
            response.getWriter().println("BRAK");
            return;
        }
        response.getWriter().println("company: \n" + "-" + company);
        response.getWriter().println("learn:");
        for (String text: learn) {
            response.getWriter().println("-" + text);
        }

    }


}