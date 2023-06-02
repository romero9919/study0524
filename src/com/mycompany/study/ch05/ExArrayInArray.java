package com.mycompany.study.ch05;

public class ExArrayInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		
	}

}
