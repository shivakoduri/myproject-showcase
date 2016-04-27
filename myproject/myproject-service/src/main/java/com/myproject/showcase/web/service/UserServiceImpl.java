package com.myproject.showcase.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myproject.showcase.web.dao.UserDao;
import com.myproject.showcase.web.model.User;


@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao dao;

	public User findById(int id) {
		return dao.findById(id);
	}

	public User findBySso(String sso) {
		return dao.findBySSO(sso);
	}

	@Override
	public User findByName(String name) {
		return dao.findByName(name);
	}

	@Override
	public void saveUser(User user) {
		dao.saveUser(user);
	}

	@Override
	public void updateUser(User user) {
		dao.updateUser(user);
	}

	@Override
	public void deleteUserById(long id) {
		dao.deleteUserById(id);
	}

	@Override
	public List<User> findAllUsers() {
		return dao.findAllUsers();
	}

	@Override
	public void deleteAllUsers() {
		dao.deleteAllUsers();
	}

	@Override
	public boolean isUserExist(User user) {
		return dao.isUserExist(user);
	}

}
