package com.aldi.smsapi.action;

import com.aldi.smsapi.model.User;
import com.aldi.smsapi.model.dao.UserDao;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private UserDao userDao;

    private User user;

    @Override
    public String execute() throws Exception {
	if (userDao.checkLogin(user)) {
	    return SUCCESS;
	}
	return ERROR;
    }

    public UserDao getUserDao() {
	return userDao;
    }

    public void setUserDao(UserDao userDao) {
	this.userDao = userDao;
    }

    public User getUser() {
	return user;
    }

    public void setUser(User user) {
	this.user = user;
    }

}
