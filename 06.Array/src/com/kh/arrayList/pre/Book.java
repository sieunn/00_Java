package com.kh.arrayList.pre;

public class Book {
	//필드
	private String bookName;
	private String author;
	
	//setter
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	//getter
	public String getBookName() {
		return bookName;
	}
	public String getAuthor() {
		return author;
	}
	public Book() {
		
	}
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	
	public void showBook() {
		System.out.println(bookName + " , " + author);
	}
	
	
}
