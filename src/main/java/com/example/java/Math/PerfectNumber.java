package com.example.java.Math;

import java.util.ArrayList;
import java.util.List;

public class PerfectNumber {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum = sum+i;
            }
        }
        if(sum==n){
            System.out.println(n+" is a perfect number");
        }else{
            System.out.println(n+" is not a perfect number");
        }

    }
}
