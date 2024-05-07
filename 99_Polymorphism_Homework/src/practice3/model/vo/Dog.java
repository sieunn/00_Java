package practice3.model.vo;

//동물 추상클래스 가져오기
public class Dog extends Animal {
//필드	
	public static final String PLACE = "애견카페";
	private int weight;
//메서드
	
	//setter
	public int getWeight() {
		return weight;
	}
	//getter
	public void setWeight(int weight) {
		this.weight = weight;
	}

	//기본생성자
	public Dog() {

	}
	
	//필수생성자
	public Dog(String name, String kinds, int weight) {
		super(name,kinds);
		this.weight = weight;
	}
	
	@Override
	public void speak() {
		System.out.println(super.toString() + "몸무게는 " + weight + "kg 입니다.");
	}
	
	
	
}
