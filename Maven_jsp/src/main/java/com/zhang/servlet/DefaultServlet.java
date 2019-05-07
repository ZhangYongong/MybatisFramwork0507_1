package com.zhang.servlet;

import com.zhang.entity.UserEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Yonghong Zhang
 * @date 2019/4/26 - 10:42
 */
@WebServlet("/defaultServlet")
public class DefaultServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(87988);
        userEntity.setUserName("laibai");
        userEntity.setPassWord("586486");
        userEntity.setFlag("9");
        req.setAttribute("userA",userEntity);
        List<UserEntity> list = new ArrayList<UserEntity>();
        list.add(userEntity);
        req.setAttribute("users",list);
        req.getRequestDispatcher("default.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
