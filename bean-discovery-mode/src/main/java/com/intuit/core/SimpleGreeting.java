package com.intuit.core;

import javax.inject.Named;



//@ApplicationScoped
@Named("greeting")
public class SimpleGreeting {
	private String greeting = "Good morning !";
	
	public String getGreeting() {
		System.out.println("hello there");
		return greeting;
	}

}
