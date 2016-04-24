/**
 * 
 */
package com.myproject.showcase.web.test;

import static org.junit.Assert.assertNotNull;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.myproject.showcase.config.RepositoryHibernateConfiguration;
import com.myproject.showcase.web.dao.UserDao;
import com.myproject.showcase.web.model.User;

/**
 * @author shiva koduri
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={RepositoryHibernateConfiguration.class}, loader=AnnotationConfigContextLoader.class)
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

}
