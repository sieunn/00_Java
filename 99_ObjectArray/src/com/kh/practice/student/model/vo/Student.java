package com.kh.practice.student.model.vo;

public class Student {
//필드
	private String name;
	private String subject;
	private int score;
	private boolean passed; //합격여부 boolean은 최초값이 false


	

	//메서드
	// setter
	public void setName(String name) {
		this.name = name;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public void setPassed(boolean passed) {
		this.passed = passed;
	}

	// getter
	public String getName() {
		return name;
	}
	public String getSubject() {
		return subject;
	}
	public int getScore() {
		return score;
	}
	public boolean isPassed() {
		return passed;
	}


	// 기본생성자
	public Student() {

	}

	// 필수생성자
	public Student(String name, String subject, int score) {
		this.name = name;
		this.subject = subject;
		this.score = score;
	}

	// 자동정렬 단축키 : ctrl + shift +f
	// return String inform()
	public String inform() {
		return "이름:" + name + ", 과목:" + subject + " , 점수:" + score;

	}

}
