package com.arc.lang;

public class StringTest4 {

	public static void main(String[] args) {
		String s1 = "iu";
		String s2 = "iu";
		String s3 = new String("iu");
		String s4 = new String("iu");

		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		System.out.println(s1 == s3);
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s3));

		
		String str1 = new String("iu");
		str1 = str1 + "choa";
		
		System.out.println(str1);
		
		System.out.println("1"+1+"abc");
		
		String str2 = "abCd";
		String str3 = str2.toUpperCase();
		System.out.println(str3);
		System.out.println(str2);
		
	}

}
