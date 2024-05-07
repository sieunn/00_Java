package com.kh.oop.method.ex;

public class Circle {
	//필드
	private double pi = 3.14;
	private int radius = 1; //반지름
	
	//Setter Getter
	public void setPi(double pi) {
		this.pi = pi;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double getPi() {
		return pi;
	}
	public int getRadius() {
		return radius;
	}
	
	//기본 생성자
	public Circle() {
		
	}
	
	//메서드
	public void incrementRadius() { //증가 반지름
		//반지름을 1씩 증가하기
		radius++;
	}
	public void getAreaOfCircle() { //넓이
		//소수자리
		double area = pi * radius * radius;
		System.out.println("원의 넓이 : " + area);
	}
	public void getSizeOfCircle() { //둘레
		//3.14가 소수자리이기 때문에 double
		double size = 2 * pi * radius;
		System.out.println("원의 둘레 : " + size);
	}
	
	//메인메서드 main ctrl + space
	public static void main(String[] args) {
		//원 객체 생성
		Circle 원 = new Circle();
		
		//1씩 증가하기 전에 원의 둘레와 넓이 출력하기
		System.out.println("원의 초기 둘레와 넓이 ");
		원.getSizeOfCircle();
		원.getAreaOfCircle();
		
		//반지름 원이 1씩 증가한다면?
		원.incrementRadius(); // 1씩 원의 크기를 증가시킨다
		
		//증가된 반지름의 원의 둘레 및 넓이 출력
		System.out.println("반지름 1 증가후 원의 둘레와 넓이");
		원.getSizeOfCircle();
		원.getAreaOfCircle();
	}
	
	
}
