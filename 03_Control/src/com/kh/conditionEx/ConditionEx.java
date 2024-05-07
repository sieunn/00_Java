package com.kh.conditionEx;

import java.util.Scanner;

//패키지 : 작성한 파일의 폴더 위치
//조건문 기능용 클래스

public class ConditionEx {
	/*
	 
	if 주어진 조건이 참일 때 실행되는 코드 블록
	else 조건이 거짓일 때 실행되는 코드 블록 (필수가 아님)
	
	사용방법
	if (조건문) {
		조건이 참일 경우 실행할 코드 작성
		만약에 조건문의 조건이 참이 아닐경우 자동으로 실행 종료
	}
	
	if - else if - else 
	
	 */
	
	
	//메서드1 : 19세 이상은 성인입니다. 출력하기
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("고객님의 나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		//만약에 고객의 나이가 19세 이상이라면
		//성인입니다 출력할것
		if(age>=19) {
			System.out.println("성인입니다.");
		}else {
			//만약에 age값이 성인이 아니라면
			System.out.println("성인이 아닙니다.");
		}
	}
	
	//메서드2
	public static void method2() {
		int num = 3;
		
		//만약에 num이 짝수일 경우 '짝수입니다' 출력
		//num이 홀수인 경우 '홀수입니다' 출력
		//짝수 2 % 0
		
		if (num % 2 == 0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
	}
	
	//메서드3
	public static void method3() {
		//0~13세 어린이입니다.
		
		//14부터는 어린이가 아닙니다.
		
		int age = 20;
		
		if(age > 0 && age <14 ) {
			System.out.println("어린이입니다.");
		}else {
			System.out.println("어린이가 아닙니다.");
		}
		
	}
	
	
	public static void practice1() {
		//스캐너 이용
		//나이가 10세 이상 20세 미만일때는 10대
		//이 외는 10대가 아님
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력해주세요 : ");
		int age = sc.nextInt();
		
		if (age>=10 && age<20) {
			System.out.println("10대입니다.");
		}else {
			System.out.println("10대가 아닙니다.");
		}
	}
	
	
	//나이가 80세 이상이면 80세 이상입니다. 출력하기
	public static void practice2() {
		
		int age = 88;
		
		if (age >= 80) {
			System.out.println("80세 이상입니다.");
		}else {
			System.out.println("80세 이하입니다.");
		}
	}
	
	
	public static void pre2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 입력 : ");
		int korea = sc.nextInt();
		System.out.print("영어점수 입력 : ");
		int english = sc.nextInt();
		System.out.print("수학점수 입력 : ");
		int math = sc.nextInt();
		
		int sum = korea + english + math;
		double avg = sum/3;
		
		if (korea>=40 && english>=40 && math>=40 && avg>=60) {
			
			System.out.println("국어점수: " + korea);
			System.out.println("영어점수: " + english);
			System.out.println("수학점수: " + math);
			System.out.println("과목 합계 점수 : " + sum);
			System.out.println("과목 평균 점수 : " + avg);
			
			System.out.println("축하합니다. 합격입니다!");
		}else {
			System.out.println("불합격입니다.");
		}
	}
	
	
	public static void pre4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력하세요 : ");
		double hight = sc.nextDouble();
		System.out.print("몸무게를 입력하세요 : ");
		double weight = sc.nextDouble();
		
		double BMI = weight / (hight * hight);
		System.out.println("BMI지수 : " + BMI);
		
		if(BMI<18.5) {
			System.out.println("저체중 입니다.");
		}else if(BMI<23) {
			System.out.println("정상체중 입니다.");
		}else if(BMI<25) {
			System.out.println("과체중 입니다.");
		}else if(BMI<30) {
			System.out.println("비만 입니다.");
		}else {
			System.out.println("고도비만 입니다.");
		}
		
		
	}
	
	//최종메서드
	public static void main(String[] args) {
		//method1();
		//method2();
		//method3();
		//practice1();
		//practice2();
		//pre2();
		pre4();
	}

}
