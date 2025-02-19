package com.example.java.MapsSets;

import java.util.HashMap;
import java.util.Map;

public class SubArraySum {
	public static int SubAraySumEqualsK(int[] arr,int k) {
		Map<Integer,Integer> map = new HashMap<>();
		int currentSum = 0;
		int count = 0;
		
		for(int i=0;i<arr.length;i++) {
			currentSum += arr[i];
			if(currentSum == k) {
				count ++;
			}
			if(map.containsKey(currentSum-k)) {
				count += map.get(currentSum-k);
			}
			map.put(currentSum, map.getOrDefault(currentSum, 0)+1);
		}
		return count;
	}
	
	public static void main(String[] args) {
        int[] arr = {10, 2, -2, -20, 10};
        int k = -10;
        System.out.println(SubAraySumEqualsK(arr, k));
    }

}
