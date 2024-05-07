package com.kh.oop.basic;

public class Animal {
	
	//필드
	//동물의 이름String name 나이 int age
	public String name;
	public int age;
	
	//초기 생성자
	public Animal() {
		
	}
	//필수 생성자 String name int age
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//출력 메서드
	public void info() {
		System.out.println("이름:" + name + " 나이:" + age);
	}
	
	//메인 메서드
	public static void main(String[] args) {
		//1. 초기 생성자
			//강아지의 이름과 나이
			//강아지 정보 출력
			Animal dog = new Animal();
			dog.name = "강아지";
			dog.age = 5;
			
			dog.info();

		//2. 필수 생성자
			Animal cat = new Animal("고양이", 3);
			cat.info();
	}
	
}
