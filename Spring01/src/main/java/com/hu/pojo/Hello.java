package com.hu.pojo;

import lombok.Data;

/**
 * @author Dia o
 */
@Data
public class Hello {
    private int size;
    private String name;
    public void say(){
        System.out.println(name+size);
    }
}
