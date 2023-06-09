package com.mycompany.study.third;

public class Arithmetic {
	
	
	public int add(int a, int b) {
		int y = a + b;
		return y;
	}
	
	public int minus(int a, int b) {
		int y = a - b;
		return y;
	}
	
	public int multi(int a, int b) {
		int y = a * b;
		return y;
	}
	
	public String wow(String name) {
		if (name.equals("장원영")) {
			return "Tony";
		} else if (name.equals("아이브")) {
			return "return은 없고 장원영은 너무 예뻐";
		} else {
			return "다시 입력하세요";
		}
		
	}
	
	public void good(String goodgood) {
		
		if (goodgood.equals("아이브")) {
			System.out.println("장원영은 너무 예뻐");
		}else {
			System.out.println("모르겟어요");
		}
	}
	
	public int money() {
		
		return 10000;
		 
	}
}
