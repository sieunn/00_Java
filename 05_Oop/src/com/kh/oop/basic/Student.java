package com.kh.oop.basic;

public class Student {
	//필드
	//학생의 이름과 나이와 학년
	public String name;
	public int age;
	public int grade;
	
	public Student() {
		
	}
	
	//생성자(필수 메서드)
	//필수로 넣어야하는것 이름 나이 학년
	public Student (String name, int age, int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
	//출력메서드 정보출력메서드
	public void info() {
		System.out.println("이름 : " + name + "\n나이 : " + age + "\n학년 : " + grade);
	}
	
	//최종 메인메서드
	//학생 객체 생성하기 김철수 18살 3학년 / 박영희 20살 2학년
	//Student student1
	//Student student2
	public static void main(String[] args) {
		Student student1 = new Student("김철수", 18, 3);
		Student student2 = new Student("김영희", 20, 2);
	
		//학생1과 학생2 정보 출력하기
		student1.info();
		student2.info();
	
	
	}

}
