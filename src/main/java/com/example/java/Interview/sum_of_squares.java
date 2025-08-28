package com.example.java.Interview;

import java.util.Arrays;
import java.util.List;

public class sum_of_squares {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		int sum = Arrays.stream(arr)
				.boxed()
				.map(i->i*i)
				.reduce(0, Integer::sum);
		
		System.out.println(sum);
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		int sum2 = list.stream()
				.map(i->i*i)
				.reduce(0, Integer::sum);
		
		System.out.println(sum2);
		
	}
}
