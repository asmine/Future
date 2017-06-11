package com.asmine.test.main;

import java.io.UnsupportedEncodingException;

public class Test {

	public static void main(String[] args) {
		String word = "中文";
		try {
			String keyword = new String(word.getBytes("ISO-8859-1"),"UTF-8");
			System.out.println("keyword is "+ keyword);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
