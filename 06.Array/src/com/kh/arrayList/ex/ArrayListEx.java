package com.kh.arrayList.ex;

import java.util.ArrayList;

/*
 ArrayList
 리스트는 배열과 비슷하지만 크기가 제한이 없기때문에 다름
 원하는 만큼 담을수 있음
 
 ArrayList로 클래스 이름 사용하지 말것!!!
 
 ArrayList<자료형> 변수명 = new ArrayList<자료형>();
 int->Integer
 Strint -> String
 double -> Double
 char -> Character
 
 add추가 get반환 set수정 remove삭제 size개수확인 isEmpty 비어있는지확인 clear모두삭제
 */
public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		//index 자리위치 0 인지 확인
		//자리가 비어있기 때문에 true
		System.out.println(num.isEmpty());

		//숫자 추가하기
		num.add(10); //index 0 자리에 10이 들어감
		System.out.println("추가확인 : " + num.get(0));
		
		System.out.println(num.isEmpty()); //비어있지 않기 때문에 flase 나옴
		
		//크기 확인 -length를 사용하지않음
		System.out.println("크기 확인 : " + num.size());
		
		//set 수정하기    위지  어떻게 수정할거야?
		//			   Key   vlaue
		num.set(        0,    20);
		System.out.println("수정후 : " + num.get(0));
		
		//삭제
		num.remove(0);
		//삭제했기 때문에 아무것도 없어서 에러남
		//System.out.println(num.remove(0));
		System.out.println(num.isEmpty());
	}
}








