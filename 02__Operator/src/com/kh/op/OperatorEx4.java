package com.kh.op;

public class OperatorEx4 {

	public static void main(String[] args) {
		/*
		비교연산자
		데이터가 같은디 다른지를 비교할 때 사용
		결과는 항상 true false 나타남
		
		사용방법
		a == b 
			a와b가 같은면 true
			a와b가 다르면 false
		
		a != b 
			a와b가 다르면 true
			a와b가 같은면 false
		
		!는 부정할 때 사용하는 연산자
		==는 같을 때 사용하는 연산자
			
		 * */
		
		int a = 10;
		int b = 10;
		//system.out.println 으로 무언가를 출력할때
		//+는 "" 문자열이 있으면 각각의 값을 이어주는 역할을 함
		//문자열이 들어간 출력 프린트에서 연산(+-*/true false)
		//같은 작업을 진행하기 위해서는 우선순위 1번인 ()를 이용해서
		//연산작업을 우선으로 진행하고 연산이 끝난 결과를 문자와 이어붙임
		System.out.println("a == b일때 : " + (a == b));
		
		System.out.println(a==b);
		//a=10 b=10
		int c = 20;
		int d = 10;
		
		System.out.println(c != d);
		
		//1. a가 10이고 c가 20인데 ==를 썻을 경우
		System.out.println("↓ a == c ↓");
		System.out.println(a==c);
		//a == c는 값이 다르기 때문에 false가 나옴
	}

}









