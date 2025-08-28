package com.example.java.Java_8_updated;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practice {
	
	public static void OddOrEven() {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		//Creating a map to store the even and odd in list
		Map<Boolean, List<Integer>> map = list.stream()
				.collect(Collectors.partitioningBy(i->i%2==0));
		System.out.print(map.get(true));
		System.out.println();
		System.out.print(map.get(false));
		System.out.println();
	}
	
	public static void DuplicateElements() {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        Map<String,Long> map = listOfStrings.stream()
        		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.print(map);
        System.out.println();
	}
	public static void DuplicateCount() {
		String inputString = "Java Concept Of The Day";
		Map<Character,Long> map = inputString.chars()
				.mapToObj(c->(char)c)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.print(map);
		System.out.println();
	}
	public static void Frequency() {
        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
        Map<String,Long> map = stationeryList.stream()
        		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.print(map);
        System.out.println();
	}
	
	public static void Frequencyint() {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9);
		Map<Integer,Long> map = list.stream()
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.print(map);
		
		list.stream()
		.distinct()
		.sorted()
		.forEach(System.out::println);
		list.stream()
		.distinct()
		.sorted(Comparator.reverseOrder())
		.forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		OddOrEven();
		DuplicateElements();
		DuplicateCount();
		Frequency();
		Frequencyint();
	}
}
