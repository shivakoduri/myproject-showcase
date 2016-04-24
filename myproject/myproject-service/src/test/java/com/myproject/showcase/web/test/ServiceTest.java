/**
 * 
 */
package com.myproject.showcase.web.test;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.myproject.showcase.service.config.MyProjectServiceConfig;
import com.myproject.showcase.web.model.User;
import com.myproject.showcase.web.service.UserService;

/**
 * @author shiva koduri
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={MyProjectServiceConfig.class}, loader=AnnotationConfigContextLoader.class)
public class ServiceTest {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	@Qualifier("customUserDetailsService")
	UserDetailsService userDetailsService;
	
	@Test
	@Transactional
	public void testUserSSO(){
	  System.out.println("--Inside testUserBySSO...");
	  User user = userService.findBySso("user1");
	  System.out.println("User sso:" + user.getFirstName());
	}
	
	@Test
	@Transactional
	public void testDetailService(){
		UserDetails userDetails = userDetailsService.loadUserByUsername("user1");
		System.out.println("UserName:"  +userDetails.getUsername());
		
	}

}
