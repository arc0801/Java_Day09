package com.arc.lang2;

public class WrapperTest1 {

	public static void main(String[] args) {
		
		int num = 10;
		
		System.out.println(Integer.BYTES);
		System.out.println(Long.BYTES);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Long.MAX_VALUE);
	
		Integer integer = new Integer(10);
		Integer integer2 = new Integer("10"); 
		//integer = new Integer("one"); //숫자 형태의 문자열만 가능
		int n1 = integer.intValue();
		int n2 = integer2.intValue();
		System.out.println(n1+n2);
		
		n1 = integer; //reference -> primitive로 : Auto UnBoxing
		integer = n1; //primitive -> reference로 wrapper : Auto Boxing 
		
		double a = 3.14;
		Double b = a; //같은 형태끼는 박싱가능
		//integer = a; //다른 형태끼리는 불가능
		b = (double)n1; //형변환시켜주면 가능!!
		
		
		int n = Integer.parseInt("10");
		System.out.println(n);
		String s = "2.567";
		double ab = Double.parseDouble(s);
	}
}
