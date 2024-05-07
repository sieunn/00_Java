package com.kh.conditionEx;

import java.util.Scanner;

public class ConditionPre {
	
	public static void method1() {
		//숫자 값 2개 받아서 숫자 두개가 일치하는지 확인
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력1 : ");
		int num1 = sc.nextInt();
		System.out.print("숫자입력2 : ");
		int num2 = sc.nextInt();
		
		if (num1 == num2) {
			System.out.println(num1 + "과 " + num2 + "의 값이 같습니다.");
		}else {
			System.out.println(num1 + "과 " + num2 + "의 값은 같지 않습니다.");
		}
	}
	
	public static void method2() {
		//문자 2개 받아서 일치하는지 확인
		Scanner sc = new Scanner(System.in);
		System.out.print("문자입력1 : ");
		String str1 = sc.nextLine();
		System.out.print("문자입력2 : ");
		String str2 = sc.nextLine();
		
		if (str1.equals(str2)) {
			System.out.println("같습니다.");
		}else {
			System.out.println("같지 않습니다.");
		}
	}
	
	public static void method3() {
		//실수 두개 받아서 일치하는지 확인
		Scanner sc = new Scanner(System.in);
		System.out.print("실수입력1 : ");
		double num1 = sc.nextDouble();
		System.out.print("실수입력2 : ");;
		double num2 = sc.nextDouble();
		
		if(num1==num2) {
			System.out.println("같습니다.");
		}else {
			System.out.println("같지 않습니다.");
		}
	}
	
	public static void main(String[] args) {
		method1();
		method2();
		method3();
	}

}
