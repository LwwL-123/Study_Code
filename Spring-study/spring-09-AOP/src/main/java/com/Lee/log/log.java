package com.Lee.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class log implements MethodBeforeAdvice {

    /**
     *
     * @param method 要执行的抽象方法
     * @param args   参数
     * @param target 目标对象
     */

    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName()+"的"+method.getName()+"被执行了");
    }
}
