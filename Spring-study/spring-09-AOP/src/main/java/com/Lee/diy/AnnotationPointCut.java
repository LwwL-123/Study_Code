package com.Lee.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.omg.CORBA.PUBLIC_MEMBER;

@Aspect//标注这个类是一个切面
public class AnnotationPointCut {
    @Before("execution(* com.Lee.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("===方法执行前===");
    }

    @After("execution(* com.Lee.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("===方法执行后===");
    }

    //
    @Around("execution(* com.Lee.service.UserServiceImpl.*(..))")
    public void arround(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("===环绕前===");
        Signature signature = jp.getSignature();   //获得签名
        System.out.println("signature:"+signature);
        //执行方法
        Object proceed = jp.proceed();
        System.out.println("===环绕后===");
    }
}
