package org.example.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("Aao")
public class BookDaoAmpl implements BookDao{
    //简单类型的注入
    @Value("XGM")
    private String name;
    @Value("${age}")
    private String age;


    @Override
    public void work() {
        System.out.println("Aao..."+name+age);
    }


}
