package com.kh.practice.list.music.model.compare;

import java.util.Comparator;

import com.kh.practice.list.music.Music;

public class AscSinger implements Comparator<Music> {
	@Override
	public int compare(Music 음악1, Music 음악2) {
		return  음악1.getSinger().compareTo(음악2.getSinger());
	}
	
}
