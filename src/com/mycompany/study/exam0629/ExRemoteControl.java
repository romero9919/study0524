package com.mycompany.study.exam0629;

public class ExRemoteControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Television television = new Television();
		
		television.turnon();
		television.setmute(true);
		television.setmute(false);
		television.setvolume(100);
		RemoteControl.changeBattery();
		television.turnoff();
		
	}

	

}
