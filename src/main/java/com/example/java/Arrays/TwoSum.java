package com.example.java.Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static int[] twoSum(int[] arr,int target) {
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			int remainder = target-arr[i];
			if(map.containsKey(remainder)) {
				return new int[] {map.get(remainder),i};
			}else {
				map.put(arr[i], i);
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		int arr[] = {5,4,3,2,1};
		int target = 8;
		int arr1[] = twoSum(arr,target);
		System.out.print(arr1[0]+","+arr1[1]);
	}
}
