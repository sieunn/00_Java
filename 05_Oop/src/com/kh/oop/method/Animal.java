package com.kh.oop.method;

public class Animal {

	//필드
	public String name;
	public int age;
	
	//기본생성자
	public Animal() {
		
	}
	//필수생성자
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//return 메서드
	public String getName() {
		return name;
	}
	
	//return 으로 나이 받기
	public int getAge() {
		return age;
	}
	
	//void 로 프린트 줄력하기
	public void info() {
		System.out.println("동물 이름 : " + name);
		System.out.println("동물 나이 : " + age);
	} 
	
	
	public static void main(String[] args) {
		Animal dog = new Animal ("강아지",1);
		Animal cat = new Animal ("고양이",2);
		dog.info();
		cat.info();
	}

}
