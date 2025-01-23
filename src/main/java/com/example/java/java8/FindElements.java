package com.example.java.java8;

import java.util.ArrayList;
import java.util.List;

public class FindElements {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);
        list.stream()
                .findFirst()
                .ifPresent(System.out::println);
    }
}
