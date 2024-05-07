package com.kh.MapEx;

import java.util.HashMap;
import java.util.Map;

public class MapPre {
	//기본생성자
	public MapPre() {

	}
	
	//void 메서드
	public void practice1() {
		Map<Integer,String> map = new HashMap<>();
		map.put(2, "에그마요");
		map.put(3, "로티세리바베큐");
		map.put(1, "스파이시쉬림프");
		System.out.println(map);
	}
	
	public void practice2() {
										//<>자료형을 넣어도 되고 안넣어도됨
		Map<String,String> map = new HashMap<String,String>();
		//map.put을 활용해서 학원-서울시 강남구, 등산-서울시 관악구, 롯데타워 서울시-송파구
		map.put("학원", "서울시 강남구");
		map.put("등산", "서울시 관악구");
		map.put("롯데타워", "서울시 송파구");
		
		//전체출력하기
		System.out.println(map);
		
		//get을 이용해서 롯데타워가 어디있는지 출력
		System.out.println("롯데타워는 어디에 있나요? " + map.get("롯데타워"));
		
		//remove를 활용해서 등산 삭제
		map.remove("등산");
		System.out.println(map);
		
		//for each문에 keySet을 활용해서 전체목록 출력
		for(String 장소 : map.keySet()) {
			String 위치 = map.get(장소);
			System.out.println(장소 + "는 " + 위치 + "에 있습니다.");
		}
	}
	
	public void practice3() {
		//특정값이 존재하는지 확인
		Map<String,Integer> map = new HashMap<>();
		map.put("사과", 100);
		map.put("바나나", 200);
		map.put("체리", 300);
		
		//200원짜리 과일이 존재하는가?
		System.out.println("200원 과일이 존재하는가? " + map.containsValue(200));
		
		//체리과일이 존재하는가?
		System.out.println("체리가 있나요? " + map.containsKey("체리"));
		//containsValue와 containsKey true false로 값이 나옴
		
		//크기조회
		System.out.println("현재 map의 크기 : " + map.size());
		
	}
	
	public void practice4() {
		Map<Integer,String> map = new HashMap<>();
		
		//put을 이용해서 1-에그마요, 2-로티세리바베규, 3-스테이크앤치즈, 4-스파이스쉬림프
		map.put(1, "에그마요");
		map.put(2, "로티세리바베큐");
		map.put(3, "스테이크앤치즈");
		map.put(4, "스파이시쉬림프");
		System.out.println(map);
		
		//get을 이용해서 3번에 뭐가 들엇는지 확인
		System.out.println("3번 메뉴는 무엇인가요? " + map.get(3));
		
		//size()를 이용해서 총 메뉴가 몇개인지 확인
		System.out.println("총 몇개의 메뉴가 있나요? " + map.size());
		
		//remove 활용해서 4번 지워줌
		map.remove(4);
		System.out.println(map);
		
		//isEmpty() map이 비어잇는지 확인
		System.out.println("map이 비어있나요? " + map.isEmpty());
		
		//for each keySet()을 이용해서 모두 보기
		for(int num : map.keySet()){
			String 메뉴 = map.get(num);
			System.out.println(num +"번: " + 메뉴);
		}
		
		//Map.Entry 키-값을 동시에 가져오는 방법
		for(Map.Entry<Integer, String> e : map.entrySet()) {
			System.out.println(e.getKey() +" - " + e.getValue());
		}
		
		//clear() 최종삭제
		map.clear();
		
	}
	

	//메인메서드
	public static void main(String[] args) {
		MapPre mp = new MapPre();
		//mp.practice1();
		//mp.practice2();
		//mp.practice3();
		mp.practice4();
	}
	
}









