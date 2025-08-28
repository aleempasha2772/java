package com.example.java.Interview;

import java.util.Arrays;
import java.util.List;

public class upperCase_concat {
	
	public static void main(String[] args) {
		
		String[] str = {"Aleem","Nayeem", "Pasha"};
		
		String concat = Arrays.stream(str)
				.map(s->s.toUpperCase())
				.reduce("", (a,b)->a+b);
		System.out.println(concat);
		
		List<String> words = Arrays.asList("hello", "world", "java");
		
		String newConcat = words.stream()
				.map(s->s.toUpperCase())
				.reduce("", (a,b)->a+b);
		
		System.out.print(newConcat);

		
		
		
	}

}
