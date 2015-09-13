/**
 * 
 */
package com.myproject.showcase.custom.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.myproject.showcase.validator.PhoneValidator;


/**
 * @author shiva koduri
 * Most of the part is boiler-plate code to confirm with JSR-303 specs. 
 * The most important part is @Constraint annotation where we provide 
 * the class that will be used for validation i.e PhoneValidator
 */
@Documented
@Constraint(validatedBy=PhoneValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Phone {
	
	String message() default "{Phone}";
	Class<?>[] groups() default{};
	Class<? extends Payload>[] payload() default{};
}