package practice3.model.vo;

//abstract 추상메서드를 쓰기 위해서는 class도 추상클래스여야지만 사용할 수 있습니다.
public abstract class Animal {
//필드
	private String name;
	private String kinds;
	
//메서드
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setKinds(String kinds) {
		this.kinds = kinds;
	}
	//getter
	public String getName() {
		return name;
	}
	public String getKinds() {
		return kinds;
	}

	//기본생성자 ctrl space enter
	public Animal() {
		
	}
	
	//필수생성자 alt shift s o
	public Animal(String name, String kinds) {
		super();
		this.name = name;
		this.kinds = kinds;
	}
	
	@Override
	//toString
	public String toString() {
		return "저의 이름은 " + name + "이고, 종류는 " + kinds + "입니다."; 
	}
	
	public abstract void speak();

}
