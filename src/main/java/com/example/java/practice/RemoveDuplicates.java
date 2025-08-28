package com.example.java.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] arr = {1,2,3,6,4,5,1,2,6,8,9,10,99,77};
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i:arr) {
			map.put(i, map.getOrDefault(i,0)+1);
		}
		List<Integer> list = new ArrayList<>();
		
		for(int i:arr) {
			if(map.get(i)==1) {
				list.add(i);
			}
		}
		
		int[] arr2 = new int[list.size()];
		for(int i=0;i<list.size();i++) {
			arr2[i] = list.get(i);
		}
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		
		
	}

}
