package com.mycompany.study.ch06.trfirst;

import java.util.Date;

public class Member {

	
	int userSeq;
	String userName;
	String userNick;
	String userId;
	String userPw;
	String userEmail;
	int userGender;
	Date joinUserDate;
	Date editUserDate;
	
	void userInfoCreate() {
		System.out.println("유저 정보 작성");
	}
	
	void userInfo() {
		System.out.println("유저 정보 열람");
	}
	
	void userInfoEdit() {
		System.out.println("유저 정보 수정");
	}
	
	void userInfoDelete() {
		System.out.println("유저 정보 삭제");
	}

}
