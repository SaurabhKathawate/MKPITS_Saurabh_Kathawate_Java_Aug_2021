package com.example.spring_aop_p18;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect           //get*() ....variables like id string...//public *...for data type like int String boolean
public class myAspect6 {
//    @Before("execution(public * get*())")
//    public void beforeAdvice(){
//        System.out.println("before target method package");
//    }
//
//    @After("execution(public * get*())")
//    public void afterAdvice(){
//        System.out.println("after target method package");
//    }

//    @Before("execution(public * get(..))")
//    public void beforeAdvice(){
//        System.out.println("before target method package");
//    }
//
//    @After("execution(public * get(..))")
//    public void afterAdvice(){
//        System.out.println("after target method package");
//    }

    @Before("execution(public void set(..))")
    public void beforeAdvice(){
        System.out.println("before target method package");
    }

    @After("execution(public void set(..))")
    public void afterAdvice(){
        System.out.println("after target method package");
    }

}
