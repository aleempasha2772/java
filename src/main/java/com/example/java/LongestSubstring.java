package com.example.java;

import java.util.HashMap;

public class LongestSubstring {
	
	public static int LongestSubString(String str) {
		HashMap<Character,Integer> map = new HashMap<>();
		int left = 0;
		int right = 0;
		int maxLength = 0;
		char[] arr = str.toCharArray();
		
		for(right = 0;right<arr.length;right++) {
			if(map.containsKey(arr[right]) && map.get(arr[right]) >= left) {
				left = map.get(arr[right]);
			}
			
			map.put(arr[right], right);
			
			maxLength = Math.max(maxLength, right-left);
		}
		
		return maxLength;
	}
	
	public static void main(String[] args) {
		System.out.println(LongestSubString("aleempasha"));
	}

}
