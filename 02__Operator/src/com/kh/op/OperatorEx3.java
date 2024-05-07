package com.kh.op;

public class OperatorEx3 {

	public static void main(String[] args) {
		/*
		증감연산자 : ++ --
		++ 는 1을 더한다는 의미
		-- 는 1을 뺀다는 의미
		
		전위 연산자 : 먼저 더하기 빼기를 한 다음에 다른 계산을 실행할 것
		후위 연산자 : 다른 계산을 먼저 한 다음에 더하기 빼기를 진행할 것
		 */
		
		int a =10;
		int b =++a;
		System.out.println("a: " + a + ", b: " + b);
	 	
		int c = 10;
		int d = c++;
		System.out.println("c: " + c + ", d: " + d);
	}

}
