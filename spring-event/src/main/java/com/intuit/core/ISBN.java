package com.intuit.core;

import java.util.Random;

import org.springframework.stereotype.Component;
@Component
public class ISBN implements NumberGenerator{
	public String generateNumber() {
		return "13-84951-" + Math.abs(new Random().nextInt());
		}
}
