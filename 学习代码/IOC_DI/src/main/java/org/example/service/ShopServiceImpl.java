package org.example.service;

import org.example.dao.UseDao;
import org.example.dao.UseDaoImpl;

public class ShopServiceImpl implements ShopService {
    private UseDao dao;
    private int age;
    public ShopServiceImpl(UseDaoImpl dao,int age){
        this.dao=dao;
        this.age=age;
    }

    @Override
    public void save(){
        dao.save();
        System.out.println("ShopService..."+age);
    }

}
