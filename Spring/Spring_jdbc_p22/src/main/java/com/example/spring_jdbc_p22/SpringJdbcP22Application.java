package com.example.spring_jdbc_p22;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import java.sql.Connection;
import java.sql.DriverManager;

public class SpringJdbcP22Application {

    public static void main(String[] args) {
        ApplicationContext appcont = new ClassPathXmlApplicationContext("bean.xml");

//        try{
//            DriverManagerDataSource datasource1 = appcont.getBean("datasource1", DriverManagerDataSource.class);
//            Connection con = datasource1.getConnection();
//            System.out.println("Connection Established");
//        }catch (Exception e) {System.out.println(e);}

        JdbcTemplate template = appcont.getBean("jdbctemplate", JdbcTemplate.class);
        String query="INSERT INTO student(id,name,address) VALUES(?,?,?)";
        int status = template.update(query, 05, "php", "srp");
        System.out.println("Record Inserted "+status);
    }
}
