package com.kh.practice.Employee.view;

import com.kh.practice.Employee.controller.EmployeeController;
import com.kh.practice.Employee.model.vo.Employee;

public class EmployeeMenu {

	private EmployeeController ssm = new EmployeeController();
	
	//기본생성자
	public EmployeeMenu() {
		
	}
	public void printEmployeeMenu() {
		System.out.println("학생이름    과목       점수");
		System.out.println("--------------------------");
		

		for(Employee emp : ssm.printEmployee()) {
			System.out.println(emp.inform());
		}
	}
	
}
