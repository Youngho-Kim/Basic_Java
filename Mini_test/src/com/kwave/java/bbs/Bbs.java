package com.kwave.java.bbs;

import java.text.SimpleDateFormat;

public class Bbs {

	public String author;
	public String date;
	public String title;
	public String content;
	
	public void initDate(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");	// 현재 시스템 내의 시간 표시 객체 생성
		date = sdf.format(System.currentTimeMillis());	// 현재 시간 갖고 오기
	}
}
