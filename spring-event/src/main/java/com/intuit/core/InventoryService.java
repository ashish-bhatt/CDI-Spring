package com.intuit.core;

import org.springframework.context.ApplicationListener;

public class InventoryService implements ApplicationListener<Book>{
	
	public void addBook(Book book){
		System.out.println("New book has arrived. " + book);
		//Add new book to the inventory
	}

	public void onApplicationEvent(Book event) {
		// TODO Auto-generated method stub
		System.out.println("New book has arrived. " + event);
	}
}
