/**
 * 
 */
package com.myproject.showcase;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author shiva koduri
 *
 */
@Controller
public class MenuController {
	
	 private static final Logger logger = LoggerFactory.getLogger(MenuController.class);
		
		/**
		 * Simply selects the home view to render by returning its name.
		 */
		@RequestMapping(value = "/menu", method = RequestMethod.GET)
		public String menu(Locale locale, Model model) {
			logger.info("Welcome home! The client locale is {}.", locale);
			
			return "redirect:/static/index.html";
		}


}
