package practice3.model.vo;

public class Cat extends Animal{
//필드
	private String location;
	private String color;
	
//메서드
	//setter
	
	public void setLocation(String location) {
		this.location = location;
	}
	public void setColor(String color) {
		this.color = color;
	}
	//getter
	public String getLocation() {
		return location;
	}
	public String getColor() {
		return color;
	}
	
	//기본생성자
	public Cat() {
		
	}

	//필수생성자
	public Cat(String name, String kinds, String location, String color) {
		super(name, kinds);
		this.location = location;
		this.color = color;
	}
	
	@Override
	public void speak() {
		System.out.println(super.toString() + " " + location + "에 서식하며, 색상은 " + color + "입니다.");
	}
	
	
}
