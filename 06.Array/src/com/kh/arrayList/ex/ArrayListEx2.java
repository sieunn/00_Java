package com.kh.arrayList.ex;

import java.util.ArrayList;

public class ArrayListEx2 {

	//기본생성자
	public ArrayListEx2() {
		
	}
	
	public void method1() {
		ArrayList<String> list = new ArrayList<>();
		
		//딸기 바나나 사과
		//add를 사용해서 과일 추가
		list.add("딸기");
		list.add("바나나");
		list.add("사과");
		
		//get사용해서 각 index자리에 값 출력하기
		System.out.println("list.get(0)" + list.get(0));
		System.out.println("list.get(1)" + list.get(1));
		System.out.println("list.get(2)" + list.get(2));
		
		//set 바나나 ->키위로 수정
		list.set(1, "키위");
		System.out.println("수정 후 : " + list);
		
		//size를 이용해 크기 확인
		System.out.println("크기확인 : " + list.size());
		
		//remove 키위삭제
		list.remove(1);
		System.out.println("삭제 확인 : " + list);
		
		//isEmpt() 비어있는지 확인
		list.isEmpty();
		System.out.println("바구니가 비어있나요? " + list.isEmpty());
		
		//앞으로 사용할 for문
		for(String 과일 : list) {
			System.out.println(과일);
		}
		
	}

	public void method2() {
		ArrayList<String> animal = new ArrayList<>();
		 //단축키 - ctrl + alt + ↓ :한줄 복사
		
		//add 사자 호랑이 고양이 강아지
		animal.add("사자");
		animal.add("호랑이");
		animal.add("고양이");
		animal.add("강아지");
		
		//size() 동물이 몇마리 있는지 확인
		System.out.println("몇마리? " + animal.size());
		
		//get 으로 동물 확인
		System.out.println("동물0 : " + animal.get(0));
		System.out.println("동물1 : " +animal.get(1));
		System.out.println("동물2 : " +animal.get(2));
		System.out.println("동물3 : " +animal.get(3));
		
		//set 고양이 -> 토끼로 변경
		animal.set(2, "토끼");
		
		//remove 강아지 삭제
		animal.remove("강아지");
		
		//for문 활용해서 get출력
		for(String 동물 : animal) {
			System.out.println("수정후: " + 동물);
		}
		
		//clear 사용해서 모두삭제
		animal.clear();
		
		//isEmpty() 모두삭제가 됬는지 확인
		System.out.println("모두 이사합시다.");
		System.out.println("동물들이 모두 비어있나요? "+ animal.isEmpty());
	}
	
	public void method3() {
		
		ArrayList<String> pizza = new ArrayList<>();
		System.out.println("=== 피자 메뉴 ===");
		
		//add 고구마 포테이토 페페로니
		pizza.add("고구마피자");
		pizza.add("포테이토피자");
		pizza.add("페페로니피자");
		
		//get활용해서 출력
		System.out.println(pizza.get(0));
		System.out.println(pizza.get(1));
		System.out.println(pizza.get(2));
		
		//모두보기
		System.out.println("모든 메뉴보기 : " + pizza);
		
		//set활용해서 페페로니 -> 파인애플 
		pizza.set(2, "파인애플피자");
		
		//remove 파인애플
		pizza.remove("파인애플피자");
		
		//for문 활용해서 출력
		System.out.println("=== 현재 피자 메뉴 ===");
		for(String 피자 : pizza) {
			System.out.println(피자);
		}
		System.out.println("피자가게가 사라질 예정입니다.");
		
		//메뉴 clear
		pizza.clear();
		
		//메뉴 모두 삭제됬는지 확인 isEmpty
		System.out.println("피자가게가 없어졌습니까? " + pizza.isEmpty());
	}
	
	
	//메인메서드
	public static void main(String[] args) {
		ArrayListEx2 arr = new ArrayListEx2();
		
		//arr.method1();
		//arr.method2();
		arr.method3();
	}

}
