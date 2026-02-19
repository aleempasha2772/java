package com.example.java.Dynamic;

public class ClimbingStairs {
	
	public static int climbStairs(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		int[] dp = new int[n+1];
		
		dp[1] = 1;
		dp[2] = 2;
		for(int i=3;i<=n;i++) {
			dp[i] = dp[i-1]+dp[i-2];
		}
		
		return dp[n];
	}
	
	
	
	public static void main(String[] args) {
		// Test cases
		int[] testCases = {1, 2, 3, 4, 5, 10};
		
		System.out.println("Climbing Stairs Problem - Test Results:");
		System.out.println("========================================");
		
		for (int n : testCases) {
			int ways = climbStairs(n);
			System.out.println("n = " + n + " → " + ways + " ways");
		}
		
		System.out.println("========================================");
		
		// Individual test examples
		System.out.println("\nDetailed Examples:");
		System.out.println("Stairs: 1, Ways: " + climbStairs(1));  // Expected: 1
		System.out.println("Stairs: 2, Ways: " + climbStairs(2));  // Expected: 2
		System.out.println("Stairs: 3, Ways: " + climbStairs(3));  // Expected: 3
		System.out.println("Stairs: 4, Ways: " + climbStairs(4));  // Expected: 5
		System.out.println("Stairs: 5, Ways: " + climbStairs(5));  // Expected: 8
	}
}
