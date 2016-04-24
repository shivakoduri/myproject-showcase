package com.myproject.showcase.web.service;

import java.util.List;

import com.myproject.showcase.web.model.User;



public interface UserService {

	User findById(int id);
	
	User findBySso(String sso);
	
	User findByName(String name);
	
	void saveUser(User user);
	
	void updateUser(User user);
	
	void deleteUserById(long id);

	List<User> findAllUsers(); 
	
	void deleteAllUsers();
	
	boolean isUserExist(User user);
	
}