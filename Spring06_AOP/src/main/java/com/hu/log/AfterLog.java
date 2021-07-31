package com.hu.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterLog implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        if (returnValue!=null)
            System.out.println("执行了"+method.getName()+"方法，返回了"+returnValue.toString()+"结果");
        else
            System.out.println("执行了"+method.getName()+"方法,没有返回任何信息");
    }
}
