package com.kh.example.practice1.run;

import com.kh.example.practice1.model.vo.Member;

public class Run {
	//메인 메서드
	public static void main(String[] args) {
		//멤버가 정보를 작성할 수 있는 공간 만들고
		//공간에 멤버에 대한 정보를 작성할 수 있는
		//Member 객체 생성
		
		Member member1 = new Member();
		
		//이름 변경
		member1.changeName("동그라미");
		
		//변경된 이름
		member1.printName();
	}

}
