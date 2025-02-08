package com.example.java.StringManipulation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicates {
	
	public static void main(String[] args) {
		String s1 = "nitin".toLowerCase();
		char[] s2 = s1.toCharArray();
		Set<Character> set = new HashSet<>();
		List<Character> list1 = new ArrayList<>();
		List<Character> list2 = new ArrayList<>();
		for(char i:s2) {
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
