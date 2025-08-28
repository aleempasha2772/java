package com.example.java.Java_8_updated;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicatesElements {
	public static void main(String[] args) {
		List<String> list  = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
		List<String> duplicates = list.stream()
				.distinct()
				.collect(Collectors.toList());
		System.out.print(duplicates);
	}
}
