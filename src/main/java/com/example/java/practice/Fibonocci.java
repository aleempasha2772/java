package com.example.java.practice;

public class Fibonocci {
	public static void main(String[] args) {
		int n = 10;
		int a = 0;
		int b = 1;
		int c = 0;
		
		for(int i=2;i<n;i++) {
			c= a+b;
			System.out.println(c);
			a = b;
			b= c;
		}
		System.out.print(c);
	}
}
