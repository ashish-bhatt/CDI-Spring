package com.intuit.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component("BookService")
public class BookService implements ApplicationEventPublisherAware{
	private ApplicationEventPublisher publisher;

	@Autowired
	NumberGenerator gen;
//	@Autowired
//	Book book;
	
	public Book createBook(String author, String bookName){
		Book book = new Book(this);
		book.setAuthor(author);
		book.setBookName(bookName);
		book.setISBN(gen.generateNumber());
		System.out.println("New book created: " + book);
		System.out.println("firing event now");
		publisher.publishEvent(book);
		System.out.println("event finished");
		return book;
	}

	public void setApplicationEventPublisher(
			ApplicationEventPublisher applicationEventPublisher) {
		// TODO Auto-generated method stub
		this.publisher = applicationEventPublisher;
	}
}
