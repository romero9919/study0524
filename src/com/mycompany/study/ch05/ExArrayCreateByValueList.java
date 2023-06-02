package com.mycompany.study.ch05;

public class ExArrayCreateByValueList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		double[] total;
		double[] average;
		
		char[] grade2301;
		char[] grade2302;
		
		boolean[] score;
		boolean score2[];
		*/
		
		int[] scoreChemistry = {100, 99, 98, 97, 9, 56, 56, 87};
		String[] scoreStudent = {"Jongweon", "Pedro", "John", "Sunchan", "Xiaohu"};
		char[] scoreGrade = {'A', 'B', 'C', 'D', 'E'};
		
		// int[] scorePhysics;
		// scorePhysics = {100, 99, 98, 97, 96};
		// error
		// scoreChemistry[7] = 93; 컴파일 에러
		scoreChemistry[0] = 0;
		int a = scoreChemistry.length;
		// System.out.println(a);
		// System.out.println(scoreChemistry[0]);
		
		int i=0;
		
		for(i=0; i<a; i++) {
			int score = scoreChemistry[i];
			System.out.println(score);
		}
		
		while(i<a) {
			int score = scoreChemistry[i];
			System.out.println(score);
			i++;
		}
		int sum = 0;
		for(int bb: scoreChemistry) {
			System.out.println(bb);
			sum = sum + bb;
		}
		System.out.println(sum);
		
		int[] arr1 = new int[3];
		arr1[0] = 100;
		arr1[1] = 100;
		arr1[2] = 100;
	}

}
