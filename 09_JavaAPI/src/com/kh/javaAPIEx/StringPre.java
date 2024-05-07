package com.kh.javaAPIEx;

public class StringPre {

	public static void main(String[] args) {
		//substring 메서드 사용해서 문자열의 일부를 Today 추출
		String 문제1 = "Today is a beautiful day.";
		String 서브스트링 = 문제1.substring(0,5);
		System.out.println("문제1 : " + 서브스트링);
		
		//toUpperCase 메서드 사용해서 모두 대문자로 변환
		String 문제2 = "Programming is fun and challenging";
		String up = 문제2.toUpperCase();
		System.out.println("문제2 : " + up);
		
		//toLowerCase 메서드 사용해서 모두 소문자로 변환
		String 문제3 = "Learning new things is exciting";
		String lc = 문제3.toLowerCase();
		System.out.println("문제3 : " + lc);
		
		//split 활용해서 문자열을 " " 로 구분하기
		String 문제4 = "A good medicine tastes bitter";
		String[] sp = 문제4.split(" ");
		for(String a : sp) {
			System.out.println("문제4 : " + a);
		}
		
		//replace 활용해서 more을 less로 대체
		String 문제5 = "The more, The better";
		String replace = 문제5.replace("more", "less");
		System.out.println("문제5 : " + replace);
		
		//charAt을 사용해서 6번째 글자를 가져오기
		String 문제6 = "Walls have ears";
		char ch = 문제6.charAt(6);
		System.out.println("문제6 : " + ch);
		
		//substring 메서드 사용해서 his부터 끝까지 추출
		String 문제7 = "Every dog has his day";
		String 서브스트링2 = 문제7.substring(14);
		System.out.println("문제7 : " + 서브스트링2);
		
	}

}
