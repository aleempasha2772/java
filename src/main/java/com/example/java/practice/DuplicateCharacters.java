package com.example.java.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateCharacters {
	
	public static void main(String[] args) {
		String str = "AleemPasha".toLowerCase();
		char[] ch = str.toCharArray();
		Set<Character> set = new HashSet<>();
		List<Character> list1 = new ArrayList<>();
		List<Character> list2 = new ArrayList<>();
		
		for(char i:ch) {
			if(!set.contains(i)) {
				set.add(i);
				list1.add(i);
			}else {
				list2.add(i);
			}
		}
		
		System.out.print(list2);
	}

}
