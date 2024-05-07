package com.kh.example.practice6.model.vo;

public class Book {
	//필드
	public String title;
	public String publisher;
	public String author;
	public int price;
	public double discountRate;
	
	//기본 생성자
	public Book() {
		
	}
	
	//필수 생성자
	public Book(String title, String publisher, String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}
	
	public Book(String title,String publisher, 
			String author,int price, double discountRate) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
	}
	
	//void 메소드
	public void inform() {
		System.out.println("책이름 : " + title);
		System.out.println("출판사 : " + publisher);
		System.out.println("지은이 : " + author);
		System.out.println("책가격 : " + price);
		System.out.println("할인율 : " + discountRate);
		System.out.println("=======================");
	}
}
