package com.kh.practice.Audition.model.vo;

public class Audition {
	//필드
	private String name;
	private String vlaue;
	private int score;
	private boolean passed; //false
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setVlaue(String vlaue) {
		this.vlaue = vlaue;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public void setPassed(boolean passed) {
		this.passed = passed;
	}
	
	//getter
	public String getName() {
		return name;
	}
	public String getVlaue() {
		return vlaue;
	}
	public int getScore() {
		return score;
	}
	public boolean isPassed() {
		return passed;
	}
	//기본생성자
	public Audition() {
		
	}
	//필수생성자
	public Audition(String name, String vlaue, int score) {
		this.name = name;
		this.vlaue =  vlaue;
		this.score = score;
	}
	
	public String inform() {
		return "이름:" + name + "장르:" + vlaue + "점수:" + score + "합격여부:" + passed;
	}
	
}
