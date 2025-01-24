package com.example.java.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(99,89,78,69,59,49,39,29,19,9,1);

        list.stream()
                .sorted()
                .forEach(System.out::println);
        int[] arr = {99,89,78,69,59,49,39,29,19,9,1};
        Arrays.stream(arr)
                .boxed()
                .sorted()
                .collect(Collectors.toList())
                .forEach(System.out::println);


    }
}
