package com.example.java.cap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
		List<Integer> list1 = list.stream()
		.filter(i->i%2==0)
		.collect(Collectors.toList());
		
		System.out.print(list1);
		
		List<String> list2 = list.stream()
		.map(s -> s+"")
		.filter(s->s.startsWith("1"))
		.collect(Collectors.toList());
		
		System.out.print(list2);
		
	}

}
