package com.example.java.Math;

public class Factorial {
    public static int factorialRecurssion(int n) {
        if(n==0){
            return 1;
        }
        return n*factorialRecurssion(n-1);
    }
    public static int factorialIterative(int n) {
        int fact = 1;
        if(n==0){
            return 1;
        }
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        System.out.println(factorialRecurssion(5));
        System.out.println(factorialIterative(5));
    }
}
