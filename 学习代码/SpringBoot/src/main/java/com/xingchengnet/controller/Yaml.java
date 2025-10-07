package com.xingchengnet.controller;

import com.xingchengnet.pojo.Yam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shop")
public class Yaml {  // 改名，更清晰

    @Value("${lesson}")
    private String lesson;

      @Autowired
      private Yam yam;

    @GetMapping("/{age}")
    public String getAge(@PathVariable Integer age) {
        System.out.println("age ==> " + age);
        System.out.println("lesson ==> " + lesson);
        return "Hello, Karmen!";
    }

    // 新增：如果你想测试路径变量 A
    @GetMapping("/a/{A}")  // ✅ 加上 {A}
    public String getA(@PathVariable Integer A) {
        System.out.println("A ==> " + A);
        System.out.println(yam);
        return "Hello, Karmen! A = " + A;
    }
}