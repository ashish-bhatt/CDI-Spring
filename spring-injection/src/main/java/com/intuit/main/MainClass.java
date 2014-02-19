package com.intuit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.intuit.core.Customer;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = 
		    	  new ClassPathXmlApplicationContext(new String[] {"beans.xml"});
		Customer cust = (Customer)context.getBean("CustomerBean");
    	System.out.println(cust.getPerson().getName());
    	System.out.println(cust.getPerson().getAge());
    	System.out.println(cust.getPerson().getAddress());
	}

}
