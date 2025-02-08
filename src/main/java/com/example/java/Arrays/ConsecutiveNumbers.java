package com.example.java.Arrays;

public class ConsecutiveNumbers {
	public static int consicutive(int[] arr) {
		int left = 0;
		int right = 1;
		while(left<right) {
			if(arr[right]-arr[left] != 1) {
				return arr[left]+1;
			}
			left++;
			right++;
		}
		return 0;
		
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,6};
		System.out.print(consicutive(arr));
	}
}
