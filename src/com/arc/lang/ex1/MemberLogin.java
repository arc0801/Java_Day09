package com.arc.lang.ex1;

import java.util.Scanner;

public class MemberLogin {

	public Member login() {
		/*
		MemberMaker mk = new MemberMaker();
		Member [] ar = mk.getMembers();
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i].getId());
			System.out.println(ar[i].getPw());

		}
		 */

		//id pw를 입력받아서 로그인 성공하면 해당 member를 리턴
		Scanner sc = new Scanner(System.in);

		System.out.println("ID를 입력하세요.");
		String id = sc.next();
		System.out.println("PW를 입력하세요");
		String pw = sc.next();

		MemberMaker mk = new MemberMaker();
		Member [] m = mk.getMembers();
		Member member = null;


		for(int i=0;i<m.length;i++) {
			if(m[i].getId().equals(id) && m[i].getPw().equals(pw)) {
				member = m[i];
				break;
			}
		}

		return member;

	}



}
