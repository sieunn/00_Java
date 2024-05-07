package com.kh.practice.list.music.controller;

import java.util.*;

import com.kh.practice.list.music.Music;
import com.kh.practice.list.music.model.compare.AscSinger;

public class MusicController {
	//음악 목록 
	List<Music> list = new ArrayList<>();
	
	//음악 추가
	public int addList(String title, String singer) {
		//		Music 객체에 넣어줘야함
		//									DB 추가에 성공하면 1 실패하면 0
		//					  만약에 추가 성공이   ? true : false
		return list.add(new Music(title,singer)) ? 1 : 0 ;
	}
	
	public int addAtZero(Music music) {
		//목록에 추가하는데 맨 앞에다가 다시 새로 자리값을 만들고
		//내가 추가하는 값이 무조건 0자리가 될수 있도록 추가
		list.add(0,music);
		return list.size();
	}
	
	//곡 목록 확인
	public List<Music> printAll() {
		return list;
	}
	
	//곡 검색
	public Music searchMusic(String title) {
		//for each문 사용해서
		for(Music music : list) {
			//만약에 내가 원하는 제목이 들어오면 
			if(music.getTitle().equals(title)) {
				return music;
			}
		}
		return null;
	}
	
	// 곡 삭제
	public Music removeMusic(String title) {
		/*
		boolean removed = false;
		
		for(Music music : list) {
			if(music.getTitle().equals(title) && music.getSinger().equals(singer)) {
				list.remove(music);
				removed = true;
				break;
			}
		}
		if(removed) {
			System.out.println("곡이 삭제되었습니다.");
		}else {
			System.out.println("해당 곡을 찾을 수 없습니다.");
		}
		*/
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				return list.remove(i);
			}
		}
		return null;
	}
	
	//음악에서 가수만 수정
	public Music setMusic(String title, String singer) {
		//for each 내가 원하는 제목과 가수가 있는지 확인 
		for(Music music :list) {
			if(music.getTitle().equals(title)) {
				//music.setTitle(title);
				music.setSinger(singer);
				return music;
			}
		}
		return null;
	}
	
	//오름차순 정렬
	public void ascTitle() {
		Collections.sort(list);
	}
	
	//내림차순
	public void descSinger() {
		Collections.sort(list, new AscSinger());
	}
	
}








