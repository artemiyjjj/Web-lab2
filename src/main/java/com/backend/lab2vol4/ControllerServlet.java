package com.backend.lab2vol4;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "controllerServlet", value = "/controller-servlet")
public class ControllerServlet extends HttpServlet {
    private String handleServlet;
    private String mainPage;


    public void init() {
        handleServlet = "/area-check-servlet";
        mainPage = "/index.html";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext context = getServletContext();
        RequestDispatcher dispatcher = context.getRequestDispatcher(mainPage);
        dispatcher.forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            ServletContext context = getServletContext();
            RequestDispatcher dispatcher = context.getRequestDispatcher(handleServlet);
            dispatcher.forward(request, response);
        } catch (IOException e) {
            response.setStatus(500);
            PrintWriter out = response.getWriter();
            out.println("Troubles with request handling.");
        }
    }

    public void destroy() {
    }
}