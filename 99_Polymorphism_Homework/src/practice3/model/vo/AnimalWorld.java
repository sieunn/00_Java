package practice3.model.vo;

import java.util.Random;

//true면 토끼, false면 말이 들어감
public class AnimalWorld {

	public static void main(String[] args) {
		Animal animals[] = new Animal[5];
		
		Random random = new Random();
		
		for(int i=0; i <animals.length; i++) {
			if(random.nextBoolean()) {
				animals[i] = new Rabbit("토깽이" + i, "토끼", random.nextInt(20)+1, "흰색");
			}else {
				animals[i] = new Horse("푸릉이" + i, "얼룩말", "농장", "갈색");
			}
		}
		//for each문 사용해서 모두 출력해보자
		for(Animal a : animals) {
			a.speak();
		}
	}
}
