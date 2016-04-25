/**
 * 
 */
package com.myproject.showcase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.myproject.showcase.web.service.UserService;


/**
 * @author shiva koduri
 *
 */
@RestController
public class SpringAngularCRUDController {
	
	@Autowired
	private UserService userService;
	
	

}
