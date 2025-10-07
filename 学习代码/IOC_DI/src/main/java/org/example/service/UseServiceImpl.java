package org.example.service;

import org.example.dao.UseDao;
import org.example.dao.UseDaoImpl;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class UseServiceImpl implements UseService, InitializingBean, DisposableBean {

    private UseDao dao;
    @Override
    public void save() {
        System.out.println("Service成功");
        dao.save();
    }
    //DI中setter注入引用类型
    public void setDao(UseDao dao){
        this.dao=dao;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("000");
        //属性设置之后
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("111");
    }
}
