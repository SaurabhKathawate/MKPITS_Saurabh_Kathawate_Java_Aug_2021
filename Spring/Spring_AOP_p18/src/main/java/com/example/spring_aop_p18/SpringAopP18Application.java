package com.example.spring_aop_p18;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringAopP18Application {

    public static void main(String[] args) {
        ApplicationContext appcont=new ClassPathXmlApplicationContext("bean.xml");
        Emp eob = appcont.getBean("eob", Emp.class);
        System.out.println(eob.getId()+" "+eob.getName());
//        eob.setId(123);
//        System.out.println(eob.getId());                 //myAspect6

        stud sob = appcont.getBean("sob", stud.class);
        System.out.println(sob.getId()+" "+sob.getName());
    }
}
