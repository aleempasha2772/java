package com.example.java.Java_8_updated;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {
	
	public static void main(String[] args) {
		String str = "javaj".toLowerCase();
		
		Map<Character,Long> map = str.chars()
				.mapToObj(c-> (char)c)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		Character ch = map.entrySet().stream()
				.filter(i->i.getValue()==1)
				.map(Map.Entry::getKey)
				.findFirst()
				.orElse(null);
		
		System.out.print(ch);
				
	}

}
