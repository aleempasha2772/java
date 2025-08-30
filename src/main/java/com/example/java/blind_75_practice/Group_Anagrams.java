package com.example.java.blind_75_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group_Anagrams {
	
	
	
	public static List<List<String>> anagramsGrouped(String[] arr){
		
		if(arr.length == 0 || arr == null) {
			return null;
		}
		
		Map<String,List<String>> map = new HashMap<>();
		
		for(String str:arr) {
			char[] charArray = str.toCharArray();
			Arrays.sort(charArray);
			String sortedString = new String(charArray);
			if(!map.containsKey(sortedString)) {
				map.put(sortedString, new ArrayList<>());
			}
			map.get(sortedString).add(str);
		}
		return new ArrayList<>(map.values());
	}
	
	
	
	public static void main(String[] args) {
		String[] strs =  {"act","pots","tops","cat","stop","hat"};
		System.out.print(anagramsGrouped(strs));
	}

}
