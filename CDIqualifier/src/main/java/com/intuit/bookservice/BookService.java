package com.intuit.bookservice;

import javax.inject.Inject;

public class BookService {
	@Inject
	//@ThirteenDigits//
	private NumberGenerator gen;
	
	public String getNewSerialNo() {
		return gen.generateNumber();
	}
}
