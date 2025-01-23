package com.example.java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Count {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Long count  = list.stream()
                .count();
        System.out.println(count);

        int[] arr = {1,2,3,4,5,6,8,9};
        Long count1 = Arrays.stream(arr)
                .boxed()
                .count();
        System.out.println(count1);
    }
}
