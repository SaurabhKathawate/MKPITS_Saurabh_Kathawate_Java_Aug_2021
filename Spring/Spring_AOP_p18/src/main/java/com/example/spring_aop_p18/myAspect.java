package com.example.spring_aop_p18;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect  //get Id method of emp and stud class
public class myAspect {
    @Before("execution(public int getId())")
    public void beforeAdvice(){
        System.out.println("before target method");
    }

    @After("execution(public int getId())")
    public void afterAdvice(){
        System.out.println("after target method");
    }
}
