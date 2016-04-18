/**
 * 
 */
package com.myproject.showcase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author shiva koduri
 *
 */
@Controller
public class HomeController {
	
   private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView welcome() {
		logger.info("--Inside the landing page...");
		
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Project Demo");
		model.addObject("message","This is welcome page");
		model.setViewName("home");
		
		return model;
	}

}
