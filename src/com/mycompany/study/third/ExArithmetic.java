package com.mycompany.study.third;

public class ExArithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Arithmetic arithmetic = new Arithmetic();
		
		int result = arithmetic.add(1, 2);
		
		System.out.println(result);
		
		String result2 = arithmetic.wow("장원영");
		System.out.println(result2);
		
		
		arithmetic.good("김종원");
		
		int result3 = arithmetic.money();
		System.out.println(result3);
	}

}
