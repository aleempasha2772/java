package com.example.java.google.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
	
	
	public static List<List<String>> groupAnagramsSolution(String[] strs){
		if(strs == null || strs.length == 0) {
			return new ArrayList<>();
		}
		
		Map<String,List<String>> map = new HashMap<>();
		for(String str:strs) {
			char[] ch = str.toCharArray();
			Arrays.sort(ch);
			String s = new String(ch);
			if(map.containsKey(s)) {
				map.get(s).add(str);
			}else {
				List<String> strList = new ArrayList<>();
				strList.add(str);
				map.put(s, strList);
			}
		}
		return new ArrayList<>(map.values());
	}

	public static void main(String[] args) {
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(groupAnagramsSolution(strs));
	}
}
