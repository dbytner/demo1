package pl.coderslab.web.cookies;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Cookie1Del", value = "/delCookie")
public class Cookie1Del extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        Cookie cookie = CookieHelper.getCookie("User", request.getCookies());

        if(cookie == null){
            response.getWriter().println("Nie ma takiego ciasteczka User");
        } else {
            cookie.setMaxAge(0);
            response.addCookie(cookie);
            response.getWriter().println("Usunięto ciasteczko User");
        }
    }


}