package com.kwave.java.bbs;

import java.text.SimpleDateFormat;

public class Bbs {

	public String author;
	public String date;
	public String title;
	public String content;
	
	public void initDate(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");	// ���� �ý��� ���� �ð� ǥ�� ��ü ����
		date = sdf.format(System.currentTimeMillis());	// ���� �ð� ���� ����
	}
}
