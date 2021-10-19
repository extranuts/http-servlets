package com.example.springbootess.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution (* listAll()) ")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println(
                "Before metod call - " + joinPoint.getSignature().getName()
        );
    }


}
