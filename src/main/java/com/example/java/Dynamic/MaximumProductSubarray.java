package com.example.java.Dynamic;

public class MaximumProductSubarray {
	
	public static int subProduct(int[] arr) {
		int n = arr.length;
		int leftProduct = 1;
		int rightProduct = 1;
		int ans = arr[0];
		
		for(int i=0;i<n;i++) {
			if(leftProduct==0) {
				leftProduct = 1;
			}
			if(rightProduct == 0) {
				rightProduct = 1;
			}
			
			leftProduct *= arr[i];
			rightProduct *= arr[n-1-i];
			ans = Math.max(ans, Math.max(rightProduct, leftProduct));
		}
		return ans;
	}
	
	public static void main(String[] args) {
		// Test Case 1: Mixed positive and negative
		int[] nums1 = {2, 3, -2, 4};
		System.out.println("Input: [2, 3, -2, 4] | Max Product: " + subProduct(nums1)); // Expected: 6

		// Test Case 2: Contains zero
		int[] nums2 = {-2, 0, -1};
		System.out.println("Input: [-2, 0, -1] | Max Product: " + subProduct(nums2)); // Expected: 0

		// Test Case 3: All negative (even count)
		int[] nums3 = {-2, -3, -4};
		System.out.println("Input: [-2, -3, -4] | Max Product: " + subProduct(nums3)); // Expected: 12

		// Test Case 4: Single element
		int[] nums4 = {5};
		System.out.println("Input: [5] | Max Product: " + subProduct(nums4)); // Expected: 5

		// Test Case 5: Negative result required (single negative)
		int[] nums5 = {-3};
		System.out.println("Input: [-3] | Max Product: " + subProduct(nums5)); // Expected: -3
	}

}
