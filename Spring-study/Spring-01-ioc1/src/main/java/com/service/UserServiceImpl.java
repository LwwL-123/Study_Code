package com.service;

import com.dao.UserDao;
import com.dao.UserDaoMysqlImpl;
import com.dao.UserDaoimpl;

public class UserServiceImpl implements UserService{

//    //private UserDao userDao = new UserDaoimpl();
//
//    //利用set进行动态实现值的注入
//    public void setUserDao(UserDao userDao){
//        this.userDao=userDao;
//    }

    private UserDao userDao;
    //
    public void getUser(){
        userDao.getUser();
    }

    public void setUserDao(UserDaoMysqlImpl userDao) {
        this.userDao=userDao;
    }
}
