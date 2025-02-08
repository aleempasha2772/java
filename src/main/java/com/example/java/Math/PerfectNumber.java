package com.example.java.Math;

import java.util.ArrayList;
import java.util.List;

public class PerfectNumber {
    public static void main(String[] args) {
        int n = 496;
        int sum = 0;
        for(int i=1;i<=n/2;i++) {
        	if(n%i==0) {
        		sum+=i;
        	}
        }
        
        System.out.print(n);
        if(sum == n) {
        	System.out.print(": is a perfect Number");
        }else {
        	System.out.print(": is not a perfect Number");
        }
    }
}
