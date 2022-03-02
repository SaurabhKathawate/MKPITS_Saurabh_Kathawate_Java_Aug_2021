package com.example.spring_p13;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringP13Application {

    public static void main(String[] args) {
        ApplicationContext appcont = new ClassPathXmlApplicationContext("/templates/bean.xml");
        emp_p13 bob = (emp_p13) appcont.getBean("base");
        System.out.println(bob);

        emp_p13 ob = (emp_p13) appcont.getBean("ob2");
        System.out.println(ob);
    }

}
