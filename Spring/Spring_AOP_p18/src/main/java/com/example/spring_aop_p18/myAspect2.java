package com.example.spring_aop_p18;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect     //get Id method of specific class emp/stud by using package
public class myAspect2 {
    @Before("execution(public int com.example.spring_aop_p18.Emp.getId())")
    public void beforeAdvice(){
        System.out.println("before target method package");
    }

    @After("execution(public int com.example.spring_aop_p18.Emp.getId())")
    public void afterAdvice(){
        System.out.println("after target method package");
    }

}
