package pl.coderslab.web.cookies;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Cookie4Del", value = "/removeCookie")
public class Cookie4Del extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        Cookie cookie = CookieHelper.getCookie(name, request.getCookies());

        if(cookie == null){
            response.getWriter().println("Nie ma takiego ciasteczka User");
        } else {
            cookie.setMaxAge(0);
            response.addCookie(cookie);
            response.getWriter().println("Usunięto ciasteczko name");
        }
    }


}