package com.mycompany.study.ch12;

public class ExBeepPrintThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		//how1
		Runnable runnable = new ExBeepRunnable();
		Thread thread = new Thread(runnable);
		
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("12");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}

}
