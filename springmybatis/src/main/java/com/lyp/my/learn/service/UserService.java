package com.lyp.my.learn.service;

import com.lyp.my.learn.mapper.UserMapper;
import com.lyp.my.learn.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: liyapu
 * @Description:
 * @create: 2019-07-19 14:29
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public UserService(){
        System.out.println("UserService.............");
    }

    public User getUserById(int id){
        User user = userMapper.selectUserById(id);
        return user;
    }

}
