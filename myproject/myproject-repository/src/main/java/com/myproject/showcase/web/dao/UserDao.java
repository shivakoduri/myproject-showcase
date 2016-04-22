package com.myproject.showcase.web.dao;

import com.myproject.showcase.web.model.User;


public interface UserDao {

	User findById(int id);
	
	User findBySSO(String sso);
	
}

