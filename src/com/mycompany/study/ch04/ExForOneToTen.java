package com.mycompany.study.ch04;

import java.util.Iterator;

public class ExForOneToTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		/*
		for (int i=11; i<=50; i++) {
			sum = sum + i;
			System.out.println("sum: "+ sum);
		}
		*/
		for (int i=11; i<=50; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
				System.out.println(sum);
			}
		}
	}

}
