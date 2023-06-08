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
		
		
		Mp3 mp3 = new Mp3();
		
		System.out.println(mp3.brand);
		System.out.println(mp3.button);
		System.out.println(mp3.cash);
		System.out.println(mp3.color);
		mp3.play();
		mp3.stop();
	}

}
