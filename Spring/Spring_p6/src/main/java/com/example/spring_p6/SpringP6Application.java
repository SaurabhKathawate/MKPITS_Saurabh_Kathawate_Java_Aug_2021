package com.example.spring_p6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringP6Application {

    public static void main(String[] args) {
        ApplicationContext appcont = new ClassPathXmlApplicationContext("/templates/bean.xml");
        emp_p6 eob = (emp_p6) appcont.getBean("eob");
        System.out.println(eob.getId());
        System.out.println(eob.getName());
        eob.display();

        Account acc = (Account) appcont.getBean("aob");
        acc.trans();
    }

}
