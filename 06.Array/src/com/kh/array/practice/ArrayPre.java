package com.kh.array.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayPre {
	
//메서드
	//기본생성자
	public ArrayPre() {
		
	}
	
	//void
	public void practice1() {
		//배열을 사용해서 전체 합 구하기
		//배열을 사용할 때 제일먼저 
		//숫자인지 문자열인지 문자인지 실수인지 구분을 해준 후 []표시작성
		//index      0,1,2,3,4    length = 5
		int[] num = {1,2,3,4,5};
		int result = 0;
		
		//for each문 처음부터 끝까지 반복해서 무언를 진행할 때 사용
		for(int 숫자 : num) {
			//num안에 있는 모든 숫자가 하나씩 숫자안에 들어가고
			//숫자들의 합
			result += 숫자;
		}
		System.out.println("숫자들의 합 : " + result);
	}
	
	public void practice2() {
		//ArrayList 사용해서 물건 추가하기
		//						new ArrayList<> 안에 String 넣어도되고 안넣어도딤
		ArrayList<String> goods = new ArrayList<>();
		
		//상품을 추가할때는 add
		goods.add("컴퓨터");
		goods.add("냉장고");
		goods.add("TV");
		goods.add("에어컨");
		
		//모두보기 2가지
		System.out.println(goods);
		
		//for each문
		for(String all  : goods) {
			System.out.print(all + " ");
		}
	}

	public void practice3() {
		//배열을 사용해서 최대값 찾기
		int[] numbers = {3,7,2,9,1};
		
		int max = numbers[0];
		
		for(int num : numbers) {
			if(num>max) {
				max = num;
			}
		}
		System.out.println("최대값 : " + max);
	}

	public void practice4() {
		//찾음 못찾음
		//과일가게 사과 바나나 딸기 오렌지
		String[] fruits = {"사과","바나나","딸기","오렌지"};
		
		String search = "키위";
		boolean found = false; //아직은 찾앗는지 안잦았는지 모르기때문에 false
		
		//for each문 활용해서 찾기
		for(String f  : fruits) {
			//만약에 내가 찾는 과일과 이름이 똑같다면 찾았다 해주기
			if(f.equals(search)) {
				found = true;
				break; //이름이 같은지 찾았기 때문에 if문 탈출
			}
		}
		System.out.println(search + " 찾음?" + (found ? " 찾음" : " 못찾음"));
	}

	public void practice5() {
		//스캐너로 동물을 입력하고 배열에 동물이 있는지 확인할것
		Scanner sc = new Scanner(System.in);

		String[] zoo = {"코끼리" , "원숭이", "푸바오", "토끼", "공작"};
		
		//search 스캐너로 변경
		System.out.print("동물을 입력하세요 : ");
		String search = sc.next();
		boolean found = false;
		
		for(String z : zoo) {
			if(z.equals(search)) {
				found = true;
				break;
			}
		}
		System.out.println(search + " 찾음?" + (found ? " 찾음" : " 못찾음"));
	}
	
	
	
	
	
	
	
	
	
	
}
