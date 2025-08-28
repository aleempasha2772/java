package com.example.java.Interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class even_numbers {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		list.stream()
		.filter(i-> i%2 ==0)
		.forEach(System.out::println);
		
		
		List<Integer> evenList = list.stream()
				.filter(i->i%2==0)
				.collect(Collectors.toList());
		
		System.out.println(evenList);
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		Map<Boolean,List<Integer>> list2 = Arrays.stream(arr)
				.boxed()
				.collect(Collectors.partitioningBy(i->i%2==0));
		
		List<Integer> list3 = Arrays.stream(arr)
				.boxed()
				.filter(i->i%2 ==0)
				.collect(Collectors.toList());
		
		System.out.println(list2);
		System.out.println(list3);
		
		

		
	}
}
