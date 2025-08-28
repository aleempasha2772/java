package com.example.java.Java_8_updated;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordFrequency {
	public static void main(String[] args) {
		List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
		
		Map<String,Long> map = stationeryList.stream()
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.print(map);
	}
}
