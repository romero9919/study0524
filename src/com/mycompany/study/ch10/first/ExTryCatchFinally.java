package com.mycompany.study.ch10.first;

public class ExTryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class clazz = Class.forName("ExTry");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
