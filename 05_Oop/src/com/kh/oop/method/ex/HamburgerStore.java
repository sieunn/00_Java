package com.kh.oop.method.ex;

public class HamburgerStore {
	//필드
	private String name;
	private int price;
	
	//setter getter
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	
	//기본생성자
	public HamburgerStore() {
		
	}
	
	//필수생성자
	public HamburgerStore(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	//void 메서드
	public void info() {
		System.out.println("햄버거 이름 : " + name);
		System.out.println("햄버거 가격 : " + price);
		System.out.println("---------------------");
	}
	
	//메인 메서드
	public static void main(String[] args) {
		//기본생성자로 출력
		HamburgerStore burger1 = new HamburgerStore();
		burger1.setName("불고기버거");
		burger1.setPrice(2000);
		burger1.info();
		
		//필수생성자로 출력
		HamburgerStore burger2 = new HamburgerStore("치즈버거", 3000);
		burger2.info();
	}
}
