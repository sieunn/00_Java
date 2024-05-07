package com.kh.IteratorEx;
/*
 파일 위치를 가져올 때
 동일한 폴더 위치에서 많은 파일을 가져올때는
  '*'을 사용해서 모두 가져오기를 해준다.
  '*'은 전체 선택을 의미
    import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Iterator
 */

import java.util.*; //java 폴더 밑에 util폴더 안에 있는 파일 모두 가져오기

public class IteratorPre {
	public static void main(String[] args) {
		//100,10,20,30,50,70          //숫자를 추가하는방법 1
		ArrayList<Integer> 숫자들 = new ArrayList<>(Arrays.asList(100,10,20,30,50,70));
		//숫자를 추가하는방법 2
		숫자들.add(100);
		
		//Iterator 생성
		Iterator<Integer> 반복하기 = 숫자들.iterator();
		
		//while문 사용해서 hasNext로 다음요소가 잇는지 확인하고
		//next로 출력하기
		while(반복하기.hasNext()) {
			Integer a = 반복하기.next();
			System.out.println(a);
		}
	}
}
