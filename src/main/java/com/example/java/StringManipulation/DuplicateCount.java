package com.example.java.StringManipulation;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCount {
	public static void main(String[] args) {
		String a = "Aleem".toLowerCase();
		char[] ch = a.toCharArray();
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(char c:ch) {
			if(map.containsKey(c)) {
				map.put(c,map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
		
		for(Character e:map.keySet()) {
			if(map.get(e)>1) {
				System.out.print(e+":"+map.get(e));
			}
		}
		
	}
}
