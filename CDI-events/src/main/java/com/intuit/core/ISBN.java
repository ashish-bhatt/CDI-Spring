package com.intuit.core;

import java.util.Random;

import javax.enterprise.inject.Alternative;
//@Alternative//
@ThirteenDigits//
public class ISBN implements NumberGenerator{
	public String generateNumber() {
		return "13-84951-" + Math.abs(new Random().nextInt());
		}
}
