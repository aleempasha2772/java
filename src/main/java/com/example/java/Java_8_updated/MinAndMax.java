package com.example.java.Java_8_updated;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinAndMax {
	public static void main(String[] args) {
		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		int max  = listOfIntegers.stream()
				.max(Comparator.naturalOrder()).get();
		
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        int max2 =  myList.stream()
                         .max(Integer::compare)
                         .get();
        System.out.println(max2);
		System.out.print(max);
	}
}
