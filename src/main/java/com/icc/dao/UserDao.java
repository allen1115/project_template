package com.icc.dao;

import com.icc.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    User findByUsername(String username);

    int addUser(@Param("username") String username, @Param("password") String password);
}
