package pl.coderslab.web.cookies;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@WebServlet(name = "Cookie3", value = "/cookie3")
public class Cookie3 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        String key = request.getParameter("key");
        String value = request.getParameter("value");
        String time = request.getParameter("time");

        try {
            int timeNumber = Integer.parseInt(time) * 3600;
            key = URLEncoder.encode(key, StandardCharsets.UTF_8);
            value = URLEncoder.encode(value, StandardCharsets.UTF_8);
            Cookie cookie = new Cookie(key, value);
            cookie.setMaxAge(timeNumber);
            response.addCookie(cookie);
            response.getWriter().println("Ciasteczko dodane " + cookie.getName());
        } catch (Exception e){
            response.getWriter().println("Coś poszło nie tak");
        }

    }
}