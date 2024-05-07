package com.kh.oop.method.ex;

public class IceCreamRun {

	public static void main(String[] args) {
		IceCream ice1 = new IceCream();
		ice1.setName("월드콘");
		ice1.setSuger(3);
		ice1.setMilk(true);
		ice1.makeIceCream();
		
		IceCream ice2 = new IceCream("바닐라",1,false);
		ice2.makeIceCream();
	}

}
