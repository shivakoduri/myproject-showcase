package com.myproject.showcase.service;

import com.myproject.showcase.web.model.User;



public interface UserService {

	User findById(int id);
	
	User findBySso(String sso);
	
}