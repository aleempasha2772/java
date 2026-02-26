package com.example.java.Dynamic;

public class DecodeWays {

    public static int numDecode(String s) {
        // FIX 1: Handle null or empty string immediately to prevent crash
        if (s == null || s.length() == 0) {
            return 0;
        }

        int n = s.length();
        
        // Handle single character case separately to avoid index issues later
        if (n == 1) {
            return s.charAt(0) == '0' ? 0 : 1;
        }

        int[] dp = new int[n + 1];
        
        // Base cases
        dp[0] = 1; // Empty string has 1 way (base for calculation)
        dp[1] = s.charAt(0) == '0' ? 0 : 1;

        // FIX 2: Loop must go up to <= n to calculate the final answer at dp[n]
        for (int i = 2; i <= n; i++) {
            
            // Get one digit (current character)
            // substring(i-1, i) gets the character at index i-1
            int oneDigit = Integer.valueOf(s.substring(i - 1, i));
            
            // Get two digits (previous and current)
            // substring(i-2, i) gets characters at i-2 and i-1
            int twoDigits = Integer.valueOf(s.substring(i - 2, i));

            // If valid single digit (1-9), add ways from previous step
            if (oneDigit >= 1) {
                dp[i] += dp[i - 1];
            }

            // If valid two digits (10-26), add ways from two steps back
            if (twoDigits >= 10 && twoDigits <= 26) {
                // FIX 3: Use += instead of = to accumulate possibilities
                dp[i] += dp[i - 2];
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        String[] testCases = {
            "12",      // Expected: 2 ("AB", "L")
            "226",     // Expected: 3 ("BZ", "VF", "BBF")
            "06",      // Expected: 0 (Invalid leading zero)
            "10",      // Expected: 1 ("J")
            "2101",    // Expected: 1 ("UJA")
            "",        // Expected: 0 (Empty)
            "1",       // Expected: 1
            "27",      // Expected: 1 ("BG")
            "123456"   // Expected: 3
        };

        System.out.println("Running Decode Ways Tests:");
        System.out.println("--------------------------");

        for (String s : testCases) {
            try {
                int result = numDecode(s);
                System.out.println("Input: \"" + s + "\" -> Ways: " + result);
            } catch (Exception e) {
                System.out.println("Input: \"" + s + "\" -> ERROR: " + e.getMessage());
            }
        }
    }
}