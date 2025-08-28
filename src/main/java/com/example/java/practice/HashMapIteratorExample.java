package com.example.java.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIteratorExample {
	
	public static void main(String[] args) {
		
		Map<Integer,String> map= new HashMap<>();
		map.put(1, "Aleem");
		map.put(2, "Pasha");
		
		Iterator<Map.Entry<Integer,String>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<Integer, String> entry = iterator.next();
			System.out.println(entry.getKey()+ " "+entry.getValue());
		}
		
	}

}
