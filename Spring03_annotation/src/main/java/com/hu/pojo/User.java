package com.hu.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Dia o
 */
// @Component将类注册到Spring Container中，装配bean
@Component
// @Scope 设置bean作用域
@Scope("prototype")
public class User {
    // @Value注解注入值
    @Value("老王")
    String name;
}
