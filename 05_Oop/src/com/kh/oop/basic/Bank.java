package com.kh.oop.basic;

public class Bank {
	//필드
	//이름 계좌번호 잔액 비밀번호 마케팅수신동의
	public String name;
	public String accountNumber;
	public int balance;
	public String password;
	public boolean agree; //boolean 기본값 false
	
	//생성자 (초기 생성자)
	public Bank() {
		
	}
	

	//생성자 (필수 생성자)
	public Bank(String name,String accountNumber, int balance, 
			String password, boolean agree) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.password = password;
		this.agree = agree;
	}
	
	//출력 메서드
	public void info() {
		System.out.println("이름 : " + name);
		System.out.println("계좌번호 : " + accountNumber);
		System.out.println("잔액 : " + balance);
		System.out.println("비밀번호 : " + password);
		System.out.println("마케팅수신동의 : " + agree);
	}
	
	//최종 메인 출력메서드
	public static void main(String[] args) {
		//1. 조 씨 은행통장 ok
		Bank customer1 = new Bank();
		customer1.name = "Jor";
		customer1.accountNumber = "111-222-3333";
		customer1.balance = 123;
		customer1.password = "0000";
		customer1.agree = true;
		
		customer1.info();
		
		//2. 던 씨 은행통장 수신동의 실수로 안함
		Bank customer2 = new Bank();
		customer2.name = "dan";
		customer2.accountNumber = "111-110-1234";
		customer2.balance = 1000;
		customer2.password = "1234";
		//수신동의를 안 함
		
		customer2.info();
		
		//3. 필수 생성자를 활용해서 마이클씨의 은행통장
		//이름 계좌번호 잔액 비밀번호를 입력하고
		//수신동의를 true로 변경해서 출력하기
		Bank customer3 = new Bank("마이클", "222-456-7894",2000,"0011",true);
	
		customer3.info();
	}
}
