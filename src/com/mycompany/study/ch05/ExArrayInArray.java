package com.mycompany.study.ch05;

public class ExArrayInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int[][] score = {{55, 55, 55}, {78, 78, 78}, {68, 75, 45}, {88, 31, 15}, {54, 45, 21}};
		
		int sumKor = 0;
		int sumEng = 0;
		int sumMath = 0;
		
		int a = score.length;
		for (int i=0; i<a; i++) {
			for (int j=0; j<score[i].length; j++) {
				switch (j) {
				case 0:
					sumKor = sumKor + score[i][j];
					break;
				case 1:
					sumEng = sumEng + score[i][j];
					break;
				case 2:
					sumMath = sumMath + score[i][j];
					break;
				}
				System.out.println(sumKor + "|" + sumEng + "|" + sumMath);
			}
		}
		
		*/
		/*
		int one = 1;
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
				if(j==9) {
					System.out.println(" ");
					System.out.println("1 3 5 7 90");
				}
			}
			System.out.println(" ");
		}
		*/
		for(int i=1; i<=10; i++) {
			if(i == 10) {
				for(int j=1; j<=i-1; j++) {
					if(j%2==1) {
						System.out.print(j);
					} else {
						System.out.print(" ");
					}
				}
				System.out.println("0");
			} else {
				for(int j=1; j<=i; j++) {
					System.out.print(j);
				}
				System.out.println();
			}
		}
		
	}

}
