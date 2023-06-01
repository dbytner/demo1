package pl.coderslab.web.session;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Session2", value = "/Session2")
public class Session2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        String form = form = """
                <form method="post">
                    <input name="grade">
                    <input type="submit" value="dodaj ocenę">
                </form>
                """;
        response.getWriter().println(form);
        if(request.getSession().getAttribute("grades") != null) {
            List<Integer> grades = (List<Integer>)request.getSession().getAttribute("grades");
            double sum = 0;
            for(int grade: grades) {
                response.getWriter().println(grade + ", ");
                sum += grade;
            }
            response.getWriter().println("srednia:" + (sum / grades.size()));
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getSession().getAttribute("grades") == null) {
            req.getSession().setAttribute("grades", new ArrayList<Integer>());
        }
        String grade = req.getParameter("grade");
        try {
            ( (List<Integer>) req.getSession().getAttribute("grades") ).add(Integer.parseInt(grade));
        } catch(Exception e) {
            System.out.println(e);
        }
        resp.sendRedirect("/session2");
    }
}