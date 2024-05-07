package com.kh.oop.method.ex;

public class CoffeeMaker {

	//필드
	private String coffeeType; //커피종류
	private int suger; //설탕양
	private boolean milk; //우유 유무
	
	//setter
	public void setCoffeeType(String coffeeType) {
		this.coffeeType = coffeeType;
	}
	public void setSuger(int suger) {
		this.suger = suger;
	}
	public void setMilk(boolean milk) {
		this.milk = milk;
	}

	//getter - boolean 같은 경우 get이 아니라 is로 표기
	public String getCoffeeType() {
		return coffeeType;
	}
	public int getSuger() {
		return suger;
	}
	public boolean isMilk() {
		return milk;
	}

	//기본생성자 
	public CoffeeMaker() {
			
		}
	
	//필수생성자
	public CoffeeMaker(String coffeeType, int suger, boolean milk) {
			this.coffeeType = coffeeType;
			this.suger = suger;
			this.milk = milk;
		}
	
	public void makeCoffee() {
		System.out.println("커피를 제조합니다.");
		System.out.println("종류 : " + coffeeType);
		System.out.println("설탕 : " + suger + "g");
		//만약에 우유가 추가됬다면
		if(milk) {
			System.out.println("우유 추가");
		}else {
			System.out.println("우유 미추가");
		}
		System.out.println("커피가 준비되었습니다.");
		System.out.println("--------------------");
	}
	/*
	//메인메서드
	public static void main(String[] args) {
		//기본생성자로 객체 생성
		CoffeeMaker coffee1 = new CoffeeMaker();
		coffee1.setCoffeeType("아메리카노");
		coffee1.setSuger(1);
		coffee1.setMilk(false);
		
		coffee1.makeCoffee();
		
		//필수생성자 객체 생성
		CoffeeMaker coffee2 = new CoffeeMaker("디카페인",2,true);
		coffee2.makeCoffee();
	}
*/
}



