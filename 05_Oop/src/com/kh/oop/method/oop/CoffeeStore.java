package com.kh.oop.method.oop;
//커피 가게 클래스
public class CoffeeStore {

	//필드
	//커피 만드는 파일을 가져와서 각각의 가게에 커피 만드는 방법을 다르게 작성
	private CoffeeMaker maker;
	private String storeName; //가게이름
	private String location; // 가게위치
	
	//setter
	public void setMaker(CoffeeMaker maker) {
		this.maker = maker;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	//getter
	public CoffeeMaker getMaker() {
		return maker;
	}
	public String getStoreName() {
		return storeName;
	}
	public String getLocation() {
		return location;
	}
	
	//기본생성자
	public CoffeeStore() {
		
	}
	//필수생성자 
	public CoffeeStore(CoffeeMaker maker,String storeName, String location) {
		this.maker = maker;
		this.storeName = storeName;
		this.location = location;
	}
	
	//void 커피 주문 메서드
	public void orderCoffee() {
		System.out.println("지역 : " + location);
		System.out.println(storeName + "에서 주문한 커피 정보");
		maker.makeCoffee();
	}
	
}






