package practice3.model.vo;

public class Horse extends Animal {
//필드
	private String location;
	private String color;
	
//메서드
	//setter
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	//getter
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	//기본생성자
	public Horse() {
		
	}
	
	//필수생성자
	public Horse(String name, String kinds, String location, String color) {
		super(name,kinds);
		this.location = location;
		this.color = color;
	}
	//@Override speak 가지고와서 출력하기
	@Override
	public void speak() {
		System.out.println(super.toString() + location + "에 서식하며, 색상은 " + color + "입니다.");
	}
	
}
