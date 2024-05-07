package com.kh.interfaceEx;

public class 중학생계산기 implements 계산기, 기계 {
	
	//기계 인터페이스 가져와서 완성
	@Override
	public void 전원켜기() {
		System.out.println("중학생용 계산기가 켜졌습니다.");
	}
	@Override
	public void 전원끄기() {
		System.out.println("중학생용 계산기가 꺼졌습니다.");
	}
	
	//계산기 인터페이스 가져와서 완성
	@Override
	public int 합(int a, int b) {
		return a + b;
	}
	@Override
	public int 차(int a, int b) {
		return a - b;
	}
	@Override
	public int 곱(int a, int b) {
		return a * b;
	}
	@Override
	public double 몫(int a, int b) {
		return a / b;
	}
	@Override
	public int 나머지(int a, int b) {
		return a % b;
	} 
	
}
