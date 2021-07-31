package com.hu.demo02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy implements InvocationHandler {
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    @Override
    //Object proxy:被代理的对象
    //Method method:要调用的方法
    //Object[] args:方法调用时所需要参数
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        return method.invoke(target,args);
    }
    public void log(String msg){
        System.out.println(msg);
    }
}
