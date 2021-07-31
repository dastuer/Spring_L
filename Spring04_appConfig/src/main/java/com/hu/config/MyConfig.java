package com.hu.config;

import com.hu.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Dia o
 */
// 配置组件，@Configuration表示这是一个配置类
@Configuration
@ComponentScan("com.hu.pojo")
public class MyConfig {
    // @Bean相当于注册一个Bean标签，方法名为id，返回值为class属性
    @Bean
    public User getUser(){
        return new User();
    }
}
