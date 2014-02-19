package com.intuit.bookservice;

import javax.inject.Inject;

public class BookService {
	@Inject
	//@EightDigits//
	private NumberGenerator gen;
	
	public String getNewSerialNo() {
		return gen.generateNumber();
	}
}
