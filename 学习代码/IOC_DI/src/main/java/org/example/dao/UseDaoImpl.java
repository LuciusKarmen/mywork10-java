package org.example.dao;

public class UseDaoImpl implements UseDao {
    @Override
    public void save() {
        System.out.println("dao成功");
    }
    public void init(){
        System.out.println("init...");

    }
    public void destory(){
        System.out.println("destory...");
    }
}
