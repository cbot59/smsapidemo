package com.aldi.smsapi.model.dao;

import com.aldi.smsapi.model.User;

public class UserDao {

    public boolean checkLogin(User user) {
	return user.getUsername().equals("admin") && user.getPassword().equals("password");
    }
}
