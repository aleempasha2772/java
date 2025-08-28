package com.example.java.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Practive {
	
	
	public static void fibonoci(int n) {
		
		int a = 0;
		int b = 1;
		
		int next = 0;
		for(int i=2;i<n;i++) {
			next  = a+b;
			System.out.print(next+" ");
			a = b;
			b = next;
		}
	}
	
	
	public static int digitReverse(int n) {
		int reversed  = 0;
		while(n!=0) {
			int rem  = n%10;
			reversed = reversed*10+rem;
			n = n/10;
		}
		return reversed;
	}
	
	
	public static void duplicateChars(String str) {
		char[] ch = str.toCharArray();
		Set<Character> set = new HashSet<>();
		List<Character> duplicatesList = new ArrayList<>();
		List<Character> uniqueList = new ArrayList<>();
		
		for(Character c:ch) {
			if(!set.contains(c)) {
				set.add(c);
				uniqueList.add(c);
			}else {
				duplicatesList.add(c);
			}
		}
		System.out.println(duplicatesList);
		
	}
	
	public static void duplicates(String str) {
		char[] ch = str.toCharArray();
		
		Map<Character, Integer> map = new HashMap<>();
		List<Character> list = new ArrayList<>();
		for(Character c:ch) {
			if(!map.containsKey(c)) {
				map.put(c, map.getOrDefault(c, 1));
			}
			else {
				list.add(c);
			}
		}
		
		System.out.println(list);
	}
	
	public static void reverse(String a) {
		StringBuilder sb = new StringBuilder(a);
		System.out.print(sb.reverse());
		System.out.println();
		char[] a1 = a.toCharArray();
		for(int i= a1.length -1;i>=0;i--) {
			System.out.print(a1[i]+" ");
		}
		
	}
	
	public static boolean isPrime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		fibonoci(10);
		System.out.println();
		reverse("aleem");
		duplicates("aleem");
		
		int n = 10;
		int arr[] = {2,3,5,7,9};
		for(int i=0;i<arr.length;i++) {
			if(isPrime(arr[i])) {
				System.out.println(arr[i]+ " is Prime");
			}else {
				System.out.println(arr[i]+" is not prime");
			}
		}
		System.out.println(digitReverse(1039));
		duplicateChars("aleem");
	}
}
