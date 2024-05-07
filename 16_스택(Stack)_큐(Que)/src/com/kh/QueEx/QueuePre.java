package com.kh.QueEx;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePre {
	public static void main(String[] args) {
		Queue<Integer> 큐 = new LinkedList<>();
		
		큐.offer(80);
		큐.offer(60);
		큐.offer(30);
		큐.offer(20);
		
		int 맨앞제거 = 큐.poll();
		System.out.println("데이터확인 및 제거: " + 맨앞제거);
		
		int 맨앞데이터 = 큐.peek();
		System.out.println("맨앞 데이터 확인: " + 맨앞데이터);
		
		boolean isEmpty = 큐.isEmpty();
		System.out.println("비어있나요? " + isEmpty);
	}
}
