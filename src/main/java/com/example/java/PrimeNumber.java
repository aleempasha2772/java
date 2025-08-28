package com.example.java;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrimeNumber {
	public static boolean isPrime(int n) {
		if(n<=0) {
			return false;
		}
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					return false;
				}
			}
		return true;
	}
	
	public static void main(String[] args) {
		int n = 30;
		
		for(int i=2;i<n;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
		
		
		String input = "Java Articles are Awesome".toLowerCase();
		
		Map<Character,Long> map = new HashMap<>();
		
		map = input.chars()
				.mapToObj(c->(char)c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.print(map);
		
	}
}
