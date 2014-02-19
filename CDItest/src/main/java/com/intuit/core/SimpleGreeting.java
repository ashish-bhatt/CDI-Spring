package com.intuit.core;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;


public class SimpleGreeting {
	@NotNull
	private String greeting = null;
	
	public String greet() {
		return "good morning";
	}
	public String getGreeting() {
		return greeting;
	}
	
	@AssertTrue
	public boolean validateSomething(@NotNull String greeting) {
		return true;
	}
}
