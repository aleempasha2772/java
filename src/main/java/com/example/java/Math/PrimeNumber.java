package com.example.java.Math;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
    public static boolean isPrime(int n) {
        if(n<=1){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void isPrimeRange(int n) {
        for(int i=0;i<n;i++){
            if(isPrime(i)){
                System.out.println(i+" is prime number");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(isPrime(10));
        isPrimeRange(100);
    }
}
