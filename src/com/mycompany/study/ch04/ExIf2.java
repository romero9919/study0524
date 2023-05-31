package com.mycompany.study.ch04;

public class ExIf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grade = 5;
		int cost = 12000;
		
		double salesCost = 0.0;
		//일반 1 5%
		// 브론즈 2 10%
		// 실버 3 15%
		// 골드 4 20%
		// 플래티넘 5 2.7%
		
		if (grade == 1) {
			salesCost = cost * (1 - 0.05);
			System.out.println("정가가 " + cost + "원인 일반 등급의 할인가는: " + (int) salesCost + "원 입니다.");
		} else if (grade == 2) {
			salesCost = cost * (1 - 0.1);
			System.out.println("정가가 " + cost + "원인 브론즈 등급의 할인가는: " + (int) salesCost + "원 입니다.");
		} else if (grade == 3) {
			salesCost = cost * (1 - 0.15);
			System.out.println("정가가 " + cost + "원인 실버 등급의 할인가는: " + (int) salesCost + "원 입니다.");
		} else if (grade == 4) {
			salesCost = cost * (1 - 0.2);
			System.out.println("정가가 " + cost + "원인 골드 등급의 할인가는: " + (int) salesCost + "원 입니다.");
		} else if (grade == 5) {
			salesCost = cost * (1 - 0.027);
			System.out.println("정가가 " + cost + "원인 플래티넘 등급의 할인가는: " + (int) salesCost + "원 입니다.");
		} else {
			System.out.println("존재할 수 없는 값입니다.");
		}
		
		/*
		 * if (grade == 1) { System.out.println("정가가 12000원인 일반 등급의 할인도는 " + (cost -
		 * (cost / 20)) + "원 입니다."); } else if (grade == 2) {
		 * System.out.println("정가가 12000원인 브론즈 등급의 할인도는 " + (cost - (cost / 10)) +
		 * "원 입니다."); } else if (grade == 3) {
		 * System.out.println("정가가 12000원인 실버 등급의 할인도는 " + (cost - (cost / 100 * 15)) +
		 * "원 입니다."); } else if (grade == 4) {
		 * System.out.println("정가가 12000원인 골드 등급의 할인도는 " + (cost - (cost / 5)) +
		 * "원 입니다."); } else { System.out.println("정가가 12000원인 플래티넘 등급의 할인도는 " + (cost -
		 * (cost / 1000 * 27)) + "원 입니다."); }
		 */
	}

}
