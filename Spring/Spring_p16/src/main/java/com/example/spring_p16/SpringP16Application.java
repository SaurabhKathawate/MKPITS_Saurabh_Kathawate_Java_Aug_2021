package com.example.spring_p16;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringP16Application {

    public static void main(String[] args) {
        ApplicationContext appcont = new ClassPathXmlApplicationContext("templates/bean.xml");
        Account acc = (Account) appcont.getBean("acc");
        acc.display();
    }

}
