/**
 * 
 */
package com.myproject.showcase.controller.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.myproject.showcase.HomeController;

/**
 * @author shiva koduri
 *
 */
@Controller
public class SecurityController {
	
private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/welcome**", method = RequestMethod.GET)
	public ModelAndView welcome() {
		logger.info("--Inside the landing page...");
		
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Custom Login Form");
		model.addObject("message","This is welcome page");
		model.setViewName("home");
		
		return model;
	}
	
	@RequestMapping(value="/admin**", method = RequestMethod.GET)
	public ModelAndView adminPage(){
		
        logger.info("--Inside the admin...");
		
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Custom Login Form");
		model.addObject("message","This is protected page");
		model.setViewName("admin");
		
		return model;
	}
	
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public ModelAndView login(@RequestParam(value="error",required=false) String error,
			@RequestParam(value="logout",required=false) String logout){
		
		logger.info("--Inside login page request...");
		
		ModelAndView model = new ModelAndView();
		if (error != null) {
			model.addObject("error", "Invalid username and password!");
		}

		if (logout != null) {
			model.addObject("msg", "You've been logged out successfully.");
		}
		model.setViewName("login");

		return model;

		
	}
	



}
