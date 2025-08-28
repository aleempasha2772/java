package com.example.java.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MessedUpArray {
	
	
	public static String messedArray(List<Integer> visitors) {
		
		
		Set<Integer> seen = new HashSet<>();
		Set<Integer> repeated = new HashSet<>();
		
		for(Integer i:visitors) {
			if(seen.contains(i)) {
				repeated.add(i);
			}else {
				seen.add(i);
			}
		}
		
		Set<Integer> missing = new HashSet<>();
		
		for(int i=1;i<=visitors.size();i++) {
			if(!seen.contains(i)) {
				missing.add(i);
			}
		}
		int minRepeated = repeated.isEmpty() ? -1 : Collections.min(repeated);
        int minMissing = missing.isEmpty() ? -1 : Collections.min(missing);
        
        // If both are -1, return "-1 -1"
        if (minRepeated == -1 && minMissing == -1) {
            return "-1 -1";
        }
        
        return minRepeated + " " + minMissing;
		
		
	}
	
	public static void main(String[] args) {
		
		List<Integer> list =  Arrays.asList(1, 2, 3, 4, 4);
		
		String testResult = messedArray(list);
        System.out.println("Result: " + testResult);
		
	}

}
