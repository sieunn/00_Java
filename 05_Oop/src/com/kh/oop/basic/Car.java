package com.kh.oop.basic;

public class Car {
	//필드
	public String color; //차의 색상
	public int speed; //속도
	public String door;
	public String window;
	public String sunRoof;
	public String insurance;
	
	//생성자 = 메소드를 담거나 초기화를 위한 생성자
	public Car(){
		
	}
	//생성자 = 필수 옵션
	//생성자는 클래스이름과 똑같아야함
	//생성자 이름 = 클래스 이름 = 파일명
//  public Car(글자로 받을 차 색상, 글자로 받을 차 속도){
	public Car(String inputColor, int inputSpeed){
		this.color = inputColor;
		this.speed = inputSpeed;
	}
	//메서드
	public void displayInfo() {
		System.out.println("  차 정보  ");
		System.out.println("Color : " + color);
		System.out.println("Speed : " + speed);
	}
	
	//메인메서드
	public static void main(String[] args) {
		//Car가 공간을 마련해줘
		Car myCar = new Car();
		myCar.color = "빨간색";
		System.out.println("나의 차 색상 : " + myCar.color);
		
		//공장에서 차를 만들어야하고 색상이랑 스피드가 지정이 된 상황
		Car orderCar = new Car("black", 60);
		
		orderCar.displayInfo();
		
		//storeCar 주문 색상 white 스피드 최대 100
		Car storeCar = new Car("white", 100);
		storeCar.displayInfo();
		
	}
}
