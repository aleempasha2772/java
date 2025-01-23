package com.example.java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberOccurance {
    public static void main(String[] args) {

        System.out.println("Given a list of integers, find out all the numbers starting with 1 using Stream functions?");


        System.out.println("Using List");
        List<Integer> list  = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        list.stream()
                .map(s->s+"")
                .filter(s -> s.startsWith("1"))
                .forEach(System.out::println);

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        System.out.println("Using Arrays");
        List<String> str = Arrays.stream(arr)
                .boxed()
                .map(s->s+"")

                .collect(Collectors.toList());

        str.stream()
                .filter(s->s.startsWith("1"))
                .forEach(System.out::println);


    }
}
