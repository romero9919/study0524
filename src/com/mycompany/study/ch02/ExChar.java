package com.mycompany.study.ch02;

public class ExChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';
		
//		char c1_1 = "A"; // 오류: "" 사용 불가능
//		char c1_2 = 'AB'; //오류: 한 글자만 됨
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
		
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		
		int uniCode = c1;
		System.out.println(uniCode);
		
		int uniCode2 = c4;
		System.out.println(uniCode2);
	}

}
