package com.example.java.Interview;

import java.util.Arrays;
import java.util.Optional;

public class findFirst {
	
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		Optional<Integer> firstElement = Arrays.stream(arr)
				.boxed()
				.findFirst();
		System.out.println(firstElement.orElse(null));
		
		//count of numbers
		
		Long elementCount = Arrays.stream(arr)
				.boxed()
				.count();
		
		System.out.println(elementCount);
		
		//max element
		
		Optional<Integer> maxElement = Arrays.stream(arr)
				.boxed()
				.reduce(Integer::max);
		
		System.out.println(maxElement.orElse(null));
		
		Optional<Integer> maxElement2 = Arrays.stream(arr)
				.boxed()
				.max(Integer::compare);
		
		System.out.println(maxElement2.orElse(null));
				
	}

}
