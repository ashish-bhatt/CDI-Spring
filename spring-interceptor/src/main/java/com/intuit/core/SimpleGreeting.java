package com.intuit.core;

import org.springframework.stereotype.Component;

@Component("Greeting")
public class SimpleGreeting{

	private String greeting;

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
	
}
