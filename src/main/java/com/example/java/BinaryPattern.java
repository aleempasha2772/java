package com.example.java;

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
		int n = 5;
		
		for(int i=n;i>0;i--) {
			char character = (i%2!=0) ? '1':'0';
			for(int j=0;j<i;j++) {
				System.out.print(character);
			}
			System.out.println();
		}
	}
	

}
