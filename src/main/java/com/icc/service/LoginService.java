package com.icc.service;

import com.icc.dao.LoginUserDao;
import com.icc.pojo.LoginUser;

import java.sql.SQLException;

public class LoginService {

    public static LoginUser doLogin(String username, String password) throws SQLException {
        LoginUser user = LoginUserDao.doLogin(username, password);
        return user;
    }
}
