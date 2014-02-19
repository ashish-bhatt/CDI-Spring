package com.intuit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.intuit.core.BookService;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = 
		    	  new ClassPathXmlApplicationContext(new String[] {"beans.xml"});
		BookService service = (BookService)context.getBean("BookService");
		service.createBook("Charles Darwin", "On the origin of species");
	}

}
