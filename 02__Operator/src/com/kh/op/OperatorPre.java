package com.kh.op;

import java.util.Scanner;

public class OperatorPre {
	//최종 출력 메서드
	public static void main(String[] args) {
		method1();
	}
	//최종으로 출력하는 메서드는 아님
	//내가 필요할 때 꺼내서 쓰느 메서드
	//메서드: 특정 상태나 기능을 정리해놓은 집합
	
	//static : 고정된 이라는 뜻을 가지고 있음
	//static이 붙는 것은 자료형이나 변수의 담아서 쓰는게 아니라
	//단독으로 고정적으로 메모리에서 사용할수 있음을 나타내는 표현
	
	public static void method1(){	
	//1. int num1 = 10 int num2=3
		//더하기 빼기 곱하기 나누기 결과를 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		//int num1 = 10;
		//int num2 = 3;
		
		System.out.println("정수의 사칙연산");
		
		System.out.println("첫번째 숫자를 입력하세요: ");
		int num1 = sc.nextInt(); 
		
		System.out.println("두번째 숫자를 입력하세요: ");
		int num2 = sc.nextInt();
		
		int sum = num1 + num2;
		System.out.println("덧셈 결과 : " + sum);
		
		int dif = num1 - num2;
		System.out.println("뺄셈 결과 : " + dif);
		
		int mul = num1 * num2;
		System.out.println("곱셈 결과 : " + mul);
		
		int div = num1 / num2;
		System.out.println("나눗셈 결과 : " + div);
		
		
		//2. double num3=2.5 double num4=3.5
		//더하기 빼기 곱하기 나누기 결과를 출력하기
		//double num3 = 2.5;
		//double num4 = 3.5;
		
		System.out.println("----------------");
		System.out.println("실수의 사칙연산");
		
		System.out.println("첫번째 숫자를 입력하세요: ");
		double num3 = sc.nextDouble();
		
		System.out.println("두번째 숫자를 입력하세요: ");
		double num4 = sc.nextDouble();
		
		double sum2 = num3 + num4;
		System.out.println("덧셈 결과 : " + sum2);
		
		double dif2 = num3 - num4;
		System.out.println("뺄셈 결과 : " + dif2);
		
		double mul2 = num3 * num4;
		System.out.println("곱셈 결과 : " + mul2);
		
		double div2 = num3 / num4;
		System.out.println("나눗셈 결과 : " + div2);
		
		

	}

}
