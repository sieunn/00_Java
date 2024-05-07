package com.kh.StackEx;

import java.util.Stack;

public class StackPre {
	public static void main(String[] args) {
		Stack<Integer> 스택 = new Stack<>();
		
		스택.push(10);
		스택.push(30);
		스택.push(50);
		스택.push(40);
		스택.push(20);
		
		int 팝 = 스택.pop();
		System.out.println("맨위값 지우고 반환: " +팝);
		
		int 픽 = 스택.peek();
		System.out.println("맨위값 확인: " + 픽);
		
		boolean 비어있는지 = 스택.isEmpty();
		System.out.println("비어있는지 확인: " + 비어있는지 );
		
		int 사이즈 = 스택.size();
		System.out.println("사이즈: " + 사이즈);
	}
}
