package pl.coderslab.web.cookies;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

@WebServlet(name = "Cookie51", value = "/cookie51")
public class Cookie51 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        Cookie cookie = new Cookie("cookie51", "cookie");
        cookie.setMaxAge(24 * 3600);
        response.addCookie(cookie);

        out.println("<html><body>");
        out.println("<a href=http://localhost:8080/cookie52>Przenieś mnie do strony</a>");

        String msg = request.getParameter("msg");
        msg = URLDecoder.decode(msg, StandardCharsets.UTF_8);
        out.println("<p>" + msg + "</p>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}