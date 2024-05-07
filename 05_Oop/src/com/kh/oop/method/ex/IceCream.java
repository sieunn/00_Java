package com.kh.oop.method.ex;

public class IceCream {

	//필드
	private String name;
	private int suger;
	private boolean milk;
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setSuger(int suger) {
		this.suger = suger;
	}
	public void setMilk(boolean milk) {
		this.milk = milk;
	}

	//getter
	public String getName() {
		return name;
	}
	public int getSuger() {
		return suger;
	}
	public boolean isMilk() {
		return milk;
	}

	//기본생성자
	public IceCream() {
		
	}
	
	//필수생성자
	public IceCream(String name, int suger, boolean milk) {
		this.name = name;
		this.suger = suger;
		this.milk = milk;
	}
	
	//void 메서드
	public void makeIceCream() {
		System.out.println("아이스크림을 만듭니다.");
		System.out.println("이름 : " + name);
		System.out.println("설탕 : " + suger);
		if(milk) {
			System.out.println("우유 추가");
		}else {
			System.out.println("우유 미추가");
		}
		System.out.println("아이스크림이 완성되었습니다.");
		System.out.println("---------------------");
		
	}
	
}
