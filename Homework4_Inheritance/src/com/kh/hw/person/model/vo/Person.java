package com.kh.hw.person.model.vo;

public class Person {
//필드
	private String name;
	private int age;
	private double height;
	private double weight;

//메서드
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}

	//getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}

	//기본생성자
	public Person() {

	}

	//필수생성자
	public Person(String name, int age, double height, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	
	//@Override 표시하고 toString 작성
	public String toString() {
		return "사람[name= " + name +" , age = " + age + ",height = " + height 
				+", weight = " +weight +"]";
	}

}
