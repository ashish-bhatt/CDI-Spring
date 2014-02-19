package com.intuit.core;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class SimpleValidator implements Validator{

	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return ItemServerConnection.class.isAssignableFrom(arg0);
	}

	public void validate(Object obj, Errors err) {
		// TODO Auto-generated method stub
		ValidationUtils.rejectIfEmptyOrWhitespace(err, "name", "required.name");
		ValidationUtils.rejectIfEmptyOrWhitespace(err, "ftpServerURL", "required.URL");
		
		
		ItemServerConnection connection = (ItemServerConnection)obj;
	
	}

}
