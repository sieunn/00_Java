package com.kh.oop.method.oop;

public class DrinkMaker {
	//필드
	private String drinkType; //음료종류
	private int quantity; //음료 양
	private int temp; //온도
	
	//setter
	public void setDrinkType(String drinkType) {
		this.drinkType = drinkType;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	
	//getter
	public String getDrinkType() {
		return drinkType;
	}
	public int getQuantity() {
		return quantity;
	}
	public int getTemp() {
		return temp;
	}

	//기본생성자
	public DrinkMaker() {
		
	}
	
	//필수생성자
	public DrinkMaker(String drinkType, int quantity, int temp) {
		this.drinkType = drinkType;
		this.quantity = quantity;
		this.temp = temp;
	}
	
	//void 메서드
	public void makeDrink() {
		//음료종류 음료양
		System.out.println("음료를 제조를 시작합니다.");
		System.out.println("주문음료 : " + drinkType);
		System.out.println("음료 양 : " + quantity);
		System.out.println("음료온도 : " + temp);
		
		if(temp<5) {
			System.out.println("차갑게");
		}else if(temp>=5 && temp<=10) {
			System.out.println("미지근하게");
		}else {
			System.out.println("뜨겁게");
		}
		System.out.println("음료가 준비되었습니다.");
	}
}
