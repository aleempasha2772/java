package com.example.java.Math;

import java.util.ArrayList;
import java.util.List;

public class AmstrongNumber {
	public static void main(String[] args) {
		int n = 123;
		int digitCount = String.valueOf(n).length();
		int original = n;
		int sum = 0;
		while(n>0) {
			int digit = n%10;
			sum += Math.pow(digit, digitCount);
			n /=10;
		}
		if(sum == original) {
			System.out.println("is Amstrong Number");
		}else {
			System.out.println("Not an Amstrong Number");
		}
		System.out.print(sum +" : Sum");
	}
}
