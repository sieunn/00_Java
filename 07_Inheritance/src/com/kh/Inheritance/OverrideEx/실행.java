package com.kh.Inheritance.OverrideEx;
/*
 동물
   ┖강아지
   ┖고양이
 * */

public class 실행 {
	//메인메서드
	public static void main(String[] args) {
		
		강아지 강아지1번 = new 강아지("멍멍이");
		강아지1번.소리();
		
		고양이 고양이1번 = new  고양이("고영희");
		고양이1번.소리();
		
		//소 음메 토끼 낑낑
		소 소1번 = new 소("송아지");
		소1번.소리();
		
		토끼 토끼1번 = new 토끼("토깽이");
		토끼1번.소리();
		
		
	}
}
