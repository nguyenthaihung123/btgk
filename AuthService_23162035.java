package com.example.app.service;

import com.example.app.dao.UserDao_23162035;
import com.example.app.entity.User_23162035;

public class AuthService_23162035 {
    private UserDao_23162035 userDao = new UserDao_23162035();

    public User_23162035 login(String username, String password) {
        User_23162035 u = userDao.findByUsername(username);
        if (u != null && ((User_23162035) u).getPassword().equals(password)) {
            return u;
        }
        return null;
    }

    public void register(User_23162035 u) {
        userDao.save(u);
    }
}
