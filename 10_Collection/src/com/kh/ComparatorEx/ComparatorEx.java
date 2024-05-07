package com.kh.ComparatorEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//패키지명이나 파일명 한번에 바꾸는 단축키 F2
/*
 Comparator : 비교하는 객체
 메서드
 compare(변수명1,변수명2) : 두 객체나 변수를 비교해서 정렬 순서를 결정
	 변수명1이 변수명2보다 작으면 음수 반환
	 변수명1과 변수명2가 같으면 0을 반환
	 변수명1이 변수명2보다 크면 양수를 반환
 reversed() : 순서를 거꾸로 뒤집어서 순서를 매길때 사용
 comparing(클래스명 :: 참조할메서드명) = 클래스 밑에서 참조할 메서드를 가지고와서 정렬 기준을 만들어줌
 
 */
public class ComparatorEx {
	public static void main(String[] args) {
		List<String> 단어들 = new ArrayList<>(Arrays.asList("apple","banana","cherry"));
		
		//단어에서 단어의 길이를 기준으로 정렬
		//클래스명 :: 참조할메서드명
		//String클래스에서 밑에있는 메서드 중에서 길이를 나타내는 length 메서드를 사용해서 비교
		Comparator<String> 길이비교 = Comparator.comparing(String :: length);
		
		//sort 사용해서 정렬
		단어들.sort(길이비교);
		
		//정렬된 리스트 출력
		System.out.println("문자열 길이를 기준으로 정렬된 리스트  " + 단어들);
	}
}
