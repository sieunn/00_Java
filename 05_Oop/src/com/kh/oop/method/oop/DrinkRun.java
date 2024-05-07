package com.kh.oop.method.oop;

public class DrinkRun {

	public static void main(String[] args) {
		//음료 제조 객체 생성
		DrinkMaker dm1 = new DrinkMaker("허브티",1,5);
		DrinkMaker dm2 = new DrinkMaker("아메리카노",3,1);
		
		//음료 가게 객체 생성
		DrinkStore ds1 = new DrinkStore(dm1,"경기도","맥아커피",false );
		DrinkStore ds2 = new DrinkStore(dm2,"서초구","빠나쁘레쏘",true );
		
		ds1.orderDrink();
		ds2.orderDrink();
	}

}
