package com.arc.lang;

public class Member {

	int age;
	int num;
	static int ki;
	{
		System.out.println("인스턴스 초기화 블럭");
	}
	
	static {
		System.out.println("인스턴스 초기화 블럭");
		Member.ki=30;
	}

	public Member() {
		System.out.println("생성자 호출");
	}

	@Override
	public String toString() {
		System.out.println("Age : "+this.age);
		System.out.println("Num : "+this.num);
		return "";
	}
	
	
	
	
	
	
	@Override
	public boolean equals(Object obj) {

		boolean check = true;
		//m1.age 출력
		//System.out.println(this.age);
		Member m2 = (Member)obj;
		//m2.age 출력
		//System.out.println(m2.age);

		check = this.age==m2.age && this.num==m2.num;

		//check = this.age == (Member)obj.age;
		//우선순위가 obj 다음의 .에 있음 -> 그 다음이 ()
		//만약 한 줄로 하고싶다면
		//check = this.age == ((Member)obj).age;

		return check;
	}



}
