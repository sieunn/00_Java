package com.kh.arrays.ex;

import java.util.Arrays;

public class ArraysEx2 {

	//기본생성자
	public ArraysEx2() {
		
	}
	
	public void method1() {
		//숫자 배열 생성
		int[] num = {6, 4, 2, 3, 5, 7, 9};
		
		//숫자 졍렬하기 
		Arrays.sort(num);
		
		//정렬된 내용 출력 Arrays.toString()
		System.out.println("num : "+ Arrays.toString(num));
		
		//num 배열 복사하기 abc   
		int[] abc = Arrays.copyOf(num, num.length);
		
		//num과 abc가 같은지 비교 
		boolean a= Arrays.equals(num,abc);
		System.out.println(a);
		
		//int[] 채우기 = new int[3];
		//Arrays.fill을 이용해서 숫자 6으로 모두 채우기
		int[] 채우기 = new int[3];
		Arrays.fill(채우기, 6);
		System.out.println(Arrays.toString(채우기));
		
	}
	
	//메인메서드
	public static void main(String[] args) {
		ArraysEx2 ae = new ArraysEx2();
		
		ae.method1();
		
	}

}
