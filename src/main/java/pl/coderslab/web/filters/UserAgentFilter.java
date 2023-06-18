package pl.coderslab.web.filters;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(filterName = "UserAgentFilter", value = "/*")
public class UserAgentFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        if(request instanceof HttpServletRequest requestHttp) {
            System.out.println(requestHttp.getHeader("user-agent"));
        }

        chain.doFilter(request, response);
    }
}