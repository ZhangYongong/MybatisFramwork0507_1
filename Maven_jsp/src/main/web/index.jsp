<%@ page import="com.zhang.entity.UserEntity" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/26
  Time: 9:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <%
    UserEntity userEntity  = new UserEntity();
    userEntity.setId(100);
    userEntity.setUserName("fgeyf");
    userEntity.setPassWord("bycjwgfyw");
    userEntity.setFlag("90");

    String str = "48648";
    System.out.println(str);
  %>
  <div><%=str %></div>
  <div>用户名：<%=userEntity.getUserName()%></div>
  <jsp:useBean id="user" class="com.zhang.entity.UserEntity"></jsp:useBean>
  <jsp:setProperty name="user" property="password" value="456"></jsp:setProperty>
  <div>用户名：<jsp:setProperty name="name" property="password"</div>
  </body>
</html>
