package com.wondertek.jenkins.aopConfig;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopConfig {

    @Before("execution(* com.wondertek.jenkins.controller.*.*(..))")
    public void controllerAspectj(JoinPoint joinPoint) {
        System.out.println("调用controller层代码,方法名："+joinPoint.getSignature().getName());
    }
}
