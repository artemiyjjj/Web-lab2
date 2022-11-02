package com.backend.lab2vol4.utils.filters;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class ParamFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        // todo логика фильтра (сделать класс с параметрами из ресурсов и сравнивать наличие аргументов из запроса с параметрами из ресурсов)
        if (true){
            filterChain.doFilter(servletRequest, servletResponse);
        }
        else {
            PrintWriter out = servletResponse.getWriter();
            out.println("Form data is not correct.");
        }
    }
}
