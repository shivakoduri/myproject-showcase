/**
 * 
 */
package com.myproject.showcase.beans;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import com.myproject.showcase.custom.annotations.Phone;

/**
 * @author shiva koduri
 *
 */
@Component
public class Customer {
	
	@Size(min=2, max=30)
	private String name;
	
	@NotEmpty @Email
	private String email;
	
	@NotNull @Min(18) @Max(100)
	private Integer age;
	
	@NotNull
	private Gender gender;
	
	@DateTimeFormat(pattern="MM/dd/yyyy")
	@NotNull @Past
	private Date birthDay;
	
	@Phone
	private String phone;
	
	public enum Gender{
		MALE, FEMALE;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
