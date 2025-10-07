package com.xingchengnet.pojo;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

//极速配置
@Component  // 让 Spring 能扫描到这个类
@ConfigurationProperties(prefix = "enterprise")  // 绑定配置前缀
public class Yam {

    private String name;
    private Integer age;
    private String tel;
    private List<String> subject;

    // getter 和 setter 方法（必须写！）
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public List<String> getSubject() {
        return subject;
    }

    public void setSubject(List<String> subject) {
        this.subject = subject;
    }

    // toString 可选，方便打印
    @Override
    public String toString() {
        return "EnterpriseConfig{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", tel='" + tel + '\'' +
                ", subject=" + subject +
                '}';
    }
}