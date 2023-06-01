package pl.coderslab.web.mvc;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Mvc11", value = "/mvc11")
public class Mvc11 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String role = request.getParameter("role");
        if(role == null){
            request.setAttribute("userRole", "guest");
        } else{
            request.setAttribute("userRole", "ROLE_" + role.toUpperCase());
        }

        getServletContext().getRequestDispatcher("/WEB-INF/jsp1.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}