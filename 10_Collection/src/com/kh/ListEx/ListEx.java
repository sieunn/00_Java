package com.kh.ListEx;

import java.util.ArrayList;
import java.util.List;

/*
 *  List Vector : Java1 버전 대에서 제일 먼저 등장해서 사용된것
 	  ArrayList : 검색에 좋음 but 데이터의 삽입과 삭제가 빈번한 경우 부적합
 	  LinkedList : 검색엔 안좋음 but 데이터의 삽입과 삭제에는 좋음
 
  List : 자료를 순차적으로 나열한 자료구조(배열과 비슷)
	인덱스가 존재함
	인덱스로 순서가 구분되기 때문에 중복 데이터 저장 가능
	인터페이스이기 때문에 객체로 생성이 불가능함 but 다형성으로 이용가능
	
	사용예제
		List list = new ArrayList(3);
		
	E(Element) : 요소를 뜻하는 상징적인 글잘(자료형X)
				== Object String Student 등
					객체를 가리지 않고 넣을 수 있음
	
*/
public class ListEx {
	public static void main(String[] args) {
		//List 객체 생성하고 ArrayList 인스턴스 생성
		/*
		 List list = new ArrayList(3); 에서 List한 다음
		 List<자료형> list = new ArrayList(3); <>로 타입을 지정해주지 않아서
		 노랗게 경고가 발생
		 만약 노란색을 없애고 싶다면 List<Object> 을 넣어서 사용할 수 있음
		 Object = String Integer Boolean 등등 모두 사용가능
		  */
		List list = new ArrayList(3);
		list.add("아무거나"); //add를 사용해서 추가할 수 있음
		list.add(new Object());
		list.add(123123);
		list.add(false); //3을 초과해도 크기가 자동으로 늘어나기 때문에 에러발생 X
		System.out.println(list);
		
	}	
}
