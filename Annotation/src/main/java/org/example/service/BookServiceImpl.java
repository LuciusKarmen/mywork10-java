package org.example.service;

import org.example.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("service")
public class BookServiceImpl implements BookService{

    //引用类型的注入
    @Autowired
    @Qualifier("dao")

    private BookDao a;
    @Override
    public void work() {
        System.out.println("SERVICE...");
        a.work();

    }
}
