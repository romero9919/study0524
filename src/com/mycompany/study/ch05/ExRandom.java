package com.mycompany.study.ch05;

public class ExRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		int min = 1;
		int max = 10;
		int random = (int)(Math.random()*(max-min) + min);
		System.out.println(random);
		*/
		
		
		int min = 1;
		int max = 46;
		int random = (int)(Math.random()*(max-min) + min);
		int random2 = (int)(Math.random()*(max-min) + min);
		System.out.println(random + "+" + random2);
	}

}
