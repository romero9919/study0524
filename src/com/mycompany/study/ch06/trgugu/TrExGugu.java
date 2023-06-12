package com.mycompany.study.ch06.trgugu;

import java.util.Scanner;

public class TrExGugu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		Gugu gugu = new Gugu();
		
		
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
	}

}
