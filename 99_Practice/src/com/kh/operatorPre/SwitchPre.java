package com.kh.operatorPre;

import java.util.Scanner;

public class SwitchPre {
	
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int day = sc.nextInt(); 
		
		switch(day) {
		case 1 :
			System.out.println("월요일입니다.");
			break;
		case 2 :
			System.out.println("화요일입니다.");
			break;
		default :
			System.out.println("아무요일도 아닙니다.");
		}
		
	}
	
	public static void method2() {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int menuNumber = sc.nextInt();
		
		switch(menuNumber) {
		case 1 :
			System.out.println("아메리카노 나왔습니다.");
			break;
		case 2 : 
			System.out.println("카페라떼 나왔습니다.");
			break;
		case 3 :
			System.out.println("흑당버블티 나왔습니다.");
			break;
		default : 
			System.out.println("잘못입력했습니다. 다시 이용해주세요.");
		}
	}
	
	public static void prectice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1: 
			System.out.println("1월은 31일까지 있습니다.");
			break;
		case 2: 
			System.out.println("2월은 28일까지 있습니다.");
			break;
		case 3: 
			System.out.println("3월은 31일까지 있습니다.");
			break;
		case 4: 
			System.out.println("4월은 30일까지 있습니다.");
			break;
		case 5: 
			System.out.println("5월은 31일까지 있습니다.");
			break;
		case 6: 
			System.out.println("6월은 30일까지 있습니다.");
			break;
		case 7: 
			System.out.println("7월은 31일까지 있습니다.");
			break;
		case 8: 
			System.out.println("8월은 31일까지 있습니다.");
			break;
		case 9: 
			System.out.println("9월은 30일까지 있습니다.");
			break;
		case 10: 
			System.out.println("10월은 31일까지 있습니다.");
			break;
		case 11: 
			System.out.println("11월은 30일까지 있습니다.");
			break;
		case 12: 
			System.out.println("12월은 31일까지 있습니다.");
			break;
		default :
			System.out.println(month +"월은 잘못 입력된 달입니다.");
		}
	}
	
	public static void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("도시를 입력하세요 : ");
		String city = sc.nextLine();
		
		switch(city) {
		case "서울" :
			System.out.println("대한민국");
			break;
		case "도쿄" :
			System.out.println("일본");
			break;
		case "베이징" :
			System.out.println("중국");
			break;
		default : 
			System.out.println("해당하는 도시가 없습니다.");
			System.out.println("다음에 이용해주시길 바랍니다.");
		}
	}
	
	public static void method4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12까지 숫자 중 하나를 입력하세요 : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 12: case 1: case 2:
			System.out.println("겨울");
			break;
		case 3: case 4 : case 5 :
			System.out.println("봄");
			break;
		case 6 : case 7 : case 8 :
			System.out.println("여름");
			break;
		case 9: case 10: case 11:
			System.out.println("가을");
			break;
		default :
			System.out.println(month +"월은 잘못 입력된 달입니다.");
		}
	}
	
	//등급에 따라서 학점을 출력하는 코드
	public static void method5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("A, B, C, D, E, F 중 하나의 등급을 입력하세요: ");
		char grade = sc.next().charAt(0);
		
		switch (grade) {
		case 'A' : case 'a' :
			System.out.println("4.0");
			break;
		case 'B': case 'b' :
			System.out.println("3.0");
			break;
		case 'C' : case 'c' :
			System.out.println("2.0");
			break;
		case 'D' : case 'd' :
			System.out.println("1.0");
			break;
		default :
			System.out.println("입력한 정보가 없습니다.");
		}
	}
	
	public static void main(String[] args) {
		//method1();
		//method2();
		//method3();
		//method4();
		//prectice3();
		method5();
	}

}
