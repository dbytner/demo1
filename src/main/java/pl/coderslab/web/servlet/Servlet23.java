package pl.coderslab.web.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


@WebServlet(name = "Servlet23", value = "/servlet23")
public class Servlet23 extends HttpServlet {
    private static final String fileName = "/home/damian/Dokumenty/Repozytoria/demo1/oop.txt";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Path path = Paths.get(fileName);
        List<String> arrayList = new ArrayList<>();
        if (Files.exists(path)) {
            try {
                arrayList = Files.readAllLines(path);
            } catch (IOException e) {
                response.getWriter().println(e.getMessage());
            }
        } else {
            response.getWriter().println("Plik nie istnieje");
        }
        for (String string : arrayList) {
            response.getWriter().println(string);
        }
    }

}