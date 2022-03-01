package com.example.spring_p11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;


public class SpringP11Application {

    public static void main(String[] args) {
        ApplicationContext appcont = new ClassPathXmlApplicationContext("/templates/bean.xml");
        Report rob = (Report) appcont.getBean("rob");
        Map<Integer,emp_p11> listemp = rob.getListemp();
        System.out.println(listemp);
    }
}
