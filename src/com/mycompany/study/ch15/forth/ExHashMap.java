package com.mycompany.study.ch15.forth;

import java.util.HashMap;
import java.util.Map;


public class ExHashMap {
		public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>(); // standard
		HashMap<String, Integer> hashMap = new HashMap<>(); // not bad
		
		map.put("이호중", 100);
		map.put("김종원", 99);
		map.put("김수환", 98);
		map.put("박순찬", 97);
		
		for(String strKey : map.keySet()) {
			Integer strValue = map.get(strKey);
				System.out.println(strValue);
		}
		
		map.remove("박순찬");
		map.clear();
		
	}
}
      