package org.example.integration.service;

import org.springframework.stereotype.Component;

@Component
public class BookImpl implements Book {
    @Override
    public void save() {
        int a=1;
        int b=4;
        System.out.println(a+b);
    }
}
