package com.mycompany.study.ch03;

public class ExDenyLogicOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean play = false;
		
		play = !play;
		
		System.out.println(play);
		
		int i = 3;
		if(!(i == 3)) {
			System.out.println("뭔가를 해라!!!");
		}
	}

}
