package com.example.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * Binary Pattern
	You have been given an input integer 'N'. Your task is to print the following binary pattern for it.
	Example
	Pattern for 'N' = 4 1111 000 11 0
	The first line contains 'N' 1s. The next line contains 'N' - 1 0s.
	Then the next line contains 'N' - 2 1s and so on.
	Input format :
	The first line of input contains an integer 'T' that denotes the number of test cases. 
	The first line of each test case contains a single integer 'N'.
 * 
 * 
 */



public class BinaryPattern {
	public static void main(String[] args) {
//		int n = 5;
//		
//		for(int i=n;i>0;i--) {
//			char character = (i%2!=0) ? '1':'0';
//			for(int j=0;j<i;j++) {
//				System.out.print(character);
//			}
//			System.out.println();
//		}
		
		int[] a = {3,4,2,1,3,3};
		int[] b = {4,3,5,3,9,3};
		Map<Integer,Integer> map = new HashMap<>();
		if(a.length == b.length) {
			Arrays.sort(a);
			Arrays.sort(b);
		}
//		for(int i=0;i<a.length;i++) {
//			System.out.print(a[i]+" ");
//		}
//		System.out.println();
//		for(int i=0;i<b.length;i++) {
//			System.out.print(b[i]+" ");
//		}
		
		for(int i=0;i<a.length;i++) {
			map.put(a[i], b[i]);
		}
		System.out.print(map);
		
	}
	

}
