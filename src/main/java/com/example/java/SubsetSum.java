package com.example.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SubsetSum {
    public static void subsetSums(int index, int currentSum, int[] nums, ArrayList<Integer> results) {
        if (index == nums.length) {
            results.add(currentSum); // Add the sum of the current subset
            return;
        }

        // Include the current element
        subsetSums(index + 1, currentSum + nums[index], nums, results);

        // Exclude the current element
        subsetSums(index + 1, currentSum, nums, results);
    }

    public static ArrayList<Integer> getSubsetSums(int[] nums) {
        ArrayList<Integer> results = new ArrayList<>();
        subsetSums(0, 0, nums, results);
        Collections.sort(results); // Sort in non-decreasing order
        return results;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of test cases
        int T = sc.nextInt();

        while (T-- > 0) {
            // Size of the array
            int N = sc.nextInt();
            int[] nums = new int[N];

            // Input array elements
            for (int i = 0; i < N; i++) {
                nums[i] = sc.nextInt();
            }

            // Compute subset sums
            ArrayList<Integer> subsetSums = getSubsetSums(nums);

            // Output results for the current test case
            for (int sum : subsetSums) {
                System.out.print(sum + " ");
            }
            System.out.println(); // New line for the next test case
        }

        sc.close();
    }
}
