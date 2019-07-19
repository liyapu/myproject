package com.lyp.my.learn.mapper;

import com.lyp.my.learn.pojo.User;
import com.lyp.my.learn.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: liyapu
 * @Description: UserMapper 单元测试类
 * @create: 2019-07-19 13:46
 */
public class UserMapperTest {

    private ApplicationContext applicationContext = null;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring/spring-application.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        System.out.println("===================="+userService);
    }

    @Test
    public void selectUserById() {
        UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
        User user = userMapper.selectUserById(10);
        System.out.println(user);
    }

    @Test
    public void insertUser() {
        UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");

        User user = new User();
        user.setUsername("商鞅");
        user.setAddress("卫国");
        user.setSex("1");

        int rows = userMapper.insertUser(user);
        System.out.println(rows);
    }

    @Test
    public void updateUser() {
        UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");

        User user = new User();
        user.setId(51);
        user.setUsername("商鞅");
        user.setAddress("卫国");
        user.setSex("1");

        int rows = userMapper.updateUser(user);
        System.out.println(rows);
    }

    @Test
    public void deleteUserById() {
        UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
        int rows = userMapper.deleteUserById(58);
        System.out.println(rows);
    }
}