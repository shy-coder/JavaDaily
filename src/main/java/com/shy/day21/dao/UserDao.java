package com.shy.day21.dao;

import com.shy.day21.pojo.User;

import java.sql.*;

/**
 * @ClassName UserDao
 * @Author shy
 * @Date 2020/11/9
 **/
public class UserDao {
    public int checkLogin(String name,String password) {
        PreparedStatement statement = null;
        Connection con = null;
        try {
            //1.加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2.创建连接
            String sqlUrl = "jdbc:mysql://localhost:3306/jmi?serverTimezone=UTC&useUnicode=true&characterEncoding=utf8&useSSL=true";
            //Driveer表示Java驱动的接口
            con = DriverManager.getConnection(sqlUrl,"root","123456");
            //3.预编译、使用占位符
            String sql = "select * from user";
            //4.创建连接状态
            statement = con.prepareStatement(sql);
            ResultSet set = statement.executeQuery();

            User user = null;
            if (set.next()) {
                user = new User();
                user.setName(set.getString("name"));
                user.setPassword(set.getString("password"));
                if (user.getName().equals(name) && user.getPassword().equals(password)){
                    return 1;
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return 0;
    }
}
