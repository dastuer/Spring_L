package com.hu.demo02;

public class UserServiceImpl implements UserService{

    @Override
    public void add() {
        System.out.print("add users");
    }

    @Override
    public void delete() {
        System.out.println("delete users");
    }

    @Override
    public void update() {
        System.out.println("update user");
    }

    @Override
    public void query() {
        System.out.println("query user");
    }
}
