package com.example.servlet3;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World! 2";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        //action logic to collect data from FORM
        String name =request.getParameter("name");
        String password =request.getParameter("password");
        String gender =request.getParameter("gender");
//      String course =request.getParameter("course");
        String course[] =request.getParameterValues("course");
        String city = request.getParameter("city");
        String dob = request.getParameter("dob");
        String description = request.getParameter("description");

        //display to browser
        out.println("<table>");
        out.println("<tr>");
        out.println("<td>name:</td>");
        out.println("<td>" + name + "</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>password:</td>");
        out.println("<td>" + password + "</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>gender:</td>");
        out.println("<td>" + gender + "</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>course:</td>");
//        out.println("<td>" + course + "</td>");
        for(String s:course
             ) {
            out.println("<td>" + s + "</td>");
        }
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>city:</td>");
        out.println("<td>" + city + "</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>dob:</td>");
        out.println("<td>" + dob + "</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>description:</td>");
        out.println("<td>" + description + "</td>");
        out.println("</tr>");
        out.println("</table>");
    }
    public void destroy() {
    }
}