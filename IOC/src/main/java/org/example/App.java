package org.example;

import org.example.dao.UseDao;
import org.example.service.UseService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class App {
    public static void main(String[] args) {
        //获取IoC
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        UseDao a= (UseDao) ctx.getBean("bookdao1");
        UseService b= (UseService) ctx.getBean("bookservice1");
        a.save();
        b.save();
    }
}