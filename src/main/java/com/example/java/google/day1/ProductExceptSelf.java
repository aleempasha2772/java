package com.example.java.google.day1;


/*
 * 
Given an integer array nums, return an array answer such that answer[i] is equal,
to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]

 */

public class ProductExceptSelf {
	
	public static int[] productExceptSelfSolution(int[] nums) {
		if(nums.length == 0) {
			return null;
		}
		int n = nums.length;
		int[] left = new int[n];
		int[] right = new int[n];
		int[] result = new int[n];
		
		left[0] = 1;
		for(int i=1;i<n;i++) {
			left[i] = left[i-1]*nums[i-1];
		}
		right[n-1] = 1;
		for(int i=n-2;i>=0;i--) {
			right[i] = right[i+1]*nums[i+1];
		}
		
		for(int i=0;i<n;i++) {
			result[i] = left[i]*right[i];
		}
		
		return result;
	}
	public static void main(String[] args) {

	    int[] nums = {1, 2, 3, 4};

	    int[] result = productExceptSelfSolution(nums);

	    System.out.println("Output:");

	    for (int num : result) {
	        System.out.print(num + " ");
	    }
	}
	

}
