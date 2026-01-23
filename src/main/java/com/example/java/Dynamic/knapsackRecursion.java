package com.example.java.Dynamic;

public class knapsackRecursion {
	public static int knapsack(int[] wt, int[] val, int W,int n) {
		if(n==0|| W==0) {
			return 0;
		}
		if(wt[n-1] < W) {
			return Math.max(val[n-1]+knapsack(wt,val,W-wt[n -1],n-1),knapsack(wt,val,W,n-1));
		}else if(wt[n-1]> W) {
			return knapsack(wt,val,W,n-1);
		}else {
			return -1;
		}
	}
	
	public static void main(String[] args) {
		int W = 4;
        int[] val = {1, 2, 3};
        int[] wt = {4, 5, 1};
        int n = val.length;
        
        int result = knapsack(wt, val, W, n);
        System.out.println("Maximum value: " + result);
	}
}
