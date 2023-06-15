package com.mycompany.study.ch15.first;

import java.util.ArrayList;

public class ExMember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Member> members = new ArrayList<Member>();
		
		Member member1 = new Member("이호중", "Hojoong", "1234", "01054703857", "romero119@naver.com");
		Member member2 = new Member("김종원", "Jongweon", "1234", "01090690669", "jongweon0819@naver.com");
		Member member3 = new Member("김김김", "Kimkimkim", "1234", "01011111111", "kimkimkim@naver.com");
	    
		members.add(member1);
		members.add(member2);
		members.add(member3);
		
		for(Member member: members) {
			System.out.println(member.name);
			System.out.println(member.id);
			System.out.println(member.pw);
			System.out.println(member.phone);
			System.out.println(member.email);
			System.out.println("=================");
		}
		System.out.println();
		System.out.println();
		System.out.println("----------------------");
		System.out.println();
		System.out.println();
		for(int i=0; i<members.size(); i++) {
			System.out.println(members.get(i).name);
			System.out.println(members.get(i).id);
			System.out.println(members.get(i).pw);
			System.out.println(members.get(i).phone);
			System.out.println(members.get(i).email);
			System.out.println("=================");
			
		}
		
		
		
	}

}
