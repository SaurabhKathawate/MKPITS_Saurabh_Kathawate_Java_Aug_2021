package com.example.spring_p7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringP7Application {

    public static void main(String[] args) {
        ApplicationContext appcont= new ClassPathXmlApplicationContext("/templates/bean.xml");
        emp_p7 eob = (emp_p7) appcont.getBean("eob1");    //object name should not be necessary to match with bean name
        System.out.println(eob.getId());
        System.out.println(eob.getName());
        eob.display();

        Account acc = (Account) appcont.getBean("aob");
        acc.trans();
    }

}
