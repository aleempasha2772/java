package com.example.java.Sorting;

public class BubbleSort {
	
	public static int[] sort(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			for(int j = i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
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
		System.out.println("Bubble Sort");
		System.out.println("before sorting");
		printArray(arr);
		System.out.println("After sorting");
		sort(arr);
		printArray(arr);
		
	}

}
