package com.example.java.Math;

import java.util.ArrayList;
import java.util.List;

public class AmstrongNumber {
	public static void main(String[] args) {
		int n = 123;
		int digit = String.valueOf(n).length();
		int original = n;
		int sum =0;
		while(n>0){
			int num = n%10;
			sum = (int) (sum + Math.pow(num,digit));
			n/=10;
		}

		System.out.println(sum);

		if(sum==original){
			System.out.println("is amstrong");
		}else{
			System.out.println("is not amstrong");
		}
	}
}
