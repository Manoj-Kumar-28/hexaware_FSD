package com.config;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    @Before("execution(* com.repository.*.*(..))")
    public void logBefore() {
        System.out.println("Repository method called");
    }

    //@After("execution(* com.service.*.*(..))")
//    public void logAfter() {
//        System.out.println("Service method completed");
//    }
    @After("execution(* com.repository.*.*(..))")
    public void logAfter() {
        System.out.println("Repository method completed");
    }
}
