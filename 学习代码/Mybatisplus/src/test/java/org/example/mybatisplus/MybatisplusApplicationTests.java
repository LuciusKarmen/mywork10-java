package org.example.mybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.example.mybatisplus.dao.UserDao;
import org.example.mybatisplus.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class MybatisplusApplicationTests {

    @Autowired
    private UserDao a;
    @Autowired
    private UserDao userDao;

    //查
    @Test
    void contextLoads() {
        List<User> users =a.selectList(null);
        System.out.println(users);
    }
    //删
    @Test
    void d(){
        userDao.deleteById(1);

    }
    //改
    //提供什么改什么
    @Test
    void u(){

        User a=new User();
        a.setId(1);
        a.setName("xgm");
        userDao.updateById(a);

    }
    //增
    @Test
    void add(){
        for (int i = 0; i < 10; i++) {
            User a=new User();
            a.setId(0);
            a.setAge(0);
            a.setName("test");
            userDao.insert(a);
        }

    }
    //分页查询
    @Test
    void testGetByPage(){
        IPage page=new Page(1,10);
        userDao.selectPage(page,null);
        System.out.println(page.getCurrent());

    }
    //条件查询
    @Test
    void sectionConditional(){
        QueryWrapper<User> q=new QueryWrapper<>();
        q.eq("name","xgm");
        List<User> a= userDao.selectList(q);
        System.out.println(a);
    }
    @Test
    void testQueryByLambdaWrapper() {
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(User::getName, "xgm");     // 使用方法引用，不会写错字段


        List<User> users = userDao.selectList(wrapper);
        System.out.println(users);
    }




}
