package com.lyp.my.learn.controller;

import com.alibaba.fastjson.JSONObject;
import com.lyp.my.learn.pojo.User;
import com.lyp.my.learn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: liyapu
 * @Description:
 * @create: 2019-07-19 14:29
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    public UserController(){
        System.out.println("UserController ...................");
    }

    @ResponseBody
    @RequestMapping("/getUserById")
    public String getUserById(Integer id){
        System.out.println("id = " + id);
        User user = userService.getUserById(id);
        return JSONObject.toJSONString(user);
    }

    @RequestMapping("/toSuccess")
    public String toSuccess(){
        return "success";
    }
}
