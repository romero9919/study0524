package com.mycompany.study.ch04;

public class ExIf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a = -56741;
		
		if (a == 0) {
			System.out.println("0입니다.");
		} else if (a % 2 == 1) {
			System.out.println("입력하신 " + a + " = 홀수입니다.");
		} else {
			System.out.println("입력하신 " + a + " = 짝수입니다.");
		}
		
	}

}
