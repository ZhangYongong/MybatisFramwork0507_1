package com.zhang.dao.impl;

import com.zhang.dao.UserDao;
import com.zhang.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * @author Yonghong Zhang
 * @date 2019/4/29 - 19:10
 */
public class UserDaoImpl implements UserDao {
    private SqlSessionFactory factory;

    public  UserDaoImpl(SqlSessionFactory factory){
        this.factory = factory;
    }
    @Override
    public List<User> findAll() {
        //1.使用工厂创建SqlSession对象
        SqlSession session = factory.openSession();
        //2.使用session执行查询方法
       List<User> users = session.selectList("com.zhang.dao.UserDao.findAll");
       //3.返回查询结果
        return users;
    }
}
