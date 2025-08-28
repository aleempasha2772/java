package com.example.java.Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubString {
	
//	public static int SubstringLength(String str) {
//		
//		Map<Character,Integer> map = new HashMap<>();
//		
//		
//		int left = 0;
//		int count  = 0;
//		
//		for(int i=0;i<str.length();i++) {
//			Character currentCharacter = str.charAt(i);
//			if(map.containsKey(currentCharacter)&&map.get(currentCharacter) >=left) {
//				left = map.get(currentCharacter)+1;
//			}
//			map.put(currentCharacter, i);
//			count = Math.max(count, i-left+1);
//			
//		}
//		
//		
//		
//		return count;
//	}
	
	public static int SubstringLength(String str) {
	    if (str == null || str.length() == 0) return 0;

	    Map<Character, Integer> map = new HashMap<>();
	    int left = 0;
	    int maxLength = 0;

	    for (int i = 0; i < str.length(); i++) {
	        char currentChar = str.charAt(i);

	        if (map.containsKey(currentChar) && map.get(currentChar) >= left) {
	            left = map.get(currentChar) + 1;
	        }

	        map.put(currentChar, i);
	        maxLength = Math.max(maxLength, i - left + 1);
	    }

	    return maxLength;
	}
	
	
	public static void main(String[] args) {
		System.out.print(SubstringLength("abcbcbbbbbbbba"));
	}

}
