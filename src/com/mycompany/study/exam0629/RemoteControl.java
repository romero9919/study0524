package com.mycompany.study.exam0629;

public interface RemoteControl {
	public final int MAX_VOLUME = 10;
	public final int MIN_VOLUME = 0;
	
	
	abstract void turnon();
	abstract void turnoff();
	abstract void setvolume(int volume); 
	
	public default void setmute(boolean mute) {
		if (mute == true) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	public static void changeBattery() {
		System.out.println("건전지 교체를 수행합니다.");
	}
}
