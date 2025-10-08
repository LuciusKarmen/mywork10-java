package org.example.interpretor.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserMapper {

    @Insert("INSERT INTO user (id, age, name) VALUES (#{id}, #{age}, #{name})")
    boolean add(int id, int age, String name);
}

