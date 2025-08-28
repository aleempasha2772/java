package com.example.java.cap;

import java.util.HashMap;
import java.util.Map;

public class iter {
	
public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<>();
		
		for(int i=0;i<5;i++) {
			map.put(i, "i"+i);
		}
		System.out.print(map);
		
		java.util.Iterator<Map.Entry<Integer,String>> iterator = map.entrySet().iterator();
		
		while(iterator.hasNext()) {
			Map.Entry<Integer, String> entry = iterator.next();
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
		
	}

}
