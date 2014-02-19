package com.intuit.bookservice;

import java.util.Random;

//@EightDigits//
public class ISSN implements NumberGenerator{
	
	public String generateNumber() {
		return "8-" + Math.abs(new Random().nextInt());
		}
}
