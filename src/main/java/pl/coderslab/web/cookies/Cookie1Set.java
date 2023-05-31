package pl.coderslab.web.cookies;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Cookie1Set", value = "/setCookie")
public class Cookie1Set extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        Cookie cookie = new Cookie("User", "CodersLab");
        cookie.setMaxAge(24 * 3600);
        response.addCookie(cookie);
        response.getWriter().println("Ustawiono ciasteczko");
    }


}