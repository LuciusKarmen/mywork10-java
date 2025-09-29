package org.example.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//被扫描
@Component//控制
@Aspect
public class MyAdvice {

    //4.设置切入点fn
    @Pointcut("execution(void org.example.dao.UseDaoImpl.save())")
    private void fn(){}



    @Before("fn()")
    public void method(){
        System.out.println("人民万岁！！！");
    }
    @After("fn()")
    public void me(){
        System.out.println("中国万岁！！！");
    }
}
