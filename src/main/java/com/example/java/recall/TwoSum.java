package com.example.java.recall;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	public boolean twoSum(int[] arr, int target) {
		
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			int difference = target-arr[i];
			if(map.containsKey(difference)) {
				return true;
			}else {
				map.put(arr[i], i);
			}
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		int[] arr = {3,4,5,6};
		int target = 7;
		TwoSum ts= new TwoSum();
		
		boolean result = ts.twoSum(arr, target);	
		System.out.print(result);
		
	}

}
