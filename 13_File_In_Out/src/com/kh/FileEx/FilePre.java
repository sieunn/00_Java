package com.kh.FileEx;

import java.io.File;
import java.io.IOException;

public class FilePre {
	//기본생성자
	public FilePre() {

	}
	
	public void 메서드1() {
		File 텍스트파일 = new File("c:/Users/user1/Desktop/newFFF/파일생성.txt");
		
		if(텍스트파일.exists()) {
			System.out.println("파일이 존재합니다.");
		}else {//존재하지 않는다면
			//만약 파일 만들기 성공 try catch문
			try {
				텍스트파일.createNewFile();
				System.out.println(텍스트파일.getName() + " 파일이 생성되었습니다.");
				
			} catch (IOException e) {
				System.out.println("파일만들기 실패");
				e.printStackTrace();
			}
		}
		
	}
	
	public void 메서드2() {
		//절대경로
		//바탕화면에 뉴폴더라는 폴더 생성하고 뉴폴더 안에 파일생성.txt 파일 만들기
		String 폴더경로 = "c:/Users/user1/Desktop/뉴폴더";
		
		//바탕화면 경로를 설정하는 방법				c:/Users/user1
		String 바탕화면경로 = System.getProperty("user.home") + "/Desktop";
		System.out.println(바탕화면경로);
		
		File 폴더만들기 = new File(폴더경로);
	
		if(폴더만들기.exists()) {
			System.out.println("폴더가 이미 존재합니다.");
		}else {
			폴더만들기.mkdir();
			System.out.println("폴더만들기 성공");
		}
		
		File 텍스트파일 = new File(폴더만들기 + "/파일생성.txt");
		
		if(텍스트파일.exists()) {
			System.out.println("파일이 이미 존재합니다.");
		}else {
			try {
				텍스트파일.createNewFile();
				System.out.println(텍스트파일.getName() + " 파일이 생성되었습니다.");
			} catch (IOException e) {
				System.out.println("파일 만들기 실패");
				e.printStackTrace();
			}
		}
	}

	public void 메서드3() {
		
		String 바탕화면경로 = System.getProperty("user.home") + "/Desktop";
		
		//모든폴더 생성
		File 폴더들 = new File(바탕화면경로 + "/뉴1/뉴2/뉴3");
		폴더들.mkdirs();
		
		//파일생성
		File 파일 = new File(폴더들 + "/새로운파일.txt");
		try {
			boolean 파일생성확인 = 파일.createNewFile();
			System.out.println("파일이 생성되었나요? " + 파일생성확인);
			
			//파일 크기확인
			System.out.println(파일.length());
			
			//파일 마지막 수정일 확인
			System.out.println(파일.lastModified());
			
			//파일 삭제
			파일.delete();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void 메서드4() {
		//파일 이름 변경하기
		String 바탕화면경로 = System.getProperty("user.home") + "/Desktop"; 
		File 텍스트파일 =  new File(바탕화면경로 + "/newFFF/파일생성이름바꾸기.txt");
		try {
			텍스트파일.createNewFile();
			System.out.println("파일이 생성되었습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void 메서드5() {
		//파일 이름 변경하기
		String 바탕화면경로 = System.getProperty("user.home") + "/Desktop"; 
		File 텍스트파일 = new File(바탕화면경로 + "/newFFF/파일생성.txt");
		File 새로운이름 = new File(바탕화면경로 + "/newFFF/변경된이름.txt");
		
		// 파일 이름 변경하기
		//만약에 파일이 존재할 경우 -> 파일 이름 변경 존재하지 않으면 변경 x
		if(텍스트파일.exists()) {
			//만약에 파일 이름을 성공적으로 변경했다면
			if(텍스트파일.renameTo(새로운이름)) {
				System.out.println("파일 이름이 성공적으로 변경되었습니다.");
			} else {
				System.out.println("파일 이름 변경에 실패했습니다.");
			}
		} else {
			System.out.println("파일 이름이 존재하지 않습니다. 만들어주세요^^.");
		}
	}
	
	//메인
	public static void main(String[] args) {
		FilePre 파일 = new FilePre();
		
		//파일.메서드1();
		//파일.메서드2();
		파일.메서드3();
	}
}
