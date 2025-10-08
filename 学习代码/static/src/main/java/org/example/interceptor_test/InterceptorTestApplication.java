package org.example.interceptor_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InterceptorTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(InterceptorTestApplication.class, args);
        System.out.println("success!!!");
    }

}
