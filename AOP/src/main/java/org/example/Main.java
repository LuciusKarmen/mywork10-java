package org.example;

import org.example.config.SpringConfig;
import org.example.dao.UseDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx= new AnnotationConfigApplicationContext(SpringConfig.class);
        UseDao a= (UseDao) ctx.getBean("dao");
        a.save();


    }
}