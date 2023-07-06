package com.mycompany.study.exam0629;

public class Television implements RemoteControl {

	int volume;
	
	@Override
	public void turnon() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnoff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setvolume(int volume) {
		if( volume >= MAX_VOLUME) {
			volume = MAX_VOLUME;
			System.out.println("현재 TV 볼륨: " + volume);
		} else if(volume <= MIN_VOLUME) {
			volume = MIN_VOLUME;
			System.out.println("현재 TV 볼륨: " + volume);
		} else {
			System.out.println("현재 TV 볼륨: " + volume);
		}
	}

}
