package com.example.java.Interview;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class max_number {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,5,9};
		
		Optional<Integer> max = Arrays.stream(arr)
				.boxed()
				.reduce(Integer::max);
		
		System.out.println(max.orElse(null));
		
		List<Integer> list = Arrays.asList(1,2,34,5);
		
		Optional<Integer> maxNumber = list.stream()
				.reduce(Integer::max);
		
		System.out.print(maxNumber.orElse(null));
	}

}
