package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {

	/*String title,String publisher,String author,int price, double discountRate*/
	public static void main(String[] args) {
		System.out.println("kh서점에 오신것을 환영합니다.");
		//book1 책정보 입력후 출력
		Book book1 = new Book();
		book1.title = "그것이 알고싶다.";
		book1.publisher = "SBS";
		book1.author = "박진아";

		book1.inform();
		
		//book2 필수생성자 (String title,String publisher,String author)
		Book book2 = new Book("5월32일", "kh T반", "T반단체");
		book2.inform();
		
		//book3 모두 입력되어있는 필수생성자 이용해서 출력
		Book book3 = new Book("Do it 자바프로그래밍 입문", "이지스퍼블리싱", "박은종", 16500, 0.34);
		book3.inform();
	}

}
