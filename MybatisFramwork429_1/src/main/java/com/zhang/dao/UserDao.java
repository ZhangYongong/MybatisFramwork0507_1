package com.zhang.dao;

import com.zhang.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Yonghong Zhang
 * @date 2019/4/28 - 18:50
 * 用户的持久层接口
 */
public interface UserDao {
    @Select("select * from user")
    List<User> findAll();
}
