package com.kh.oop.constructor;

public class ConstructorEx {

	/* 생성자
	변수를 원하는 값으로 초기화할 수 있음
	
	초기값 = 0으로 되어있을 때 초기값에 1을 넣어주면
	초기값이 1로 초기화됨
	
	1. 반환값이 없음(return 사용 X, void 사용 X)
	2. 객체를 (클래스) 초기화 하는 방법이 많을 경우 모두 사용 가능
		
		선언예제
			1. 기본 생성자 - 아무런 값도 안들어감
			public 클래스이름(){
			
			}
			2. 필수 생성자 - 필수로 받아야하는 값이 존재함
						- 필수로 받아야하는 값은 필드에 적힌 값만 가능
			public 클래스이름(String oo, intㅁㅁ, char ㅎㅎ){
				(여기서 변수명과 필드값은 같음)
				this.필드값1 = oo;
				this.필드값2 = ㅁㅁ;
				this.필드값3 = ㅎㅎ;
			}
			3. 값이 지정된 생성자
				필드나 생성자에서 값을 지정해준 생성자
			
	*/
	
	//필드 (변수명 정의)
	public String name;
	public String phone;
	public int idNo;
	public int money;
	
	//기본 생성자
	public ConstructorEx() {
		
	}
	
	//필수 생성자 - 괄호 안에 매개변수가 필수로 들어가야하는 생성자
	public ConstructorEx(String inputName) {
		this.name = inputName;
	}
	
	public ConstructorEx(String inputName, String inputNumber) {
		this.name = inputName;
		this.phone = inputNumber;
	}
	
	public ConstructorEx(String inputName, String inputNumber, int inputId) {
		this.name = inputName;
		this.phone = inputNumber;
		this.idNo = inputId;
	}
	
	public ConstructorEx(String inputName, String inputNumber, int inputId, int inputMoney){
		this.name = inputName;
		this.phone = inputNumber;
		this.idNo = inputId;
		this.money = inputMoney;
	}
	
	//값을 지정한 생성자
	//값을 지정한 생성자는 초기의 값만 지정해주기 때문에
	//매개변수를 필수를 넣어주지 않아도 되지만
	//기본 생성자와 생김새가 똑같아서 빨간줄이 나기 때문에
	//현재는 임의로 매개변수를 넣어줌
	//보통은 public ConstructorEx() {} 사용할 수 있음 - 많이 사용하지 않음
	public ConstructorEx(int a) {
		//기본으로 값을 지정해서 전달하는 생성자
		//생성할 때부터 값을 지정해주고 추후 값을 변경할 수있도록 해줌
		
		name = "이름을 입력해주세요.";
		phone = "번호를 입력해주세요.";
		idNo = 1; //int이기 때문에 숫자값을 넣어야함
		money = 0;
	}
	
	
	
	public static void main(String[] args) {
		
	}

}
