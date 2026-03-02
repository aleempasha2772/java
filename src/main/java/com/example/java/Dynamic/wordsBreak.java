package com.example.java.Dynamic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class wordsBreak {

    public static boolean Wordbreak(String s, List<String> wordDict) {
        int maxLength = 0;
        Set<String> words = new HashSet<>(wordDict);
        for (String word : words) {
            maxLength = Math.max(maxLength, word.length());
        }

        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        for (int i = 1; i <= n; i++) {
            for (int j = i - 1; j >= Math.max(0, i - maxLength); j--) {
                if (dp[j] && words.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        // Test Case 1: Basic example - should return true
        String s1 = "leetcode";
        List<String> wordDict1 = Arrays.asList("leet", "code");
        System.out.println("Test 1: \"" + s1 + "\" with " + wordDict1);
        System.out.println("Result: " + Wordbreak(s1, wordDict1)); // Expected: true
        System.out.println();

        // Test Case 2: Should return false
        String s2 = "applepenapple";
        List<String> wordDict2 = Arrays.asList("apple", "pen");
        System.out.println("Test 2: \"" + s2 + "\" with " + wordDict2);
        System.out.println("Result: " + Wordbreak(s2, wordDict2)); // Expected: true
        System.out.println();

        // Test Case 3: Should return false
        String s3 = "catsandog";
        List<String> wordDict3 = Arrays.asList("cats", "dog", "sand", "and", "cat");
        System.out.println("Test 3: \"" + s3 + "\" with " + wordDict3);
        System.out.println("Result: " + Wordbreak(s3, wordDict3)); // Expected: false
        System.out.println();

        // Test Case 4: Empty string - should return true
        String s4 = "";
        List<String> wordDict4 = Arrays.asList("hello", "world");
        System.out.println("Test 4: \"" + s4 + "\" with " + wordDict4);
        System.out.println("Result: " + Wordbreak(s4, wordDict4)); // Expected: true
        System.out.println();

        // Test Case 5: Single word match
        String s5 = "hello";
        List<String> wordDict5 = Arrays.asList("hello", "world");
        System.out.println("Test 5: \"" + s5 + "\" with " + wordDict5);
        System.out.println("Result: " + Wordbreak(s5, wordDict5)); // Expected: true
        System.out.println();

        // Test Case 6: No match possible
        String s6 = "abcdef";
        List<String> wordDict6 = Arrays.asList("ab", "cd");
        System.out.println("Test 6: \"" + s6 + "\" with " + wordDict6);
        System.out.println("Result: " + Wordbreak(s6, wordDict6)); // Expected: false
    }
}