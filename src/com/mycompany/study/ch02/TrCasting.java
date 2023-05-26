package com.mycompany.study.ch02;

public class TrCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// double > float > long > int > short > byte
		
		int start = 123;
		
		String stringVar = String.valueOf(start);
		
		int intVar = Integer.parseInt(stringVar);
		
		System.out.println(start);
		System.out.println(stringVar);
		System.out.println(intVar);
	}

}
