package com.intuit.core;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

//@Component
public class Book extends ApplicationEvent{

	public Book(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ISBN;
	private String author;
	private String bookName;
	
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String name) {
		this.bookName = name;
	}
}
