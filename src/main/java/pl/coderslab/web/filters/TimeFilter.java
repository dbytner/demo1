package pl.coderslab.web.filters;

import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebFilter(filterName = "TimeFilter", value = "/*")
public class TimeFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        long startTime = System.currentTimeMillis();

        chain.doFilter(request, response);

        long stopTime = System.currentTimeMillis();
        System.out.println("czas:" + (stopTime - startTime) + " millisekund");
    }
}