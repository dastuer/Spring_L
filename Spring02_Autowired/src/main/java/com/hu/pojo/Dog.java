package com.hu.pojo;

import lombok.Data;

/**
 * @author Dia o
 */
@Data
public class Dog {
    String name;
    public void bark(){
        System.out.println("woof woof woof!");
    }
}
