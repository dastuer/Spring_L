package com.hu.pojo;

import lombok.Data;

/**
 * @author Dia o
 */
@Data
public class Cat {
    private String name;
    public void meow(){
        System.out.println("mew mew mew!");
    }
}
