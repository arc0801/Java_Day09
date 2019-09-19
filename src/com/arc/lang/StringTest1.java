package com.arc.lang;

public class StringTest1 {

	public static void main(String[] args) {
		//워낙 많이 쓰여서 자바에서 편의 제공
		String str = "abc";
		//원래 형식~
		String str2 = new String("abc");
		
		//System.out.println(str2.toString());
		//System.out.println(str2);
		
		//System.out.println(str);
		
		System.out.println(str == str2);
		
		boolean check = str.equals(str2);
		System.out.println(check);
		
		
		String str3 = "HelloJava";
		//charAt 사용하고 출력
		//참조변수명.메서드명
		char a = str3.charAt(0);
		System.out.println(a);
		
		//indexOf 사용하고 출력
		int b = str3.indexOf('a');
		System.out.println(b);
		
		b = str3.indexOf('a', 6);
		System.out.println(b);
		
		b = str3.indexOf("Java");
		System.out.println(b);	
		
		
		
		
		str = "Hello Java World Company Low legacy";
		
		str = str.replace('l', 'L');
		System.out.println(str);
				
		str = str.replace("Java", "Game");
		System.out.println(str);
		
		String sub = str.substring(6, 10);
		System.out.println(sub);
		
	}
}