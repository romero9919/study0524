package com.mycompany.study.ch02;

public class ExCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// double>float>long>int>short>byte
		
		double doubleVar = 123456789;
		System.out.println(doubleVar);
		
		float floatVar = (float)doubleVar;
		System.out.println(floatVar);
		
		long longVar = (long)floatVar;
		System.out.println(longVar);
		
		int intVar = (int)longVar;
		
		short shortVar = (short)intVar;
		
		byte byteVar = (byte)shortVar;
		
		System.out.println(intVar);	
		System.out.println(shortVar);
		System.out.println(byteVar);
		
		System.out.println("---------------------------");
		
		String stringVar = String.valueOf(intVar);
		System.out.println(stringVar);
		
		int intVar2 = Integer.parseInt(stringVar);
		System.out.println(intVar2);
	}

}
