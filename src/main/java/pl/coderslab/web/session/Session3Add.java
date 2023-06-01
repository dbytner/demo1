package pl.coderslab.web.session;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Session3Add", value = "/addToSession")
public class Session3Add extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        String form = """
                <form action="" method="POST">
                    <label>
                        Klucz:
                        <input type="text" name="key">
                    </label>
                    <label>
                        Wartość:
                        <input type="text" name="value">
                    </label>
                    <input type="submit">
                </form>                            
                """;
        response.getWriter().println(form);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        String key = request.getParameter("key");
        String value = request.getParameter("value");
        request.getSession().setAttribute(key, value);
        response.getWriter().println("ustawiono zmienna " + key + " w sessji na wartosc" + value);
        response.sendRedirect("/addToSession");
    }
}