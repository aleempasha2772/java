package com.example.java.Interview;

import java.util.Arrays;
import java.util.List;

public class total_length_of_all_strings {
	
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "cherry");
		
		Integer length = words.stream()
				.map(String::length)
				.reduce(0, Integer::sum);
		
		System.out.print(length);
	}

}
