package com.example.spring_p4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringP4Application {

    public static void main(String[] args) {
        ApplicationContext appcont = new ClassPathXmlApplicationContext("/templates/bean.xml");
        emp_p4 eob = (emp_p4) appcont.getBean("emp_p4");
        System.out.println(eob.getId());
        System.out.println(eob.getName());
        eob.display();

        Account acc = (Account) appcont.getBean("aob");
        acc.trans();
    }

}
