package com.intuit.core;

import javax.enterprise.inject.Vetoed;
import javax.inject.Named;



//@ApplicationScoped
//@Named("greeting")
//@Vetoed
public class SimpleGreeting {
	private String greeting = "Good morning !";
	
	public String getGreeting() {
		return greeting;
	}

}
