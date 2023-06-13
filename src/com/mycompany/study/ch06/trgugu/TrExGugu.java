package com.mycompany.study.ch06.trgugu;

import java.util.Scanner;

public class TrExGugu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner scanner = new Scanner(System.in);
		Gugu gugu = new Gugu();
		
		/*
		while(true){
			Scanner scanner = new Scanner(System.in);
			int result = scanner.nextInt();
			
			if(result == 0) {
				break;
			} else {
				gugu.gugudan(result);
				System.out.println("--------------------");
				scanner = new Scanner(System.in);
				continue;
			}
		}
		*/
		
		while(gugu.z) {
			System.out.println("정수를 입력해 주세요");
			int scannerInt = scanner.nextInt();
			
			if(scannerInt != 0) {
				gugu.gugudan(scannerInt);
			} else {
				System.out.println("프로그램 종료");
				gugu.z = false;
			}
		}
	}

}
