package com.example.java;

import java.util.HashMap;

public class LongestSubstring {
	
	public static int lengthOfLongestSubstring(String str) {
		
		char[] arr = str.toCharArray();
		int left = 0;
		int maxLenght = 0;
		HashMap<Character,Integer> map = new HashMap<>();
		
		
		for(int right=0;right<arr.length;right++) {
			if(map.containsKey(arr[right]) && map.get(arr[right]) >= left) {
				left = map.get(arr[right]);
			}
			map.put(arr[right], right);
			maxLenght = Math.max(maxLenght, right-left);
		}
		return maxLenght;
	}
	
	
	public static void main(String[] args) {
		String S = "aleempasha";
        System.out.println("Length of the longest substring without repeating characters: " + lengthOfLongestSubstring(S));

        String S2 = "bbbbb";
        System.out.println("Length of the longest substring without repeating characters: " + lengthOfLongestSubstring(S2));

        String S3 = "pwwkew";
        System.out.println("Length of the longest substring without repeating characters: " + lengthOfLongestSubstring(S3));
	}

}
