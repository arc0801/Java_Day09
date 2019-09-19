package com.arc.lang;

public class StringTest2 {

	public static void main(String[] args) {
		String str = "아이유,수지,설리,박보검";
		String [] names= str.split(","); //자르려고 하는 기준 문자열

		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		
		str = "abDcFdsf";
		str = str.toLowerCase();
		
		System.out.println(str);
		
		
		
		str = str.toUpperCase();
		
		System.out.println(str);
		
		
	}
}
