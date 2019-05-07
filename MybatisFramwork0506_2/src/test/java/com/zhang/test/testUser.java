package com.zhang.test;

import com.zhang.dao.UserDao;
import com.zhang.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * @author Yonghong Zhang
 * @date 2019/5/5 - 15:33
 */
public class testUser {
    private InputStream in;
    private SqlSessionFactoryBuilder builder;
    private SqlSessionFactory factory;
    private SqlSession sqlSession;
    private UserDao userDao;

    /**
     * 加载初始化
     *
     * @throws Exception
     */
    @Before
    public void init() throws Exception {
        in = Resources.getResourceAsStream("configuration.xml");
        builder = new SqlSessionFactoryBuilder();
        factory = builder.build(in);
        sqlSession = factory.openSession(true);
        userDao = sqlSession.getMapper(UserDao.class);
    }

    /**
     * 关闭连接
     *
     * @throws Exception
     */
    @After
    public void destroy() throws Exception {
        sqlSession.close();
        in.close();
    }

    /**
     * 查询单个User
     */
    @Test
    public void testFindById() {

        User user = userDao.findById(41);
        System.out.println(user);
    }

    /**
     * 查询所有User
     */
    @Test
    public void testFindAll() {
//        List<User> users = userDao.findAll();
//        for (User user : users) {
//            System.out.println(user);
//        }
        //分页查询数据
        int offset = (2 - 1) * 4;
        int limit = 4;
        RowBounds rowBounds = new RowBounds(offset, limit);
        List<User> users = sqlSession.selectList("com.zhang.dao.UserDao.findAll", null, rowBounds);
        for (User user : users) {
            System.out.println(user);
        }
    }

    /**
     * 根据Username进行查询
     */
    @Test
    public void testFindByName() {
        List<User> users = userDao.findByName("老白");
        for (User user : users) {
            System.out.println(user);
        }
    }

    /**
     * 增加User
     */
    @Test
    public void testAddUser() {
        User user = new User();
        user.setUsername("老白");
        user.setBirthday(new Date());
        user.setSex("男");
        user.setAddress("山西大同");

        userDao.addUser(user);
    }

    /**
     * 更新User
     */
    @Test
    public void testUpdateUser() {
        User user = new User();
        user.setId(53);
        user.setUsername("update 老白");
        user.setBirthday(new Date());
        user.setSex("女");
        user.setAddress("南京华信智原");

        userDao.updateUser(user);
    }

    /**
     * 删除User
     */
    @Test
    public void testDeleteUser() {
        userDao.deleteUser(53);
    }


}
