package com.example.spring_p10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Set;

public class SpringP10Application {

    public static void main(String[] args) {
        ApplicationContext appcont = new ClassPathXmlApplicationContext("/templates/bean.xml");
        Report rob = (Report) appcont.getBean("rob");
        Set<emp_p10> listemp = rob.getListemp();
        System.out.println(listemp);
    }
}
