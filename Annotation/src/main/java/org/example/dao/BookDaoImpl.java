package org.example.dao;

import org.springframework.stereotype.Component;
@Component("dao")
public class BookDaoImpl implements BookDao{

    @Override
    public void work() {
        System.out.println("Dao...");
    }


}
