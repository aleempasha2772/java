package com.example.java.StringManipulation;

public class Palindrome {
	public static void main(String[] args) {
		String s1 = "nitin";
		StringBuilder s2 = new StringBuilder(s1);
		
		String s3 = s2.reverse().toString();
		
		if(s1.equals(s3)) {
			System.out.print(s1 +" is a palindrome");
		}else {
			System.out.print(s1 +" is not a palindrome");
		}
		
	}
}
