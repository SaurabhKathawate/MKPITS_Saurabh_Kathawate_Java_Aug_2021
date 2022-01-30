package com.example.demo4;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import static java.lang.System.out;

//@WebServlet(name = "Servlet4", value = "/Servlet4")
public class Servlet4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String username=request.getParameter("username");
        String password=request.getParameter("password");

        PrintWriter out = response.getWriter();
        out.println(username);
        out.println(password);
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/database1","root","root");
            Statement stmt=con.createStatement();
            String qr=("insert into table1 values ('"+username+"','"+password+"')");
            stmt.executeUpdate(qr);
            out.println("data insert");

            out.println("database connected");
        }catch(Exception e){
            out.println(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
