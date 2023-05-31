package pl.coderslab.web.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

@WebServlet(name = "Servlet25", value = "/servlet25")
public class Servlet25 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        Random random = new Random();
        PrintWriter out = response.getWriter();
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= 10; i++){
            int id = random.nextInt(100);
            arrayList.add(id);
        }
        ListIterator<Integer> listIterator = arrayList.listIterator();
        out.println("<html><body><p>");
        while (listIterator.hasNext()) {
            Integer number = listIterator.next();
            out.println(number);
        }
        out.println("</p><p>");
        while (listIterator.hasPrevious()) {
            Integer number = listIterator.previous();
            out.println(number);
        }
        out.println("</p></body></html>");
    }


}