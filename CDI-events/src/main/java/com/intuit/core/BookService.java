package com.intuit.core;

import java.util.logging.Logger;

import javax.enterprise.event.Event;
import javax.enterprise.event.Observes;
import javax.enterprise.inject.spi.ProcessAnnotatedType;
import javax.inject.Inject;

public class BookService {

	@Inject
	private Logger logger;
	@Inject
	private Event<Book> event;
	@Inject
	@ThirteenDigits
	private NumberGenerator gen;
	@Inject
	Book book;
	
	public Book createBook(String author, String bookName){
		book.setAuthor(author);
		book.setBookName(bookName);
		book.setISBN(gen.generateNumber());
		logger.info("New book created: " + book);
		logger.info("firing event now");
		event.fire(book);
		logger.info("event finished");
		return book;
	}

}
