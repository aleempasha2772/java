package com.example.java.MapsSets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramsGrouper {
	
	public static List<List<String>> groupAnagrams(String[] strs){
		
		if(strs == null|| strs.length == 0) {
			return new ArrayList<>();
		}
		
		Map<String,List<String>> map = new HashMap<>();
		for(String s:strs ) {
			char[] charArray = s.toCharArray();
			Arrays.sort(charArray);
			String sorted  = new String(charArray);
			
			if(!map.containsKey(sorted)) {
				map.put(sorted, new ArrayList<>());
			}
			map.get(sorted).add(s);
		}
		return new ArrayList<>(map.values());
	}
	public static void main(String[] args) {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(input);

        // Print the grouped anagrams
        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}
