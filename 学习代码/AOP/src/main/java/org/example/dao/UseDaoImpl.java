package org.example.dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class UseDaoImpl implements UseDao {


    @Override
    public void save() {
        System.out.println(System.currentTimeMillis());

    }

    @Override
    public void delete() {

    }
}
