package com.hu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Dia o
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private int id;
    private int age;
    public User(int id){
        this.id=id;
    }
    public User(int id,String name){
        this.name=name;
        this.id=id;
    }
}
