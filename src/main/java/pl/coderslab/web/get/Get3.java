package pl.coderslab.web.get;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Get3", value = "/get3")
public class Get3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        String width = request.getParameter("width");
        String high = request.getParameter("high");

        if(width == null || high == null){
            for(int row = 1; row <=10; row++){
                for(int column = 1; column <= 5; column++){
                    response.getWriter().print(row * column + " ");
                }
                response.getWriter().println("\n");
            }
        } else {
            try{
                int widthNumber = Integer.parseInt(width);
                int highNumber = Integer.parseInt(high);
                for(int row = 1; row <=highNumber; row++){
                    for(int column = 1; column <= widthNumber; column++){
                        response.getWriter().print(row * column + " ");
                    }
                    response.getWriter().println("\n");
                }

            } catch (Exception e){
                response.getWriter().println("Podano błędne dane.");
            }
        }

    }


}