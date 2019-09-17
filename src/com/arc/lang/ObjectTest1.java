package com.arc.lang;

public class ObjectTest1 {

	public static void main(String[] args) {
		//클래스명 변수명 = new 생성자호출
		Object obj = new Object();

		//메서드 선언 공식
		//접근지정자 [그외지정자] 리턴타입 메서드명([매개변수들]){}
		String a = obj.toString();

		System.out.println(a);
		System.out.println(obj);
		
		
		
		Member m1 = new Member();
		Member m2 = new Member();
		
		m1.age = 11;
		m1.num = 1;
		
		m2.age = 22;
		m2.num = 1;
		
		boolean b = m1.equals(m2);
		System.out.println(b);
		
		
		
		
	}
}