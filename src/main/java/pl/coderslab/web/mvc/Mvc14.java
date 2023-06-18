package pl.coderslab.web.mvc;

import pl.coderslab.web.data.Book;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "Mvc14", value = "/mvc14")
public class Mvc14 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        List<Book> books = List.of(new Book("Krzyżacy", "H. Sienkiewicz", "FGHF767678HH"),
                new Book("Ostatnie życzenie", "A. Sapkowski", "67687AFDDF"),
                new Book("Sługa honoru", "A. Przechrzta", "65757ADRS"));
        request.setAttribute("books", books);
        getServletContext().getRequestDispatcher("/WEB-INF/resultList.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}