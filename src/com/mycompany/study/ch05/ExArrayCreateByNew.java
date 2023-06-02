package com.mycompany.study.ch05;

import java.nio.file.StandardCopyOption;

public class ExArrayCreateByNew {

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
		
		int a = scoreChemistry.length;
		System.out.println(a);
		System.out.println(scoreChemistry[0]);
	}
	

}
