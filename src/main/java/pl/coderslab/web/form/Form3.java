package pl.coderslab.web.form;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Form3", value = "/getForm3")
public class Form3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        String param = request.getParameter("page");

        try {
            int paramNumber = Integer.parseInt(param);
            for (int i = 1; i <= paramNumber; i++){
                if(paramNumber % i == 0){
                    response.getWriter().println(i);
                }
            }
        } catch (Exception e) {
            response.getWriter().println("Należy podać liczbę");
        }


    }


}