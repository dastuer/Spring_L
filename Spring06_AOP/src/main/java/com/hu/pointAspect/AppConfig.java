package com.hu.pointAspect;

import com.hu.service.UserService;
import com.hu.service.UserServiceImpl;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration
public class AppConfig {
    @Bean
    public AnnotationAspect annotationAspect(){
        return new AnnotationAspect();
    }
    @Bean
    public UserService service(){
        return new UserServiceImpl();
    }
}
