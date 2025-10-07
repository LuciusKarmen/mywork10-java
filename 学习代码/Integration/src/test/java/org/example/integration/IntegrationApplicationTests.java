package org.example.integration;

import org.example.integration.service.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class IntegrationApplicationTests {

    @Autowired
    private Book a;
    @Test
    void contextLoads() {
        a.save();
    }

}
