package com.mycompany.study.ch03;

public class ExIncreaseDecreaseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			int i = 0;
			int j = 0;
			
			++i;
			j++;
			
			System.out.println(i);
			System.out.println(j);
			
			
			int k = i++;
			int m = ++j;
			
			System.out.println(k);
			System.out.println(i);
			System.out.println(m);
			System.out.println(j);
			
			
			--i;
			int z = ++i + j++;
			
			System.out.println(z);
			System.out.println(i);
			System.out.println(j);
			
			
			int a = 1;
			int b = 1;
			
			--a;
			b--;
			
			System.out.println(a);
			System.out.println(b);
			
			
	}

}
