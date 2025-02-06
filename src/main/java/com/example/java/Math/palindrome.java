package com.example.java.Math;

public class palindrome {
	public static boolean isPalindrome(int n) {
		
		int remainder = 0;
		int original = n;
		while(n>0) {
			int digit = n%10;
			remainder = remainder *10+digit;
			n= n/10;
		}
		if(original==remainder) {
			return true;
		}else {
			return false;
		}
	}

	public static boolean isPalindrome2(String s) {
		if(s.length()==0){
			return false;
		}
		int left = 0;
		int right = s.length()-1;
		while(left<right){
			if(s.charAt(left)!=s.charAt(right)){
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		if(isPalindrome(11)) {
			System.out.println("is a palindrome");
		}else {
			System.out.println("not a palindrome");
		}

		System.out.println(isPalindrome2("nitin"));
	}
    
}
