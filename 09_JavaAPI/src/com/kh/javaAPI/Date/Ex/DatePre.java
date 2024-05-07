package com.kh.javaAPI.Date.Ex;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePre {

	public static void main(String[] args) {
		//SimpleDateFormat 활용해서 날짜만들기
		
		//1. yyyy-MM-dd
		SimpleDateFormat 날짜 = new SimpleDateFormat("yyyy-MM-dd");
		String 표시 = 날짜.format(new Date());
		System.out.println("날짜 : " + 표시);
		
		//2. HH:mm:ss
		SimpleDateFormat 시간 = new SimpleDateFormat("HH:mm:ss");
		String 표현 = 시간.format(new Date());
		System.out.println("시간 : " + 표현);
		
		//3. yyyy-MM-dd HH:mm:ss
		SimpleDateFormat 날짜시간 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String 표기 = 날짜시간.format(new Date());
		System.out.println("날짜시간 : " +  표기);
		
		//4. SimpleDateFormat E를 사용해서 요일 나타내기
		SimpleDateFormat 요일 = new SimpleDateFormat("E");
		String 변경 = 요일.format(new Date());
		System.out.println("요일 : " +  변경);
		
		
	}

}
