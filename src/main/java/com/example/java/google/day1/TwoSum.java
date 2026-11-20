package com.example.java.google.day1;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	public static int[] twoSumSolution(int[] nums, int target) {
		Map<Integer,Integer> map =  new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			int difference = target - nums[i];
			if(map.containsKey(difference)) {
				return new int[] {map.get(difference),i};
			}else {
				map.put(nums[i], i);
			}
		}
		return new int[] {};
	}
	
	public static void main(String[] args) {

	    int[] nums = {2, 7, 11, 15};
	    int target = 9;

	    int[] result = twoSumSolution(nums, target);

	    System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
	}

}
