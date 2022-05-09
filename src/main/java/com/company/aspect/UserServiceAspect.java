package com.company.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
@Slf4j
public class UserServiceAspect {

    @Before("execution(* com.company.service.impl.UserServiceImpl.*(..))")
    public void beforeAllUserMethods(JoinPoint joinpoint) throws InterruptedException {
        log.info("{}", joinpoint.getSignature());
        log.info("{}", Arrays.toString(joinpoint.getArgs()));
        System.err.println("This will be printed before the method starts.");
        Thread.sleep(3000);// I put Thread.sleep on purpose
    }

    @After("execution(* com.company.service.UserService.*(..))")
    public void afterAllUserMethods() {
        System.err.println("This will be printed after the method is completed.");
    }

    @AfterThrowing(pointcut = "execution(* com.company.service.impl.UserServiceImpl.*(..))", throwing = "exception")
    public void afterExceptionAllUserMethods(Throwable exception) {
        System.err.println(exception.getMessage());
    }

    @AfterReturning(value = "execution(* com.company.service.UserService.*(..))", returning = "result")
    public void afterReturningMethods(Object result) {
        log.info("{}", result);
        System.err.println("This will be printed after the method returns sth");
    }

    @Around("execution(* com.company.service.impl.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Thread.sleep(3000);
        proceedingJoinPoint.proceed();
        Thread.sleep(3000);
        System.out.println("This will be printed around the method.");
    }
}
