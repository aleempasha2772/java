package com.example.java.Patterns;

public class InvertedStarPattern {
    public static void main(String[] args) {
        int n = 5;
        for(int i=0;i<n;i++){
            for(int j= i+1;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
