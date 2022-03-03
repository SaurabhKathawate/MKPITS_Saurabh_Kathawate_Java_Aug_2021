package com.example.spring_p15;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringP15Application {

    public static void main(String[] args) {
        ApplicationContext appcont = new ClassPathXmlApplicationContext("/templates/bean.xml");
        emp_p15 bob = (emp_p15) appcont.getBean("base");
        System.out.println(bob);

        emp_p15 ob2 = (emp_p15) appcont.getBean("ob2");
        System.out.println(ob2);
    }

}
