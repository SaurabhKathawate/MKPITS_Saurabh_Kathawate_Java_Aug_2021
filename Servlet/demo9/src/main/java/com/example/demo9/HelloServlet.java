package com.example.demo9;
import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
//@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String name = request.getParameter("uname");
        if(name.equals("saurabh"))
        {
            response.sendRedirect("success.html");
        }
        else
        {
            response.sendRedirect("error.html");
        }
    }

    public void destroy() {
    }
}