package pl.coderslab.web.form;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Form1", value = "/post1")
public class Form1 extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String userName = request.getParameter("userName");
        String userSurname = request.getParameter("userSurname");

        response.getWriter().println("Witaj, " + userName + " " + userSurname);

    }
}