package com.example.java.Dynamic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSequence {
	
	public static int LCS(int[] nums) {
		int LongestNumber = 0;
		Map<Integer,Boolean> map = new HashMap<>();
		for(int num :nums) {
			map.put(num, Boolean.FALSE);
		}
		
		for(int num:nums) {
			int currentLenght = 1;
			
			int nextNum = num + 1;
			while(map.containsKey(nextNum) && map.get(nextNum) == Boolean.FALSE) {
				currentLenght++;
				map.put(nextNum, Boolean.TRUE);
				nextNum++;
			}
			
			int prevNum = num - 1;
			while(map.containsKey(prevNum) && !map.get(prevNum)) {
				currentLenght++;
				map.put(prevNum, Boolean.TRUE);
				prevNum--;
			}
			
			LongestNumber = Math.max(LongestNumber, currentLenght);
		}
		return LongestNumber;
	}
	
	public static void main(String[] args) {
		int[] nums = {100, 4, 200, 1, 3, 2};
		System.out.println(LCS(nums));
	}

}
