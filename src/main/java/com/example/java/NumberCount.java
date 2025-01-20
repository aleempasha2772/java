package com.example.java;

import java.util.ArrayList;
import java.util.List;

public class NumberCount {
	public static void main(String[] args) {
		int a = 1;
		int n = 50;
		
		List<Integer> arr = new ArrayList<>();
		//System.out.print(10012%10);
		for(int i=a;i<n;i++) {
			if(i%10 == 2 || i%10 == 5 || i%10 == 7) {
				arr.add(i);
			}
		}
		System.out.print(arr.size());
	}

}
