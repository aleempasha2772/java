package com.example.java;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10,1,2,3,4,5,6,7,8,9,};

        for(int i=0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println(arr[arr.length-2]);


    }
}
