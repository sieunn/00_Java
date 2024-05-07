package com.kh.oop.constructor;

public class Cafe {
	// 필드
	public String name;
	public String location;
	public int tableNum;
	
	//기본 생성자
	public Cafe() {
		
	}
	
	//필수 생성자
	public Cafe(String name, String location, int tableNum) {
		this.name = name;
		this.location = location;
		this.tableNum = tableNum;
	}
	
	//void 메서드 
	public void cafeInfo() {
		//카페이름 지역 테이블수 출력하기
		System.out.println("카페이름 : " + name);
		System.out.println("카페위치 : " + location);
		System.out.println("테이블수 : " + tableNum);
		System.out.println("---------------");
	}
	
	public static void main(String[] args) {
		System.out.println("안녕하세요. kh민족입니다.");
		System.out.println("===카페 조회하기===");
		
		//Cafe객체 사용해서 
		//1. 기본생성자로 cafe1 만들기
		// 이름 테이블 출력
		Cafe cafe1 = new Cafe();
		cafe1.name = "kh카페";
		cafe1.tableNum = 5;
		cafe1.cafeInfo();
		
		//2. 기본생성자로 cafe2 만들기
		//지역 테이블 출력
		Cafe cafe2 = new Cafe();
		cafe2.location = "서울시 강남구";
		cafe2.tableNum = 6;
		cafe2.cafeInfo();
		
		
		//3. 필수생성자로 cafe3 만들기
		//필수로 생성한 내용 출력하기
		Cafe cafe3 = new Cafe("kh카페","서울시 강남구",7);
		cafe3.cafeInfo();
	}

}
