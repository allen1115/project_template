package com.icc.dao;

import com.icc.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    User findByUsername(String username);
}
