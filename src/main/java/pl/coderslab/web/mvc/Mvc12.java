package pl.coderslab.web.mvc;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Mvc12", value = "/mvc12")
public class Mvc12 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String start = request.getParameter("start");
        String end = request.getParameter("end");

        try {
            int startNumber = Integer.parseInt(start);
            int endNumber = Integer.parseInt(end);
            request.setAttribute("start", startNumber + 10);
            request.setAttribute("end", endNumber + 10);
            getServletContext().getRequestDispatcher("/WEB-INF/jsp2.jsp").forward(request, response);

        } catch (Exception e){
            response.getWriter().println("Podano błędne dane.");
        }
    }


}