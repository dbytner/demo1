package pl.coderslab.web.form;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Form4", value = "/post4")
public class Form4 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        String param_1 = request.getParameter("number_1");
        String param_2 = request.getParameter("number_2");
        String param_3 = request.getParameter("number_3");

        try {
            double number_1 = Double.parseDouble(param_1);
            double number_2 = Double.parseDouble(param_2);
            double number_3 = Double.parseDouble(param_3);
            response.getWriter().println(Calculate.calculate(number_1, number_2, number_3));

        } catch (Exception e) {
            response.getWriter().println("Należy podać wszystkie współczynniki w postaci liczby");
        }

    }
}