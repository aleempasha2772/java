package com.example.java.java8;

import java.util.Arrays;
import java.util.List;

public class Cube {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5,6,7);
        list.stream()
                .map(i->i*i*i)
                .filter(num->num>100)
                .forEach(System.out::println);
    }
}
