package com.intuit.core;

import java.util.logging.Logger;

import javax.enterprise.event.Observes;
import javax.inject.Inject;

public class InventoryService {
	
	@Inject
	private Logger logger;
	
	public void addBook(@Observes Book book){
		logger.info("New book has arrived. " + book);
		//Add new book to the inventory
	}

}
