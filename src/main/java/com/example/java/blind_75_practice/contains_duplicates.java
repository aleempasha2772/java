
package com.example.java.blind_75_practice;

import java.util.HashSet;
import java.util.Set;

public class contains_duplicates {
	
	
	public static boolean duplicates(int[] nums) {
		
		Set<Integer> set = new HashSet<>();
		
		for(int i=0;i<nums.length;i++) {
			if(set.contains(nums[i])) {
				return true;
			}
			set.add(nums[i]);
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		int[] nums = {1,2,3,3};
		System.out.print(duplicates(nums));
	}
}
