package com.kh.conditionEx;

import java.util.Scanner;

public class ControlSwitchIf {
	
	public static void takeAtaxi() {
		//입력받은 돈이 3000원 이상일 경우에만 택시를 탈 것인지 물어볼것
		Scanner sc = new Scanner(System.in);
		System.out.println("현재 보유하고 있는 금액을 입력하세요 : ");
		int money = sc.nextInt();
		
		//if문을 사용해서 금액이 3000원 이상일 경우에만 물어보는 코드 작성
		if(money >= 3000) {
			System.out.println("택시를 탈까요? (예/아니오)");
			String answer = sc.next();
			
			//answer로 받은 대답에 따라 응답 처리하기
			switch (answer) {
			case "예" :
				System.out.println("택시를 탔습니다.");
				break;
			case "아니오" :
				System.out.println("택시를 타지 않습니다.");
				break;
			default :
				System.out.println("잘못된 입력입니다.");
			}
		}else {
			System.out.println("3000원 이하이므로 잔액이 부족합니다.");
		}
	}
	
	/*
	 사용자로부터 점수를 입력받아 성적 등급을 판별하는 프로그램 작성
	 90점 이상 A학점
	 80점 이상 B학점
	 70점 이상 C학점
	 60점 이상 D학점
	 60점 미만 F학점
	 -> F학점일 때 재수강 하시겠습니까? (yes or no)
	 만약 yes or no 이외의 값이 나올수 있기 때문에 
	 case YES : case yes: 
	 */
	public static void whyScore() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		
		if(score >= 90) {
			System.out.println("A학점");
		}else if(score >=80 ) {
			System.out.println("B학점");
		}else if(score >=70) {
			System.out.println("C학점");
		}else if(score >=60) {
			System.out.println("D학점");
		}else {
			System.out.println("F학점");
			System.out.println("재수강 하시겠습니까? (yes or no): ");
			String reScore = sc.next();
			//재수강의 여부 확인
			switch(reScore) {
			case "yes" : case "YES" :
				System.out.println("재수강 신청이 완료되었습니다.");
				break;
			case "no" : case "NO":
				System.out.println("재수강 신청을 하지 않습니다.");
				break;
			default :
				System.out.println("올바른 입력이 아닙니다.");
			}
		}
	}
	
	/*
	 날짜를 입력받고
	 월수금 :헬스
	 화목 :공부
	 주말 : 집에서 쉴 예정입니까?
	 예 : 집
	 아니오 : 1등산 2독서 3수영
	 */
	public static void whatDay() {
		Scanner sc = new Scanner(System.in);
		System.out.println("날짜를 입력하세요");
		System.out.print("(월/화/수/목/금/토/일) : ");
		String day = sc.next();
		
		String result= "";
		
		switch(day) {
			case "월": case "수" : case "금":
				result= "헬스";
				break;
			case "화" : case "목" :
				result= "공부";
				break;
			case "토" : case "일" :
				System.out.println("주말이네요.");
				System.out.print("집에서 쉴 예정인가요? (예/아니오) : ");
				String answer = sc.next();
				if(answer.equals("예")) {
					result= "집";
				}else {//아니오 할 경우
					System.out.println("어떤 활동을 할 계획인가요?");
					System.out.println("(1.등산/2.독서/3.수영) :");
					int activity =sc.nextInt();
					switch(activity) {
					case 1:
						result= "등산";
						break;
					case 2:
						result= "독서";
						break;
					case 3: 
						result= "수영";
						break;
					default :
						System.out.println("잘못된 입력");
						return;
					}
				}
		default :
			return;
		}
		System.out.println(day + "요일에 "+ result + "할 예정입니다.");
	}
	
	public static void main(String[] args) {
		//takeAtaxi();
		//whyScore();
		whatDay();
	}

}
