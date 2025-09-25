package org.example.service;

import org.example.dao.UseDao;
import org.example.dao.UseDaoImpl;

public class UseServiceImpl implements UseService  {

    private UseDao dao;
    @Override
    public void save() {
        System.out.println("Service成功");
        dao.save();
    }
    public void setDao(UseDao dao){
        this.dao=dao;
    }
}
