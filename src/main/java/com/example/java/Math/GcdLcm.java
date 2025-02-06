package com.example.java.Math;

public class GcdLcm {
	public static int GCD(int a,int b) {
		while(b!=0) {
			int temp = b;
			b = a%b;
			a = temp;
		}
		return a;
	}
	
	public static int LCM(int a,int b) {
		if(a==0 || b==0) {
			return 0;
		}
		return Math.abs(a*b)/GCD(a,b);
	}
	
	public static void main(String[] args) {
		System.out.println(GCD(4,8));
		System.out.println(LCM(4,8));
		
	}
}
