/**
 * 
 */
package com.myproject.showcase.controller;


import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myproject.showcase.beans.Customer;

/**
 * @author shiva koduri
 * Annotation based form validation
 */
@Controller
public class CustomerController {
 
	public static final Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);
	
	private Map<String, Customer> customers = null;
    
    public CustomerController(){
        customers = new HashMap<String, Customer>();
    }
	
	@RequestMapping(value="/cust/save", method=RequestMethod.GET)
	public String saveCustomerPage(Model model){
		LOGGER.info("Inside saveCustomePage...");
		
		model.addAttribute("customer",new Customer());
		return "custSave";
	}
	
	@RequestMapping(value="/cust/save",  method = RequestMethod.POST)
	public String saveCustomerAction(
			@Valid Customer customer,
			BindingResult bindingResult, Model model){
		
		if(bindingResult.hasErrors()){
			LOGGER.info("Returning to custSave.jsp page...");
			return "custSave";
		}
		
		LOGGER.info("Returning to custSaveSuccess.jsp page...");
		model.addAttribute("customer", customer);
		customers.put(customer.getEmail(), customer);
		
		return "custSaveSuccess";
		
	}
	
}
