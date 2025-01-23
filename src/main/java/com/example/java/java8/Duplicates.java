package com.example.java.java8;

import java.util.*;
import java.util.stream.Collectors;

public class Duplicates {

    public static void getDataWithoutDuplicates() {
        List<Integer> myList = Arrays.asList(1, 1, 85, 6, 2, 3, 65, 6, 45, 45, 5662, 2582, 2, 2, 266, 666, 656);
        Set<Integer> set = new HashSet<>(myList);

        // Convert the set back to a list if needed
        List<Integer> uniqueData = set.stream().collect(Collectors.toList());

        // Print the unique elements
        uniqueData.forEach(System.out::println);
    }
    public static void main(String[] args) {


        //getDataWithoutDuplicates();
        System.out.println("Using HashSet");
        List<Integer> list = Arrays.asList(1, 1, 85, 6, 2, 3, 65, 6, 45, 45, 5662);
        Set<Integer> set = new HashSet();
        list.stream()
                .filter(i->!set.add(i))
                .forEach(System.out::println);

        System.out.println("Using List ");
        List<Integer> list1 = Arrays.asList(1,2,2,3,33,4,56,7,7,8,99,9,99);
        list1.stream()
                .distinct()
                .forEach(noDuplicateData-> System.out.println(noDuplicateData));

        System.out.println("Using Array");
        int[] arr = {1, 1, 85, 6, 2, 3, 65, 6, 45, 45, 5662};
        List<Integer> list2 = Arrays.stream(arr)
                .boxed()
                .distinct()
                .collect(Collectors.toUnmodifiableList());
        list2.stream()
                .forEach(noDuplicateData-> System.out.println(noDuplicateData));


    }
}
