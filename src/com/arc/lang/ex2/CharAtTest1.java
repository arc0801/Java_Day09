package com.arc.lang.ex2;

import java.util.Scanner;

public class CharAtTest1 {

	public void t4() {
		//파일명을 입력
		//이미지파일 : jpg, gif, png, jpeg
		//indexOf, subString
		Scanner sc = new Scanner(System.in);
		System.out.println("파일명을 입력하세용~");
		String image = sc.next();

		int a = image.lastIndexOf('.');
		image = image.substring(a+1);

		if(image.equals("jpg") || image.equals("gif") || image.equals("png") || image.equals("jpeg")) {
			System.out.println("이미지 파일이 맞습니다.");
		}else {
			System.out.println("이미지 파일이 아닙니다.");
		}

	}//t4



	public void t3() {
		String str = "Hello Java World Company Low legacy";
		// 소문자 l이 몇 개 있는지 출력
		// indexOf를 이용
		int a = 0;
		int m = 0;
		boolean check = true;

		while(check) {

			a=str.indexOf('l', a);

			if(a==-1) {
				break;
			}

			a++;
			m++;
		}//while

		System.out.println(m);

	}//t3



	public void t2() {
		// a -> c
		// b -> d
		// aaabbb
		// cccddd
		Scanner sc = new Scanner(System.in);

		System.out.println("문자를 입력하세요");
		String str = sc.next();

		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			int num = ch+2;
			ch = (char)num;
			System.out.print(ch);
		}
	}//t2



	public void t1() {
		//문자열 입력 -- hello
		Scanner sc = new Scanner(System.in);

		System.out.println("문자를 입력하세요");
		String str = sc.next();

		//한글자씩 출력
		//charAt, legth()
		for(int i=0;i<str.length();i++) {
			char a = str.charAt(i);
			System.out.println(a);
		}
	}//t1
}
