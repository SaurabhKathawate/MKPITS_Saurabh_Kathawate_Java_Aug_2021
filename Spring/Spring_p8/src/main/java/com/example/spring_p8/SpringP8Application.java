package com.example.spring_p8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringP8Application {

    public static void main(String[] args) {
        ApplicationContext appcont = new ClassPathXmlApplicationContext("/templates/bean.xml");
        emp_p8 eob = (emp_p8) appcont.getBean("emp_p8");
        System.out.println(eob.getId());
        System.out.println(eob.getName());
        eob.display();

        Account acc = (Account) appcont.getBean("aob");
        acc.trans();
    }

}
