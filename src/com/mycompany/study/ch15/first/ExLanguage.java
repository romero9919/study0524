package com.mycompany.study.ch15.first;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExLanguage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Language> arrayList = new ArrayList<Language>();
		// ArrayList, LinkedList, Vector
		Language language = new Language("Java", 11);
		
		arrayList.add(language);
		arrayList.add(new Language("Python", 8));
		arrayList.add(new Language("C#", 6));
		
		for(Language a: arrayList) {
			System.out.println(a.name);
			System.out.println(a.version);
		}
		
		/*
		List<String> list = new ArrayList<String>();

		
		LinkedList<String> linkedList = new LinkedList<String>();
		
		list.add("Java");
		list.add("Python");
		list.add("Node");
		list.add(2, "c#");
		
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		int i=0;
		for(String a: list) {
			// String a = list[i]와 같은 의미
			System.out.println(a);
			i++;
		}

		System.out.println("====================");
		
		list.remove(2);
		list.remove("Python");	
		
		for(String a: list) {
			// String a = list[i]와 같은 의미
			System.out.println(a);
			i++;
		}
		*/
		
		/*
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("Java");
		arrayList.add("Python");
		arrayList.add("Node");
		arrayList.add(2, "c#");
		
		for (int i=0; i<arrayList.size(); i++) {
			System.out.println(list.get(i));
		}
		*/
	}

}
