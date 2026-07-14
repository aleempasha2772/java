package com.example.java.Dynamic;

public class RodCutting {
	public int cutRod(int[] price) {
        int n = price.length; 
        int[][] dp = new int[n + 1][n + 1];
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j >= i) {
                    dp[i][j] = Math.max(dp[i - 1][j], price[i - 1] + dp[i][j - i]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][n];
    }
	
	public static void main(String[] args) {
		RodCutting solution = new RodCutting();

        // Test Case 1: Classic example (N = 8)
        // Optimal cut: Two pieces of length 2 and 6 (Price: 5 + 17 = 22)
        int[] price1 = {1, 5, 8, 9, 10, 17, 17, 20};
        int result1 = solution.cutRod(price1);
        System.out.println("Test Case 1:");
        System.out.println("Prices: [1, 5, 8, 9, 10, 17, 17, 20]");
        System.out.println("Expected: 22, Actual: " + result1);
        System.out.println("Pass: " + (result1 == 22));
        System.out.println("-------------------------");

        // Test Case 2: Cutting into all 1s is optimal (N = 8)
        // Optimal cut: Eight pieces of length 1 (Price: 8 * 3 = 24)
        int[] price2 = {3, 5, 8, 9, 10, 17, 17, 20};
        int result2 = solution.cutRod(price2);
        System.out.println("Test Case 2:");
        System.out.println("Prices: [3, 5, 8, 9, 10, 17, 17, 20]");
        System.out.println("Expected: 24, Actual: " + result2);
        System.out.println("Pass: " + (result2 == 24));
        System.out.println("-------------------------");

        // Test Case 3: Single element array (N = 1)
        int[] price3 = {5};
        int result3 = solution.cutRod(price3);
        System.out.println("Test Case 3:");
        System.out.println("Prices: [5]");
        System.out.println("Expected: 5, Actual: " + result3);
        System.out.println("Pass: " + (result3 == 5));
        System.out.println("-------------------------");
        
        // Test Case 4: No cuts are better than cutting (N = 4)
        // Optimal cut: One piece of length 4 (Price: 10)
        int[] price4 = {1, 2, 3, 10};
        int result4 = solution.cutRod(price4);
        System.out.println("Test Case 4:");
        System.out.println("Prices: [1, 2, 3, 10]");
        System.out.println("Expected: 10, Actual: " + result4);
        System.out.println("Pass: " + (result4 == 10));
    }
}
