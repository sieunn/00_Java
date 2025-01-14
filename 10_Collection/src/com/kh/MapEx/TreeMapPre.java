package com.kh.MapEx;

import java.util.TreeMap;

public class TreeMapPre {
	public static void main(String[] args) {
	
		TreeMap<String,String> tmp = new TreeMap<>();
		
		String[] keys = { "apple" , "banana","orange","grape", "watermelon"};
		String[] values = {"사과", "바나나", "오렌지", "포도", "수박"};
		
		for(int i=0; i<keys.length; i++) {
			tmp.put(keys[i], values[i]);
		}
		
		System.out.println("전체출력: " + tmp);
		
		System.out.println(tmp.get("banana"));
		
		System.out.println("사이즈: " + tmp.size());
		
		System.out.println("비어있나요? " + tmp.isEmpty());
		
		System.out.println("grape 존재? " + tmp.containsKey("grape"));
		
		System.out.println("포도 존재? " + tmp.containsValue("포도"));
		
		System.out.println(tmp.keySet());
		
		System.out.println(tmp.values());
		
		System.out.println("첫번째 키: " + tmp.firstKey());
		
		System.out.println("마지막 키: " + tmp.lastKey());
		
		tmp.clear();
		
		System.out.println(tmp);
		
	}
}
