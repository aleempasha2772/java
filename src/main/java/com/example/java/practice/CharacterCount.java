package com.example.java.practice;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
	
	public static void main(String[] args) {
		String str = "AleemPasha".toLowerCase();
		char[] ch = str.toCharArray();
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(char i:ch) {
			if(!map.containsKey(i)) {
				map.put(i,1);
			}else {
				map.put(i,map.get(i)+1);
			}
		}
		System.out.print(map);
		
		for(Character e:map.keySet()) {
			if(map.get(e)>1) {
				System.out.println(e+":"+map.get(e));
				break;
			}
		}
	}
}
