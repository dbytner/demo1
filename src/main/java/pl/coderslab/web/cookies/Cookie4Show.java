package pl.coderslab.web.cookies;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Cookie4Show", value = "/showAllCookies")
public class Cookie4Show extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        Cookie[] cookies = request.getCookies();

        out.println("<html><body>");
        for(Cookie c: cookies){
            String name = c.getName();
            out.println("<p>");
            out.println(name);
            out.println("<a href=http://localhost:8080/removeCookie?name=" + name + ">Przenieś mnie do strony</a>");
        }
        out.println("</p></body></html>");
    }
}