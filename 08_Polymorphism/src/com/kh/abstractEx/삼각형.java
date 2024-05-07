package com.kh.abstractEx;

//도형에서 사용한 메서드를 사용하겟다. extends 도형


public class 삼각형 extends 도형{
//필드
	private double 밑변;
	private double 높이;
	
	

//필수생성자
	//도형에 있는 필드를 작성해주지 않아 빨간줄 생김
	//도형에서 String 색깔을 넣어줫다면 삼각형에서도 String 색깔과 super(색깔)을 넣어줘야함
	public 삼각형(String 색깔, double 밑변, double 높이) {
		super(색깔);
		this.밑변 = 밑변;
		this.높이 = 높이;
	}
	
	@Override
	public double 도형넓이() {
		return 0.5 * 밑변 * 높이;
	}
	
	/*
	 Math
	 	sqrt = 제곱근을 계산하는 메서드
	 	pow = 주어진 값을 거듭제곱하는 메서드
	 */
	@Override
	public double 도형둘레() {
		double 빗변 = Math.sqrt(Math.pow(밑변, 2) + Math.pow(높이, 2));
		return 밑변 + 높이 + 빗변;
	}
	
	
	
}