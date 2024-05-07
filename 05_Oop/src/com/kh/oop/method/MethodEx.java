package com.kh.oop.method;

public class MethodEx {
	/*
	메서드
	클래스 내부에 존재
	특정 기능을 하는 코드를 묶어서 나타낸 것
	
	1. 메인메서드
	자바 프로그램을 시작할 때 사용하는 메서드
	작성한 메서드나 변수를 호출해서 최종으로 실행하는 메서드
	public static void main(String[] args){
	
	}
	
	2. 생성자메서드
	생성자는 메서드라는 이름을 붙여서 많이 사용하지는 않지만 메서드의 한 종류
	클래스명과 파일명과 생성자명은 동일해야함
	
	3. void 메서드
	반환하는 값이 없는 메서드
	메서드가 실행은 되지만 실행 후 어떤 값도 반환하지 않음
	  1) 매개변수가 없는 void 메서드
		  public void method(){
		  	System.out.print("hi");
		  }
	  2) 매개변수가 있는 void 메서드
	  	  public void method(자료형 매개변수){
	  	  	System.out.print("매개변수: " + a);
	  	}
	  	
	4. return 메서드
	값을 반환하는 메서드
	메서드가 실행되면 결과를 반환하고 메서드를 호출한 곳에 반환된 값을 제공
	
	public 자료형 method(자료형 매개변수){
		return 자료형에 해당하는 변수명;
	 }
	 
	 	1) return 값이 String 일때
	 	public String method(String str) {
	 		return str;
	 	 }
	 	 
	 	2) return 값이 int 일때
	 	public int method(int num){
	 		int abc = num;
	 		return abc;
	 	}
	 	
	 	3) return 값이 필드에 적혀있거나 위에 먼저 적혀있을 때
	 	String str;
	 	
	 	public String method() {
	 		return str;
	 	}
	 
	 */
	
	//기본 생성자
	public MethodEx() {
		
	}
	//메서드
	public void 숫자합1(int a, int b) {
		int 합의결과 = a + b;
		System.out.println("숫자 합은 : " + 합의결과 + " 입니다.");
	}
	
	public int 숫자합2(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		MethodEx met = new MethodEx();
		
		met.숫자합1(5, 3);
		
		int 결과 = met.숫자합2(7, 4);
		System.out.println("결과는 : " + 결과);
	}
}
