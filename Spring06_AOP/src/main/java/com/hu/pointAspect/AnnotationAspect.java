package com.hu.pointAspect;

import lombok.SneakyThrows;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;


@Aspect
public class AnnotationAspect {
    //    定义切入点
    @Pointcut("execution(* com.hu.service.UserServiceImpl.*(..))")
    public void selectAll(){
    }
    @Before("selectAll()")
    public void before(){
        System.out.println("执行前");
    }
    @SneakyThrows
    @Around("selectAll()")
    public Object around(ProceedingJoinPoint point){
        System.out.println("环绕前");
        Object proceed = point.proceed();
        System.out.println("环绕后");
        return proceed;
    }

    @After("selectAll()")
    public void after(){
        System.out.println("执行后");
    }
    @AfterReturning(pointcut = "selectAll()",returning = "re")
    public void afterReturning(Object re){
        System.out.println("返回后");
    }
    @AfterThrowing(pointcut = "selectAll()", throwing = "ex")
    public void afterThrowing(IllegalArgumentException ex) {
        System.out.println("这里的异常为：" + ex.toString());
    }


}
