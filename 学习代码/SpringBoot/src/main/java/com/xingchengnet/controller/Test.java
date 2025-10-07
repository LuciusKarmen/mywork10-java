package com.xingchengnet.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class Test {
    
    @GetMapping("/{id}")
    public String getID(@PathVariable Integer id){
        System.out.println("id==>"+id);
        return "Hello,Karmen!";

    }

}
