package org.example;

import org.example.dao.UseDao;
import org.example.service.ShopService;
import org.example.service.UseService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class App {
    public static void main(String[] args) {
        //获取IoC
//  创建容器的办法

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
// 类路径      ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
// 文件       FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("C:\\Users\\HP\\Desktop\\仓库10(java)\\mywork10-java\\IOC\\src\\main\\resources\\applicationContext.xml");
//  多个      ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml","1.xml");



//        获取bean
        UseDao a= (UseDao) ctx.getBean("daodao");
        UseService b= (UseService) ctx.getBean("bookservice1");
        ShopService c= (ShopService) ctx.getBean("Shop");
        a.save();
        b.save();
        c.save();
        //因为结束之后虚拟机直接关闭了，没有机会销毁就结束了
        //使用关闭标记
        ctx.close();
        //关闭的时候销毁

    }
}