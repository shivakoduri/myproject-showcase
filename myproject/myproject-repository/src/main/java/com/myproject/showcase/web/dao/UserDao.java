package com.myproject.showcase.web.dao;

import java.util.List;

import com.myproject.showcase.web.model.User;


public interface UserDao {

	User findById(int id);
	
	User findBySSO(String sso);
	
	User findByName(String name);
	
	void saveUser(User user);
	
	void updateUser(User user);
	
	void deleteUserById(long id);

	List<User> findAllUsers(); 
	
	void deleteAllUsers();
	
	boolean isUserExist(User user);
	
}

