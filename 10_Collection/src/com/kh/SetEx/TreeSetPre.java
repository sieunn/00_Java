package com.kh.SetEx;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetPre {
	public static void main(String[] args) {
		//과일들 String으로 "키위 복숭아 참외 수박 딸기"
							//Set.of("","","")
		TreeSet<String> 과일들 = new TreeSet<>(Set.of("키위","복숭아","참외","수박","딸기"));
		과일들.add("키위"); //이걸 써도 중복이 안됨
		System.out.println(과일들);
		
		//복숭아 제거
		과일들.remove("복숭아");
		System.out.println("복숭아 제거: " + 과일들);
		
		//수박이 포합되어있는지 확인
		System.out.println("수박이 포함되어있낭? " + 과일들.contains("수박"));
		
		//과일들이 비어있는지 확인
		System.out.println("과일들이 비어있나요? " + 과일들.isEmpty());
		
		//과일들 개수
		System.out.println("과일들 갯수: " + 과일들.size());
		
		//가장 작은 값
		System.out.println("가장 작은값은? " + 과일들.first());
		
		//가장 큰 값
		System.out.println("가장 큰 값은? " + 과일들.last());
		
		//모든값 제거 //모든값 제거되었는지 확인
		과일들.clear();
		System.out.println("모든 값 제거: " + 과일들);
		
		
		
		
	}
	
}
