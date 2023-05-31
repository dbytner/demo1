package pl.coderslab.web.cookies;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@WebServlet(name = "Cookie2", value = "/addToCookies")
public class Cookie2 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String key = request.getParameter("key");
        String value = request.getParameter("value");

        try {
            key = URLEncoder.encode(key, StandardCharsets.UTF_8);
            value = URLEncoder.encode(value, StandardCharsets.UTF_8);
            Cookie cookie = new Cookie(key, value);
            response.addCookie(cookie);
            response.getWriter().println("Ciasteczko dodane " + cookie.getName());
        } catch (Exception e){
            response.getWriter().println("Coś poszło nie tak");
        }
    }
}