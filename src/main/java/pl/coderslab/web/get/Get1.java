package pl.coderslab.web.get;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Get1", value = "/get1")
public class Get1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        String start = request.getParameter("start");
        String end = request.getParameter("end");
        if (start == null || end == null) {
            response.getWriter().println("BRAK");
            return;
        }
        try {
            int startNumber = Integer.parseInt(start);
            int endNumber = Integer.parseInt(end);
            for(int i = startNumber; i <= endNumber; i++){
                response.getWriter().println(i);
            }

        } catch (Exception e) {
            response.getWriter().println("Nie mogę zamienić na liczby całkowite.");
        }

    }


}