package com.kh.javaAPIEx;
/*
 Object : 모든 자바 클래스의 최상위 클래스
 		  모든 클래스가 기본으로 상속받는 클래스
 		  
 	Object 클래스는 기본으로 사용한다라는 개념이 있기 때문에
 	   	   굳이 new object를 사용하진 않음
 	   	   기본으로 모든 클래스는 Object가 기본으로 쓸수있게 만들어짐
 	대표 메서드 : equals, toString   	   
 */

public class Object {

	public boolean equals(Object obj) {
		return true;
	}
	
	@Override
	public String toString() {
		return "Object에서부터 내려오는 메서드 입니다";
	}
	
	public static void main(String[] args) {
		//Object는 기본이기 때문에 굳이 new를 사용해서 공산생성X
		//그렇다고해서 만들수 없는것은 아님
		
		//Object위에 마우스를 올리고 노란색 메모지 위에  @옆에있는 아이콘을 누르면
		//Object 파일로 이동해서 볼수있음
		Object 오브젝트 = new Object();
		
		System.out.println(오브젝트);
	}

}
