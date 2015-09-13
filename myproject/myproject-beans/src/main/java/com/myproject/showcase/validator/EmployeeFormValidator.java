/**
 * 
 */
package com.myproject.showcase.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.myproject.showcase.beans.Employee;


/**
 * @author shiva koduri
 * 
 * EmployeeFormValidator is the validator implementation that is specific to Spring Framework. 
 * supports() method implementation by Spring Framework to know objects on which this validation can be used.
 *
 */
@Component("employeeValidator")
public class EmployeeFormValidator implements Validator{
	
	public boolean supports(Class<?> paramClazz) {
		
		 return Employee.class.equals(paramClazz);
	}
	
	
	/**
	 * validate() method and add errors if any field validation fails. 
	 * Spring provides org.springframework.validation.ValidationUtils utility class 
	 * for basic validations such as null or empty. Once this method returns, spring framework binds the
	 *  Errors object to the BindingResult object that we use in our controller handler method
	 *  
	 *  ValidationUtils.rejectIfEmptyOrWhitespace() last argument takes the key name for message resources. 
	 *  This way we can provide localized error messages to the user
	 */
	public void validate(Object target, Errors errors) {
		 ValidationUtils.rejectIfEmptyOrWhitespace(errors, "id", "id.required");
		 
		 Employee emp = (Employee) target;
		 if(emp.getId() <= 0){
			 errors.rejectValue("id", "negativeValue", new Object[]{"'id'"}, "id can't be negative");
		 }
		 
		 ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "name.required");
		 ValidationUtils.rejectIfEmptyOrWhitespace(errors, "role", "role.required");		 
	}
}
