package com.arc.lang.ex3;

public class StringEx2 {

	public static void main(String[] args) {
		
		CarMaker cm = new CarMaker();
		Car car = cm.makeCar();
		
		CarView cv = new CarView();
		cv.view(car);
		
		Car [] cars = cm.makeCars();
		cv.view(cars);
		
	}

}
