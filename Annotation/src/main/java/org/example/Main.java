package org.example;

import org.example.config.Config;
import org.example.dao.BookDao;
import org.example.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
//        注解的使用
        ApplicationContext ctx= new AnnotationConfigApplicationContext(Config.class);
        BookService a= (BookService) ctx.getBean("service");
        BookDao b= (BookDao) ctx.getBean("Aao");
        a.work();
        b.work();


    }
}