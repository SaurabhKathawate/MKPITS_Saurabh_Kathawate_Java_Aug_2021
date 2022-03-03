package com.example.spring_aop_p17;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAopP17Application {

    public static void main(String[] args) {
        ApplicationContext atx = new ClassPathXmlApplicationContext("bean.xml");
        Emp eob = atx.getBean("eob", Emp.class);
        System.out.println(eob.getId()+" "+eob.getName());
    }
}
