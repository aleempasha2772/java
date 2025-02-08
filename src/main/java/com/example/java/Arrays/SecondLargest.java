package com.example.java.Arrays;

import java.util.Arrays;

public class SecondLargest {
	public static void main(String[] args) {
		int[] arr = {1,3,5,4,2,5};
		
		Arrays.sort(arr);
		int right = arr.length-1;
		int left = arr.length-2;
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		System.out.println(arr[right]);
		System.out.println(arr[left]);
		while (left >= 0 && right >= 0) {
            if (arr[left] != arr[right]) {
                System.out.println("Left: " + arr[left]);
                break;
            }
            left--;
            right--;
        }
	}

}
