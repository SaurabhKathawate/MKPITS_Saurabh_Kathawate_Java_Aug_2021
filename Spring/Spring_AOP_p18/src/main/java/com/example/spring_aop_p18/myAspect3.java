package com.example.spring_aop_p18;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect            //get*() ....variables like id string...
public class myAspect3 {
    @Before("execution(public int get*())")
    public void beforeAdvice(){
        System.out.println("before target method package");
    }

    @After("execution(public int get*())")
    public void afterAdvice(){
        System.out.println("after target method package");
    }

}
