package com.example.java.Sorting;

public class SelectionSort {
	
	public static int[] sortArray(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			int min = i;
			for(int j=i;j<n;j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		
		return arr;
	}
	
	public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
	public static void main(String[] args) {
		int[] arr = {64, 25, 12, 22, 11};
		
		System.out.println("before sorting");
		printArray(arr);
		System.out.println("After sorting");
		sortArray(arr);
		printArray(arr);
		
	}
	

}
