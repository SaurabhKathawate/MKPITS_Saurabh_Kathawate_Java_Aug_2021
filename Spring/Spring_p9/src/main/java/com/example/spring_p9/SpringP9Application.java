package com.example.spring_p9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SpringP9Application {

    public static void main(String[] args) {
        ApplicationContext appcont = new ClassPathXmlApplicationContext("/templates/bean.xml");
        Report rob = (Report) appcont.getBean("rob");
        List<emp_p9> listemp = rob.getListemp();
        System.out.println(listemp);
    }
}
