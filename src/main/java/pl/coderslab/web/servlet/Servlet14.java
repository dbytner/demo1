package pl.coderslab.web.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Servlet14", value = "/servlet14")
public class Servlet14 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String adrressIP = request.getHeader("Host");
        response.getWriter().println(adrressIP);
        String browser = request.getHeader("User-Agent");
        response.getWriter().println(browser);
    }

}