package com.example.java.Java_8_updated;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequency {
	public static void main(String[] args) {
		String str  = "Java Concept Of The Day".toLowerCase();
		Map<Character, Long> map = str.chars()
				.mapToObj(c -> (char)c)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
				
		System.out.println(map);
		
		
		String a = "javaj".toLowerCase();
		
		Map<Character,Long> map2 = a.chars()
				.mapToObj(c->(char)c)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		char b = map2.entrySet()
				.stream()
				.filter(c->c.getValue()==1)
				.map(Map.Entry::getKey)
				.findFirst()
				.orElse(null);
		char c = map2.entrySet()
				.stream()
				.map(Map.Entry::getKey)
				.findFirst()
				.orElse(null);
		
		System.out.print(b);
		System.out.print(c);
	}
}
