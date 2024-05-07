package practice3.controller;

import java.util.Random;

import practice3.model.vo.Animal;
import practice3.model.vo.Cat;
import practice3.model.vo.Dog;

public class AnimalManager {
	public static void main(String[] args) {
		
		Animal[] animals = new Animal[5];
		
		Random random = new Random();
		
		for(int i=0; i<animals.length; i++) {
			//만약에 랜덤으로 true false를 가져오게 한다음
			//true면 강아지 false면 고양이를 칸에 넣을 예정
			//random.nextBoolean() : 랜덤으로 거짓과 참이 나옴
			if(random.nextBoolean()) {
				animals[i] = new Dog("멍멍이" + i, "개", random.nextInt(30)+1);
			}else {
				animals[i] = new Cat("야옹이" + i, "고양이", "집", "검은색");
			}
			
		}
		//System.out.println(animals[0]);
		
		for(Animal a : animals) {
			a.speak();
		}
		
	}
}
