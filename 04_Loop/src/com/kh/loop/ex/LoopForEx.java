package com.kh.loop.ex;

import java.util.Random;
import java.util.Scanner;

public class LoopForEx {
	//기본 메서드
	
	//LoopForEx에서 출력하길 원한다면
	
	//방법1. public static void guguDan으로 static을 추가해준 다음에
	//public static void main(String[] args){
	//	guguDan();
	//}
	
	//방법2. static을 붙이지 않고 출력하길 원한다면
	//출력용 클래스를 만들어서 출력하기 LoopForRun
	//종료를 하기 전까지 반복해서 출력하기
	
	public void guguDan() {
		//사용자로부터 숫자를 입력받고 숫자에 해당하는 구구단 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 세계로 오신것을 환영합니다^^");
		
		//구구단을 0을 입력하기 전까지 반복해서 출력하기
		//반복하기 위해서 while문 사용
		while(true) {
			System.out.println("종료를 원하면 0 입력하기");
			System.out.print("원하는 숫자 입력 : ");
			int dan = sc.nextInt();
			
			//만약 숫자 0이 들어오면 프로그램 종료하기
			if(dan==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			//받은수를 for문 이용해서 출력
			for(int i=1; i<=9; i++) {
				System.out.println(dan + " * " + i + " = " + (dan*i));
			}
		}
	}
	
	
	//구구단 입력받아 거꾸로 출력하기
	public void guguDan2() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("종료를 원하면 0을 입력해주세요");
			System.out.println("원하는 수를 입력해주세요 : ");
			int dan = sc.nextInt();
			
			if(dan==0) {
				System.out.println("프로그램 종료");
				break;//for문,while문,switch에서 사용 가능 / if문에서 단독으로 사용안됨
			}
			//continue 는 자주 사용되지 않음
			//if 1~9까지만 입격 가능하도록 조건
			if (dan <1 || dan >9) {
				System.out.println("1부터 9까지의 숫자를 입력해주세요: ");
				continue;
			}
			
			for(int a=9; a>=1; a--) {
				System.out.println(dan + " * " + a + " = " + (dan*a));
			}
		}
	}
	
	
	//구구단을 1단부터 9단까지 모두 출력
	public void guguDan3() {
		//1단부터 9단까지 출력
		for(int dan=1; dan<=9; dan++) {
			System.out.println("*****" + dan + "*****");
			//1단에서부터 1~9를 곱해준 값을 출력
			for(int num=1; num<=9; num++) {
				System.out.println(dan + " * " + num + " = " + (dan*num));
			}
		}
		
	}
	
	
	//구구단 2단부터 9단까지 출력
	public void guguDan4() {
		for(int dan=2; dan<=9; dan++) {
			System.out.println("*****" + dan + "*****");
			
			for(int num=1; num<=9; num++) {
				System.out.println(dan + " * " + num + " = " + (dan*num));
			}
		}
	}
	
	
	//10개의 숫자 랜덤으로 출력하기
	public void randomNum() {
		//Random 불러와 내가 지정한 범위에서 숫자를 랜덤으로 출력
		Random 랜덤 = new Random(); //로또번호 생성
		
		//nextInt안에 숫자를 넣어서 
		//어디서부터 어디 사이에서 랜덤으로 숫자가 나와야하는지
		//범위를 지정할 수 있음
		int 랜덤숫자 = 랜덤.nextInt(5); // 0~4 사이에 숫자가 나옴 
		System.out.println("랜덤숫자 : " + 랜덤숫자);
	}
	
	//랜덤으로 숫자 3개 출력하기 1~10사이의 숫자
	public void randomFor() {
		Random ran = new Random();
		
		for(int num=1; num<=3; num++) {
			//랜덤으로 숫자 만들어주기
			int randomNum = ran.nextInt(10)+1;
			System.out.println("랜덤숫자 " + num + " : " + randomNum);
		}
		
	}
	
	//랜덤으로 1~45 번호 6자리 for문 출력
	public void randomFor2() {
		Random ran = new Random();
		for(int num=1; num<=6; num++) {
			int ranNum = ran.nextInt(45)+1;
			System.out.println("랜덤숫자" + num + " : " + ranNum);
		}
		
	}
	
	//1부터 10까지의 숫자중에서 홀수만 출력하기
	public void oddNum() {
		for(int num=1; num<=10; num++) {
			if(num%2 !=0) {
				System.out.println(num);
			}
		}
	}
	
	
	//짝수만 1부터10까지 출력하기
	public void evenNum() {
		for(int num=1; num<=10; num++) {
			if(num%2==0) {
				System.out.println (num);
			}
		}
	}
	
	//정사각형 모양의 별출력
	public void squareStar() {
		int star = 3;
		for(int i=0; i<star; i++) { //한줄출력
			for(int j=0; j<star; j++) {
				System.out.print("* ");
			}
			System.out.println();//가로로 별을 출력한다음 줄바꿈
		}
	}
	
	//정사각형 모양의 별 출력 가로로 5개씩 출력
	public void fiveStar() {
		int star = 5;
		for(int i=0; i<star; i++) {
			for(int j=0; j<star; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	//for 2번기회주기
	//if문 수정 - 숫자값이 정답보다 작으면 숫자가 작습니다.
	// 숫자값이 정답보다 높으면 숫자가 너무 큽니다. hint

	public void numberGame() {
		//랜덤으로 만들어진 숫자가 무엇인지 키보드로 맞추는 게임
		Scanner sc = new Scanner(System.in);
		
		//랜덤으로 숫자 만들기
		Random random = new Random();
		
		while(true) {//숫자를 맞출때까지 계속 반복
			
			int randomNum = random.nextInt(3)+1; //1부터 3까지
			System.out.println("숫자를 맞춰보세요 : ");
			
			for(int i=1; i<=2; i++) {
				System.out.println("공격 " + i +"번째 시도! ");
				int guest = sc.nextInt(); //게스트가 입력한 숫자 가져오기
				
				if(guest == randomNum) {
					System.out.println("축하합니다. 숫자를 맞췄습니다!");
					break;
				}else if(guest < randomNum) {
					System.out.println("숫자가 너무 작습니다.");
					continue;
				}else if(guest > randomNum) {
					System.out.println("숫자가 너무 큽니다.");
					continue;
				}else {
					System.out.println("틀렸습니다.");
				}
			}
			System.out.println("정답은 : " + randomNum + "입니다.");
			System.out.println("게임을 다시 시작하시겠습니까? (1.yes / 2.no) : ");
			int playAgain = sc.nextInt();
			
			//만약 2번 누르면 break; 걸어주기
			if(playAgain == 2) {
				System.out.println("게임을 종료합니다.");
				break;
			}
		}
	}
	
	
	
	
	
	
	
}
