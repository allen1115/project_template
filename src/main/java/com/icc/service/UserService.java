package com.icc.service;

import com.icc.dao.UserDao;
import com.icc.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public User getUserByUsername(String username) {
        return userDao.findByUsername(username);
    }
}
