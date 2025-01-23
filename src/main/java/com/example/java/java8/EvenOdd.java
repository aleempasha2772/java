package com.example.java.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOdd {
    public static void main(String[] args) {
        /*Method - 1 */
        System.out.println("Method - 1");
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(i);
        }
        list.stream()
                .filter(i->i%2==0)
                .forEach(System.out::println);
        /*Method - 2 */
        System.out.println("Method - 2");
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        List<Integer> array = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toList());

        array.stream()
                .filter(i->i%2==0)
                .forEach(System.out::println);

    }
}
