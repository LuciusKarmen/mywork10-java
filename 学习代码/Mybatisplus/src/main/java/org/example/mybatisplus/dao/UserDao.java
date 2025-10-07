package org.example.mybatisplus.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.mybatisplus.pojo.User;

@Mapper
public interface UserDao extends BaseMapper<User> {
    //BaseMapper<User> 关于user的操作库解决一切

}
