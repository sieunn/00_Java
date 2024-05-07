package com.kh.example.practice2.model.vo;

public class Product {

	//필드
	private String pName;
	private int price;
	private String brand;
	
	//setter
	public void setpName(String pName) {
		this.pName = pName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	//getter 
	public String getpName() {
		return pName;
	}
	public int getPrice() {
		return price;
	}
	public String getBrand() {
		return brand;
	}

	//기본 생성자
		public Product() {
				
		}

	public void information() {		
		System.out.println("이 름 : " + pName);
		System.out.println("가 격 : " + price);
		System.out.println("브랜드 : " + brand);
	}
	
	//메인메서드	
	public static void main(String[] args) {
		//객체생성
		Product 상품 = new Product();
		
		System.out.println("상품의 정보");
		상품.setpName("사과");
		상품.setPrice(2000);
		상품.setBrand("유기농 마을");
		상품.information();
		
		System.out.println("===get으로불러오기===");
		System.out.println("이름 : " + 상품.getpName());
		System.out.println("가격 : " + 상품.getPrice());
		System.out.println("브랜드 : " + 상품.getBrand());
	}

}
