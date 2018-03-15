package com.icc.dao;

import com.icc.pojo.LoginUser;
import com.icc.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginUserDao {

    public static LoginUser doLogin(String username, String password) throws SQLException {
        Connection conn = DBUtil.getConn();
        String sql = "select * from user_login where username = ? and password = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, username);
        pst.setString(2, password);
        ResultSet rs = pst.executeQuery();
        LoginUser user = new LoginUser();
        while(rs.next()) {
            String queryUsername = rs.getString("username");
            String queryPassword = rs.getString("password");
            user.setUsername(queryUsername);
            user.setPassword(queryPassword);
            System.out.println(queryUsername + " " + queryPassword);
        }
        rs.close();
        pst.close();
        conn.close();
        return user;
    }
}
