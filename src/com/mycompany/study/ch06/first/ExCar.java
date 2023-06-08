package com.mycompany.study.ch06.first;

public class ExCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		
		Car car = new Car();
		System.out.println(car.name);
		System.out.println(car.engine);
		System.out.println(car.color);
		System.out.println(car.company);
		
		car.go();
		car.back();
		
	}

}
