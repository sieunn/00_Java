package com.kh.oop.method;

public class Car {

	//필드
	public String brand; //브랜드
	public String model; //차 모델
	public int year;
	
	//기본 생성자
	public Car() {
		
	}
	//필수 생성자
	public Car(String brand, String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}
	
	//단축키 팁 : ctrl 누른채로 변수명에 마으스를 대면 처음 만들어진 변수명의 위치로 감
	//return 메서드
	public String getBrand() {
		return brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
	public static void main(String[] args) {
		//자동차 car1출력
		Car car1 = new Car("Toyota", "Carmy", 2022);
		
		System.out.println(car1.getBrand() + "  " + car1.getModel() + " " + car1.getYear());
	}

}
