package com.example.spring_p12;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Properties;


public class SpringP12Application {

    public static void main(String[] args) {
        ApplicationContext appcont = new ClassPathXmlApplicationContext("/templates/bean.xml");
        Report rob = (Report) appcont.getBean("rob");
        Properties listemp = rob.getListemp();
        System.out.println(listemp);
    }
}
