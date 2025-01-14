package com.kh.AddressEx;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class AddressPre {
	public static void main(String[] args) {
		//www.google.com
		try {
			InetAddress 구글주소 = InetAddress.getByName("www.google.com");
			System.out.println("호스트명: " + 구글주소.getHostName());
			System.out.println("IP 주소: " + 구글주소.getHostAddress());
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		//나의 컴퓨터 이름과 자리번호 확인하기
		//getLocalHost
		try {
			InetAddress 내컴퓨터 = InetAddress.getLocalHost();
			System.out.println("내 컴퓨터이름과 자리번호: " + 내컴퓨터);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		//www.facebook.com 페이스북 호스트이름과 호스트주소 
		try {
			InetAddress 페이스북 = InetAddress.getByName("www.facebook.com");
			System.out.println("호스트이름: " + 페이스북.getHostName());
			System.out.println("호스트주소: " + 페이스북.getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		//www.instagram.com 인스타그램 호스트이름과 호스트주소 검색
		try {
			InetAddress 인스타그램 = InetAddress.getByName("www.instagram.com");
			System.out.println("호스트이름: " + 인스타그램.getHostName());
			System.out.println("호스트주소: " + 인스타그램.getHostAddress());
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
}
