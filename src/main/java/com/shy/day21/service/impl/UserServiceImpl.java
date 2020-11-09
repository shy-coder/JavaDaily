package com.shy.day21.service.impl;

import com.shy.day21.dao.UserDao;
import com.shy.day21.service.UserService;

/**
 * @ClassName UserServiceImpl
 * @Author shy
 * @Date 2020/11/9
 **/
public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDao();
    @Override
    public int login(String name, String psw) {
        int flag = userDao.checkLogin(name,psw);
        if (flag == 1){
            return  1;
        }
        return 0;
    }
}
