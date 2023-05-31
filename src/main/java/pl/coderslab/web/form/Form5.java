package pl.coderslab.web.form;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Form5", value = "/post5")
public class Form5 extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        String temperature = request.getParameter("degrees");
        String conversionType = request.getParameter("conversionType");


        try {
            double temperatureNumber = Double.parseDouble(temperature);

            if (conversionType.equals("celcToFahr")) {
                response.getWriter().println(CalculateTemperature.calculateInFahrenheit(temperatureNumber));
            } else {
                response.getWriter().println(CalculateTemperature.calculateInCelsius(temperatureNumber));
            }

        } catch (Exception e) {
            response.getWriter().println("Podaj temperaturę");
        }

    }
}