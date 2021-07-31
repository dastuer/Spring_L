package com.hu.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

import javax.annotation.Resource;

/**
 * @author Dia o
 */
@Data
public class Human {
    private String name;
    @Resource
    private Cat cat;
    @Resource
    private Dog dog;
}
