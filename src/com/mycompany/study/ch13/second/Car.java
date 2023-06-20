package com.mycompany.study.ch13.second;

public class Car {
	
	public static void main(String[] args) {
		Product<String, Integer> product = new Product<>();
		
		product.setKind("Romero");
		product.setModel(100);
		
		System.out.println(product.getKind() + product.getModel());
	}
}
