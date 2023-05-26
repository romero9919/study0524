package com.mycompany.study.ch02;

public class ExPromotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// byte < short < int < long < float < double
		
		byte byteVar = 10;
		System.out.println(byteVar);
		
		short shortVar = byteVar;
		System.out.println(shortVar);
		
		int intVar = shortVar;
		System.out.println(intVar);
		
		long longVar = intVar;
		System.out.println(longVar);
		
		float floatVar = longVar;
		System.out.println(floatVar);
		
		double doubleVar = floatVar;
		System.out.println(doubleVar);
	}

}
