package com.roman.web022023;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(urlPatterns = {"/hello-servlet"})
public class HelloServlet extends HttpServlet {

    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        String str = request.getParameter("num");
        int number = Integer.parseInt(str);
        ++number;
        request.setAttribute("res", number);
        request.getRequestDispatcher("/jap/main.jsp").forward(request, response);
    }

    public void destroy() {
    }
}