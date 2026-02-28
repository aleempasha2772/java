package com.example.java.BitManipulation;

public class HammingWeight {
	
	public static int countBits(int n) {
		int count = 0;
		while (n != 0) {
			n = n & (n - 1);
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// Test cases to demonstrate the countBits method
		int[] testCases = {0, 1, 5, 7, 10, 15, 16, 31, 255, -1};

		System.out.println("Hamming Weight (Number of 1 bits) Calculator");
		System.out.println("=============================================");

		for (int num : testCases) {
			int result = countBits(num);
			System.out.printf("Number: %4d | Binary: %32s | 1-bits: %d%n",
					num, Integer.toBinaryString(num), result);
		}

		// Additional specific examples
		System.out.println("\nAdditional Examples:");
		System.out.println("====================");
		System.out.println("countBits(11) = " + countBits(11) + " (binary: 1011)");
		System.out.println("countBits(128) = " + countBits(128) + " (binary: 10000000)");
		System.out.println("countBits(2147483647) = " + countBits(2147483647) + " (Integer.MAX_VALUE)");
	}
}