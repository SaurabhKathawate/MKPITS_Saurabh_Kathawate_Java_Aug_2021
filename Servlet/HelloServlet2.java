package com.example.demo2;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet2 extends HttpServlet {
    private String message;

    public void init() {
        message = "Welcome to my servlet";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        //action logic to collect data from FORM
        String name = request.getParameter("Name");
        String addres = request.getParameter("addr");

        //displaying to browser
        out.println("name = : "+name);
        out.println("address = : "+addres);

        out.println("</body></html>");
    }

    public void destroy() {
    }
}