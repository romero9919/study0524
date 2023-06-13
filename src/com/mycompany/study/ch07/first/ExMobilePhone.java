package com.mycompany.study.ch07.first;

public class ExMobilePhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CellPhone cellPhone = new CellPhone();
		
		cellPhone.powerOn();
		cellPhone.powerOn(1);
		
		System.out.println("==================");
		
		DmbCellPhone dmbCellPhone = new DmbCellPhone();
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.powerOn();
		dmbCellPhone.powerOn(2);
		
		System.out.println("==================");
		
		MobilePhone mobilePhone = new MobilePhone();
		
		mobilePhone.aaa();
		mobilePhone.turnOnDmb();
		mobilePhone.powerOn();
		mobilePhone.powerOn(2);
	}

}
