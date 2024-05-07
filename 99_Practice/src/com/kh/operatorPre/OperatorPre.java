package com.kh.operatorPre;

import java.util.Scanner;

//패키지 : 내가 만든 클래스가 들어있는 폴더 위치

//클래스 : 실행하고자 하는 코드를 작성하는 공간

public class OperatorPre {
	//기본 출력 메서드
	//최종으로 출력하는 메서드가 아니지만 상황에 따라
	//최종 메서드에서 호출해서 사용할 수 있는 메서드 중 하나
	//static : 메모리에서 고정
	public static void practice1() { //모든 사람이 사탕을 골고루 나눠갖기
		Scanner sc = new Scanner(System.in);
		// 스캐너를 불러온 다음에 바로 sc로 스캐너 기능을 불러와도 되지만
		//sysout 을 이용해서 어떤 행동을 진행하고 있는지
		//확인하는 작업을 진행할 것
		
		//인원 수 입력받기
		System.out.print("인원 수를 입력하세요 : ");
		int people = sc.nextInt();
		//사탕 개수 입력받기
		System.out.print("사탕 개수를 입력하세요 : ");
		int candies = sc.nextInt();
		//1인당 나눠줄 사탕 개수 계산
		int getCandies = candies / people;
		//나눠주고 남은 사탕 개수 계산
		int reMain = candies % people;
		//결과 출력
		System.out.println("참여 인원 : " + people);
		System.out.println("사탕 총 개수 : " + candies);
		System.out.println("동일하게 나눠가진 사탕 개수 : " + getCandies);
		System.out.println("남은 사탕 개수 : " + reMain);
	}
	
	public static void practice2() { //키보드로 정보 입력받기 + 남녀 확인
		/*
		 이름 : 홍길동, 학년(숫자만) : 3, 반(숫자만) : 4, 번호(숫자만) : 15, 성별(M/F) : M,
		 성적(소수점 아래 둘째 자리까지) : 85.75*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("학생관리프로그램");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		System.out.print("반(숫자만) : ");
		int classNum = sc.nextInt();
		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();
		
		
		//스캐너로 char값을 입력받고자 할 경우에는
		//charAt 을 사용해서 문자열 위치를 읽어오는 작업을 진행해야 됨
		//system으로 예를 들면 system - out - print()
		//charAt은 스캐너 - next - charAt(숫자만적음)
		//                             내가 보고자 하는 숫자 위치
		//T A B L E = 5글자 
		//만약에 맨 앞글자를 보고싶다면 
		//charAt(0) : 맨 앞글자를 보기
		//charAt(1) : 두번째 글자를 보기
		//charAt(2) : 세번째 글자를 보기
		//TABLE의 경우 총 5글자이기 때문에
		//charAt 에서는 4까지만 작성할 수 있음
		
		//성별에 따라 출력 문자열 설정
		//삼항 연산자 이용하여 출력 문자열 설정
		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0);
		//어떤 글자가 들어오든 관계없이 맨 앞에있는 글자만
		//필요하기 때문에 0으로 작성
		
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double score = sc.nextDouble(); //전체자리 입력받기
		
		System.out.println("이름 : " + name);
		System.out.println("학년 : " + grade);
		System.out.println("반 : " + classNum);
		System.out.println("번호 : " + num);
		System.out.println("성별 : " + gender);
		//System.out.println("성적 : " + score);
		
		//printf 를 쓸때는 +가 아니라 ,를 사용함
		//pintf로 %f를 출력할 때는 소수점 자리를 지정해줘도 되고
		//지정해주지 않아도 된다.
		//다만 만약에 소수점 자리 위치를 출력하길 원한다면
		//% .출력을 원하는 소수점 위치자리 값 f
		// 예를 들어 소수점 4번째 자리까지 출력하길 원함 : %.4f
		
		System.out.printf("성적 : %.2f" , score);
		
	}

	public static void practice3() { 
		/*
		 국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고,
		 세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수를 입력하세요 : ");
		int korea = sc.nextInt();
		
		System.out.print("영어점수를 입력하세요 : ");
		int english = sc.nextInt();
		
		System.out.print("수학점수를 입력하세요 : ");
		int math = sc.nextInt();
		
		int total = korea + english + math;
		//점수가 무조건 소수점 이외 정수만 나오느다는 보장이 없기 때문에
		//실수가 나온다는 가정에 진행
		double avg = (double)total / 3.0;
		
		System.out.println("국어점수 : " + korea);
		System.out.println("영어점수 : " + english);
		System.out.println("수학점수 : " + math);
		System.out.println("세 과목의 합계는 : " + total);
		System.out.println("세 과목의 평균은 : " + avg);
		
		
	}
	
	public static void practice4() {
		//2개의 수를 키보드로 입력받아 입력받은 수가
		//모두 같으면 true 아니면 false 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		//true false를 표현할 때 boolean 을 사용해서 표현함
		boolean result = num1 == num2;
		
		System.out.println("num1==num2 : "+ result);
	}
	
	public static void method4() {
		/*실습문제 4번 응용
		2개의 수를 키보드로 입력받아 입력받은 수가
		모두 다르면 true 같으면 false 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		//true false를 표현할 때 boolean 을 사용해서 표현함
		boolean result = num1 != num2;
		
		System.out.println("num1의 값 : " + num1);
		System.out.println("num2의 값 : " + num2);
		System.out.println("num1!=num2 : "+ result);
		
		
		
	}
	
	public static void prectice5() {
		//3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 입력 : ");
		int a = sc.nextInt();
		System.out.print("두번째 숫자 입력 : ");
		int b = sc.nextInt();
		System.out.print("세번째 숫자 입력 : ");
		int c = sc.nextInt();
		
		//&&는 두 값이 모두 true이어야 true
		boolean result = (a==b)&&(b==c);
		
		
		// ||: vertical bar: or 
		//||는 두 값중 하나만 true이면 true
		boolean isOR = (a==b) || (b==c);
		
		System.out.println("첫번째 숫자:" + a + " 두번째 숫자:" + b + " 세번째 숫자:" + c);
		System.out.println("결과 : " + result);
		System.out.println("isOR : " + isOR);
	}
	
	
	//메인메서드 : 최종으로 실행하는 메서드
	public static void main(String[] args) {
		//작성해준 메서드 중에서 실행이나 출력하고자 하는 메서드 작성 
		//practice1();
		//practice2();
		//practice3();
		//practice4();
		//method4();
		prectice5();
	}

}
