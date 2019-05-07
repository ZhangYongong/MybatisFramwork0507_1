package com.zhang.dao;

import com.zhang.entity.User;

import java.util.List;

/**
 * @author Yonghong Zhang
 * @date 2019/5/5 - 14:58
 */
public interface UserDao {
    User findById(Integer id);
    List<User> findAll();
    List<User> findByName(String username);
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(Integer id);
}
