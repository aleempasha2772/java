package com.example.java;

public class PrimeNumber {
	public static boolean isPrime(int n) {
		if(n<=0) {
			return false;
		}
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					return false;
				}
			}
		return true;
	}
	
	public static void main(String[] args) {
		int n = 30;
		
		for(int i=2;i<n;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}
}
