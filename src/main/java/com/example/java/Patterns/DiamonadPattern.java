package com.example.java.Patterns;

import java.sql.SQLOutput;

public class DiamonadPattern {
    public static void main(String[] args) {
        int n = 6;
        int space = n-1;
        /*Upper Pyramid */
        for(int i=0;i<n;i++){
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print(" *");
            }
            System.out.println();
            space--;
        }
        /*Pyrmaid Inverted*/
        for(int i=n;i>0;i--){
            for(int j=0;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
            space++;
        }
    }
}
