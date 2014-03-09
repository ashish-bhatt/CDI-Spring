package com.intuit.core;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class SimpleGreeting {

	private String greeting;
	@Size(max=4)
	private String email = null;
	
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	public String getGreeting() {
		return greeting;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getEmail(){
		return email;
	}
	
//	@AssertTrue
	public boolean validateSomething(@Size(max=3) String greeting) {
		return true;
	}
}
