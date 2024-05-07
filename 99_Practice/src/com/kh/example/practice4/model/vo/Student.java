package com.kh.example.practice4.model.vo;

public class Student {

	//필드
	private int grade;
	private int classroom;
	private String name;
	private double heigth;
	private char gender;
	
	
	//setter
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	//getter 
	public int getGrade() {
		return grade;
	}
	public int getClassroom() {
		return classroom;
	}
	public String getName() {
		return name;
	}
	public double getHeigth() {
		return heigth;
	}
	public char getGender() {
		return gender;
	}

	//기본생성자
	public Student() {
		
	}
	
	public void infomation() {
		System.out.println("학년 : " + grade);
		System.out.println("반 : " + classroom);
		System.out.println("이름 : " + name);
		System.out.println("키 : " + heigth);
		System.out.println("성별 : " + gender);
	}
	
	//메인 메서드
	public static void main(String[] args) {
		
		Student st = new Student();
		st.setName("홍길동");
		st.setGrade(3);
		st.setClassroom(2);
		st.setHeigth(200.5);
		st.setGender('남');
		
		st.infomation();
		
	}

}
