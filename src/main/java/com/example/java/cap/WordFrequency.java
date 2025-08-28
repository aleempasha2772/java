package com.example.java.cap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordFrequency {
	
	public static void main(String[] args) {
		String[] cars = {"aleem", "pasha","aleem", "bugati","benz","benz"};
		
		Map<String,Integer> map = new HashMap<>(); 
		
		for(int i=0;i<cars.length;i++) {
			map.put(cars[i], map.getOrDefault(cars[i], 0)+1);
		}
		System.out.print(map);
		
		Map<String,Long> map2 = Arrays.stream(cars)
				.collect(Collectors.groupingBy(car->car,Collectors.counting()));
		
		System.out.print(map2);
				
 	}
}
