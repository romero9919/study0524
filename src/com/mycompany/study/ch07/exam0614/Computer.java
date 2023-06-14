package com.mycompany.study.ch07.exam0614;

public class Computer extends Calculator {
	
	
	@Override
	public double calc(double r) {
		
		return Constants.PAI_2*(r*r);
	}
	
}
