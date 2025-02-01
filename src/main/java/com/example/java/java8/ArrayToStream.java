package com.example.java.java8;

import java.util.Arrays;

public class ArrayToStream {
    public static void main(String[] args) {

        int[] arr = {88,100,987,678,7,6,1,0,9};
        Arrays.parallelSort(arr);
        Arrays.stream(arr)
                .forEach(System.out::println);

    }
}
