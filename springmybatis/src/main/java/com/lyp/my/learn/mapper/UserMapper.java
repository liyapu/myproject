package com.lyp.my.learn.mapper;

import com.lyp.my.learn.pojo.User;

/**
 * @Author: liyapu
 * @Description: mapper接口
 * @create: 2019-07-17 14:43
 */
public interface UserMapper {

    /**
     * 根据用户id 查找 user
     * @param id
     * @return
     */
    User selectUserById(int id);

    /**
     * 插入用户
     * @param user
     */
    int insertUser(User user);

    /**
     * 更新用户
     * @param user
     */
    int updateUser(User user);

    /**
     * 根据id删除用户
     * @param id
     * @return
     */
    int deleteUserById(int id);
}
