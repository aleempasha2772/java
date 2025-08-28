package com.example.java.Java_8_updated;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Joins {
	
	public static void ArrayJoin() {
		int[] a = new int[] {4, 2, 7, 1};
        
        int[] b = new int[] {8, 3, 9, 5};
        
        int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b))
        		.sorted().toArray();
        System.out.print(Arrays.toString(c));
	}
	
	public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        String joined = listOfStrings.stream()
        		.collect(Collectors.joining(",","[","]"));
        System.out.print(joined);
        
        ArrayJoin();
        ArrayJoinDistinct();
        MinAndMax();
	}
	
	public static void ArrayJoinDistinct() {
		int[] a = new int[] {4, 2, 7, 1, 8, 9};
        
        int[] b = new int[] {8, 3, 9, 5, 0, 4, 2};
        
        int[] list = IntStream.concat(Arrays.stream(a), Arrays.stream(b))
        		.sorted()
        		.distinct()
        		.toArray();
        System.out.print(Arrays.toString(list));
        		
	}
	
	public static void MinAndMax() {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        
        List<Integer> list = listOfIntegers.stream()
        .sorted()
        .limit(3)
        .collect(Collectors.toList());
        System.out.print(list);
        List<Integer> list2 = listOfIntegers.stream()
        		.sorted(Comparator.reverseOrder())
        		.limit(3)
        		.collect(Collectors.toList());
        System.out.print(list2);
	}
}
