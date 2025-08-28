package com.example.java.Interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenedList {
	
	public static void main(String[] args) {
		List<List<Integer>> listOfLists = Arrays.asList(
			    Arrays.asList(1, 2),
			    Arrays.asList(3, 4),
			    Arrays.asList(5)
			);
		
		
		List<Integer> list = listOfLists.stream()
				.flatMap(List::stream)
				.collect(Collectors.toList());
		
		System.out.print(list);
				
	}

}
