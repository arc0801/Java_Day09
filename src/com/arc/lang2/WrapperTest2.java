package com.arc.lang2;

import java.util.Scanner;

public class WrapperTest2 {

	public static void main(String[] args) {
		//회원가입
		//비밀번호 입력
		//최소 8글자 이상
		//대문자 2개 이상
		//소문자 2개 이상
		//숫자 1개 이상
		//공백 없이
		Scanner sc = new Scanner(System.in);
		System.out.println("사용하실 비밀번호를 입력하세요 \\(>ㅁ<)/");
		String pw = sc.next();
		int u = 0;
		int l = 0;
		int d = 0;
		int w = 0;

		for(int i=0;i<pw.length();i++) {
			char a = pw.charAt(i);

			if (Character.isUpperCase(a)) {
				u++;
			}else if(Character.isLowerCase(a)) {
				l++;
			}else if(Character.isDigit(a)) {
				d++;
			}else if(Character.isWhitespace(a)) {
				w++;
			}
		}//for

		if(pw.length()>=8 && u>=2 && l>=2 && d>=1 && w==0) {
			System.out.println("비밀번호 사용가능:D");
		}else {
			System.out.println("비밀번호를 다시 설정해주세요(8ㅁ8)");
		}

	}//main

}
