package com.kh.operatorPre;

import java.util.Scanner;

public class SwitchIfPre {

	public static void practice8() {
		//주민번호를 이용하여 남자인지 여자인지 구분하여 출력하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 -포함해서 입력하세요 :");
		String idNum = sc.next();
		
		//주민번호 뒷자리의 첫번째 숫자를 가지고 옵니다.
		//charAt 7번째 자리에 있는 값을 가지고 여자인지 남자인지 구분해서 출력
		// -를 제외하고 주민번호만 숫자만 입력한다면 6번째 자리 숫자
		
		char genderCode = idNum.charAt(7); // -포함해서 7번째자리
		
		//주민번호 뒷자리 첫번째 숫자로 성별 판별
		String gender;
		//만약 1이나 3이 들어온다면 남자,  2나 4가 들어온다면 여자
		//char는 ''사용
		if(genderCode == '1'|| genderCode =='3') {
			gender = "남자";
		}else if(genderCode == '2' || genderCode == '4') {
			gender = "여자";
		}else {
			System.out.println("올바른 주민번호가 아닙니다.");
			//else에서 돌려보내는 return
			return;
		}
		// 결과출력
		System.out.println("입력한 주민번호는 " + gender + "입니다.");
	}
	
	public static void castingPractice1() {
		//키보드로 문자 하나를 입력 받아 그 문자의 유니코드를 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자를 입력하세요 : ");
		char inputChar = sc.next().charAt(0);
		
		//유니코드 출력 (16진수)
		int unicode = (int) inputChar;
		System.out.println("입력한 문자 " + inputChar + "의 유니코드는 " + unicode + " 입니다.");
	}
	
	public static void castingPractice3() {
		//주어진 코드에서 빈칸을 채우고 출력결과가 나오도록 만든 것
		int iNum1= 10;
		int iNum2 = 4;
		float fNum = 3.0f; //기본값이 double이기때문에 float로 변경해주는 f붙여줌
		double dNum = 2.5;
		char ch = 'A';
		
		System.out.println(iNum1 / iNum2); ///2 //몫이 2로 떨어진다면?
		System.out.println((int)dNum); // 2 //double 실수로 되어있는 것을 정수로 변경-강제형변환
		
		System.out.println((double)iNum2 * dNum); //10.0
		System.out.println((double)iNum1); //10.0
		
		System.out.println((double)iNum1/iNum2); //2.5
		System.out.println(dNum); //2.5
		
		System.out.println((int)fNum); //3 //실수->정수
		System.out.println((int)iNum1/fNum); //3
		//int와 float은 같은 크기의 byte임. //정수인지 실수인지 표기
		
		//float는 기본적으로 소수점 이하 6자리까지만 보여줌
		System.out.println((double)iNum1/fNum); // 3.3333333
		System.out.println((double)iNum1/fNum); // 3.3333333333333335
		
		System.out.println(ch); //'A'
		System.out.println((int)ch);//65
		System.out.println((int)ch+iNum1);//75
		System.out.println((ch+iNum1));//'k'
	}

	public static void controlPractice1() {
		Scanner sc = new Scanner(System.in);
		
		//메뉴 출력
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		
		//메뉴 번호 입력받기
		System.out.print("메뉴 번호를 입력하세요 : ");
		int menuNum = sc.nextInt();
		
		//선택된 메뉴에 따라 동작 수행
		switch(menuNum) {
		case 1 :
			System.out.println("입력 메뉴 입니다.");
			break;
		case 2 :
			System.out.println("수정 메뉴 입니다.");
			break;
		case 3 :
			System.out.println("조회 메뉴 입니다.");
			break;
		case 4 :
			System.out.println("삭제 메뉴 입니다.");
			break;
		case 7 :
			System.out.println("프로그램이 종료됩니다.");
			break;
		default :
			System.out.println("잘못된 메뉴 번호입니다.");
		}
	}
	
	public static void controlpractice10() {
		Scanner sc = new Scanner(System.in);
		/*
		system.out.print해서 출력할 내용이 길어져서
		줄 바꿈으로 글을 작성하고 싶다면 \n을 이용해서 줄바꿈해서 출력
		\n은 세로로 줄바꿈해서 출력
		\r은 키보드 입력하는 위치를 현재 줄의 맨 처음으로 이동
		\r, \n 둘 중 하나만 써도됨
		system.out.print();
		+는 ); 붙이지 않는 한 줄으 ㄹ바꿔서 계쏙 이어서 작성함
		*/
		//메뉴 출력
		System.out.println("1. 메뉴 출력\r\n"
				+ "2. 짝수/홀수\r\n"
				+ "3. 합격/불합격\r\n"
				+ "4. 계절\r\n"
				+ "5. 로그인\r\n"
				+ "6. 권한 확인\r\n"
				+ "7. BMI\r\n"
				+ "8. 계산기\r\n"
				+ "9. P/F");
		System.out.print("실행할 기능을 선택하세요 : ");
		int menuNum = sc.nextInt();

		//선택된 메뉴에 따라서 동작 수행
		switch(menuNum) {
		case 1 :
			System.out.println("메뉴 출력 입니다.");
			break;
		case 2 :
			System.out.println("짝수/홀수 입니다.");
			break;
		case 3 :
			System.out.println("합격/불합격 입니다.");
			break;
		case 4 :
			System.out.println("계절 입니다.");
			break;
		case 5 :
			System.out.println("로그인 입니다.");
			break;
		case 6 :
			System.out.println("권한 확인 입니다.");
			break;
		case 7 :
			System.out.println("BMI 입니다.");
			break;
		case 8 :
			System.out.println("계산기 입니다.");
			break;
		case 9 :
			System.out.println("P/F 입니다.");
			break;
		default :
			System.out.println("잘못된 메뉴 번호입니다.");
		}
	}
	
	public static void controlPractice5() {
		//아이디 비밀번호 지정후 일치하는지 확인
		
		String userId = "myId";
		String userPw = "myPassword12";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("비밀번호 : ");
		String pw = sc.next();
		
		
		if(id.equals(userId) && pw.equals(userPw)) {
			System.out.println("로그인 성공");
			
		/* ! 특정 조건을 부정하는데 사용
		 id.equals(userId) :id와 userId가 일치하는지 확인
		 !id.equals(userId) :id와 userId가 일치하지 않음
		 						!가 붙으면 아이디가 틀렸을때 참이 된다.
	    */
		}else if(!id.equals(userId)) {
			System.out.println("아이디가 틀렸습니다.");
		}else if(!pw.equals(userPw)) {
			System.out.println("비밀번호가 틀렸습니다.");
		}else {
			System.out.println("잘못 입력되었습니다.");
		}
	}
	
	public static void controlPractice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("회원 등급을 입력하세요 : ");
		//권한이나 규칙을 설정할 때 자주 사용하는 변수명 :Role
		String userRole = sc.next();
		
		switch(userRole){
			case "회원" :
				System.out.println("-게시글 작성\n"
						+ "-게시글 조회\n"
						+ "-댓글 작성");
				break;
			case "비회원" :
				System.out.println("-게시글 조회");
				break;
			case "관리자" :
				System.out.println("-회원관리\n "
						+ "-게시글 관리\n "
						+ "-게시글 작성\n "
						+ "-게시글 조회\n "
						+ "-댓글 작성");
				break;
			default:
				System.out.println("잘못된 회원 등급입니다.");
		}
	}
	
	public static void controlPractice8() {
		/* 키보드로 두 개의 정수와 연산 기호를 입력 받아 연산 기호에 맞춰 연산 결과를 출력하세요.
		(단, 두 개의 정수 모두 양수일 때만 작동하며 없는 연산 기호를 입력 했을 시
		“잘못 입력하셨습니다. 프로그램을 종료합니다.” 출력) */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("피연산자1 입력 :");
		int num1 = sc.nextInt();
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		String oper = sc.next();
		
		double result;
		
		switch(oper) {
		case "+" :
			result= num1+num2;
			break;
		case "-" :
			result= num1-num2;
			break;
		case "*" :
			result= num1*num2;
			break;
			/* /와 %은 0으로 나눌수 없기 때문에 if문으로 값이 0이될 경우 처리를 해줘야함 */
		case "/" :
			if(num2 == 0 ) {
				System.out.println("0으로 나눌 수 없습니다. 프로그램을 종료합니다.");
				return;
			}
			result= num1/num2;
			break;
		case "%" :
			if(num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 프로그램을 종료합니다.");
				return;
			}
			result= num1%num2;
			break;
		default:
			System.out.println("잘못된 입력입니다.");
			return;
		}
		System.out.println(num1 + oper + num2 + " = " + result);
	}
	
	public static void main(String[] args) {
		//practice8();
		//castingPractice1();
		//castingPractice3();
		//controlPractice1();
		//controlpractice10();
		//controlPractice5();
		//controlPractice6();
		controlPractice8();
	}

}
