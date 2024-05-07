package com.kh.practice.Employee.controller;

import com.kh.practice.Employee.model.vo.Employee;

public class EmployeeController {

	private Employee[] eArr = new Employee[5];
	public static final int CUT_LINE = 60;
	
	//기본생성자
	public EmployeeController() {
		eArr[0] = new Employee("김길동", "자바", 100);
		eArr[1] = new Employee("박길동", "디비", 50);
		eArr[2] = new Employee("이길동", "화면", 85);
		eArr[3] = new Employee("정길동", "서버", 60);
		eArr[4] = new Employee("홍길동", "자바", 20);
	}
	
	public Employee[] printEmployee() {
		return eArr;
	}
	
	public int sumScore() {
		int sum = 0;
		for(Employee e : eArr) {
			sum += e.getScore();
		}
		return sum;
	}
	
	public double[] avgScore() {
		double avgArr[] = new double[2];
		avgArr[0] = sumScore();
		avgArr[1] = avgArr[0]/eArr.length;
		return avgArr;
	}
	
}
