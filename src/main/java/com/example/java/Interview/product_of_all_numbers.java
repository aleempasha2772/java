package com.example.java.Interview;

import java.util.Arrays;

public class product_of_all_numbers {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		Integer product = Arrays.stream(arr)
				.boxed()
				.reduce(1,(a,b)-> a*b);
		
		System.out.println(product);
		
		
		
	}

}
