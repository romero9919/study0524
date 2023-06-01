package com.mycompany.study.ch04;

public class ExIf5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a = 1;
		int b = 5;
		int c = 5;
		
		if (a > b && b > c) {
			System.out.println("최대값은 a, 최소값은 c");
		} else if (b > c && c > a) {
			System.out.println("최대값은 b, 최소값은 a");
		} else if (c > a && a > b) {
			System.out.println("최대값은 c, 최소값은 b");
		} else if (a > c && c > b) {
			System.out.println("최대값은 a, 최소값은 b");
		} else if (b > a && a > c) {
			System.out.println("최대값은 b, 최소값은 c");
		} else if (c > b && b > a) {
			System.out.println("최대값은 c, 최소값은 a");
		} else if (c > b && a == b) {
			System.out.println("최대값은 c, 최소값은 a,b");
		} else if (b > c && a == c) {
			System.out.println("최대값은 b, 최소값은 a,c");
		} else if (a > b && c == b) {
			System.out.println("최대값은 a, 최소값은 b,c");
		} else if (a < b && b == c) {
			System.out.println("최대값은 b,c, 최소값은 a");
		} else if (b < c && a == c) {
			System.out.println("최대값은 a,c, 최소값은 b");
		} else if (c < a &&  a == b) {
			System.out.println("최대값은 a,b, 최소값은 c");
		} else if (a == b && b == c) {
			System.out.println("모든 값이 동일함");
		}
		
	}

}
