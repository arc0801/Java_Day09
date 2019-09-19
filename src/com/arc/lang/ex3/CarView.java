package com.arc.lang.ex3;

public class CarView {

	public void view(Car [] cars) { //오버로딩!!!!!!!
		for(int i=0;i<cars.length;i++) {
			this.view(cars[i]);
			//System.out.println("브랜드 : "+ cars[i].getCompany());
			//System.out.println("모델 : "+ cars[i].getModel());
			//System.out.println("색상 : "+ cars[i].getColor());
			System.out.println("============");
		}
	}



	//view 메서드명
	//Car 하나 받아서 모든 정보출력

	public void view(Car car) {
		System.out.println("브랜드 : "+ car.getCompany());
		System.out.println("모델 : "+ car.getModel());
		System.out.println("색상 : "+ car.getColor());
	}
}

