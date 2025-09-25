package org.example;

import org.example.service.UseService;
import org.example.service.UseServiceImpl;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        UseService a=new UseServiceImpl();
        a.save();

    }
}
//传统版本