package com.example.java.Interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class numbers_starting_with_1 {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,12,14,5,15);
		
		list.stream()
		.map(i-> i+"")
		.filter(i->i.startsWith("1"))
		.forEach(System.out::println);
		
		
		List<String> list1 = list.stream()
				.map(i->i+"")
				.filter(i->i.startsWith("1"))
				.collect(Collectors.toList());
		System.out.println(" List 1");

		System.out.println(list1);
		
		
		int[] arr = {1,2,3,12,14,5,15};
		
		List<String> list2 = Arrays.stream(arr)
				.boxed()
				.map(i->i+"")
				.filter(i->i.startsWith("1"))
				.collect(Collectors.toList());
		
		System.out.println(list2);
			
	}

}
