package com.example.java.Dynamic;

public class HouseRob {
	
	public static int rob(int[] nums) {
		// Fixed: Handle empty array case
		if (nums == null || nums.length == 0) {
			return 0;
		}
		if (nums.length == 1) {
			return nums[0];
		}
		
		int[] dp = new int[nums.length];
		
		dp[0] = nums[0];
		dp[1] = Math.max(nums[0], nums[1]);
		
		for (int i = 2; i < nums.length; i++) {
			dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
		}
		
		return dp[nums.length - 1];
	}
	
	public static void main(String[] args) {
		// Test cases
		System.out.println("House Robber Problem - Test Results:");
		System.out.println("=====================================");
		
		// Test Case 1: Normal case
		int[] nums1 = {1, 2, 3, 1};
		System.out.println("Test 1: [1, 2, 3, 1]");
		System.out.println("Max Amount: " + rob(nums1));  // Expected: 4 (1 + 3)
		System.out.println();
		
		// Test Case 2: Another normal case
		int[] nums2 = {2, 7, 9, 3, 1};
		System.out.println("Test 2: [2, 7, 9, 3, 1]");
		System.out.println("Max Amount: " + rob(nums2));  // Expected: 12 (2 + 9 + 1)
		System.out.println();
		
		// Test Case 3: Single house
		int[] nums3 = {5};
		System.out.println("Test 3: [5]");
		System.out.println("Max Amount: " + rob(nums3));  // Expected: 5
		System.out.println();
		
		// Test Case 4: Two houses
		int[] nums4 = {3, 8};
		System.out.println("Test 4: [3, 8]");
		System.out.println("Max Amount: " + rob(nums4));  // Expected: 8
		System.out.println();
		
		// Test Case 5: Empty array
		int[] nums5 = {};
		System.out.println("Test 5: []");
		System.out.println("Max Amount: " + rob(nums5));  // Expected: 0
		System.out.println();
		
		// Test Case 6: All same values
		int[] nums6 = {5, 5, 5, 5};
		System.out.println("Test 6: [5, 5, 5, 5]");
		System.out.println("Max Amount: " + rob(nums6));  // Expected: 10 (5 + 5)
		System.out.println();
		
		System.out.println("=====================================");
		System.out.println("All tests completed!");
	}
}