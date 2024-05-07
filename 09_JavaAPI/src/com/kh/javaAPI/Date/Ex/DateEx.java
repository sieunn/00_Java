package com.kh.javaAPI.Date.Ex;
/*
 Date : 특정 날짜와 시간을 나타내는 클래스
 Calendar : 날짜와 시간을 조작하는데 사용되는 추상클래스
 GregorianCalendar : 그레고리력을 사용해서 날짜와 시간을 계산
 SimpleDateFormat : 날짜와 시간을 형식으로 보여주고 그것을 출력
 LocalDate : 
 KST : Korean Standard Time
 */

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateEx {
	public static void main(String[] args) {
		//1.Date
		Date 현재데이트 = new Date();
		System.out.println(현재데이트);
		
		//2.Calendar
		Calendar 캘린더 = Calendar.getInstance();
		int 년 = 캘린더.get(Calendar.YEAR);
		int 월 = 캘린더.get(Calendar.MONTH); //0월부터 가져오기 때무에 +1을 해줘야함
		int 일 = 캘린더.get(Calendar.DAY_OF_MONTH);
		System.out.println("현재 날짜 : " + 년 + "/" + (월+1) + "/" + 일);
		
		//3. GregorianCalendar
		/*
		 그레고리안 달력은 1년 1월 1일 무조건 월요일로 정의되있음
		 2024,4,23 을 하면 자동으로 2024년 5월 23일로 변경됨
		 2024년 5월 23일은 목요일
		 * */
		
		GregorianCalendar 그레고리안1 = new GregorianCalendar();
		GregorianCalendar 그레고리안2= new GregorianCalendar(2024,4,23);//2024/5/23 으로 됨
		int 날짜 = 그레고리안2.get(Calendar.DAY_OF_WEEK); 
		System.out.println("날짜 : " + 날짜);//5/23이 목요일이기 때문에 5라고 나오는것
	
		//4.SimpleDateFormat 년 월 일
		/*
		 년 : y
		 월 : M (분이랑 첫글자가 m인것이 같기 때문에 월은 대문자 M 임)
		 일 : d
		 시 : H (H: 0~23시,  h: 오전(am)과 오후(pm)로 나눠서 표기)
		 분 : m
		 초 : s
		 요일 : E or EEE
		  */
		SimpleDateFormat 날짜형식 = new SimpleDateFormat("yyyy-MM-dd");
		String 날짜표시 = 날짜형식.format(new Date());
		System.out.println("날짜형식 지정해서 표시하기 : " + 날짜표시);
	
		
		//5. LocalDate 현재날짜가져오기
		LocalDate 현재날짜는 = LocalDate.now();
		System.out.println("현재날짜는 : " + 현재날짜는);
	
	
	
	}
}




