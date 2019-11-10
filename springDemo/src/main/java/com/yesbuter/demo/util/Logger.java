package com.yesbuter.demo.util;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component("logger")
@Aspect
public class Logger {

     @Pointcut("execution(public String com.yesbuter.demo.service.impl.AccountServiceImpl.searchAccount())")
    private void accountServicePointCut() {

    }

    @After("accountServicePointCut()")
    public void doAfterAdvice(JoinPoint joinPoint){
        System.out.println("后置最终通知执行了");
    }

    @Around("accountServicePointCut()")
    public Object printLogger(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("logger is running");
        String result = (String) joinPoint.proceed();
        System.out.println("logger is running");
        return result;
    }
}
