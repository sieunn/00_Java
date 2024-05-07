package com.kh.practice.list.music.view;

import java.util.Scanner;

import com.kh.practice.list.music.Music;
import com.kh.practice.list.music.controller.MusicController;

public class MusicView {
	private Scanner sc = new Scanner(System.in);
	
	private MusicController mc = new MusicController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("=== 음악 관리 프로그램 ===");
			System.out.println("1. 음악 추가");
			System.out.println("2. 첫번째 위치에 음악 추가");
			System.out.println("3. 전체 목록 출력");
			System.out.println("4. 음악 검색");
			System.out.println("5. 음악 삭제");
			System.out.println("6. 음악 수정");
			System.out.println("7. 곡명 오름차순 정렬");
			System.out.println("8. 가수 내림차순 정렬");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
			
			//번호 입력할 수 있는 번호 입력 공간 만들어주기
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch (choice) {
			case 1 :
				addList();
				break;
			case 2 :
				addAtZero();
				break;
			case 3 :
				printAll();
				break;
			case 4 :
				searchMusic();
				break;
			case 5 :
				removeMusic();
				break;
			case 6 :
				setMusic();
				break;
			case 7 :
				//
				break;
			case 8 :
				//
				break;
			case 9 :
				System.out.println("프로그램을 종료합니다.");
				return;
			default :
				System.out.println("잘못된 메뉴 선택입니다.");
			}
		}
	}
	
	//음악추가
	public void addList() {
		System.out.println("곡명 입력 : ");
		String title = sc.nextLine();
		System.out.println("가수명 입력 : ");
		String singer = sc.nextLine();
		
		//곡과 가수 저장하기
		mc.addList(title,singer);
	}
	
	//첫번째 위치에 바로 음악 추가하기
	public void addAtZero() {
		System.out.println("곡명 입력 : ");
		String title = sc.nextLine();
		System.out.println("가수명 입력 : ");
		String singer = sc.nextLine();
		
		//음악을 추가하는데 맨 앞에 추가
		Music music = new Music(title, singer);
        int result = mc.addAtZero(music);

        if (result > 0) {
            System.out.println("첫 위치에 곡 추가 성공!");
        } else {
            System.out.println("첫 위치에 곡 추가 실패!");
        }
	}
	
	//모든 음악 목록 출력
	public void printAll() {
		System.out.println("=== 음악 전체 목록 ===");
		for(Music music : mc.printAll()) {
			System.out.println(music);
		}
	}
	
	//음악 검색
	public void searchMusic() {
		System.out.println("검색할 곡명 입력: ");
		String title = sc.nextLine();
		Music music = mc.searchMusic(title);
		
		if (music != null) {
            System.out.println("검색 결과 : " + music);
        } else {
            System.out.println("검색 결과가 없습니다.");
        }
		
	}
	
	//음악 삭제
	public void removeMusic() {
		System.out.println("삭제할 곡명 입력: ");
		String title = sc.nextLine();
		System.out.println("삭제할 가수명 입력: ");
		String singer = sc.nextLine();
		
		Music music = mc.removeMusic(title);
		
		if (music != null) {
            System.out.println("삭제 성공 : " + music);
        } else {
            System.out.println("삭제할 곡이 없습니다.");
        }
	}
	
	//음악에서 가수만 수정
	public void setMusic() {
		System.out.println("수정할 곡명 입력: ");
		String title = sc.nextLine();
		System.out.println("새로운 가수명 입력");
		String singer = sc.nextLine();
		System.out.println(mc.setMusic(title, singer));
		
		
	}
	
	//오름차순 정렬
	public void ascTitle() {
		mc.ascTitle();
		System.out.println("곡명을 오름차순으로 정렬하였습니다.");
	}
	
	//내림차순 정렬
	public void descSinger() {
		mc.descSinger();
		System.out.println("가수명을 내림차순으로 정렬하였습니다.");
	}
}













