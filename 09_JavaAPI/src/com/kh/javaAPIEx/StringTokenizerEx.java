package com.kh.javaAPIEx;

import java.util.StringTokenizer;

/*
 StringTokenizer
 Token = 동전, 최소단위, 정보를 가진 물리적 가성적 물체
 */

public class StringTokenizerEx {
	public static void main(String[] args) {
		//기본으로 띄어쓰기 기준으로 구분
		//								소괄호 안에 "" 무언갈 넣어줘야함
		StringTokenizer 토큰 = new StringTokenizer("자바 는 즐거워");
		//hasMoreTokens 만약에 토큰글자 안에 글자가 조금이라도 들어있다면 true
		while(토큰.hasMoreTokens()) {
			//nextToken: 현재 토큰은 꺼냇고 다음 토큰 보여줄 준비해 ~
			System.out.println(토큰.nextToken());
		}
		
	//구분자를 , 넣은 토크나이저를 볼 것
												//오렌지사과포도를 		"," 기준으로 나눈다는것
		StringTokenizer 토큰2번 = new StringTokenizer("오렌지,사과,포도" , ",");
		while(토큰2번.hasMoreTokens()) {
			System.out.println(토큰2번.nextToken());
		}
		
	}
	
}
