package com.arc.lang;

public class StringTest3 {

	public static void main(String[] args) {
		String str1 = " iu";
		String str2 = "iu ";
		str1 = str1.trim();
		str2 = str2.trim();
		
		System.out.println(str1.equals(str2));
		
		
		
		String n = String.valueOf(true);
		System.out.println(n);
		
		n = 10 + ""; //=> primitive type에 문자열이 더해지면 문자열 타입으로 바뀜
	}
}
