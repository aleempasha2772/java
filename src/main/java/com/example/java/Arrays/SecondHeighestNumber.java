package com.example.java.Arrays;

public class SecondHeighestNumber {
	
	
	
	public static int secondHeighest(int[] arr) {
		
		int largest = -1;
		int secondLargest = -1;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			}else if(arr[i]< largest && arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		}
		return secondLargest;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,5};
		System.out.print(secondHeighest(arr));
		
		
	}

}
