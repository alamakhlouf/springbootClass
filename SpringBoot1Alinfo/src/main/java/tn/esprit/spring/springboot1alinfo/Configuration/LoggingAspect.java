package tn.esprit.spring.springboot1alinfo.Configuration;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class LoggingAspect {

    @Before("execution(* tn.esprit.spring.springboot1alinfo.Service.ServiceImpl.*.*(..))")
    public void logMethodEntry(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("In method " + name + " : ");
    }

    @After("execution(* tn.esprit.spring.springboot1alinfo.Service.ServiceImpl.*.*(..))")
    public void logMethodExit(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("Exit method " + name + " : ");
    }

    @AfterThrowing("execution(* tn.esprit.spring.springboot1alinfo.Service.ServiceImpl.*.*(..))")
    public void logMethodExitThrowing(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("Exit method error " + name + " : ");
    }


    @AfterReturning("execution(* tn.esprit.spring.springboot1alinfo.Service.ServiceImpl.*.*(..))")
    public void logMethodExitReturning(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("Exit without error method  " + name + " : ");
    }
}
