package pl.coderslab.web.mvc;

import pl.coderslab.web.data.Book;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "Mvc13", value = "/mvc13")
public class Mvc13 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        String isbn = request.getParameter("isbn");

        if(title == null || author == null || isbn == null){
            response.sendRedirect("/mvc13");
            response.getWriter().println("Nie podano wszystkich danych");
        } else {
//            List<Book> books = List.of(new Book(title, author, isbn));
//            request.setAttribute("book", books);
            Book book = new Book(title, author, isbn);
            request.setAttribute("title", book.getTitle());
            request.setAttribute("author", book.getAuthor());
            request.setAttribute("isbn", book.getIsbn());
            getServletContext().getRequestDispatcher("/WEB-INF/result.jsp").forward(request, response);
        }

    }
}