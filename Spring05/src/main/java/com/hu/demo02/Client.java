package com.hu.demo02;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        DynamicProxy userServiceHandler = new DynamicProxy();
        userServiceHandler.setTarget(userService);
        //CLassLoader loader:被代理对象的类加载器
        //Class<?> interfaces:被代理类全部的接口
        //InvocationHandler h:实现InvocationHandler接口的对象
        UserService proxyInstance = (UserService) Proxy.newProxyInstance(
                userService.getClass().getClassLoader(),
                userService.getClass().getInterfaces(), userServiceHandler);
        proxyInstance.add();

    }


}
