package com.kh.array;

public class ArrayEx2 {

	
	public static void main(String[] args) {
		
		//for문을 활용한 배열 출력하기
		int numbers[] = new int[5];
		
		//1부터 4까지 배열에 숫자를 넣기
		//index가 0부터 시작하기 때문에 i는 0이다
		System.out.println("최대길이 : " + numbers.length);
		for(int i=0; i<numbers.length; i++) {
			numbers [i] = i;
			System.out.print(i);
		}
		
	}
	
	public void method1() {
		//정수 0 1 2 10 20 30 출력하기
		int [] num = new int[3];
		
		//문자열 각 자리에 월화수목금토일 각 자리에 어떤 요일이 들어가있는지 출력
		String[] str = {"월", "화", "수", "목","금","토","일"};
		
		//실수 index 2까지 만들어주고 출력 실수 자유
		double dbl[] = new double[2];
		
		//문자 'A' 'B' 'c' 넣어준 다음 각 자리 출력해보기
		char chr[] = {'A', 'B', 'C'};
	}

}
