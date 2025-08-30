package com.example.java.blind_75_practice;

public class Valid_Palindrome {
	
	
	public static boolean isPalindrome(String s) {
		int left = 0;
		int right = s.length() - 1;
		
		while(left<right) {
			if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	

	public static void main(String[] args) {
		String s = "nitin";
		System.out.print(isPalindrome(s));
	}
}
