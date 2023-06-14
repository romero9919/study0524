package com.mycompany.study.ch07.exam0614;

public class ComputerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator calculator = new Calculator();
		Computer computer = new Computer();
		double r = 7.0;
		
		System.out.println("원의 반지름: " + (int)r);
		System.out.println();
		System.out.println("Calculator 객체의 원 면적 구하는 프로그램 실행");
		System.out.println("원 면적: " + calculator.calc(r));
		System.out.println();
		System.out.println("Computer 객체의 원 면적 구하는 프로그램 실행");
		System.out.println("원 면적: " + computer.calc(r));
	}

}
