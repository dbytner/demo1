package pl.coderslab.web.mvc;

import pl.coderslab.web.data.Book;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "Main00Forward", value = "/forward")
public class Main00Forward extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("user", "Jan Kowalski");
        List<String> products = List.of("pomidor", "marchewka");
        request.setAttribute("products", products);

        List<Book> books = List.of(new Book("Krzyżacy", "henryk Sienkiewicz"), new Book("LoTR", "JRRTolkien"));
        request.setAttribute("books", books);
        getServletContext().getRequestDispatcher("/forward.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}