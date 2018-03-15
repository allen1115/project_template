package com.icc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    private static final String URL = "jdbc:mysql://localhost:3306/final_year_project";
    private static final String USER = "root";
    private static final String PASSWORD = "admin";

    private static Connection conn = null;

    static {
        try {
            // 1. 加载驱动程序
            Class.forName("com.mysql.jdbc.Driver");
            // 2. 获得数据库的链接
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 将获得的数据库与java的链接返回 (返回的类型为Connection)
    public static Connection getConn() {
        return conn;
    }
}
