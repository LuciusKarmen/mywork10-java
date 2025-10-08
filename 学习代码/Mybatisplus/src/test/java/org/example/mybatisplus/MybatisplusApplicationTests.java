package org.example.mybatisplus;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.example.mybatisplus.dao.UserDao;
import org.example.mybatisplus.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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

}
