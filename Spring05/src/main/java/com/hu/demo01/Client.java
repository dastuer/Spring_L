package com.hu.demo01;

/**
 * @author Dia o
 */
public class Client {
    public static void main(String[] args) {
        StaticProxyRent proxy = new StaticProxyRent(new Host());
        proxy.rent();
    }
}
