package com.mycompany.study.ch04;

public class ExIf4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		
		a = 0;
		b = 0;
		
		if (a > 0 && b > 0) {
			System.out.println("(a,b)는 1사분면에 위치합니다");
		} else if (a < 0 && b > 0) {
			System.out.println("(a,b)는 2사분면에 위치합니다");
		} else if (a < 0 && b < 0) {
			System.out.println("(a,b)는 3사분면에 위치합니다");
		} else if (a > 0 && b < 0) {
			System.out.println("(a,b)는 4사분면에 위치합니다");
		} else if (a == 0 && b == 0) {
			System.out.println("(a,b)는 원점에 위치합니다");
		} else if (a == 0 && b != 0) {
			System.out.println("(a,b)는 y축 위에 위치합니다");
		} else if (a != 0 && b == 0) {
			System.out.println("(a,b)는 x축 위에 위치합니다");
		}
	}

}
