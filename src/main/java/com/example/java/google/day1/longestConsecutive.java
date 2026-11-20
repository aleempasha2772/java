package com.example.java.google.day1;

import java.util.HashMap;
import java.util.Map;

public class longestConsecutive {
	
	public static int longestConsecutive(int[] nums) {
		
		int LongestLength = 0;
		if(nums.length == 0) {
			return 0;
		}
		
		if(nums.length == 1) {
			return 1;
		}
		
		Map<Integer,Boolean> map = new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			map.put(nums[i], Boolean.FALSE);
		}
		
		for(int i=0;i<nums.length;i++) {
			int currentLength = 1;
			int nextNumber = nums[i]+1;
			
			while(map.containsKey(nextNumber) && map.get(nextNumber) == Boolean.FALSE) {
				currentLength++;
				map.put(nextNumber, Boolean.TRUE);
				nextNumber++;
			}
			
			int previousNumber = nums[i]-1;
			while(map.containsKey(previousNumber) && !map.get(previousNumber)) {
				currentLength++;
				map.put(previousNumber,Boolean.TRUE);
				previousNumber--;
			}
			
			LongestLength = Math.max(currentLength, LongestLength);
		}
		
		return LongestLength;
		
	}
	
	public static void main(String[] args) {

	    int[] nums = {100, 4, 200, 1, 3, 2};

	    int result = longestConsecutive(nums);

	    System.out.println("Longest Consecutive Sequence: " + result);
	}
}
