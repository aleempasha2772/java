package com.example.java.Sorting;

public class QuickSort {
	
	public static int partition(int[] arr, int start,int end) {
		
		int pivot = arr[end];
		int i = start;
		int j = end - 1;
		
		while(i<=j) {
			while(i<=end && arr[i]<pivot) {
				i++;
			}
			while(j>=start && arr[j]> pivot) {
				j--;
			}
			if(i<=j) {
				swap(arr,i,j);
				i++;
				j--;
			}
		}
        swap(arr, i, end);
		return i;
	}
	
	private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
	
	private static void performQuickSort(int[] arr, int start, int end) {
		if(start<end) {
			int pivotIndex = partition(arr,start,end);
			performQuickSort(arr,start,pivotIndex - 1);
			performQuickSort(arr,pivotIndex + 1,end);
			
		}
	}
	public static void quickSort(int[] arr) {
        performQuickSort(arr, 0, arr.length - 1);
    }
	
	
	// Test the implementation
    public static void main(String[] args) {
        int[] arr = {2, 6, 4, 10, 8, 1, 9, 5, 3, 7};
        
        System.out.println("Original array:");
        printArray(arr);
        
        quickSort(arr);
        
        System.out.println("\nSorted array:");
        printArray(arr);
    }
    
    // Helper to print array
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
