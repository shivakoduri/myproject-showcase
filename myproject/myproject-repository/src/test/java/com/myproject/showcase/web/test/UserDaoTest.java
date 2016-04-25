/**
 * 
 */
package com.myproject.showcase.web.test;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.myproject.showcase.config.HibernateConfiguration;
import com.myproject.showcase.web.dao.UserDao;
import com.myproject.showcase.web.model.User;

/**
 * @author shiva koduri
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={HibernateConfiguration.class}, loader=AnnotationConfigContextLoader.class)
public class UserDaoTest {
	
	private static final Logger logger = LoggerFactory.getLogger(UserDaoTest.class);
	
	@Autowired
	private UserDao userDao;
	
	@Test
	@Transactional
	public void testFindById(){
		logger.debug("--Inside testFindById method...");
		User user = userDao.findById(1);
		System.out.println("userId:" + user.getId());
		assertNotNull(userDao);
		
	}
	
	@Test
	@Transactional
	public void testFindByFirstName(){
		logger.debug("--Inside testFindById method...");
		User user = userDao.findByName("user1");
		System.out.println("userLastName:" + user.getLastName());
		assertNotNull(userDao);
		
	}
	
	@Test
	@Transactional
	public void testGetAllUsers(){
		logger.debug("--Inside testGetAllUsers method..");
		List<User> users = userDao.findAllUsers();
		for(User user : users){
			System.out.println("user name:"+ user.getFirstName());
		}
	}
	
	@Test
	@Transactional
	public void testisUserExists(){
		logger.debug("Inside testisUserExists method...");
		User user = userDao.findById(1);
		assertNotNull(user);
		System.out.println(userDao.isUserExist(user));
	}

}
