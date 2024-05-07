package com.kh.ListEx;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

/*
 List Vector : Java1 버전 대에서 제일 먼저 등장해서 사용된것
 	  ArrayList : 검색에 좋음 but 데이터의 삽입과 삭제가 빈번한 경우 부적합
 	  LinkedList : 검색엔 안좋음 but 데이터의 삽입과 삭제에는 좋음
 	  
 */
public class ListPre {

	//기본생성자
	public ListPre() {

	}
	//void : 백터
	public void VectorEx() {
		//List<String> 백터 = new Vector<>(); 이렇게 사용해도 되지만 되도록 아래처럼 사용권장
		Vector<String> 백터 = new Vector<>();
		백터.add("자바");
		백터.add("파이썬");
		백터.add("C");
		System.out.println(백터);
		
	}
	
	public void LinkedEx() {
		//List<String> 링크드리스트 = new LinkedList<>();
		LinkedList<String> 링크드리스트 = new LinkedList<>();
		링크드리스트.add("말");
		링크드리스트.add("호랑이");
		링크드리스트.add("송아지");
		System.out.println(링크드리스트);
	}
	
	public void ArrayEx() {
		ArrayList<String> 어레이리스트 = new ArrayList<>();
		어레이리스트.add("사과");
		어레이리스트.add("바나나");
		어레이리스트.add("포도");
		System.out.println(어레이리스트);
	}
	
	
	public static void main(String[] args) {
		ListPre li = new ListPre();
		li.VectorEx();
		li.LinkedEx();
		li.ArrayEx();

	}
}




