package com.mycompany.study.ch04;

public class ExSwitch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 3;
		
		switch (num) {
		case 1:
			System.out.println("1번");
			break;
		case 2:
			System.out.println("2번");
			break;
		default:
			System.out.println("1번도 2번도 아님");
			break;
		}
		
		String position = "나";
		
		switch (position) {
		case "사장":
			System.out.println("사장의 연봉은 30만원 입니다.");
			break;
		case "부장":
			System.out.println("부장의 연봉은 1억 입니다.");
			break;
		case "과장":
			System.out.println("과장의 연봉은 8000만원 입니다.");
			break;
		case "대리":
			System.out.println("대리의 연봉은 7000만원 입니다.");
			break;
		case "주임":
			System.out.println("주임의 연봉은 5000만원 입니다.");
			break;
		case "사원":
			System.out.println("사원의 연봉은 4000만원 입니다.");
			break;
		case "나":
			System.out.println("나의 연봉은 2700만원 입니다.");
			break;
		default:
			System.out.println("직급을 입력하에 주세요");
			break;
		}
	}

}
