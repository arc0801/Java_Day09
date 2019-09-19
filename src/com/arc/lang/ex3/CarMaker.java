package com.arc.lang.ex3;

public class CarMaker {

	private String carInfo;

	public CarMaker() {
		carInfo = "KIA,K7,Black,Audi,Q7,Red,Benz,S300,White,BMW,Eclass,Pink";
	}

	//makeCars 메서드명
	//Car들을 리턴

	public Car [] makeCars() {

		String [] result=this.carInfo.split(",");
		Car [] cars = new Car[result.length/3];
		//int j=0;
		
		for(int i=0;i<result.length;i++) {
			Car car = new Car();
			car.setCompany(result[i]);
			car.setModel(result[++i]);
			car.setColor(result[++i]);
			cars[i/3]=car;
			
			//j++;
		}
		return cars;
	}



	//makeCar 메서드명
	//Car 객체 생성 후 리턴

	public Car makeCar() {

		String [] cars=this.carInfo.split(",");
		Car car = new Car();

		car.setCompany(cars[0]);
		car.setModel(cars[1]);
		car.setColor(cars[2]);

		return car;

	}//makeCar



}
