package com.example.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayDuplicate {
	
	public static void main(String[] args) {
		
		String[] inputArray = {"1", "2", "3", "2", "4", "5", "3", "6"};
		
		Map<String,Integer> map = new HashMap<>();
		
		for(String num:inputArray) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		
		List<String> result = new ArrayList<>();
		for(String num:inputArray) {
			if(map.get(num)==1) {
				result.add(num);
			}
		}
		
		String[] str = result.toArray(new String[0]);
		System.out.println(Arrays.toString(str));
		
		System.out.println(result.toArray(new String[0]));
		
	}

}
