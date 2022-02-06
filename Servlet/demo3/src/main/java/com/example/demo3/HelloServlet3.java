package com.example.demo3;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

//@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet3 extends HttpServlet {
    private String message;

    public void init() {
        message = "Student Details";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");

        //action logic to collect data from FORM
        String name =request.getParameter("name");
        String password =request.getParameter("password");
        String gender =request.getParameter("gender");
        String course =request.getParameter("course");
        String city = request.getParameter("city");
        String dob = request.getParameter("dob");
        String description = request.getParameter("description");

        //display to browser
        out.println("<table>");
        out.println("<tr>");
        out.println("<td>name:</td>"+name);
        //out.println("<td>" + name + "</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>password:</td>"+password);
        //out.println("<td>" + password + "</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>gender:</td>"+gender);
        //out.println("<td>" + gender + "</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>course:</td>"+course);
        //out.println("<td>" + course + "</td>");
//        for (String s:course) {
//            out.println("<td>" + s + "</td>");
//        }
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>city:</td>");
        out.println("<td>" + city + "</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>dob:</td>"+dob);
        //out.println("<td>" + dob + "</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>description:</td>"+description);
        //out.println("<td>" + description + "</td>");
        out.println("</tr>");
    }

    public void destroy() {
    }
}