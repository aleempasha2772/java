package com.example.java.Sorting;

public class InsertionSort {
	
	public static int[] sortArray(int[] arr) {
		int n = arr.length;
		
		for(int i=1;i<n;i++) {
			int j=i-1;
			int key = arr[i];
			
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
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
		int[] arr = {2,5,9,3,7,4,11,13};
		
		System.out.println("before sorting");
		printArray(arr);
		System.out.println("After sorting");
		sortArray(arr);
		printArray(arr);
		
	}
	

}
