/**
 * 
 */
package com.myproject.examples.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author shiva koduri
 *
 */
@Controller
public class BasicController {
	
	@RequestMapping(value={"/","/home"}, method=RequestMethod.GET)
	public String homepage(ModelMap model){
		model.addAttribute("greeting", "Hi, Welcome to mysite");
		return "webwelcome";
	}

}
