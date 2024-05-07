package com.kh.operatorPre;

import java.util.Scanner;

public class ControlPre {

	/* 실습문제 1
	키보드로 입력 받은 정수가 양수이면서 짝수일 때만 “짝수입니다.”를 출력하고
	짝수가 아니면 “홀수입니다.“를 출력하세요.
	양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
	 */
	public static void prectice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int number = sc.nextInt();
		
		if(number%2==0 && number>0) {
			System.out.println("짝수입니다.");
		}else if(number<0) {
			System.out.println("양수만 입력해주세요");
		}else {
			System.out.println("홀수입니다.");
		}
		
		/*
		 if(number>0) {
			if(number%2==0 && number>0) {
				System.out.println("짝수입니다.");
			}else {
				System.out.println("홀수입니다.");
			}
		}else{
			System.out.print("음수입니다. 양수만 입력해주세요");
		}
		*/
	}
	
	/* 실습문제 2
	국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
	합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
	(합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)

	합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
	불합격인 경우에는 “불합격입니다.”를 출력하세요.
	*/
	public static void prectice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 입력 : ");
		int korea = sc.nextInt();
		System.out.print("영어점수 입력 : ");
		int english = sc.nextInt();
		System.out.print("수학점수 입력 : ");
		int math = sc.nextInt();
		
		int totalScore = korea + english + math;
		double avg = (double)totalScore/3.0;
		
		//합격 여부 판별
		if(korea>=40 && english>=40 && math>=40 && avg>=60) {
			System.out.println("국어점수: " + korea);
			System.out.println("영어점수: " + english);
			System.out.println("수학점수: " + math);
			System.out.println("합   계 : " + totalScore);
			System.out.println("평   균 : " + avg);
			
			System.out.print("축하합니다. 합격입니다!");
		}else {
			System.out.println("불합격입니다.");
		}
	}
	
	/*실습문제 3
	 1~12 사이의 수를 입력 받아 해당 달의 일수를 출력하세요.(2월 윤달은 생각하지 않습니다.)
	잘못 입력한 경우 “OO월은 잘못 입력된 달입니다.”를 출력하세요.
	 */
	public static void prectice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12중 하나 입력 : ");
		int month = sc.nextInt(); //키보드로 입력한 달
		
		int daysMonth; //해당하는 달의 일수
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			daysMonth = 31;
			break;
			
		case 4: case 6: case 9: case 11:
			daysMonth = 30;
			break;
			
		case 2:
			daysMonth = 28;
			break;
			
		default :
			System.out.println(month + "월은 존재하지 않는 달입니다.");
			//daysMonth = 0;
			return;
		}
		System.out.println(month + "월은 " + daysMonth + "일까지 있습니다.");
	}
	
	/* 실습문제 4
	키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
	저체중/정상체중/과체중/비만을 출력하세요.
	*/
	public static void prectice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력하세요: ");
		double hight = sc.nextDouble();
		System.out.print("몸무게를 입력하세요: ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (hight * hight);
		System.out.println("BMI지수 : " + bmi);
		
		if(bmi<18.5) {
			System.out.println("저체중 입니다.");
		}else if(bmi<23) {
			System.out.println("정상체중 입니다.");
		}else if(bmi<25) {
			System.out.println("과체중 입니다.");
		}else if(bmi<30) {
			System.out.println("비만 입니다.");
		}else {
			System.out.println("고도비만 입니다.");
		}
		
	}

	/*실습문제 5
	 중간고사, 기말고사, 과제점수, 출석횟수를 입력하고 Pass 또는 Fail을 출력하세요.
	평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고
 	이 때, 출석 횟수는 총 강의 횟수 20회 중에서 출석한 날만 따진 값으로 계산하세요.
	70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요.
	 */
	public static void prectice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("중간 점수 : ");
		double mid = sc.nextDouble();
		System.out.print("기말 점수 : ");
		double fin = sc.nextDouble();
		System.out.print("과제 점수 : ");
		double assig = sc.nextDouble();
		System.out.print("출석 횟수 : ");
		int attend = sc.nextInt();
		
		//출석 비율 계산
		//attend/20 = 출석횐 횟수를 전체 강의 횟수로 나눠서 출석 비율 계산
		//실수로 된 값을 100을 곱해서 백분율로 변환
		double attendPer = (double) attend / 20*100;
		
		//평가 비율에 따른 총점 계산
		double midScore = mid *0.2;
		double finScore = fin *0.3;
		double assigScore = assig *0.3;
		double attendScore = attendPer *0.2;
		double totalScore = midScore + finScore + assigScore + attendScore;
		
		System.out.println("========결과==========");
		
		
		System.out.println("중간 점수(20점 만점): " + midScore);
		System.out.println("기말 점수(30점 만점): " + finScore);
		System.out.println("과제 점수(20점 만점): "+ assigScore);
		System.out.println("출석 점수(30점 만점): " + attendScore);
		System.out.println("총 점수 : " + totalScore);
		
		//평가에 따른 pass or fail 출력
		if (totalScore >=70 && attendPer>=70) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
				
	}

	
	public static void main(String[] args) {
		//prectice1();
		//prectice2();
		prectice3();
		//prectice4();
		//prectice5();
	}

}
