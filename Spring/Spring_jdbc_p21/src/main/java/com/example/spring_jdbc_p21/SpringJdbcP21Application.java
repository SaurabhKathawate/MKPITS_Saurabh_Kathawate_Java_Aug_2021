package com.example.spring_jdbc_p21;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.Connection;
import java.sql.DriverManager;

public class SpringJdbcP21Application {

    public static void main(String[] args) {
        ApplicationContext appcont = new ClassPathXmlApplicationContext("bean.xml");

        try{
            DriverManagerDataSource datasource1 = appcont.getBean("datasource1", DriverManagerDataSource.class);
            Connection con = datasource1.getConnection();
            System.out.println("Connection Established");
//            Class.forName("com.mysql.jdbc.Driver");
//            System.out.println("Driver loaded");
//            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/spring_db","root","root");
//            System.out.println("Connection Established");
        }catch(Exception e){ System.out.println(e);}
    }
}
