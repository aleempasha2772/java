package com.example.java.StringManipulation;

import java.util.Arrays;

public class Anagram {
	public static boolean isAnagram(String s1,String s2) {
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		if(c1.length != c2.length) {
			return false;
		}else {
			Arrays.sort(c1);
			Arrays.sort(c2);
			return Arrays.equals(c1, c2);
		}
	}
	
	public static void main(String[] args) {
		System.out.print(isAnagram("Aleem","Aleem"));
		
	}
}
