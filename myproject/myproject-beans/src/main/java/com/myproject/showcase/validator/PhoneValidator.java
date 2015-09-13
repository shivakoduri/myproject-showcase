/**
 * 
 */
package com.myproject.showcase.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.myproject.showcase.custom.annotations.Phone;

/**
 * @author shiva koduri
 * 
 *  JSR-303 specs validator implementation should implement javax.validation.ConstraintValidator interface. 
 *  If we are using some resource such as DataSource, we can initialize them in the initialize() method.
 *   The validation method is isValid and it returns true if data is valid else it should return false
 * 
 */
public class PhoneValidator implements ConstraintValidator<Phone, String> {

	public void initialize(Phone arg0) {

	}

	public boolean isValid(String phoneNo, ConstraintValidatorContext ctx) {
		if (phoneNo == null) {
			return false;
		}

		// validate phone numbers of format "1234567890"
		if (phoneNo.matches("\\d{10}"))
			return true;
		// validating phone number with -, . or spaces
		else if (phoneNo.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}"))
			return true;
		// validating phone number with extension length from 3 to 5
		else if (phoneNo.matches("\\d{3}-\\d{3}-\\d{4}\\s(x|(ext))\\d{3,5}"))
			return true;
		// validating phone number where area code is in braces ()
		else if (phoneNo.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}"))
			return true;
		// return false if nothing matches the input
		else
			return false;
	}

}
