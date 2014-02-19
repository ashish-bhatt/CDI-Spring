package com.intuit.core;


public class Book {

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
