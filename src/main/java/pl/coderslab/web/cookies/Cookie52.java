package pl.coderslab.web.cookies;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.net.URLEncoder;

@WebServlet(name = "Cookie52", value = "/cookie52")
public class Cookie52 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        Cookie cookie = CookieHelper.getCookie("cookie51", request.getCookies());

        if(cookie == null){
            String message = "First Visit Cookie51";
            response.sendRedirect("cookie51?msg=" + URLEncoder.encode(message, "UTF-8"));

        } else {
            cookie.setMaxAge(0);
            response.addCookie(cookie);
            response.getWriter().println("<p>Usunięto ciasteczko cookie51</p>");
            response.getWriter().println("Witamy na stronie Cookie52");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}