package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {
	//기본 생성자
	public ArrayPractice() {
		
	}
	
	public void practice1() {
		
		int num[] = new int[10];
		for(int i=0; i<num.length; i++) {
			num[i] = i +1;
			System.out.print(num[i]);
		}
	}

	public void practice2() {
		int num[] = new int[10];
		for(int i=0; i<num.length; i++) {
			num[i] = num.length-i;
			System.out.println("num[" + i + "] = " + num[i]);
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의정수: ");
		int size = sc.nextInt();
		
		//입력받은 정수 크기의 배열 생성
		int[] numbers = new int[size];
		
		//numbers.length = size
		for(int i=0; i<size; i++) {
			numbers[i] = i+1;
			System.out.print(numbers[i] + " ");
		}
	}
	
	public void practice4() {
		String[] fruits = {"사과","귤","포도","복숭아","참외"};
		System.out.println(fruits[1]);
	}
	
	public void practice6() {
					//    0   1    2   3   4    5   6
		String[] week = {"월","화","수","목","금","토","일"};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("0~6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		//입력한 숫자가 0~6사이에 있는지 확인후 사이에 있다면 요일 출력
		if(num >=0 && num <=6) {
			System.out.println(week[num]+ "요일");
		}else {
			System.out.println("잘못 입력하셨습니다");
		}
	}
	
	public void practice9() {
		int[] num = new int[7];
		
		//랜덤으로 숫자 출력하기
		//1. Random 객체사용 - 조금 더 넓은 범위로 랜덤 사용 
		//2. Math 객체에서 random() 메서드 사용 - 위 객체보다 작은 범위로 사용가능
		
					//num의 최종 길이를 알기 위해서 num.length를 사용
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random()*45+1);
			System.out.println("num[" + i +"] = " + num[i]);
		}
		
	}
	
	
	public void method1() {
		//정수 10 20 30 출력하기
		int[] num = new int[3];
		num[0] =10;
		num[1] =30;
		num[2] =30;
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		
		
		//문자열 각 자리에 월화수목금토일 각 자리에 어떤 요일이 들어가있는지 출력
		String[] str = {"월", "화", "수", "목","금","토","일"};
		
		for(int i=0; i<str.length; i++) {
			System.out.println("str[" + i + "] = " + str[i]);
		}
		
		//실수 index 2까지 만들어주고 출력 실수 자유
		double dbl[] = new double[3];
		dbl[0] = 10.1;
		dbl[1] = 11.1;
		dbl[2] = 13.2;
		
		for(int i=0; i<dbl.length; i++) {
			System.out.println(dbl[i] + " ");
		}
		
		//문자 'A' 'B' 'c' 넣어준 다음 각 자리 출력해보기
		char chr[] = {'A', 'B', 'C'};
		
		for(int i=0; i<chr.length; i++) {
			System.out.print(chr[i] + " ");
		}
	}

	
	public void practice17() {
		//입력한 값이 배열에 있는지 검색
		//있으면 치킨 배달가능 없으면 없는 치킨입니다 출력
		
		String[] chickenMenu = {"양념치킨", "후라이드치킨", "간장치킨"};
		
		//사용자로부터 치킨이름 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("치킨 이름을 입력하세요 : ");
		String inputChic = sc.next();
		
		//배열에 사용자가 입력한 치킨이 있는지 검색
		boolean found = false;
		
		//for - each 문을 사용해서 치킨이 있는지 확인하는 작업
		//만약 치킨이 존재한다면 found = true로 변경 후 break;
		//만약 치킨이 존재한다면 배달 가능 출력
		//존재하지 않는다면 ㅇㅇ치킨은 없는 메뉴입니다 출력

		for(String 치킨 : chickenMenu) {
			if(inputChic.equals(치킨)) {
				found=true;
				break;
			}
		}
		if(found) {
			System.out.println(inputChic + "은 배달가능합니다.") ;
		}else {
			System.out.println(inputChic + "은 없는 메뉴입니다.");
		}
	}

	
	public static void main(String[] args) {
		ArrayPractice ap = new ArrayPractice();
		//ap.practice1();
		//ap.practice2();
		//ap.practice3();
		//ap.practice4();
		//ap.practice6();
		//ap.practice9();
		//ap.method1();
		ap.practice17();
	}
}
