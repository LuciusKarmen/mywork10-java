package org.example.interpretor.controller;

import org.example.interpretor.dao.UserMapper;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/a")
public class UserController {

    //核心
    private final UserMapper a;

    public UserController(UserMapper a) {
        this.a = a;
    }

    @GetMapping("/a")
    public String add(@RequestParam int id,
                       @RequestParam int age,
                       @RequestParam String name
                       ){
        a.add(id, age, name);
        System.out.println("ba");
        return "OK!";
    }

}
